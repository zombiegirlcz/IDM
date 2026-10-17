package xvf;

import a82.s;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import vkm.q;
import vkm.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends oki.h implements h {

    @NotNull
    public static final l Companion = new l();
    public final ouf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c70.a f309255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l80.e f309256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f309257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public a2 f309258s;

    public m(ouf.a interactor, c70.a clipboard, l80.e dateProvider, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = interactor;
        this.f309255p = clipboard;
        this.f309256q = dateProvider;
        this.f309257r = mra.d.b(this, new f(new Data(null, null, true, 3, null), 0L), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new xb4.e(this, null, 13), new yi5.b(26));
    }

    @Override // yji.l
    public final void P1() {
        a2 a2Var = this.f309258s;
        if (a2Var != null) {
            a2Var.f(null);
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        a2 a2Var = this.f309258s;
        Continuation continuation = null;
        if (a2Var != null) {
            a2Var.f(null);
        }
        this.f309258s = yji.l.a1(this, q.Q(new t0(this.f309257r.B(new xub.e(14)), 1), new x18.e(continuation, this, 20)), null, null, new s(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f309257r;
    }
}
