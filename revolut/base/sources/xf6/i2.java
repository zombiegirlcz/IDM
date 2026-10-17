package xf6;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.clients_list.clients_list_screen.ClientsListScreenContract$Input;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class i2 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientsListScreenContract$Input f304889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f304890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f304891c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f304892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f304893h;

    public i2(w2 w2Var, x2 x2Var, il6.a aVar, ClientsListScreenContract$Input clientsListScreenContract$Input) {
        this.f304890b = w2Var;
        this.f304889a = clientsListScreenContract$Input;
        int i = 7;
        this.f304891c = e4m.b.b(new t1(w2Var, this, 2, i));
        this.d = e4m.b.b(new t1(w2Var, this, 1, i));
        this.e = e4m.b.b(new t1(w2Var, this, 0, i));
        this.f = e4m.b.b(new t1(w2Var, this, 3, i));
        this.f304892g = e4m.b.b(new t1(w2Var, this, 5, i));
        this.f304893h = e4m.b.b(new t1(w2Var, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
