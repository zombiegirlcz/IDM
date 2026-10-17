package pgf;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.transactions.api.navigation.ScheduledPaymentsInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import yji.n;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mkd.g f235884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScheduledPaymentsInputData f235885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f235886c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f235887g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f235888h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f235889j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f235890l;

    public c(e eVar, ViewController viewController, ScheduledPaymentsInputData scheduledPaymentsInputData, mkd.g gVar) {
        this.f235886c = eVar;
        this.f235884a = gVar;
        this.f235885b = scheduledPaymentsInputData;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 12;
        this.e = e4m.b.b(new pa6.f(eVar, this, 2, i));
        this.f = e4m.b.b(new pa6.f(eVar, this, 1, i));
        this.f235887g = e4m.b.b(new pa6.f(eVar, this, 0, i));
        this.f235888h = e4m.b.b(eVar.Y);
        this.i = e4m.b.b(new pa6.f(eVar, this, 3, i));
        this.f235889j = e4m.b.b(new pa6.f(eVar, this, 4, i));
        this.k = e4m.b.b(new pa6.f(eVar, this, 6, i));
        this.f235890l = e4m.b.b(new pa6.f(eVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((n) this.f235888h.get(), (n) this.i.get(), (n) this.f235889j.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f235887g.get());
    }
}
