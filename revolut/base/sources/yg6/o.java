package yg6;

import com.revolut.feature.external_accounts.api.model.LinkedAccountPayload;
import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends gim.i implements Function2 {
    public p u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f313555w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f313556x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ LinkedAccountPayload f313557y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, String str, LinkedAccountPayload linkedAccountPayload, Continuation continuation) {
        super(2, continuation);
        this.f313555w = pVar;
        this.f313556x = str;
        this.f313557y = linkedAccountPayload;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.f313555w, this.f313556x, this.f313557y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        p pVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            p pVar2 = this.f313555w;
            com.revolut.feature.external_accounts.api.navigation.a aVar2 = pVar2.f313559n;
            LinkedAccountPayload linkedAccountPayload = this.f313557y;
            ym6.d dVar = (ym6.d) aVar2;
            ufm.i iVarB = dVar.b(new ExternalAccountsFeatureConfig.Configuration.TrueLayer(this.f313556x, null, null, null, null, null, linkedAccountPayload.d, linkedAccountPayload.f72221b, 4061), null, true);
            this.u = pVar2;
            this.v = 1;
            Object objB = nim.a.b(iVarB, this);
            if (objB == aVar) {
                return aVar;
            }
            pVar = pVar2;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return pVar.A2(new BridgeDestination((NaviCommand) obj2));
    }
}
