package elf;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.vaults.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class v1 extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j60.a f127422l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final njb.d f127423m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r10.r f127424n;
    public final lg0.b o;

    public v1(j60.a bottomDialogExtension, njb.d productInfoSheetsDelegate, r10.r infoSheetDeeplinkHandler, lg0.b deeplinkHandler) {
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(productInfoSheetsDelegate, "productInfoSheetsDelegate");
        Intrinsics.checkNotNullParameter(infoSheetDeeplinkHandler, "infoSheetDeeplinkHandler");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f127422l = bottomDialogExtension;
        this.f127423m = productInfoSheetsDelegate;
        this.f127424n = infoSheetDeeplinkHandler;
        this.o = deeplinkHandler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (lg0.b.x1(r7.o, r8, null, null, r5, 2) == r0) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r8, java.lang.String r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof elf.t1
            if (r0 == 0) goto L14
            r0 = r10
            elf.t1 r0 = (elf.t1) r0
            int r1 = r0.f127413x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f127413x = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            elf.t1 r0 = new elf.t1
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.v
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f127413x
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r10)
            goto L64
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.String r8 = r5.u
            yhm.o.b(r10)
            goto L4a
        L3a:
            yhm.o.b(r10)
            r5.u = r8
            r5.f127413x = r3
            r10.r r10 = r7.f127424n
            java.lang.Object r10 = r10.r(r8, r9, r5)
            if (r10 != r0) goto L4a
            goto L63
        L4a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r9 = r10.booleanValue()
            if (r9 != 0) goto L67
            r9 = 0
            r5.u = r9
            r5.f127413x = r2
            lg0.b r1 = r7.o
            r3 = 0
            r4 = 0
            r6 = 2
            r2 = r8
            java.lang.Object r8 = lg0.b.x1(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L64
        L63:
            return r0
        L64:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.v1.Z2(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.Object r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof elf.u1
            if (r0 == 0) goto L13
            r0 = r6
            elf.u1 r0 = (elf.u1) r0
            int r1 = r0.f127417w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f127417w = r1
            goto L18
        L13:
            elf.u1 r0 = new elf.u1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f127417w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L66
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r6 = "null cannot be cast to non-null type com.revolut.feature.shared.savings.models.product.SavingsProductData"
            kotlin.jvm.internal.Intrinsics.i(r5, r6)
            com.revolut.feature.shared.savings.models.product.SavingsProductData r5 = (com.revolut.feature.shared.savings.models.product.SavingsProductData) r5
            com.revolut.feature.shared.savings.models.product.ProductGroup r6 = r5.f86684b
            java.util.List r6 = r6.k
            java.lang.Object r6 = zhm.d0.d0(r6)
            com.revolut.feature.shared.savings.models.product.ProductGroup$Tax r6 = (com.revolut.feature.shared.savings.models.product.ProductGroup.Tax) r6
            if (r6 != 0) goto L48
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L48:
            java.lang.String r2 = r6.e
            if (r2 == 0) goto L59
            com.revolut.feature.shared.savings.models.product.SavingsProduct r5 = r5.f86683a
            java.lang.String r5 = r5.f86617a
            r0.f127417w = r3
            java.lang.Object r5 = r4.Z2(r2, r5, r0)
            if (r5 != r1) goto L66
            return r1
        L59:
            njb.d r5 = r4.f127423m
            skb.f r5 = (skb.f) r5
            rp0.y r5 = r5.e(r6)
            j60.a r6 = r4.f127422l
            r6.x(r5)
        L66:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: elf.v1.b3(java.lang.Object, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        rp0.y yVar;
        int iHashCode = str.hashCode();
        njb.d dVar = this.f127423m;
        boolean z = false;
        j60.a aVar = this.f127422l;
        switch (iHashCode) {
            case -1903882484:
                if (str.equals("ID_SAVINGS_INTEREST_TAX_FEES")) {
                    return b3(obj2, (gim.c) continuation);
                }
                return Boolean.valueOf(z);
            case -1032828734:
                if (str.equals("ID_SAVINGS_INTEREST_SERVICE_FEES")) {
                    aVar.x(((skb.f) dVar).d());
                    z = true;
                }
                return Boolean.valueOf(z);
            case 419899223:
                if (str.equals("ID_SAVINGS_INTEREST_NET_INTEREST")) {
                    Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.feature.shared.savings.models.product.SavingsProductData");
                    SavingsProductData productData = (SavingsProductData) obj2;
                    ((skb.f) dVar).getClass();
                    Intrinsics.checkNotNullParameter(productData, "productData");
                    SavingsProduct savingsProduct = productData.f86683a;
                    xi0.b currency = savingsProduct.f86618b;
                    int i = skb.e.f263802a[savingsProduct.f86619c.ordinal()];
                    if (i == 1 || i == 2) {
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.mmf_info_sheets_interest_rate_explanation_cells_net_interest, null, null, 14);
                        int i2 = com.revolut.feature.retail.savings.api.R$string.savings_info_sheets_net_interest_explanation_subtitle_tax;
                        skb.c cVar = skb.d.Companion;
                        dj0.d dVar2 = new dj0.d(1L, currency);
                        cVar.getClass();
                        yVar = new rp0.y(zhm.u.c(skb.c.a(cVar, R$attr.uikit_dp16, 0, 14)), new rp0.t(textLocalisedClause, new TextLocalisedClause(i2, zhm.u.c(skb.c.b(dVar2)), null, 12), null, 28), null, null, null, null, "INFO_DELEGATES_KEY", null, null, null, 3836);
                    } else {
                        if (i != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.mmf_info_sheets_interest_rate_explanation_cells_net_interest, null, null, 14);
                        int i3 = R$string.mmf_info_sheets_net_interest_explanation_subtitle;
                        skb.c cVar2 = skb.d.Companion;
                        dj0.d dVar3 = new dj0.d(1L, currency);
                        cVar2.getClass();
                        yVar = new rp0.y(zhm.u.c(skb.c.a(cVar2, R$attr.uikit_dp16, 0, 14)), new rp0.t(textLocalisedClause2, new TextLocalisedClause(i3, zhm.u.c(skb.c.b(dVar3)), null, 12), null, 28), null, null, null, null, "INFO_DELEGATES_KEY", null, null, null, 3836);
                    }
                    aVar.x(yVar);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2138519144:
                if (str.equals("ID_SAVINGS_INTEREST_GOT_IT_BUTTON")) {
                    j60.a.v(aVar, false, null, 2);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Boolean.valueOf(z);
        }
    }
}
