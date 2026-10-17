package j6f;

import ieg.z;
import java.util.ArrayList;
import java.util.List;
import k50.a4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements cli.n {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k6f.f f171752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6f.m f171753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k6f.k f171754c;
    public final n d;

    public q(k6f.f assetsMapper, k6f.m sectorsMapper, k6f.k regionsMapper, k6f.n topHoldingsMapper, n allocationSubheaderProvider, k6f.h rebalanceStatusMapper, k6f.g closureStatusMapper) {
        Intrinsics.checkNotNullParameter(assetsMapper, "assetsMapper");
        Intrinsics.checkNotNullParameter(sectorsMapper, "sectorsMapper");
        Intrinsics.checkNotNullParameter(regionsMapper, "regionsMapper");
        Intrinsics.checkNotNullParameter(topHoldingsMapper, "topHoldingsMapper");
        Intrinsics.checkNotNullParameter(allocationSubheaderProvider, "allocationSubheaderProvider");
        Intrinsics.checkNotNullParameter(rebalanceStatusMapper, "rebalanceStatusMapper");
        Intrinsics.checkNotNullParameter(closureStatusMapper, "closureStatusMapper");
        this.f171752a = assetsMapper;
        this.f171753b = sectorsMapper;
        this.f171754c = regionsMapper;
        this.d = allocationSubheaderProvider;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        a state = (a) jVar;
        Intrinsics.checkNotNullParameter(state, "domainState");
        s0 s0Var = new s0(2);
        s0Var.b(((List) iii.c.f(state.f171739a, new j3f.d(21), new j0g.b(24), new z(this, state, 21))).toArray(new koi.j[0]));
        Intrinsics.checkNotNullParameter(state, "state");
        s0Var.b(((List) iii.c.f(state.f171739a, new a4(25), new k1f.n(15), new jb8.b(28))).toArray(new koi.j[0]));
        ArrayList arrayList = s0Var.f186433a;
        return new c(v.k(arrayList.toArray(new koi.j[arrayList.size()])));
    }
}
