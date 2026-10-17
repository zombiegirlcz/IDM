package pri;

import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ifm.b f239031a = new ifm.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f239032b = new g();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f239033c = j.b(new lm.d(21));
    public final Lazy d = j.b(new lm.d(22));
    public final ihm.f e = v0.a.d("create(...)");
    public WeakReference f = new WeakReference(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f239034g;

    public final ifm.b G() {
        return this.f239031a;
    }

    public void I() {
        l();
    }

    public final Function0 J() {
        return (Function0) this.d.getValue();
    }

    public Function1 K() {
        return (Function1) this.f239033c.getValue();
    }

    public final rri.a L() {
        return (rri.a) this.f.get();
    }

    public void M(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
    }

    @Override // pri.e
    public void h(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f = new WeakReference(view);
        if (!this.f239034g) {
            this.f239034g = true;
            M(view);
        }
        Intrinsics.checkNotNullParameter(view, "view");
        this.e.onNext(new ch.b(11));
    }

    @Override // pri.e
    public boolean isAttached() {
        return L() != null;
    }

    @Override // pri.e
    public void l() {
        this.f239031a.d();
        this.f.clear();
    }
}
