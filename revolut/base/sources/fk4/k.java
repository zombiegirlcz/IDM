package fk4;

import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import grl.k9;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class k extends gim.i implements Function2 {
    public q u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q f135711w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(q qVar, Continuation continuation) {
        super(2, continuation);
        this.f135711w = qVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new k(this.f135711w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        q qVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            q qVar2 = this.f135711w;
            com.revolut.feature.external_accounts.api.navigation.a aVar2 = qVar2.f135717q;
            Integer num = new Integer(1000);
            k9 k9Var = k9.Credit;
            Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
            ufm.i iVarB = ((ym6.d) aVar2).b(null, new ExternalAccountsFeatureConfig.Configuration.DirectLink(num, null, null, null, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), 86), false);
            this.u = qVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarB, this);
            if (objB == aVar) {
                return aVar;
            }
            qVar = qVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return qVar.C1(new BridgeDestination((NaviCommand) obj2));
    }
}
