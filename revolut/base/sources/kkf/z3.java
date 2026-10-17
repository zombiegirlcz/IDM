package kkf;

import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import tof.r9;

/* JADX INFO: loaded from: classes8.dex */
public final class z3 extends yji.n implements elf.s0 {

    @NotNull
    public static final w3 Companion = new w3();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f185047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nhf.a f185048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f185049n;
    public final thf.g o;

    public z3(com.revolut.domain.interactors.transactions.a transactionsInteractor, klf.h0 commonDataSource, nhf.a unitedWalletInteractor, thf.g transactionsItemMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(transactionsItemMapper, "transactionsItemMapper");
        this.f185047l = commonDataSource;
        this.f185048m = unitedWalletInteractor;
        this.f185049n = transactionsInteractor;
        this.o = transactionsItemMapper;
    }

    public static final Flow Z2(z3 z3Var, String str) {
        if (str == null) {
            return new go.g(null, 2);
        }
        return new ahe.m0(rd0.e.e(mo3.a.g(rd0.e.b(com.revolut.domain.interactors.transactions.a.d(z3Var.f185049n, new r9(str), null, 1, null, null, 26)), null, new kd8.f(29), 1), zhm.h0.f322473a, new i23.c(3, 20, null)), 7);
    }

    public final cmf.p b3(boolean z) {
        return new cmf.p(new t38.e(vkm.q.Q(this.f185047l.h(new kjk.x(14)), new jy6.l((Continuation) null, this, 26)), 24, rd0.e.b(((njf.j) this.f185048m).f()), new x3(this, z, null)), new chc.c0(23), zhm.u.c(this), "OriginalTransaction");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (obj2 instanceof tof.a3) {
            A2(new TransactionDetailsDestination(ofm.q.P((tof.a3) obj2), (rhf.d) null, 6));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final cmf.p c3(Function1 additionalFilter) {
        Intrinsics.checkNotNullParameter(additionalFilter, "additionalFilter");
        return new cmf.p(vkm.q.Q(this.f185047l.d(), new k25.o(null, additionalFilter, this, 3)), new chc.c0(23), zhm.u.c(this), "SpareChangeOriginalTransaction");
    }
}
