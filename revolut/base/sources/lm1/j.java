package lm1;

import cli.n;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.apm.bills.billers.api.navigation.BillerSearchNavigation$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends oki.h implements dli.b {

    @NotNull
    public static final g Companion = new g();
    public final mm1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final j2 f196861p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f196862q;

    public j(BillerSearchNavigation$InputData inputData, n stateMapper, mm1.b billerSearchPagingInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(billerSearchPagingInteractor, "billerSearchPagingInteractor");
        this.o = billerSearchPagingInteractor;
        m70.a.c(t0.f186434a);
        j2 j2VarC = q.c("");
        this.f196861p = j2VarC;
        this.f196862q = mra.d.b(this, new e(new lk0.g(f0.f322471a), (String) j2VarC.getValue(), inputData.f61154a, inputData.f61155b), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, rd0.e.b(((mm1.c) this.o).d), null, null, new h(this, continuation, 0), 3);
        yji.l.a1(this, this.f196862q.B(new llb.e(3)), null, null, new h(this, continuation, 1), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, q.q(new ft4.f0(t1.g(this.f196861p, 500L), 1)), null, new h(this, null, 2), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f196862q;
    }
}
