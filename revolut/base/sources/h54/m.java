package h54;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.credit.core.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.j0;
import nii.u1;
import nii.y0;

/* JADX INFO: loaded from: classes22.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.application.d f149481w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ it3.d f149482x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar, it3.d dVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f149481w = dVar;
        this.f149482x = dVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f149481w, this.f149482x, continuation, 0);
            case 1:
                return new m(this.f149481w, this.f149482x, continuation, 1);
            case 2:
                return new m(this.f149481w, this.f149482x, continuation, 2);
            case 3:
                return new m(this.f149481w, this.f149482x, continuation, 3);
            case 4:
                return new m(this.f149481w, this.f149482x, continuation, 4);
            default:
                return new m(this.f149481w, this.f149482x, continuation, 5);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f149481w.Q2(this.f149482x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                it3.d dVar = this.f149482x;
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar2 = this.f149481w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    ow3.e eVar = dVar2.f67092r;
                    String str = dVar.f168323a;
                    this.v = 1;
                    if (eVar.b(str, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.a1(dVar2, dVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_status_dialog_canceled_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_status_dialog_canceled_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new n(dVar2, dVar, null, 1), 3);
            case 2:
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
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar3 = this.f149481w;
                m mVar = new m(dVar3, this.f149482x, null, 1);
                this.v = 1;
                Object objP2 = dVar3.p2(this, mVar);
                return objP2 == aVar3 ? aVar3 : objP2;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (this.f149481w.Q2(this.f149482x, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                it3.d dVar4 = this.f149482x;
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar5 = this.f149481w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    ow3.e eVar2 = dVar5.f67092r;
                    String str2 = dVar4.f168323a;
                    this.v = 1;
                    if (eVar2.b(str2, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.a1(dVar5, dVar5.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_status_dialog_canceled_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.credit_application_cancellation_cancel_application_status_dialog_canceled_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4092), false, 5)), null, null, new n(dVar5, dVar4, null, 4), 3);
            default:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 != 0) {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.credit.application.plugins.impl.ui.application.d dVar6 = this.f149481w;
                m mVar2 = new m(dVar6, this.f149482x, null, 4);
                this.v = 1;
                Object objP22 = dVar6.p2(this, mVar2);
                return objP22 == aVar6 ? aVar6 : objP22;
        }
    }
}
