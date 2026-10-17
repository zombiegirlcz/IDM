package com.revolut.feature.retail.salary_account.impl.salary_promotion;

import cli.g;
import cli.y;
import df7.d;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pre.c;
import q06.l;
import ukm.f;
import vkm.q;
import vkm.z1;
import wgb.i;
import wgb.o;
import wgb.x;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements i {

    @NotNull
    private static final o Companion = new o();
    public final zgb.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f83022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f83023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q06.d f83024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l f83025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SalaryPromotionControllerContract$InputData f83026t;
    public final y u;
    public final z1 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f83027w;

    public b(x stateMapper, zgb.a salaryPromotionInteractor, d lotteryEnrollmentStateObserver, c termsInteractor, q06.d deeplinkParser, l deeplinkRouter, SalaryPromotionControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(salaryPromotionInteractor, "salaryPromotionInteractor");
        Intrinsics.checkNotNullParameter(lotteryEnrollmentStateObserver, "lotteryEnrollmentStateObserver");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        Intrinsics.checkNotNullParameter(deeplinkParser, "deeplinkParser");
        Intrinsics.checkNotNullParameter(deeplinkRouter, "deeplinkRouter");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = salaryPromotionInteractor;
        this.f83022p = lotteryEnrollmentStateObserver;
        this.f83023q = termsInteractor;
        this.f83024r = deeplinkParser;
        this.f83025s = deeplinkRouter;
        this.f83026t = inputData;
        this.u = mra.d.b(this, new wgb.h(0), stateMapper, null, false, 12);
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Boolean.FALSE);
        this.v = z1VarB;
        this.f83027w = e.a(this, new wde.f(this, 9));
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0102 A[Catch: all -> 0x0069, CancellationException -> 0x0157, TRY_ENTER, TryCatch #4 {CancellationException -> 0x0157, blocks: (B:14:0x003a, B:53:0x00e6, B:21:0x0054, B:43:0x00b4, B:48:0x00c1, B:50:0x00cd, B:54:0x00ef, B:26:0x0064, B:37:0x0091, B:39:0x0099, B:56:0x0102, B:57:0x011a, B:31:0x0076, B:33:0x007c), top: B:76:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0099 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.retail.salary_account.impl.salary_promotion.b r21, com.revolut.data.model.Data r22, egb.q0 r23, boolean r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.salary_account.impl.salary_promotion.b.I2(com.revolut.feature.retail.salary_account.impl.salary_promotion.b, com.revolut.data.model.Data, egb.q0, boolean, gim.c):java.lang.Object");
    }

    public static String J2(Object obj2) {
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj2, "Unable to process the given parcel. Excepted String but given "));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        return null;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, q.Q(this.v, new w2a.q(continuation, this, 11)), null, null, new a(this, null), 3);
        String code = this.f83026t.f83016a;
        if (code != null) {
            d dVar = this.f83022p;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(code, "code");
            qf7.i iVar = dVar.f113803a;
            iVar.getClass();
            Intrinsics.checkNotNullParameter(code, "code");
            yji.l.a1(this, q.q(new njj.l(new pkg.e(q.g(iVar.f245273h), code, 24), 19)), null, null, new w65.c(this, continuation, 20), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f83027w;
    }

    @Override // cli.z
    public final g getState() {
        return this.u;
    }
}
