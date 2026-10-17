package com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation;

import be5.e;
import cli.y;
import com.revolut.data.model.Data;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mre.c;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vdl.c1;
import vii.b;
import vkm.j2;
import vkm.q;
import vq5.f;
import vq5.g;
import vq5.m;
import vq5.o;
import vq5.u;
import vq5.v;
import vq5.z;
import yji.l;
import zp5.d;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements f {

    @NotNull
    public static final o Companion = new o();
    public final e A;
    public final CryptoSendConfirmationControllerContract$InputData B;
    public final b C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final no5.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f71323p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ppk.f f71324q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f71325r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ang.f f71326s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l61.a f71327t;
    public final hc5.a u;
    public final c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f71328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final agf.b f71329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final uj5.b f71330y;
    public final sf0.h z;

    public a(no5.b cryptoWithdrawRepository, wj0.a idempotencyKeyHolder, ppk.f ratesInteractor, z dialogProvider, ang.f userInteractor, l61.a userCompanyInteractor, hc5.a cryptoAccountInteractor, c termsNavigationFactory, d feeBreakdownHolder, agf.b transactionWorkflowInteractor, uj5.b restrictedActionNavigationProvider, sf0.h serverErrorParser, e cryptoConvertFooterDisclaimerDelegate, CryptoSendConfirmationControllerContract$InputData inputData, m stateMapper) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawRepository, "cryptoWithdrawRepository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(cryptoAccountInteractor, "cryptoAccountInteractor");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(feeBreakdownHolder, "feeBreakdownHolder");
        Intrinsics.checkNotNullParameter(transactionWorkflowInteractor, "transactionWorkflowInteractor");
        Intrinsics.checkNotNullParameter(restrictedActionNavigationProvider, "restrictedActionNavigationProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        Intrinsics.checkNotNullParameter(cryptoConvertFooterDisclaimerDelegate, "cryptoConvertFooterDisclaimerDelegate");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = cryptoWithdrawRepository;
        this.f71323p = idempotencyKeyHolder;
        this.f71324q = ratesInteractor;
        this.f71325r = dialogProvider;
        this.f71326s = userInteractor;
        this.f71327t = userCompanyInteractor;
        this.u = cryptoAccountInteractor;
        this.v = termsNavigationFactory;
        this.f71328w = feeBreakdownHolder;
        this.f71329x = transactionWorkflowInteractor;
        this.f71330y = restrictedActionNavigationProvider;
        this.z = serverErrorParser;
        this.A = cryptoConvertFooterDisclaimerDelegate;
        this.B = inputData;
        this.C = new b();
        this.D = mra.d.b(this, new g(!Intrinsics.f(inputData.f71313a.f71060b, inputData.e), inputData.f71313a, inputData.f71314b, inputData.e, inputData.f71315c, inputData.f71316g, null, null, new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null, inputData.f71317h), stateMapper, null, false, 12);
        this.E = hx7.e.a(this, new vh9.b(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a r26, java.lang.String r27, dj0.d r28, gim.c r29) {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a.I2(com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a, java.lang.String, dj0.d, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        this.f71323p.a("IDEMPOTENCY_TAG_CRYPTO_WITHDRAW_V2");
        if (((g) ((j2) this.D.f22677a).getValue()).f291314a) {
            l2(new v(this, null, 0), new yi5.b(26));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        l.b1(this, q.Q(this.C, new c1(continuation, this, 21)), null, new u(this, continuation, 4), 3);
        if (!((g) ((j2) this.D.f22677a).getValue()).f291314a) {
            CryptoSendConfirmationControllerContract$InputData cryptoSendConfirmationControllerContract$InputData = this.B;
            l.b1(this, nim.a.v(rd0.e.b(this.f71324q.e(v1.c.w(cryptoSendConfirmationControllerContract$InputData.f71313a.f71060b, cryptoSendConfirmationControllerContract$InputData.f.f71112a.f115083b), n9l.b.SEC_3)), new vq0.g(7)), null, new u(this, continuation, 3), 3);
        }
        ang.f fVar = this.f71326s;
        w4l.h hVar = w4l.h.f294642c;
        l.b1(this, fVar.j(hVar), null, new u(this, continuation, 1), 3);
        l.b1(this, rd0.e.b(hng.g.b(((ang.b) this.f71327t).f7765a)), null, new u(this, continuation, 2), 3);
        l.b1(this, this.u.a(hVar), null, new u(this, continuation, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
