package cu1;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.blik.impl.ui.code.BlikCodeScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class l implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlikCodeScreenContract$InputData f108758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f108759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f108760c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f108761g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f108762h;
    public final e4m.e i;

    public l(k kVar, o oVar, ari.a aVar, BaseScreen baseScreen, BlikCodeScreenContract$InputData blikCodeScreenContract$InputData) {
        this.f108759b = kVar;
        this.f108758a = blikCodeScreenContract$InputData;
        int i = 21;
        this.f108760c = e4m.b.b(new afj.d(kVar, oVar, this, 1, i));
        this.d = e4m.b.b(new afj.d(kVar, oVar, this, 0, i));
        this.e = e4m.b.b(e4m.c.a(baseScreen));
        this.f = e4m.b.b(new afj.d(kVar, oVar, this, 3, i));
        this.f108761g = e4m.b.b(new afj.d(kVar, oVar, this, 5, i));
        this.f108762h = e4m.b.b(new afj.d(kVar, oVar, this, 4, i));
        this.i = e4m.b.b(new afj.d(kVar, oVar, this, 2, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.d.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of();
    }
}
