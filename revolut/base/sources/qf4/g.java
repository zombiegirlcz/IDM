package qf4;

import cli.j;
import cli.n;
import cli.o;
import kotlin.jvm.internal.Intrinsics;
import pf4.u;
import q5g.f0;
import q87.z;
import qa9.r;
import scl.h;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f245240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pf4.b f245241b;

    public g(pf4.b mapper, int i) {
        this.f245240a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                this.f245241b = mapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(mapper, "mapper");
                this.f245241b = mapper;
                break;
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        switch (this.f245240a) {
            case 0:
                pf4.e domainState = (pf4.e) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return (u) iii.c.f(domainState.f235436b, new r(this, 28), new f0(this, 18), new z(this, domainState, 7));
            default:
                pf4.e domainState2 = (pf4.e) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                return (u) iii.c.f(domainState2.f235436b, new scl.e(this, 16), new h(this, 8), new rbe.c(this, domainState2, 29));
        }
    }
}
