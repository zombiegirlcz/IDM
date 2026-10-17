package do8;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessController;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$ModalStep;
import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAppAccessController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(JuniorAppAccessController juniorAppAccessController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAppAccessController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        JuniorBankingProfile juniorBankingProfile;
        Object content;
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        String listId = model.f52373a;
        Object obj3 = model.k;
        com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) hVarE3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!Intrinsics.f(listId, "ID_INVITATION_DATA_STATE_ITEM")) {
            throw new IllegalStateException(h30.l.r("Cannot handle secondary button click. Unknown listId: ", listId));
        }
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation");
        RemoteLoginInvitation remoteLoginInvitation = (RemoteLoginInvitation) obj3;
        try {
            content = ((i) ((j2) dVar.f77293x.f22677a).getValue()).f116451a.getContent();
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
            juniorBankingProfile = null;
        }
        if (content == null) {
            throw new IllegalArgumentException(("Can't show remove phone number dialog as junior profile is empty for " + f0.U0(4, dVar.o.f77277a)).toString());
        }
        juniorBankingProfile = (JuniorBankingProfile) content;
        if (juniorBankingProfile != null) {
            if (remoteLoginInvitation.equals(RemoteLoginInvitation.Absent.INSTANCE)) {
                IllegalStateException illegalStateException = new IllegalStateException("We shouldn't have a secondary vertical button for absent state");
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "onFullScreenSecondaryButtonClick", null, illegalStateException, h0Var2);
            } else if (remoteLoginInvitation instanceof RemoteLoginInvitation.Pending) {
                oki.h.v2(dVar.f77294y, new JuniorAppAccessControllerContract$ModalStep.PhoneRemovalConfirmation(juniorBankingProfile.f77103j, juniorBankingProfile.f77099b, new PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod.RemoteLoginInvitation(((RemoteLoginInvitation.Pending) remoteLoginInvitation).f77170c)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
            } else {
                if (!(remoteLoginInvitation instanceof RemoteLoginInvitation.Accepted)) {
                    throw new NoWhenBranchMatchedException();
                }
                IllegalStateException illegalStateException2 = new IllegalStateException("We shouldn't have a secondary vertical button for accepted state");
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "onFullScreenSecondaryButtonClick", null, illegalStateException2, h0Var3);
            }
        }
        return Unit.f186387a;
    }
}
