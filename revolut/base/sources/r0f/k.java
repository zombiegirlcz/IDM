package r0f;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreenContract$InputData;
import e0f.u0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends oki.h implements i {
    public final McyExchangeRateScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vte.a f250796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f250797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v2k.c f250798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wj0.a f250799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u0 f250800t;
    public final f01.a u;
    public final y v;

    public k(m stateMapper, McyExchangeRateScreenContract$InputData inputData, vte.a interactor, j60.a bottomDialogControllerExtension, v2k.c taxesItemProvider, wj0.a idempotencyKeyHolder, u0 mcyTopupErrorInteractor, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(bottomDialogControllerExtension, "bottomDialogControllerExtension");
        Intrinsics.checkNotNullParameter(taxesItemProvider, "taxesItemProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(mcyTopupErrorInteractor, "mcyTopupErrorInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.o = inputData;
        this.f250796p = interactor;
        this.f250797q = bottomDialogControllerExtension;
        this.f250798r = taxesItemProvider;
        this.f250799s = idempotencyKeyHolder;
        this.f250800t = mcyTopupErrorInteractor;
        this.u = uiKitResources;
        this.v = mra.d.b(this, new f(new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    @Override // yji.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void I1() {
        /*
            r23 = this;
            r0 = r23
            com.revolut.feature.topup_screen.impl.mcy.mcy_exchange_rate.McyExchangeRateScreenContract$InputData r1 = r0.o
            xi0.b r2 = r1.f91086a
            dj0.d r3 = r1.f91087b
            boolean r4 = r1.f91088c
            com.revolut.domain.models.topup.mcy.McyTopUpMethod r1 = r1.e
            com.revolut.domain.models.topup.mcy.McyTopUpMethod$BankTransfer r5 = com.revolut.domain.models.topup.mcy.McyTopUpMethod.BankTransfer.f60433a
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r1, r5)
            r6 = 0
            if (r5 == 0) goto L19
            com.revolut.domain.models.topup.methods.TopupMethodType r1 = com.revolut.domain.models.topup.methods.TopupMethodType.MCY_BANK_TRANSFER
        L17:
            r13 = r1
            goto L2a
        L19:
            boolean r5 = r1 instanceof com.revolut.domain.models.topup.mcy.McyTopUpMethod.Stored.Upi
            if (r5 == 0) goto L20
            com.revolut.domain.models.topup.methods.TopupMethodType r1 = com.revolut.domain.models.topup.methods.TopupMethodType.MCY_UPI_APP
            goto L17
        L20:
            boolean r5 = r1 instanceof com.revolut.domain.models.topup.mcy.McyTopUpMethod.Stored.NetBanking
            if (r5 == 0) goto L27
            com.revolut.domain.models.topup.methods.TopupMethodType r1 = com.revolut.domain.models.topup.methods.TopupMethodType.MCY_NET_BANKING
            goto L17
        L27:
            if (r1 != 0) goto Lbe
            r13 = r6
        L2a:
            vte.a r1 = r0.f250796p
            e0f.v0 r1 = (e0f.v0) r1
            r1.getClass()
            java.lang.String r5 = "baseCurrency"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            java.lang.String r7 = "targetAmount"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            w71.b r1 = r1.f121695c
            e31.j r1 = (e31.j) r1
            r1.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r5)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r7)
            qe0.o r14 = r1.f122184h
            long r8 = r3.f115082a
            xi0.b r1 = r3.f115083b
            java.lang.String r10 = r1.f306286a
            java.lang.String r11 = r2.f306286a
            if (r4 == 0) goto L57
            java.lang.String r1 = "TCS_THRESHOLD_EXCEEDED"
            goto L58
        L57:
            r1 = r6
        L58:
            java.util.List r12 = zhm.v.l(r1)
            com.revolut.data.network.models.topup.MultiCurrencyTransferReviewRequest r15 = new com.revolut.data.network.models.topup.MultiCurrencyTransferReviewRequest
            r7 = r15
            r7.<init>(r8, r10, r11, r12, r13)
            r20 = 0
            r21 = 16
            r16 = 1
            w4l.i r18 = w4l.i.f294643c
            r19 = 1
            vkm.d r1 = qe0.o.a(r14, r15, r16, r18, r19, r20, r21)
            e1d.h r2 = new e1d.h
            r3 = 9
            r2.<init>(r3)
            akg.n r1 = nim.a.v(r1, r2)
            q9c.v r7 = new q9c.v
            r13 = 4
            r14 = 6
            r8 = 2
            e0f.u0 r9 = r0.f250800t
            java.lang.Class<e0f.u0> r10 = e0f.u0.class
            java.lang.String r11 = "extractDocumentExpiredError"
            java.lang.String r12 = "extractDocumentExpiredError(Lcom/revolut/data/model/Data;)V"
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r17 = r9
            vkm.q0 r2 = new vkm.q0
            r3 = 1
            r2.<init>(r1, r7, r3)
            q9c.v r15 = new q9c.v
            r21 = 4
            r22 = 7
            r16 = 2
            java.lang.Class<e0f.u0> r18 = e0f.u0.class
            java.lang.String r19 = "extractLrsLimitError"
            java.lang.String r20 = "extractLrsLimitError(Lcom/revolut/data/model/Data;)V"
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            vkm.q0 r1 = new vkm.q0
            r1.<init>(r2, r15, r3)
            qp7.g r4 = new qp7.g
            r2 = 20
            r4.<init>(r0, r6, r2)
            r5 = 3
            r2 = 0
            r3 = 0
            yji.l.a1(r0, r1, r2, r3, r4, r5)
            java.lang.String r1 = "IDEMPOTENCY_TAG_BOOK_MULTI_CURRENCY_TRANSFER"
            wj0.a r2 = r0.f250799s
            r2.a(r1)
            return
        Lbe:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r0f.k.I1():void");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
