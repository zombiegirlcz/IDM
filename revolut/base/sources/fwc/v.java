package fwc;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.eac.CertificateBody;
import zh9.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends gim.i implements Function2 {
    public com.revolut.feature.security_hub.impl.ui.transactions_limits.a u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.security_hub.impl.ui.transactions_limits.a f138618w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar, Continuation continuation) {
        super(2, continuation);
        this.f138618w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new v(this.f138618w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((v) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            com.revolut.feature.security_hub.impl.ui.transactions_limits.a aVar3 = this.f138618w;
            ufm.i iVarB = ((ym6.d) aVar3.f85750s).b(new ExternalAccountsFeatureConfig.Configuration.TrueLayer(null, null, null, null, null, null, false, null, 16381), new ExternalAccountsFeatureConfig.Configuration.DirectLink(null, null, null, null, null, CertificateBody.profileType), true);
            this.u = aVar3;
            this.v = 1;
            Object objB = nim.a.b(iVarB, this);
            if (objB == aVar2) {
                return aVar2;
            }
            aVar = aVar3;
            obj2 = objB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "await(...)");
        return aVar.C1(u0.b((NaviCommand) obj2));
    }
}
