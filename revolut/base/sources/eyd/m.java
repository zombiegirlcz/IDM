package eyd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.statements.impl.ui.consolidated.screen.ConsolidatedStatementScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConsolidatedStatementScreenContract$InputData f130782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f130783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f130784c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f130785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f130786h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f130787j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f130788l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f130789m;

    public m(b0 b0Var, l lVar, ViewController viewController, ConsolidatedStatementScreenContract$InputData consolidatedStatementScreenContract$InputData) {
        this.f130783b = b0Var;
        this.f130782a = consolidatedStatementScreenContract$InputData;
        this.f130784c = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.d = e4m.b.b(new j(b0Var, this, 2, i));
        this.e = e4m.b.b(new j(b0Var, this, 4, i));
        this.f = e4m.b.b(new j(b0Var, this, 5, i));
        this.f130785g = e4m.b.b(new j(b0Var, this, 3, i));
        this.f130786h = e4m.b.b(new j(b0Var, this, 1, i));
        this.i = e4m.b.b(new j(b0Var, this, 0, i));
        this.f130787j = e4m.b.b(new j(b0Var, this, 6, i));
        this.k = e4m.b.b(new j(b0Var, this, 7, i));
        this.f130788l = e4m.b.b(new j(b0Var, this, 9, i));
        this.f130789m = e4m.b.b(new j(b0Var, this, 8, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.k.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.f130787j.get());
    }
}
