package com.revolut.feature.apm.core.ui.impl.ui.transfer.review;

import c52.c;
import c52.s;
import cli.g;
import cli.y;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuote;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteBreakdownItem;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteChargeTax;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteCharges;
import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteRate;
import com.revolut.feature.apm.core.ui.api.mapper.ApmFooterContent;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import hx7.e;
import i2l.n0;
import i4h.q;
import i52.a0;
import i52.b;
import i52.b0;
import i52.c0;
import i52.e0;
import i52.i;
import i52.o;
import i52.z;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q12.l;
import vkm.j2;
import vkm.v1;
import x02.d;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements i {

    @NotNull
    public static final b0 Companion = new b0();
    public final y A;
    public final TransferReviewContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f62471p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o f62472q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f62473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f62474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i5k.a f62475t;
    public final j60.a u;
    public final yof.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final v2k.c f62476w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s42.c f62477x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c52.a f62478y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(TransferReviewContract$InputData inputData, d router, o interactor, c transferExtension, s transferResultExtension, i5k.a appFraudCheckExtension, j60.a bottomDialogExtension, yof.a recipientTrustMapper, v2k.c taxesItemProvider, s42.c expiryExtension, c52.a expiryDialogProvider, z stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(router, "router");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transferExtension, "transferExtension");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        Intrinsics.checkNotNullParameter(expiryExtension, "expiryExtension");
        Intrinsics.checkNotNullParameter(expiryDialogProvider, "expiryDialogProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f62471p = router;
        this.f62472q = interactor;
        this.f62473r = transferExtension;
        this.f62474s = transferResultExtension;
        this.f62475t = appFraudCheckExtension;
        this.u = bottomDialogExtension;
        this.v = recipientTrustMapper;
        this.f62476w = taxesItemProvider;
        this.f62477x = expiryExtension;
        this.f62478y = expiryDialogProvider;
        this.z = e.a(this, new n0(9));
        ApmTransferDestination apmTransferDestination = inputData.f62466a;
        ApmTransferDirection apmTransferDirection = inputData.f62467b;
        Intrinsics.checkNotNullParameter(apmTransferDirection, "<this>");
        this.A = mra.d.b(this, new b(apmTransferDestination, apmTransferDirection, k12.b.a(apmTransferDirection.t0()), inputData.d, inputData.f62468c, null, inputData.f, inputData.f62469g, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof i52.d0
            if (r0 == 0) goto L13
            r0 = r5
            i52.d0 r0 = (i52.d0) r0
            int r1 = r0.f158554w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158554w = r1
            goto L18
        L13:
            i52.d0 r0 = new i52.d0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f158554w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4c
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            tji.f r5 = r4.X()
            c52.a r2 = r4.f62478y
            r2.getClass()
            nii.y0 r2 = c52.a.a()
            rv6.e r5 = r5.d(r2)
            r0.f158554w = r3
            java.lang.Object r5 = vkm.q.x(r5, r0)
            if (r5 != r1) goto L4c
            return r1
        L4c:
            i52.e r5 = i52.e.f158555a
            r4.C2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a.I2(com.revolut.feature.apm.core.ui.impl.ui.transfer.review.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void J2(Object obj2, String listId) {
        ApmQuote apmQuote;
        ApmQuoteRate apmQuoteRate;
        ApmQuote apmQuote2;
        ApmQuoteCharges apmQuoteCharges;
        ApmQuote apmQuote3;
        Intrinsics.checkNotNullParameter(listId, "listId");
        int iHashCode = listId.hashCode();
        v2k.c cVar = this.f62476w;
        j60.a aVar = this.u;
        d dVar = this.f62471p;
        switch (iHashCode) {
            case -1954780290:
                if (!listId.equals("ID_TAXES_BREAKDOWN_CGST_CELL_ITEM")) {
                    return;
                }
                break;
            case -1453783698:
                if (!listId.equals("ID_TAXES_BREAKDOWN_SGST_CELL_ITEM")) {
                    return;
                }
                break;
            case -1088218285:
                if (!listId.equals("ID_TAXES_BREAKDOWN_UNKNOWN_CELL_ITEM")) {
                    return;
                }
                break;
            case -884385171:
                if (!listId.equals("ID_TAXES_BREAKDOWN_TCS_CELL_ITEM")) {
                    return;
                }
                break;
            case -693164744:
                if (!listId.equals("ID_TAXES_BREAKDOWN_IGST_CELL_ITEM")) {
                    return;
                }
                break;
            case -96477444:
                if (!listId.equals("BREAKDOWN_PREFIX_PAYMENT_BREAKDOWN_EXCHANGE_RATE_ITEM") || (apmQuote = K2().f158551a) == null || (apmQuoteRate = apmQuote.f62209a) == null) {
                    return;
                }
                C1(((l) dVar).f(apmQuoteRate));
                return;
            case 192728422:
                if (!listId.equals("ID_TAXES_CELL_ITEM") || (apmQuote2 = K2().f158551a) == null || (apmQuoteCharges = apmQuote2.d) == null) {
                    return;
                }
                ApmQuoteChargeTax apmQuoteChargeTax = apmQuoteCharges.f62224c;
                Intrinsics.checkNotNullParameter(apmQuoteCharges, "<this>");
                List<ApmQuoteBreakdownItem> list = apmQuoteChargeTax.f62221b;
                ArrayList arrayList = new ArrayList(w.t(list, 10));
                for (ApmQuoteBreakdownItem apmQuoteBreakdownItem : list) {
                    arrayList.add(new z3l.b(apmQuoteBreakdownItem.d, null, apmQuoteBreakdownItem.f62214a, null, apmQuoteBreakdownItem.f62215b));
                }
                aVar.x(cVar.c(new z3l.a(arrayList, apmQuoteChargeTax.f62220a)));
                return;
            case 268160571:
                if (!listId.equals("ID_TAXES_BREAKDOWN_FX_CGST_CELL_ITEM")) {
                    return;
                }
                break;
            case 768659314:
                if (!listId.equals("ID_TAXES_BREAKDOWN_VAT_CELL_ITEM")) {
                    return;
                }
                break;
            case 769157163:
                if (!listId.equals("ID_TAXES_BREAKDOWN_FX_SGST_CELL_ITEM")) {
                    return;
                }
                break;
            case 1443934367:
                if (listId.equals("BREAKDOWN_PREFIX_PAYMENT_BREAKDOWN_FEES_ITEM") && (apmQuote3 = K2().f158551a) != null) {
                    C1(((l) dVar).c(apmQuote3));
                    return;
                }
                return;
            case 1529776117:
                if (!listId.equals("ID_TAXES_BREAKDOWN_FX_IGST_CELL_ITEM")) {
                    return;
                }
                break;
            case 1811245001:
                if (!listId.equals("ID_TAXES_BREAKDOWN_GMF_CELL_ITEM")) {
                    return;
                }
                break;
            case 2092719467:
                if (!listId.equals("ID_TAXES_BREAKDOWN_STAMP_DUTY_CELL_ITEM")) {
                    return;
                }
                break;
            default:
                return;
        }
        z3l.b bVar = obj2 instanceof z3l.b ? (z3l.b) obj2 : null;
        if (bVar != null) {
            aVar.x(cVar.b(bVar));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final i52.c K2() {
        i52.c cVar = ((b) ((j2) this.A.f22677a).getValue()).f;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // yji.l
    public final void T1(long j2) {
        q qVar = new q(14);
        y yVar = this.A;
        yji.l.b1(this, vkm.q.Q(v7.w(yVar.B(qVar)), new hcj.o((Continuation) null, this, 16)), null, new c0(this, null), 3);
        ApmTransferContract$InputData.FooterConfig footerConfig = this.o.f;
        ApmFooterContent apmFooterContent = footerConfig != null ? footerConfig.f62290b : null;
        if (apmFooterContent instanceof ApmFooterContent.TextOnly) {
            H2(yVar, new a0((ApmFooterContent.TextOnly) apmFooterContent, 0));
            return;
        }
        if (!(apmFooterContent instanceof ApmFooterContent.Expiry)) {
            if (!(apmFooterContent instanceof ApmFooterContent.ImageOnly) && apmFooterContent != null) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            long j3 = ((ApmFooterContent.Expiry) apmFooterContent).f62231a;
            s42.c cVar = this.f62477x;
            cVar.getClass();
            yji.l.b1(this, new v1(new s42.b(cVar, j3, null)), null, new e0(this, null), 3);
        }
    }

    @Override // cli.z
    public final g getState() {
        return this.A;
    }
}
