package arf;

import aqb.s;
import com.revolut.data.model.Data;
import com.revolut.feature.transfer.core.api.ui.throubleshooter.TransferRecallInputData;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wli.x;

/* JADX INFO: loaded from: classes9.dex */
public final class l extends jki.g implements jki.h {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final TransferRecallInputData f8703p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final opf.l f8704q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f8705r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yqf.b f8706s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f8707t;
    public final d u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(TransferRecallInputData inputData, opf.l ticketsInteractor, com.revolut.domain.interactors.transactions.a transactionsInteractor, yqf.b deeplinkFactory, x deeplinkHandler, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(ticketsInteractor, "ticketsInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkFactory, "deeplinkFactory");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f8703p = inputData;
        this.f8704q = ticketsInteractor;
        this.f8705r = transactionsInteractor;
        this.f8706s = deeplinkFactory;
        this.f8707t = deeplinkHandler;
        this.u = new d(new Data(null, null, true, 3, null), inputData.f92169b);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(arf.l r11, java.lang.String r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: arf.l.y2(arf.l, java.lang.String, gim.c):java.lang.Object");
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
        yji.l.a1(this, rd0.e.b(nim.a.w(com.revolut.domain.interactors.transactions.a.c(this.f8705r, this.f8703p.f92168a, null, false, 6), new s(29))), null, null, new ap7.k(this, null, 10), 3);
    }
}
