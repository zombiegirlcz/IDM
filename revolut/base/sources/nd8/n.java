package nd8;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.junior_consent.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import vkm.z1;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f214343w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(q qVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f214343w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f214343w, continuation, 0);
            case 1:
                return new n(this.f214343w, continuation, 1);
            default:
                return new n(this.f214343w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                q qVar = this.f214343w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    kd8.e eVar = qVar.f214346q;
                    String str = qVar.o.f214337a;
                    v6d.a aVar2 = v6d.a.BLANK_CARD_DELIVERY;
                    this.v = 1;
                    if (eVar.b(str, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                z1 z1Var = qVar.f214347r.f.f263838a;
                Unit unit = Unit.f186387a;
                z1Var.k(unit);
                return unit;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                Continuation continuation = null;
                q qVar2 = this.f214343w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    n nVar = new n(qVar2, continuation, 0);
                    this.v = 1;
                    if (u0.b0(qVar2.X(), "BLANK_CARD_DELIVERY_PRIMARY_BUTTON_LOADING_TAG", nVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return yji.l.b1(qVar2, qVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.junior_blank_card_delivery_consent_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, new o(qVar2, null, 0), 3);
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                q qVar3 = this.f214343w;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    kd8.e eVar2 = qVar3.f214346q;
                    String str2 = qVar3.o.f214337a;
                    v6d.a aVar5 = v6d.a.BLANK_CARD_DELIVERY;
                    this.v = 1;
                    if (eVar2.d(str2, aVar5, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                z1 z1Var2 = qVar3.f214347r.f.f263838a;
                Unit unit2 = Unit.f186387a;
                z1Var2.k(unit2);
                return unit2;
        }
    }
}
