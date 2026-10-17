package bnh;

import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.models.robo.RoboPortfolioInfo;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jhi.b f17196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WealthAccount.Robo f17197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RoboPortfolioInfo f17198c;
    public final /* synthetic */ del.b d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ vel.l f;

    public m(jhi.b bVar, WealthAccount.Robo robo, RoboPortfolioInfo roboPortfolioInfo, del.b bVar2, boolean z, vel.l lVar) {
        this.f17196a = bVar;
        this.f17197b = robo;
        this.f17198c = roboPortfolioInfo;
        this.d = bVar2;
        this.e = z;
        this.f = lVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f17196a.collect(new l(flowCollector, this.f17197b, this.f17198c, this.d, this.e, this.f), continuation);
        return objCollect == fim.a.COROUTINE_SUSPENDED ? objCollect : Unit.f186387a;
    }
}
