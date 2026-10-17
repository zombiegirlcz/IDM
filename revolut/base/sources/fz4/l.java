package fz4;

import jki.p;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import wli.x;
import zhm.r0;

/* JADX INFO: loaded from: classes22.dex */
public final class l extends jki.g implements i {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final x f139097p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final xy4.b f139098q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g f139099r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(x deeplinkHandler, xy4.b directDebitStatusDialogFactory, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(directDebitStatusDialogFactory, "directDebitStatusDialogFactory");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f139097p = deeplinkHandler;
        this.f139098q = directDebitStatusDialogFactory;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Pair pair = new Pair("sort.code.key", new n(false, "", ""));
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        this.f139099r = new g(r0.k(pair, new Pair("account.number.key", new n(false, "", ""))), 2);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f139099r;
    }
}
