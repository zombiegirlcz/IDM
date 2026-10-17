package z9h;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.wealth.impl.ui.flows.create_add_money_request.CollectDepositInfoFlowContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements xki.c, zbh.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CollectDepositInfoFlowContract$Input f320383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ozg.a f320384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f320385c;
    public final a d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f320386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f320387h;

    public a(d dVar, CollectDepositInfoFlowContract$Input collectDepositInfoFlowContract$Input, ozg.a aVar) {
        this.f320385c = dVar;
        this.f320383a = collectDepositInfoFlowContract$Input;
        this.f320384b = aVar;
        int i = 15;
        this.e = e4m.b.b(new yxj.c(this, 1, i));
        this.f = e4m.b.b(new yxj.c(this, 0, i));
        this.f320386g = e4m.b.b(new yxj.c(this, 2, i));
        this.f320387h = e4m.b.b(new yxj.c(this, 3, i));
    }

    @Override // zbh.c
    public final m b() {
        return new m(this.f320385c, this.d, 1);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
