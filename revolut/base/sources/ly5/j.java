package ly5;

import cli.n;
import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.z1;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends oki.h implements e {

    @NotNull
    public static final h Companion = new h();
    public final x8h.g o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z1 f200702p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f200703q;

    public j(n stateMapper, x8h.g collectionsInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(collectionsInteractor, "collectionsInteractor");
        this.o = collectionsInteractor;
        z1 z1VarB = q.b(0, 2, ukm.f.DROP_OLDEST);
        z1VarB.k(Unit.f186387a);
        this.f200702p = z1VarB;
        this.f200703q = mra.d.b(this, new f(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, nim.a.v(q.Q(this.f200702p, new li2.f(continuation, this, 16)), new lv9.c(25)), null, new lph.h(this, continuation, 13), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f200703q;
    }
}
