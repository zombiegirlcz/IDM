package com.revolut.feature.pockets.impl.ui.add_new;

import ang.f;
import com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rea.g;
import rea.m;
import rea.p;
import s99.i;
import t99.k;
import te8.t;
import te8.z;
import yea.e;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements e {
    public final AddNewPocketContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f80895p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f80896q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f80897r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f80898s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f80899t;
    public final phm.a u;
    public final p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final z f80900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final t f80901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final yki.i f80902y;

    public c(AddNewPocketContract$InputData inputData, g newPocketAvailabilityChecker, f userInteractor, m pocketDetailsInteractor, i exchangeGlobalAccessInteractor, k exchangeGlobalAccessFlowProvider, o41.b pickerInteractor, p validateMcyExtension, z juniorProductsInteractor, t juniorLegalLinksInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(newPocketAvailabilityChecker, "newPocketAvailabilityChecker");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        Intrinsics.checkNotNullParameter(pickerInteractor, "pickerInteractor");
        Intrinsics.checkNotNullParameter(validateMcyExtension, "validateMcyExtension");
        Intrinsics.checkNotNullParameter(juniorProductsInteractor, "juniorProductsInteractor");
        Intrinsics.checkNotNullParameter(juniorLegalLinksInteractor, "juniorLegalLinksInteractor");
        this.o = inputData;
        this.f80895p = newPocketAvailabilityChecker;
        this.f80896q = userInteractor;
        this.f80897r = pocketDetailsInteractor;
        this.f80898s = exchangeGlobalAccessInteractor;
        this.f80899t = exchangeGlobalAccessFlowProvider;
        this.u = pickerInteractor;
        this.v = validateMcyExtension;
        this.f80900w = juniorProductsInteractor;
        this.f80901x = juniorLegalLinksInteractor;
        this.f80902y = d8l.d.a(this, new y8a.g(this, 17));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0094, code lost:
    
        if (r12 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pockets.impl.ui.add_new.c r10, xi0.b r11, gim.c r12) {
        /*
            rea.p r0 = r10.v
            boolean r1 = r12 instanceof yea.f
            if (r1 == 0) goto L15
            r1 = r12
            yea.f r1 = (yea.f) r1
            int r2 = r1.f312839x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f312839x = r2
            goto L1a
        L15:
            yea.f r1 = new yea.f
            r1.<init>(r10, r12)
        L1a:
            java.lang.Object r12 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f312839x
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r12)
            goto L97
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            xi0.b r11 = r1.u
            yhm.o.b(r12)
            goto L55
        L3a:
            yhm.o.b(r12)
            r1.u = r11
            r1.f312839x = r5
            n8b.a r12 = r0.f253582a
            o8b.c r12 = (o8b.c) r12
            boolean r12 = r12.g()
            if (r12 == 0) goto L50
            java.lang.Object r12 = r0.a(r1)
            goto L52
        L50:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
        L52:
            if (r12 != r2) goto L55
            goto L96
        L55:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r3 = 0
            if (r12 == 0) goto L78
            r0.getClass()
            nii.y0 r11 = rea.p.c()
            kotlinx.coroutines.flow.Flow r5 = r10.X1(r11)
            y83.d r8 = new y83.d
            r11 = 17
            r8.<init>(r10, r3, r11)
            r9 = 3
            r6 = 0
            r7 = 0
            r4 = r10
            yji.l.a1(r4, r5, r6, r7, r8, r9)
            goto La4
        L78:
            rea.m r12 = r10.f80897r
            com.revolut.feature.pockets.api.ui.add_new.AddNewPocketContract$InputData r0 = r10.o
            io3.l r5 = r0.f80786a
            com.revolut.feature.pockets.api.ui.add_new.ExtendedAccountId r0 = r0.f80787b
            com.revolut.core.model.account.AccountId r0 = r0.o2()
            ufm.i r11 = r12.b(r0, r5, r11)
            ufm.i r11 = l89.e.b(r11)
            r1.u = r3
            r1.f312839x = r4
            java.lang.Object r12 = nim.a.b(r11, r1)
            if (r12 != r2) goto L97
        L96:
            return r2
        L97:
            java.lang.String r12 = (java.lang.String) r12
            jda.a r11 = new jda.a
            kotlin.jvm.internal.Intrinsics.h(r12)
            r11.<init>(r12)
            r10.C2(r11)
        La4:
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.ui.add_new.c.I2(com.revolut.feature.pockets.impl.ui.add_new.c, xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.pockets.impl.ui.add_new.c r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.ui.add_new.c.J2(com.revolut.feature.pockets.impl.ui.add_new.c, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new b(this, null), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80902y;
    }
}
