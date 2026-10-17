package ya5;

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
import kotlin.jvm.internal.Intrinsics;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import skm.e0;
import skm.p0;
import twb.b0;
import vkm.q;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f311941w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ dj0.d f311942x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(l lVar, dj0.d dVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f311941w = lVar;
        this.f311942x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f311941w, this.f311942x, continuation, 0);
            default:
                return new k(this.f311941w, this.f311942x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        l lVar = this.f311941w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    ra5.b bVar = lVar.o;
                    String str = lVar.f311946s;
                    this.v = 1;
                    ua5.e eVar = (ua5.e) bVar.f252783a;
                    eVar.getClass();
                    b0 b0Var = new b0(this.f311942x, eVar, str, null, 8);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, b0Var, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                int i5 = 0;
                dj0.d amount = this.f311942x;
                Continuation continuation = null;
                if (i3 == 0) {
                    o.b(obj2);
                    k kVar = new k(lVar, amount, continuation, i5);
                    this.v = 1;
                    if (lVar.p2(this, kVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        lVar.B2();
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                }
                tji.f fVarX = lVar.X();
                lVar.f311944q.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                rv6.e eVarD = fVarX.d(new y0("repayment_success_status_dialog", new j0((Clause) new TextLocalisedClause(R$string.post_termination_plan_repayment_success, u.c(sx4.f.b(3, null, null, amount)), null, 12), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 4));
                xsd.a aVar2 = new xsd.a(2, 5, null);
                this.v = 2;
                if (q.y(eVarD, aVar2, this) == aVar) {
                    return aVar;
                }
                lVar.B2();
                return Unit.f186387a;
        }
    }
}
