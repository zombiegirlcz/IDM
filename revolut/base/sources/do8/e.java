package do8;

import cli.y;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import com.revolut.feature.junior_remote_login.navigation.JuniorUpdatePhoneNumberDestination;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessController;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$InputData;
import com.revolut.feature.junior_settings.impl.ui_kompot.app_access.JuniorAppAccessControllerContract$ModalStep;
import com.revolut.feature.junior_settings.impl.ui_kompot.phone_removal_confirmation.PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import kotlin.text.f0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes4.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ JuniorAppAccessController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(JuniorAppAccessController juniorAppAccessController, Continuation continuation) {
        super(2, continuation);
        this.v = juniorAppAccessController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        JuniorBankingProfile juniorBankingProfile;
        Object content;
        Object content2;
        FullScreenStateDelegate.Model model = (FullScreenStateDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        h hVarE3 = this.v.d();
        String listId = model.f52373a;
        Object obj3 = model.k;
        com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d dVar = (com.revolut.feature.junior_settings.impl.ui_kompot.app_access.d) hVarE3;
        y yVar = dVar.f77293x;
        JuniorAppAccessControllerContract$InputData juniorAppAccessControllerContract$InputData = dVar.o;
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (!Intrinsics.f(listId, "ID_INVITATION_DATA_STATE_ITEM")) {
            throw new IllegalStateException(h30.l.r("Cannot handle primary button click. Unknown listId: ", listId));
        }
        Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation");
        RemoteLoginInvitation remoteLoginInvitation = (RemoteLoginInvitation) obj3;
        if (remoteLoginInvitation.equals(RemoteLoginInvitation.Absent.INSTANCE)) {
            dVar.I2();
        } else {
            Unit unit = null;
            JuniorBankingProfile juniorBankingProfile2 = null;
            if (remoteLoginInvitation instanceof RemoteLoginInvitation.Pending) {
                try {
                    content2 = ((i) ((j2) yVar.f22677a).getValue()).f116451a.getContent();
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
                if (content2 == null) {
                    throw new IllegalArgumentException(("Can't start update phone number flow as junior profile is empty for " + f0.U0(4, juniorAppAccessControllerContract$InputData.f77277a)).toString());
                }
                juniorBankingProfile2 = (JuniorBankingProfile) content2;
                if (juniorBankingProfile2 != null) {
                    dVar.C1(new JuniorUpdatePhoneNumberDestination(new JuniorUpdatePhoneNumberDestination.InputData(juniorBankingProfile2)));
                }
            } else {
                if (!(remoteLoginInvitation instanceof RemoteLoginInvitation.Accepted)) {
                    throw new NoWhenBranchMatchedException();
                }
                try {
                    content = ((i) ((j2) yVar.f22677a).getValue()).f116451a.getContent();
                } catch (Exception e2) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var2);
                    juniorBankingProfile = null;
                }
                if (content == null) {
                    throw new IllegalArgumentException(("Can't show remove phone number dialog as junior profile is empty for " + f0.U0(4, juniorAppAccessControllerContract$InputData.f77277a)).toString());
                }
                juniorBankingProfile = (JuniorBankingProfile) content;
                if (juniorBankingProfile != null) {
                    String str = juniorBankingProfile.f;
                    if (str == null) {
                        str = "";
                    }
                    try {
                    } catch (Exception e4) {
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e4, h0Var3);
                    }
                    if (d0.W(str)) {
                        throw new IllegalArgumentException(("Can't show remove phone number dialog as junior phone number is empty for " + f0.U0(4, juniorAppAccessControllerContract$InputData.f77277a)).toString());
                    }
                    unit = Unit.f186387a;
                    if (unit != null) {
                        oki.h.v2(dVar.f77294y, new JuniorAppAccessControllerContract$ModalStep.PhoneRemovalConfirmation(juniorBankingProfile.f77103j, juniorBankingProfile.f77099b, new PhoneRemovalConfirmationControllerContract$PhoneNumberRemovalMethod.Profile(str)), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
            }
        }
        return Unit.f186387a;
    }
}
