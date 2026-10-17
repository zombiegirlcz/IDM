package zqf;

import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferLocateInputData;
import jki.p;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import opf.l;
import org.jetbrains.annotations.NotNull;
import wli.x;
import zfd.s;
import znd.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends jki.g implements jki.h {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransferLocateInputData f324485p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l f324486q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f324487r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yqf.b f324488s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f324489t;
    public final d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TransferLocateInputData inputData, l ticketsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, yqf.b deeplinkFactory, x deeplinkHandler, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkFactory, "deeplinkFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f324485p = inputData;
        this.f324486q = ticketsInteractor;
        this.f324487r = transactionsInteractor;
        this.f324488s = deeplinkFactory;
        this.f324489t = deeplinkHandler;
        this.u = new d(new Data(null, null, true, 3, null), inputData.f92165b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(zqf.k r12, java.lang.String r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zqf.k.y2(zqf.k, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        z2();
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.u;
    }

    public final void z2() {
        yji.l.a1(this, rd0.e.b(nim.a.w(com.revolut.domain.interactors.transactions.a.c(this.f324487r, this.f324485p.f92164a, null, false, 6), new u0(23))), null, null, new s(this, (Continuation) null, 26), 3);
    }
}
