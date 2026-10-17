package oi4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import te0.w;

/* JADX INFO: loaded from: classes22.dex */
public final class o extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f225443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ zm3.i f225444x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(p pVar, zm3.i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f225443w = pVar;
        this.f225444x = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new o(this.f225443w, this.f225444x, continuation, 0);
            default:
                return new o(this.f225443w, this.f225444x, continuation, 1);
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
        Object objB;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                p pVar = this.f225443w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    hw3.c cVar = pVar.f225446q;
                    String applicationId = pVar.f225447r.f68457a.f66892b;
                    String phone = this.f225444x.f323351b;
                    if (phone == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    p24.p pVar2 = cVar.f156055a;
                    pVar2.getClass();
                    Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                    Intrinsics.checkNotNullParameter(phone, "phone");
                    d0<tt3.a> d0VarSubmitSpousalConsent = pVar2.f232057c.submitSpousalConsent(applicationId, new tz3.n(phone));
                    p24.b bVar = new p24.b(12, new p24.e(pVar2, 9));
                    d0VarSubmitSpousalConsent.getClass();
                    ufm.i iVar = new ufm.i(d0VarSubmitSpousalConsent, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.n nVarI0 = w.i0(iVar);
                    this.v = 1;
                    objB = nim.a.b(nVarI0, this);
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                it3.d dVar = (it3.d) objB;
                Intrinsics.h(dVar);
                yji.l.a1(pVar, pVar.X1(new y0("STATUS_DIALOG_REQUEST_SENT_SUCCESS_ID", new j0((Clause) new TextLocalisedClause(R$string.spousal_consent_initiator_common_checking_request_consent_dialog_request_sent_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.spousal_consent_initiator_common_checking_request_consent_dialog_request_sent_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4092), false, 4)), null, null, new o95.c(pVar, dVar, null, 22), 3);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    p pVar3 = this.f225443w;
                    o oVar = new o(pVar3, this.f225444x, null, 0);
                    this.v = 1;
                    if (pVar3.p2(this, oVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
