package tjh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class s implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Flow f271767a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WealthAccount f271768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f271769c;

    public s(Flow flow, WealthAccount wealthAccount, int i) {
        this.f271767a = flow;
        this.f271768b = wealthAccount;
        this.f271769c = i;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f271767a.collect(new dmf.a(flowCollector, this.f271768b, this.f271769c), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
