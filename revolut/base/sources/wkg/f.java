package wkg;

import efm.r;
import jki.i;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wk2.x;
import yji.l;

/* JADX INFO: loaded from: classes9.dex */
public final class f extends jki.g implements jki.h {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zkg.b f298285p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f298286q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p stateMapper, zkg.b atomicInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(atomicInteractor, "atomicInteractor");
        this.f298285p = atomicInteractor;
        this.f298286q = new b(false);
    }

    @Override // yji.l
    public final void I1() {
        l2(new w76.a(this, null, 18), new x(this, 2));
        zkg.d dVar = (zkg.d) this.f298285p;
        r map = dVar.f322979b.f306810a.map(new zii.e(new zhf.f(dVar, 10), 6));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        l.a1(this, rd0.e.b(map), null, null, new wka.e(this, null, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        if (((b) t2()).f298283a) {
            v2(new c(false));
        }
    }

    @Override // jki.g
    public final i r2() {
        return this.f298286q;
    }
}
