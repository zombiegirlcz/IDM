package rpb;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class a0 {

    @NotNull
    private static final v Companion = new v();
    public static final Set d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rnb.w f256309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f256310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qpb.e f256311c;

    static {
        String[] elements = {"EarnedInterestSmall", "SavingsSavedThisMonthSmall", "TotalSavingsSmall", "SavingsCashflowSmall", "TotalWealthItems"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        d = kotlin.collections.d.y0(elements);
    }

    public a0(rnb.w savingsVaultInteractor, gte.a featureToggleInteractor, qpb.e widgetsInteractor) {
        Intrinsics.checkNotNullParameter(savingsVaultInteractor, "savingsVaultInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f256309a = savingsVaultInteractor;
        this.f256310b = featureToggleInteractor;
        this.f256311c = widgetsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type r9, java.lang.String r10, gim.c r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof rpb.w
            if (r0 == 0) goto L13
            r0 = r11
            rpb.w r0 = (rpb.w) r0
            int r1 = r0.f256352x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256352x = r1
            goto L18
        L13:
            rpb.w r0 = new rpb.w
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256352x
            qpb.e r3 = r8.f256311c
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L42
            if (r2 == r6) goto L3c
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            yhm.o.b(r11)
            return r11
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            yhm.o.b(r11)
            return r11
        L3c:
            com.revolut.feature.home_feed.api.widget.VaultWidgetContext$Type r9 = r0.u
            yhm.o.b(r11)
            goto L9d
        L42:
            yhm.o.b(r11)
            boolean r11 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.JointSavings
            if (r11 != 0) goto L90
            boolean r11 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.JuniorSavings
            if (r11 != 0) goto L90
            boolean r11 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.Savings
            if (r11 == 0) goto L52
            goto L90
        L52:
            boolean r10 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.JointPockets
            if (r10 != 0) goto L71
            boolean r10 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.JuniorPockets
            if (r10 != 0) goto L71
            boolean r10 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.Pockets
            if (r10 != 0) goto L71
            boolean r10 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.ProRegularPockets
            if (r10 != 0) goto L71
            boolean r10 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.ProTaxPockets
            if (r10 != 0) goto L71
            boolean r10 = r9 instanceof com.revolut.feature.home_feed.api.widget.VaultWidgetContext.Type.TeenPockets
            if (r10 == 0) goto L6b
            goto L71
        L6b:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L71:
            nib.b r10 = nib.c.Companion
            r10.getClass()
            java.util.Set r10 = nib.b.d
            java.lang.String r11 = r9.getF74730a()
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto Lb3
            r0.u = r7
            r0.f256352x = r4
            qpb.n r3 = (qpb.n) r3
            java.lang.Object r9 = r3.a(r9, r0)
            if (r9 != r1) goto L8f
            goto Lb1
        L8f:
            return r9
        L90:
            r0.u = r9
            r0.f256352x = r6
            java.lang.String r11 = "VaultAutomationsList"
            java.lang.Object r11 = r8.d(r11, r10, r0)
            if (r11 != r1) goto L9d
            goto Lb1
        L9d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r10 = r11.booleanValue()
            if (r10 == 0) goto Lb3
            r0.u = r7
            r0.f256352x = r5
            qpb.n r3 = (qpb.n) r3
            java.lang.Object r9 = r3.a(r9, r0)
            if (r9 != r1) goto Lb2
        Lb1:
            return r1
        Lb2:
            return r9
        Lb3:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rpb.a0.a(com.revolut.feature.home_feed.api.widget.VaultWidgetContext$Type, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rpb.x
            if (r0 == 0) goto L13
            r0 = r8
            rpb.x r0 = (rpb.x) r0
            int r1 = r0.f256353w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256353w = r1
            goto L18
        L13:
            rpb.x r0 = new rpb.x
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256353w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L65
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            rnb.w r8 = r6.f256309a
            kotlinx.coroutines.flow.Flow r7 = r8.b(r7)
            rp0.n0 r8 = new rp0.n0
            r2 = 23
            r8.<init>(r2)
            akg.n r7 = nim.a.v(r7, r8)
            rnd.d0 r8 = new rnd.d0
            r2 = 5
            r8.<init>(r2)
            r2 = 0
            jhi.b r7 = mo3.a.g(r7, r2, r8, r3)
            qtb.o r8 = new qtb.o
            r4 = 3
            r5 = 9
            r8.<init>(r4, r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r2, r8)
            r0.f256353w = r3
            java.lang.Object r8 = vkm.q.z(r7, r0)
            if (r8 != r1) goto L65
            return r1
        L65:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L6e
            boolean r7 = r8.booleanValue()
            goto L6f
        L6e:
            r7 = 0
        L6f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rpb.a0.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rpb.y
            if (r0 == 0) goto L13
            r0 = r8
            rpb.y r0 = (rpb.y) r0
            int r1 = r0.f256354w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256354w = r1
            goto L18
        L13:
            rpb.y r0 = new rpb.y
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256354w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L72
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            gte.a r8 = r6.f256310b
            com.revolut.feature.retail.savings.api.core.SavingsCoreApi$Toggles$FixedTermSavings r2 = com.revolut.feature.retail.savings.api.core.SavingsCoreApi$Toggles$FixedTermSavings.f83118c
            boolean r8 = r8.a(r2)
            if (r8 == 0) goto L3f
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L3f:
            rnb.w r8 = r6.f256309a
            kotlinx.coroutines.flow.Flow r7 = r8.b(r7)
            rp0.n0 r8 = new rp0.n0
            r2 = 22
            r8.<init>(r2)
            akg.n r7 = nim.a.v(r7, r8)
            rnd.d0 r8 = new rnd.d0
            r2 = 4
            r8.<init>(r2)
            r2 = 0
            jhi.b r7 = mo3.a.g(r7, r2, r8, r3)
            qtb.o r8 = new qtb.o
            r4 = 3
            r5 = 10
            r8.<init>(r4, r5, r2)
            zhm.h0 r2 = zhm.h0.f322473a
            vkm.y r7 = rd0.e.e(r7, r2, r8)
            r0.f256354w = r3
            java.lang.Object r8 = vkm.q.z(r7, r0)
            if (r8 != r1) goto L72
            return r1
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            if (r8 == 0) goto L7b
            boolean r7 = r8.booleanValue()
            goto L7c
        L7b:
            r7 = 0
        L7c:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rpb.a0.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r7.equals("SavingsCashflowSmall") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a1, code lost:
    
        if (r7.equals("TotalSavingsSmall") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ab, code lost:
    
        if (r7.equals("EarnedInterestSmall") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00af, code lost:
    
        r0.u = null;
        r0.f256356x = 1;
        r9 = c(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b7, code lost:
    
        if (r9 != r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00cc, code lost:
    
        if (r7.equals("SavingsFixedTermAccountProgressWidget") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f8, code lost:
    
        if (r9 == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x012c, code lost:
    
        if (r9 == r1) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x013e, code lost:
    
        if (r7.equals("SavingsFixedTermAccountInterestEarnedWidget") == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0141, code lost:
    
        r0.u = null;
        r0.f256356x = 5;
        r7 = c(r8, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        if (r7 != r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x014d, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0160, code lost:
    
        if (r9 == r1) goto L94;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rpb.a0.d(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
