package xb1;

import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class j implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseScreen f303932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f303933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f303934c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f303935g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f303936h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f303937j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f303938l;

    public j(p pVar, n nVar, BaseScreen baseScreen) {
        this.f303933b = pVar;
        this.f303932a = baseScreen;
        this.f303934c = e4m.b.b(new wpg.g(pVar, nVar, this, 1, 8));
        this.d = e4m.b.b(new wpg.g(pVar, nVar, this, 0, 8));
        this.e = e4m.b.b(e4m.c.a(baseScreen));
        this.f = e4m.b.b(new wpg.g(pVar, nVar, this, 3, 8));
        this.f303935g = e4m.b.b(new wpg.g(pVar, nVar, this, 2, 8));
        this.f303936h = e4m.b.b(new wpg.g(pVar, nVar, this, 5, 8));
        this.i = e4m.b.b(new wpg.g(pVar, nVar, this, 4, 8));
        this.f303937j = e4m.b.b(new wpg.g(pVar, nVar, this, 7, 8));
        this.k = e4m.b.b(new wpg.g(pVar, nVar, this, 8, 8));
        this.f303938l = e4m.b.b(new wpg.g(pVar, nVar, this, 6, 8));
    }

    @Override // sji.b
    public final Set f() {
        return Collections.singleton((yji.n) this.i.get());
    }

    @Override // sji.b
    public final Set g() {
        ArrayList arrayList = new ArrayList(2);
        kii.e.w(this.d, "Set contributions cannot be null", arrayList);
        return kii.e.C(this.f303935g, "Set contributions cannot be null", arrayList) ? Collections.EMPTY_SET : arrayList.size() == 1 ? Collections.singleton(arrayList.get(0)) : j6.a.A(arrayList);
    }
}
