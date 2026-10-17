package o7c;

import k7c.d0;
import k7c.g0;
import kotlin.jvm.internal.Intrinsics;
import nya.i0;
import org.jetbrains.annotations.NotNull;
import rfm.f0;
import te0.w;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements z5c.c {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f222763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f222764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final sri.m f222765c;
    public final f9c.a d;

    public k(g0 paymentsRepository, d0 paymentWithChallengeRepository, sri.m navigator, f9c.a returnCommandBuilder) {
        Intrinsics.checkNotNullParameter(paymentsRepository, "paymentsRepository");
        Intrinsics.checkNotNullParameter(paymentWithChallengeRepository, "paymentWithChallengeRepository");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(returnCommandBuilder, "returnCommandBuilder");
        this.f222763a = paymentsRepository;
        this.f222764b = paymentWithChallengeRepository;
        this.f222765c = navigator;
        this.d = returnCommandBuilder;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "revpay-native");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o7c.k.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final efm.d0 f(final jf0.c cVar, boolean z) {
        if (y.D(cVar, "deeplink", 1, "revpay-native") && Intrinsics.f(cVar.e(2), "topup")) {
            final int i = 0;
            f0 f0VarF = new pfm.h(new kfm.a() { // from class: o7c.h
                /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
                @Override // kfm.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r10 = this;
                        int r0 = r3
                        switch(r0) {
                            case 0: goto L7b;
                            default: goto L5;
                        }
                    L5:
                        jf0.c r0 = r1
                        java.util.HashMap r0 = r0.d
                        java.lang.String r1 = "package"
                        java.lang.Object r1 = r0.get(r1)
                        r4 = r1
                        java.lang.String r4 = (java.lang.String) r4
                        java.lang.String r1 = "redirect_url"
                        java.lang.Object r1 = r0.get(r1)
                        r3 = r1
                        java.lang.String r3 = (java.lang.String) r3
                        java.lang.String r1 = "move_money_target"
                        java.lang.Object r1 = r0.get(r1)
                        java.lang.String r1 = (java.lang.String) r1
                        if (r1 == 0) goto L44
                        u6c.l[] r2 = u6c.l.values()
                        int r5 = r2.length
                        r6 = 0
                    L2b:
                        if (r6 >= r5) goto L3e
                        r7 = r2[r6]
                        java.lang.String r8 = r7.name()
                        r9 = 1
                        boolean r8 = kotlin.text.a0.z(r8, r1, r9)
                        if (r8 == 0) goto L3b
                        goto L3f
                    L3b:
                        int r6 = r6 + 1
                        goto L2b
                    L3e:
                        r7 = 0
                    L3f:
                        if (r7 != 0) goto L42
                        goto L44
                    L42:
                        r5 = r7
                        goto L47
                    L44:
                        u6c.l r7 = u6c.l.UNDEFINED
                        goto L42
                    L47:
                        java.lang.String r1 = "pocket_id"
                        java.lang.Object r1 = r0.get(r1)
                        r6 = r1
                        java.lang.String r6 = (java.lang.String) r6
                        java.lang.String r1 = "top_up_amount"
                        java.lang.Object r0 = r0.get(r1)
                        java.lang.String r0 = (java.lang.String) r0
                        if (r0 == 0) goto L66
                        java.lang.Long r0 = kotlin.text.z.n(r0)
                        if (r0 == 0) goto L66
                        long r0 = r0.longValue()
                    L64:
                        r7 = r0
                        goto L69
                    L66:
                        r0 = 0
                        goto L64
                    L69:
                        o7c.k r0 = r2
                        sri.m r0 = r0.f222765c
                        com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
                        com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeMoveMoney r2 = new com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeMoveMoney
                        r2.<init>(r3, r4, r5, r6, r7)
                        r1.<init>(r2)
                        r0.c(r1)
                        return
                    L7b:
                        jf0.c r0 = r1
                        java.util.HashMap r0 = r0.d
                        java.lang.String r1 = "package"
                        java.lang.Object r1 = r0.get(r1)
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.String r2 = "redirect_url"
                        java.lang.Object r0 = r0.get(r2)
                        java.lang.String r0 = (java.lang.String) r0
                        o7c.k r2 = r2
                        sri.m r2 = r2.f222765c
                        com.revolut.retail.core.navigation.FeatureCommand r3 = new com.revolut.retail.core.navigation.FeatureCommand
                        com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeTopUp r4 = new com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeTopUp
                        r4.<init>(r0, r1)
                        r3.<init>(r4)
                        r2.c(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o7c.h.run():void");
                }
            }, 2).f(efm.d0.m(Boolean.TRUE));
            Intrinsics.checkNotNullExpressionValue(f0VarF, "andThen(...)");
            return f0VarF;
        }
        if (Intrinsics.f(cVar.e(1), "revpay-native") && Intrinsics.f(cVar.e(2), "move-money")) {
            final int i2 = 1;
            f0 f0VarF2 = new pfm.h(new kfm.a() { // from class: o7c.h
                @Override // kfm.a
                public final void run() {
                    /*
                        this = this;
                        int r0 = r3
                        switch(r0) {
                            case 0: goto L7b;
                            default: goto L5;
                        }
                    L5:
                        jf0.c r0 = r1
                        java.util.HashMap r0 = r0.d
                        java.lang.String r1 = "package"
                        java.lang.Object r1 = r0.get(r1)
                        r4 = r1
                        java.lang.String r4 = (java.lang.String) r4
                        java.lang.String r1 = "redirect_url"
                        java.lang.Object r1 = r0.get(r1)
                        r3 = r1
                        java.lang.String r3 = (java.lang.String) r3
                        java.lang.String r1 = "move_money_target"
                        java.lang.Object r1 = r0.get(r1)
                        java.lang.String r1 = (java.lang.String) r1
                        if (r1 == 0) goto L44
                        u6c.l[] r2 = u6c.l.values()
                        int r5 = r2.length
                        r6 = 0
                    L2b:
                        if (r6 >= r5) goto L3e
                        r7 = r2[r6]
                        java.lang.String r8 = r7.name()
                        r9 = 1
                        boolean r8 = kotlin.text.a0.z(r8, r1, r9)
                        if (r8 == 0) goto L3b
                        goto L3f
                    L3b:
                        int r6 = r6 + 1
                        goto L2b
                    L3e:
                        r7 = 0
                    L3f:
                        if (r7 != 0) goto L42
                        goto L44
                    L42:
                        r5 = r7
                        goto L47
                    L44:
                        u6c.l r7 = u6c.l.UNDEFINED
                        goto L42
                    L47:
                        java.lang.String r1 = "pocket_id"
                        java.lang.Object r1 = r0.get(r1)
                        r6 = r1
                        java.lang.String r6 = (java.lang.String) r6
                        java.lang.String r1 = "top_up_amount"
                        java.lang.Object r0 = r0.get(r1)
                        java.lang.String r0 = (java.lang.String) r0
                        if (r0 == 0) goto L66
                        java.lang.Long r0 = kotlin.text.z.n(r0)
                        if (r0 == 0) goto L66
                        long r0 = r0.longValue()
                    L64:
                        r7 = r0
                        goto L69
                    L66:
                        r0 = 0
                        goto L64
                    L69:
                        o7c.k r0 = r2
                        sri.m r0 = r0.f222765c
                        com.revolut.retail.core.navigation.FeatureCommand r1 = new com.revolut.retail.core.navigation.FeatureCommand
                        com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeMoveMoney r2 = new com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeMoveMoney
                        r2.<init>(r3, r4, r5, r6, r7)
                        r1.<init>(r2)
                        r0.c(r1)
                        return
                    L7b:
                        jf0.c r0 = r1
                        java.util.HashMap r0 = r0.d
                        java.lang.String r1 = "package"
                        java.lang.Object r1 = r0.get(r1)
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.String r2 = "redirect_url"
                        java.lang.Object r0 = r0.get(r2)
                        java.lang.String r0 = (java.lang.String) r0
                        o7c.k r2 = r2
                        sri.m r2 = r2.f222765c
                        com.revolut.retail.core.navigation.FeatureCommand r3 = new com.revolut.retail.core.navigation.FeatureCommand
                        com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeTopUp r4 = new com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayNativeTopUp
                        r4.<init>(r0, r1)
                        r3.<init>(r4)
                        r2.c(r3)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: o7c.h.run():void");
                }
            }, 2).f(efm.d0.m(Boolean.TRUE));
            Intrinsics.checkNotNullExpressionValue(f0VarF2, "andThen(...)");
            return f0VarF2;
        }
        if (!Intrinsics.f(cVar.e(1), "revpay-native") || !Intrinsics.f(cVar.e(2), "suspicioustransaction")) {
            ufm.b bVarM = efm.d0.m(Boolean.FALSE);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        ufm.i iVar = new ufm.i(w.o0(kotlin.coroutines.g.f186406a, new i0(cVar, this, null, 11)), new o5i.a(9, new o54.a(cVar, this, 6)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
