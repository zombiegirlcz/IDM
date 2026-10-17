package je5;

import cli.y;
import je5.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q extends oki.h implements f {

    @NotNull
    public static final o Companion = new o();
    public final h o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ge5.a f173227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f173228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ce9.j f173229r;

    public q(cli.n stateMapper, h inputData, ge5.a cryptoPairsItemProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoPairsItemProvider, "cryptoPairsItemProvider");
        this.o = inputData;
        this.f173227p = cryptoPairsItemProvider;
        this.f173228q = mra.d.b(this, new g(new ce9.p(null, null, 61), 2), stateMapper, null, false, 12);
        this.f173229r = new ce9.j(new j7b.m(23), new jch.p(this, 10));
    }

    @Override // yji.l
    public final void I1() {
        n nVar = new n(0);
        y yVar = this.f173228q;
        H2(yVar, nVar);
        ce9.j jVar = this.f173229r;
        yji.l.a1(this, rd0.e.b(jVar.e), null, null, new j82.q(this, null, 15), 3);
        m70.a.c(t0.f186434a);
        H2(yVar, new jb8.a("", 4));
        io3.h.a(jVar, ce9.n.FORCE_REFRESH);
    }

    public final void I2(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean zF = Intrinsics.f(event, i.a.f173219a);
        ce9.j jVar = this.f173229r;
        if (zF) {
            io3.h.a(jVar, ce9.n.RETRY_LAST_PAGE);
            return;
        }
        if (event instanceof j) {
            C2(new ee5.a(((j) event).f173220a));
            return;
        }
        if (event instanceof k) {
            k kVar = (k) event;
            io3.h.p(jVar, kVar.f173221a, kVar.f173222b);
        } else {
            if (!(event instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            H2(this.f173228q, new jb8.a(((l) event).f173223a, 4));
            io3.h.a(jVar, ce9.n.FORCE_REFRESH);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f173228q;
    }
}
