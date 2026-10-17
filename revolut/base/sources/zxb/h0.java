package zxb;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.rev_points.impl.ui.transactions.details.RevPointsTransactionDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class h0 implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f326157a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsTransactionDetailsScreenContract$InputData f326158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f326159c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f326160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f326161h;

    public h0(e eVar, m mVar, ViewController viewController, RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData) {
        this.f326159c = eVar;
        this.f326158b = revPointsTransactionDetailsScreenContract$InputData;
        int i = 5;
        this.d = e4m.b.b(new s(eVar, this, 1, i));
        this.e = e4m.b.b(new s(eVar, this, 0, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 5;
        this.f326160g = e4m.b.b(new s(eVar, this, 3, i2));
        this.f326161h = e4m.b.b(new s(eVar, this, 2, i2));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f326157a) {
        }
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f326157a) {
        }
        return ImmutableSet.of();
    }

    public h0(e eVar, ViewController viewController, RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData) {
        this.f326159c = eVar;
        this.f326158b = revPointsTransactionDetailsScreenContract$InputData;
        int i = 7;
        this.d = e4m.b.b(new s(eVar, this, 1, i));
        this.e = e4m.b.b(new s(eVar, this, 0, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 7;
        this.f326160g = e4m.b.b(new s(eVar, this, 3, i2));
        this.f326161h = e4m.b.b(new s(eVar, this, 2, i2));
    }

    public h0(e eVar, f0 f0Var, ViewController viewController, RevPointsTransactionDetailsScreenContract$InputData revPointsTransactionDetailsScreenContract$InputData) {
        this.f326159c = eVar;
        this.f326158b = revPointsTransactionDetailsScreenContract$InputData;
        int i = 6;
        this.d = e4m.b.b(new s(eVar, this, 1, i));
        this.e = e4m.b.b(new s(eVar, this, 0, i));
        this.f = e4m.b.b(e4m.c.a(viewController));
        int i2 = 6;
        this.f326160g = e4m.b.b(new s(eVar, this, 3, i2));
        this.f326161h = e4m.b.b(new s(eVar, this, 2, i2));
    }
}
