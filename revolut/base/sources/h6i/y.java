package h6i;

import com.revolut.core.model.account.AccountId;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.api.model.OrderMode;
import java.io.Serializable;
import java.util.List;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes10.dex */
public final class y implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f149738a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FlowCollector f149739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f149740c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Serializable f149741g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f149742h;

    public y(FlowCollector flowCollector, b6i.l lVar, xi0.b bVar, AccountWrapper accountWrapper, e0 e0Var, xi0.b bVar2, AccountWrapper accountWrapper2) {
        this.f149739b = flowCollector;
        this.f = lVar;
        this.f149741g = bVar;
        this.d = accountWrapper;
        this.f149740c = e0Var;
        this.f149742h = bVar2;
        this.e = accountWrapper2;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object emit(java.lang.Object r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.y.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public y(FlowCollector flowCollector, e0 e0Var, AccountWrapper accountWrapper, AccountWrapper accountWrapper2, b6i.j jVar, b6i.l lVar, OrderMode orderMode) {
        this.f149739b = flowCollector;
        this.f149740c = e0Var;
        this.d = accountWrapper;
        this.e = accountWrapper2;
        this.f149741g = jVar;
        this.f = lVar;
        this.f149742h = orderMode;
    }

    public y(FlowCollector flowCollector, urj.n nVar, uzi.b bVar, xi0.b bVar2, od0.i iVar, List list, AccountId accountId) {
        this.f149739b = flowCollector;
        this.f = nVar;
        this.f149742h = bVar;
        this.f149741g = bVar2;
        this.d = iVar;
        this.e = list;
        this.f149740c = accountId;
    }
}
