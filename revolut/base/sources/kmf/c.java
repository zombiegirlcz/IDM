package kmf;

import ah1.p;
import amf.o;
import go.g;
import kkf.i9;
import kkf.y0;
import klf.h0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import okf.k;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends hmf.a {
    public final h0 e;
    public final i9 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k f185820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f185821h;
    public final amf.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final kge.d f185822j;
    public final y0 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final clf.a f185823l;

    public c(h0 commonDataSource, i9 userCommentBlockProvider, k creditCardInstalmentBlockProvider, o userCommentMenuOptionProvider, amf.c hideTransactionMenuOptionProvider, kge.d creditCardInstalmentHeaderProvider, y0 equivalentBlockProvider, clf.a slotBlockProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(userCommentBlockProvider, "userCommentBlockProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentBlockProvider, "creditCardInstalmentBlockProvider");
        Intrinsics.checkNotNullParameter(userCommentMenuOptionProvider, "userCommentMenuOptionProvider");
        Intrinsics.checkNotNullParameter(hideTransactionMenuOptionProvider, "hideTransactionMenuOptionProvider");
        Intrinsics.checkNotNullParameter(creditCardInstalmentHeaderProvider, "creditCardInstalmentHeaderProvider");
        Intrinsics.checkNotNullParameter(equivalentBlockProvider, "equivalentBlockProvider");
        Intrinsics.checkNotNullParameter(slotBlockProvider, "slotBlockProvider");
        this.e = commonDataSource;
        this.f = userCommentBlockProvider;
        this.f185820g = creditCardInstalmentBlockProvider;
        this.f185821h = userCommentMenuOptionProvider;
        this.i = hideTransactionMenuOptionProvider;
        this.f185822j = creditCardInstalmentHeaderProvider;
        this.k = equivalentBlockProvider;
        this.f185823l = slotBlockProvider;
    }

    @Override // hmf.b0
    public final Flow a() {
        return h(v.k(this.f185823l.Z2(), this.k.a(), this.f.a(), this.f185820g.Z2()));
    }

    @Override // hmf.b0
    public final Flow b() {
        return this.f185822j.s();
    }

    @Override // hmf.b0
    public final Flow d() {
        return new g(f0.f322471a, 2);
    }

    @Override // hmf.b0
    public final Flow e() {
        return g(v.k(this.f185821h.a(new p(29)), this.i.a()));
    }

    @Override // hmf.a
    public final h0 i() {
        return this.e;
    }
}
