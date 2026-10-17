package m98;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.junior.card_request.impl.R$string;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import skm.a2;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f203656w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f203656w = pVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f203656w, continuation, 0);
            default:
                return new o(this.f203656w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((o) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                p pVar = this.f203656w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    a2 a2Var = pVar.v;
                    if (a2Var != null) {
                        a2Var.f(null);
                    }
                    ic8.b bVar = pVar.f203660s;
                    jc8.a aVar2 = (jc8.a) ((f) pVar.t2()).f203640c.getContent();
                    if (aVar2 == null || (str = aVar2.f172748a) == null) {
                        throw new IllegalStateException("Cannot get card request id. Card request is null");
                    }
                    this.v = 1;
                    if (((i98.e) bVar).e(str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.junior_card_request_declined_dialog_title, null, null, 14);
                int i2 = R$string.junior_card_request_declined_dialog_subtitle;
                JuniorBankingProfile juniorBankingProfile = (JuniorBankingProfile) ((f) pVar.t2()).f203638a.getContent();
                if (juniorBankingProfile == null || (str2 = juniorBankingProfile.f77099b) == null) {
                    throw new IllegalStateException("Cannot get junior profile first name. Junior profile is null");
                }
                return yji.l.b1(pVar, pVar.X1(new y0(null, new j0((Clause) textLocalisedClause, (Clause) new TextLocalisedClause(i2, u.c(str2), null, 12), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 5)), null, new n(pVar, null), 3);
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                p pVar2 = this.f203656w;
                o oVar = new o(pVar2, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(pVar2.k, "TASK_ID_REJECT_CARD_REQUEST", oVar, this);
                return objB == aVar3 ? aVar3 : objB;
        }
    }
}
