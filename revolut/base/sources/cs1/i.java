package cs1;

import cli.n;
import cli.o;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import p5k.v;
import p5k.w;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f108437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f108438b;

    public i(w transferBreakdownMapper, int i) {
        this.f108437a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(transferBreakdownMapper, "transferBreakdownMapper");
                this.f108438b = transferBreakdownMapper;
                break;
            default:
                Intrinsics.checkNotNullParameter(transferBreakdownMapper, "transferBreakdownMapper");
                this.f108438b = transferBreakdownMapper;
                break;
        }
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        switch (this.f108437a) {
            case 0:
                d domainState = (d) jVar;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                ArrayList arrayListA = w.a(this.f108438b, domainState.f108431a, new v(domainState.f108432b, true, false), domainState.f108433c, domainState.d, null, true, null, null, null, null, null, null, null, null, 32704);
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                return new h(arrayListA);
            default:
                io1.d domainState2 = (io1.d) jVar;
                Intrinsics.checkNotNullParameter(domainState2, "domainState");
                ArrayList arrayListA2 = w.a(this.f108438b, domainState2.f163136a, new v(domainState2.f163137b, true, false), domainState2.f163138c, domainState2.d, null, true, null, null, null, null, null, null, null, null, 32704);
                yp0.b.k(arrayListA2, 0, 0, 0, 0, 31);
                return new io1.f(arrayListA2);
        }
    }
}
