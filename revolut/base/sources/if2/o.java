package if2;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f160893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f160894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f160895c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f160896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f160897h;

    public o(f fVar, ViewController viewController) {
        this.f160893a = fVar;
        this.f160894b = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.f160895c = e4m.b.b(new i9e.l(fVar, this, 2, i));
        this.d = e4m.b.b(new i9e.l(fVar, this, 1, i));
        this.e = e4m.b.b(new i9e.l(fVar, this, 0, i));
        this.f = e4m.b.b(new i9e.l(fVar, this, 4, i));
        this.f160896g = e4m.b.b(new i9e.l(fVar, this, 3, i));
        this.f160897h = e4m.b.b(new i9e.l(fVar, this, 5, i));
    }

    @Override // xki.e
    public final Set f() {
        Object interactor = (zf2.a) this.f160893a.K.get();
        xg2.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        yji.n nVar = (yji.n) interactor;
        vc.s.k(nVar);
        return ImmutableSet.of(nVar, (yji.n) this.f160896g.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
