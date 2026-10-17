package ow2;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.feature.card_add_to_googlepay.impl.R$string;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.y0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u = 0;
    public f0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f230288w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e f230289x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e eVar, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.f230289x = eVar;
        this.v = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f230289x, this.v, continuation);
            default:
                return new k(this.f230289x, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f0 f0Var;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.f230288w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e eVar = this.f230289x;
                mcg.j jVar = new mcg.j(eVar, this.v, null, 6);
                this.f230288w = 1;
                Object objB = pu7.a.B(eVar.k, "design_config", jVar, this);
                return objB == aVar ? aVar : objB;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f230288w;
                Continuation continuation = null;
                com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e eVar2 = this.f230289x;
                if (i2 == 0) {
                    o.b(obj2);
                    f0 f0Var2 = (f0) ((e) ((j2) eVar2.f64497s.f22677a).getValue()).f230277a.getContent();
                    if (f0Var2 == null) {
                        return Unit.f186387a;
                    }
                    ol8.e eVar3 = new ol8.e(eVar2, f0Var2, continuation, 9);
                    this.v = f0Var2;
                    this.f230288w = 1;
                    if (eVar2.p2(this, eVar3) == aVar2) {
                        return aVar2;
                    }
                    f0Var = f0Var2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f0Var = this.v;
                    o.b(obj2);
                }
                yji.l.a1(eVar2, eVar2.X1(new y0(null, new j0((Clause) new TextLocalisedClause(R$string.google_pay_in_app_verification_success_title, null, null, 14), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4094), false, 5)), null, null, new oli.f(eVar2, f0Var, continuation, 27), 3);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e eVar, Continuation continuation) {
        super(2, continuation);
        this.f230289x = eVar;
    }
}
