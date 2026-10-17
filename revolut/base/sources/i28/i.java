package i28;

import com.revolut.feature.separate_favourites.api.alerts.AlertsFeatureConfig;
import com.revolut.feature.shared_separate_favourites.api.alerts.navigation.SharedAlertsConfiguration;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ n u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(n nVar, Continuation continuation) {
        super(2, continuation);
        this.u = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        j28.g.Companion.getClass();
        Set set = j28.g.f170724b;
        this.u.f157898a.a(u0.c(new AlertsFeatureConfig.AlertsScreen(new SharedAlertsConfiguration(set, set, (mgd.d) null, (SharedAlertsConfiguration.Action.CreateAlert) null, false, 60))));
        return Unit.f186387a;
    }
}
