package pqg;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.navigation.ExchangeBreakdownFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ bw0.m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f238740w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(bw0.m mVar, i0 i0Var, Continuation continuation) {
        super(1, continuation);
        this.v = mVar;
        this.f238740w = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new g0(this.v, this.f238740w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((g0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        i0 i0Var = this.f238740w;
        if (i == 0) {
            yhm.o.b(obj2);
            bw0.m mVar = this.v;
            if (!Intrinsics.f(mVar != null ? mVar.e : null, "AMOUNT_EDIT_END_HINT_EXCHANGE_OUTPUT_INFO_ID")) {
                return Unit.f186387a;
            }
            acb.j jVar = i0Var.f238743y;
            acb.c cVar = new acb.c(((o) i0Var.t2()).a(i0Var.z), ((o) i0Var.t2()).f238752g, ((o) i0Var.t2()).f238749a);
            c4i.a aVar2 = c4i.a.VAULT_TRANSFER;
            k9 k9Var = k9.Savings;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            AnalyticsProduct.Retail retailH = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
            this.u = 1;
            obj2 = jVar.b(cVar, aVar2, retailH, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return i0Var.C1(new BridgeDestination(new FeatureCommand((ExchangeBreakdownFeatureConfig) obj2)));
    }
}
