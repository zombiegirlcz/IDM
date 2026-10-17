package mb3;

import android.app.Activity;
import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f204080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f204081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f204082c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f204083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f204084h;
    public final e4m.e i;

    public l(p pVar, k kVar, ViewController viewController, Activity activity) {
        this.f204080a = activity;
        this.f204081b = e4m.b.b(e4m.c.a(viewController));
        int i = 25;
        this.f204082c = e4m.b.b(new lzk.b(pVar, this, 2, i));
        this.d = e4m.b.b(new lzk.b(pVar, this, 1, i));
        this.e = e4m.b.b(new lzk.b(pVar, this, 0, i));
        this.f = e4m.b.b(new lzk.b(pVar, this, 3, i));
        this.f204083g = e4m.b.b(new lzk.b(pVar, this, 6, i));
        this.f204084h = e4m.b.b(new lzk.b(pVar, this, 5, i));
        this.i = e4m.b.b(new lzk.b(pVar, this, 4, i));
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
