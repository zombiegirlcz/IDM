package ufh;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import i4h.p0;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ufg.k0;
import vc.s;
import yji.n;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3h.b f279841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kgh.l f279842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e3h.i f279843c;
    public final ViewController d;
    public final f3h.a e;
    public final i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f279844g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f279845h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f279846j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f279847l;

    public g(i iVar, f3h.b bVar, f3h.a aVar, ViewController viewController, kgh.l lVar, e3h.i iVar2) {
        this.f = iVar;
        this.f279841a = bVar;
        this.f279842b = lVar;
        this.f279843c = iVar2;
        this.d = viewController;
        this.e = aVar;
        this.f279844g = e4m.b.b(new k0(iVar, this, 1, 5));
        this.f279845h = e4m.b.b(new k0(iVar, this, 0, 5));
        this.i = e4m.b.b(new k0(iVar, this, 2, 5));
        this.f279846j = e4m.b.b(new k0(iVar, this, 3, 5));
        this.k = e4m.b.b(new k0(iVar, this, 5, 5));
        this.f279847l = e4m.b.b(new k0(iVar, this, 4, 5));
    }

    @Override // xki.e
    public final Set f() {
        e3h.a extensions = (e3h.a) this.f279845h.get();
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        p0 controllerModelExtension = extensions.f122271b;
        Intrinsics.checkNotNullParameter(controllerModelExtension, "controllerModelExtension");
        return ImmutableSet.of((n) controllerModelExtension, dw3.l.m((d1h.e) this.f279846j.get()));
    }

    @Override // xki.e
    public final Set g() {
        yji.d dVarA = f0k.d.A(this.f279841a, (e3h.a) this.f279845h.get());
        gah.f fVarA = ((u8h.b) this.f.i).a();
        s.j(fVarA);
        return ImmutableSet.of((aah.g) dVarA, dw3.l.l(fVarA, (d1h.j) this.i.get(), (d1h.e) this.f279846j.get()));
    }
}
