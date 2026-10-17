package com.revolut.feature.retail.savings.impl.common.sole_tax_residency;

import ang.f;
import kotlin.jvm.internal.Intrinsics;
import mre.c;
import rd0.e;
import u36.g;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends n implements vkb.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f f83208l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f83209m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f83210n;
    public final c o;

    public b(f userInteractor, j60.a bottomDialogExtension, a dialogModelProvider, c termsNavigationFactory) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(dialogModelProvider, "dialogModelProvider");
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        this.f83208l = userInteractor;
        this.f83209m = bottomDialogExtension;
        this.f83210n = dialogModelProvider;
        this.o = termsNavigationFactory;
    }

    @Override // yji.n
    public final void D2() {
        n.j2(this, e.b(this.f83209m.C()), null, new g(2, this, b.class, "onSubtitleClauseClick", "onSubtitleClauseClick(Lcom/revolut/core/ui_kit/dialogs/ExpandableDialogDisplayer$SubtitleClickData;)V", 4, 14), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
    
        if (r7 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b0, code lost:
    
        if (r7 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b2, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(npg.k r7, com.revolut.feature.shared.savings.models.product.SavingsProductData r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof vkb.e
            if (r0 == 0) goto L13
            r0 = r9
            vkb.e r0 = (vkb.e) r0
            int r1 = r0.f289900w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f289900w = r1
            goto L18
        L13:
            vkb.e r0 = new vkb.e
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289900w
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L34
            if (r2 == r5) goto L27
            if (r2 != r3) goto L2c
        L27:
            yhm.o.b(r9)
            goto Lb3
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r9)
            int[] r9 = vkb.c.f289898a
            int r7 = r7.ordinal()
            r7 = r9[r7]
            java.lang.String r9 = "flatMapCompletable(...)"
            ang.f r2 = r6.f83208l
            if (r7 == r5) goto L8c
            if (r7 == r3) goto L65
            r9 = 3
            if (r7 == r9) goto L55
            r8 = 4
            if (r7 != r8) goto L4f
            r4 = r5
            goto Lb3
        L4f:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L55:
            com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$SavingsUnavailableException r7 = new com.revolut.feature.retail.savings.api.error.SavingsErrorHandlingApi$SavingsUnavailableException
            com.revolut.feature.shared.savings.models.product.SavingsProduct r8 = r8.f86683a
            java.lang.String r8 = r8.f86617a
            java.lang.String r9 = "Savings is unavailable for product with id = "
            java.lang.String r8 = j6.a.q(r9, r8)
            r7.<init>(r8)
            throw r7
        L65:
            r0.f289900w = r3
            efm.d0 r7 = r2.f(r4)
            vkb.b r8 = new vkb.b
            r2 = 1
            r8.<init>(r6, r2)
            vif.c r2 = new vif.c
            r3 = 6
            r2.<init>(r8, r3)
            pfm.a r8 = new pfm.a
            r3 = 4
            r8.<init>(r7, r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.lang.Object r7 = nim.a.a(r8, r0)
            if (r7 != r1) goto L87
            goto L89
        L87:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        L89:
            if (r7 != r1) goto Lb3
            goto Lb2
        L8c:
            r0.f289900w = r5
            efm.d0 r7 = r2.f(r4)
            vkb.b r8 = new vkb.b
            r2 = 0
            r8.<init>(r6, r2)
            vif.c r2 = new vif.c
            r3 = 5
            r2.<init>(r8, r3)
            pfm.a r8 = new pfm.a
            r3 = 4
            r8.<init>(r7, r2, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            java.lang.Object r7 = nim.a.a(r8, r0)
            if (r7 != r1) goto Lae
            goto Lb0
        Lae:
            kotlin.Unit r7 = kotlin.Unit.f186387a
        Lb0:
            if (r7 != r1) goto Lb3
        Lb2:
            return r1
        Lb3:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.common.sole_tax_residency.b.Z2(npg.k, com.revolut.feature.shared.savings.models.product.SavingsProductData, gim.c):java.lang.Object");
    }
}
