package uk9;

import com.revolut.data.model.Data;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi9.c0;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends jki.g implements e {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f280707p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c0 f280708q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f280709r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f280710s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xh9.a payLaterInteractor, c0 payLaterRepayItemFactory, j60.a bottomDialog, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(payLaterRepayItemFactory, "payLaterRepayItemFactory");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f280707p = payLaterInteractor;
        this.f280708q = payLaterRepayItemFactory;
        this.f280709r = bottomDialog;
        this.f280710s = new d(new Data(null, null, true, 3, null));
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, rd0.e.b(nim.a.w(((ti9.g) this.f280707p).n(), i.f)), null, null, new uf0.d(this, null, 12), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f280710s;
    }
}
