package tk9;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi9.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends jki.g implements e {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f271919p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f271920q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f271921r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f271922s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(xh9.a payLaterInteractor, c0 payLaterRepayItemFactory, j60.a bottomDialog, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterRepayItemFactory, "payLaterRepayItemFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f271919p = payLaterInteractor;
        this.f271920q = payLaterRepayItemFactory;
        this.f271921r = bottomDialog;
        this.f271922s = new d(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(nim.a.w(((ti9.g) this.f271919p).n(), new tfh.a(19))), null, null, new t9h.b(this, null, 25), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f271922s;
    }
}
