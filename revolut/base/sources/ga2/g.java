package ga2;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import g1k.i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uy1.o;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends ba2.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f142055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o71.a f142056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ia2.a f142057n;
    public final x2k.e o;

    public g(o interactor, o71.a beneficiaryRepository, ia2.a payIdAliasDialogProvider, x2k.e paymentsBankTransferNaviCommandProvider) {
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(payIdAliasDialogProvider, "payIdAliasDialogProvider");
        Intrinsics.checkNotNullParameter(paymentsBankTransferNaviCommandProvider, "paymentsBankTransferNaviCommandProvider");
        this.f142055l = interactor;
        this.f142056m = beneficiaryRepository;
        this.f142057n = payIdAliasDialogProvider;
        this.o = paymentsBankTransferNaviCommandProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c3(ga2.g r10, com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10.getClass()
            boolean r0 = r12 instanceof ga2.e
            if (r0 == 0) goto L16
            r0 = r12
            ga2.e r0 = (ga2.e) r0
            int r1 = r0.f142051w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f142051w = r1
            goto L1b
        L16:
            ga2.e r0 = new ga2.e
            r0.<init>(r10, r12)
        L1b:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f142051w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r12)
            return r12
        L2d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L35:
            yhm.o.b(r12)
            goto L47
        L39:
            yhm.o.b(r12)
            uy1.o r12 = r10.f142055l
            r0.f142051w = r4
            java.lang.Object r12 = r12.a(r11, r0)
            if (r12 != r1) goto L47
            goto L71
        L47:
            a02.i r12 = (a02.i) r12
            boolean r11 = r12 instanceof a02.h
            r8 = 0
            if (r11 == 0) goto L73
            o71.a r10 = r10.f142056m
            a02.h r12 = (a02.h) r12
            a02.b r11 = r12.f113a
            java.lang.String r6 = r11.f106a
            com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose r7 = com.revolut.domain.models.beneficiary.BeneficiarySpecialPurpose.PAYID_ALIAS
            r0.f142051w = r3
            r5 = r10
            r21.h r5 = (r21.h) r5
            r5.getClass()
            qd8.e r4 = new qd8.e
            r9 = 20
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            java.lang.Object r10 = skm.e0.J(r10, r4, r0)
            if (r10 != r1) goto L72
        L71:
            return r1
        L72:
            return r10
        L73:
            a02.c r10 = a02.c.f109a
            boolean r10 = kotlin.jvm.internal.Intrinsics.f(r12, r10)
            if (r10 != 0) goto L8c
            boolean r10 = r12 instanceof a02.g
            if (r10 == 0) goto L86
            a02.g r12 = (a02.g) r12
            java.lang.Throwable r10 = r12.getError()
            throw r10
        L86:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L8c:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Alias Resolve is needed for PayID input flow"
            r10.<init>(r11)
            zhm.h0 r11 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r12 = rd0.d.f253311a
            rd0.c r12 = rd0.c.ERROR
            rd0.d.a(r12, r8, r8, r10, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ga2.g.c3(ga2.g, com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias, gim.c):java.lang.Object");
    }

    @Override // ba2.e
    public final void Z2(ba2.f sourceFlow, ResolveAlias alias, Function1 onReceiveError) {
        Intrinsics.checkNotNullParameter(sourceFlow, "sourceFlow");
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(onReceiveError, "onReceiveError");
        T2(new i(this, alias, null, 23), new dqd.a(onReceiveError, this, sourceFlow, alias, 13));
    }
}
