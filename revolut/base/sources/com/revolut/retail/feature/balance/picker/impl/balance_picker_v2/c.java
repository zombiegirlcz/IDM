package com.revolut.retail.feature.balance.picker.impl.balance_picker_v2;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mz3.r;
import n1j.b0;
import n1j.d0;
import n1j.o;
import n1j.w;
import oki.h;
import os2.g;
import p1j.d;
import p1j.e;
import p1j.i;
import p1j.l;
import p1j.m;
import smd.s;
import tsk.t;
import ukm.f;
import vfg.p;
import vkm.q;
import vkm.z1;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class c extends h implements o {
    public final l A;
    public final g B;
    public final d C;
    public final z1 D;
    public final z1 E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public final y G;
    public final BalanceSelector$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f99507p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f99508q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n1j.e f99509r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s1j.b f99510s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p1j.b f99511t;
    public final lal.a u;
    public final i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z1j.a f99512w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final m f99513x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final t f99514y;
    public final p z;

    public c(BalanceSelector$InputData inputData, s countryProfilesDelegate, e balancePickerCountryProfilesDelegateInputData, n1j.e accountsOrderInfoProvider, s1j.b investmentsDisclaimerDescriptorProvider, p1j.b balanceConfirmationRequiredDelegate, lal.a disclaimerDelegate, i mapperExtraConfigDelegate, z1j.a savingsDisclaimersFlowProvider, m searchDelegate, t legalEntityContextProvider, p hiddenAccountEntryPointItemProvider, l nonExistingAccountsInfoProvider, g cryptoLockedBalanceBuyDestinationProvider, d balanceDisabledInfoProvider, d0 stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryProfilesDelegate, "countryProfilesDelegate");
        Intrinsics.checkNotNullParameter(balancePickerCountryProfilesDelegateInputData, "balancePickerCountryProfilesDelegateInputData");
        Intrinsics.checkNotNullParameter(accountsOrderInfoProvider, "accountsOrderInfoProvider");
        Intrinsics.checkNotNullParameter(investmentsDisclaimerDescriptorProvider, "investmentsDisclaimerDescriptorProvider");
        Intrinsics.checkNotNullParameter(balanceConfirmationRequiredDelegate, "balanceConfirmationRequiredDelegate");
        Intrinsics.checkNotNullParameter(disclaimerDelegate, "disclaimerDelegate");
        Intrinsics.checkNotNullParameter(mapperExtraConfigDelegate, "mapperExtraConfigDelegate");
        Intrinsics.checkNotNullParameter(savingsDisclaimersFlowProvider, "savingsDisclaimersFlowProvider");
        Intrinsics.checkNotNullParameter(searchDelegate, "searchDelegate");
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        Intrinsics.checkNotNullParameter(hiddenAccountEntryPointItemProvider, "hiddenAccountEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(nonExistingAccountsInfoProvider, "nonExistingAccountsInfoProvider");
        Intrinsics.checkNotNullParameter(cryptoLockedBalanceBuyDestinationProvider, "cryptoLockedBalanceBuyDestinationProvider");
        Intrinsics.checkNotNullParameter(balanceDisabledInfoProvider, "balanceDisabledInfoProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f99507p = countryProfilesDelegate;
        this.f99508q = balancePickerCountryProfilesDelegateInputData;
        this.f99509r = accountsOrderInfoProvider;
        this.f99510s = investmentsDisclaimerDescriptorProvider;
        this.f99511t = balanceConfirmationRequiredDelegate;
        this.u = disclaimerDelegate;
        this.v = mapperExtraConfigDelegate;
        this.f99512w = savingsDisclaimersFlowProvider;
        this.f99513x = searchDelegate;
        this.f99514y = legalEntityContextProvider;
        this.z = hiddenAccountEntryPointItemProvider;
        this.A = nonExistingAccountsInfoProvider;
        this.B = cryptoLockedBalanceBuyDestinationProvider;
        this.C = balanceDisabledInfoProvider;
        f fVar = f.DROP_OLDEST;
        z1 z1VarB = q.b(0, 2, fVar);
        m70.a.c(t0.f186434a);
        z1VarB.k("");
        this.D = z1VarB;
        z1 z1VarB2 = q.b(0, 2, fVar);
        z1VarB2.k(null);
        this.E = z1VarB2;
        this.F = hx7.e.a(this, new r(this, 7));
        this.G = mra.d.b(this, new n1j.m(new Data(null, null, true, 3, null), r0.g(), null, null, new j1j.b(false, null, false, 128), null, null, new Data(null, null, true, 3, null), f0.f322471a), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c r7, com.revolut.data.model.Data r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof n1j.x
            if (r0 == 0) goto L13
            r0 = r9
            n1j.x r0 = (n1j.x) r0
            int r1 = r0.f211409x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f211409x = r1
            goto L18
        L13:
            n1j.x r0 = new n1j.x
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f211409x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            j1j.d r7 = r0.u
            yhm.o.b(r9)
            goto Lb0
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r9)
            java.lang.Object r8 = r8.getContent()
            java.util.List r8 = (java.util.List) r8
            r9 = 0
            if (r8 != 0) goto L40
        L3e:
            r8 = r9
            goto L9e
        L40:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = zhm.w.t(r8, r4)
            r2.<init>(r4)
            java.util.Iterator r8 = r8.iterator()
        L51:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L63
            java.lang.Object r4 = r8.next()
            k1j.b r4 = (k1j.b) r4
            java.util.List r4 = r4.f180284c
            r2.add(r4)
            goto L51
        L63:
            java.util.ArrayList r8 = zhm.w.u(r2)
            java.util.Iterator r8 = r8.iterator()
        L6b:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L85
            java.lang.Object r2 = r8.next()
            r4 = r2
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r4 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper) r4
            java.lang.String r4 = r4.f99404a
            com.revolut.retail.feature.balance.picker.api.balance_picker_v2.BalanceSelector$InputData r5 = r7.o
            java.lang.String r5 = r5.f99383h
            boolean r4 = kotlin.jvm.internal.Intrinsics.f(r4, r5)
            if (r4 == 0) goto L6b
            goto L86
        L85:
            r2 = r9
        L86:
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r2 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper) r2
            if (r2 != 0) goto L8b
            goto L3e
        L8b:
            j1j.d r8 = new j1j.d
            java.lang.String r4 = r2.f99404a
            xi0.b r5 = r2.getF99406c()
            com.revolut.core.model.account.AccountId r6 = r2.getD()
            k1j.a r2 = r2.getF99407g()
            r8.<init>(r4, r5, r6, r2)
        L9e:
            if (r8 == 0) goto Lbb
            p1j.b r7 = r7.f99511t
            k1j.a r9 = r8.d
            r0.u = r8
            r0.f211409x = r3
            java.lang.Object r9 = r7.b(r9, r0)
            if (r9 != r1) goto Laf
            return r1
        Laf:
            r7 = r8
        Lb0:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r8 = r9.booleanValue()
            n1j.r r9 = new n1j.r
            r9.<init>(r7, r8)
        Lbb:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c.I2(com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c, com.revolut.data.model.Data, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, yh5.b.e(this.f99507p.O(this.f99508q), this.D, this.E), null, null, new ac8.h(this, null), 3);
        yji.l.a1(this, this.f99509r.b(this.o.f99379a), null, null, new w(this, continuation, 0), 3);
        n1j.t tVar = new n1j.t(0);
        y yVar = this.G;
        yji.l.a1(this, new vkm.t0(yVar.B(tVar), 1), null, null, new b0(this, null), 3);
        yji.l.a1(this, q.Q(new vkm.t0(yVar.B(new n1j.t(1)), 1), new mk0.f(continuation, this, 12)), null, null, new w(this, continuation, 2), 3);
        yji.l.a1(this, this.z.g(), null, null, new w(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.G;
    }
}
