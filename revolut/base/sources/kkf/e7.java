package kkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e7 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f184660l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zv9.a f184661m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final klf.n2 f184662n;
    public final klf.m1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w0a.h f184663p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w0a.g f184664q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w0a.f f184665r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final cl3.a f184666s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final elf.b2 f184667t;

    public e7(klf.h0 commonDataSource, zv9.a paymentsProductFeatureChecker, klf.n2 splitBillDataSource, klf.m1 juniorDataSource, w0a.h splitBillItemsMapper, w0a.g splitBillItemizationItemsMapper, w0a.f itemizationItemsDetailsDataProvider, cl3.a contactsInteractor, elf.b2 splitBillItemizationClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(splitBillDataSource, "splitBillDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(splitBillItemsMapper, "splitBillItemsMapper");
        Intrinsics.checkNotNullParameter(splitBillItemizationItemsMapper, "splitBillItemizationItemsMapper");
        Intrinsics.checkNotNullParameter(itemizationItemsDetailsDataProvider, "itemizationItemsDetailsDataProvider");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(splitBillItemizationClickHandler, "splitBillItemizationClickHandler");
        this.f184660l = commonDataSource;
        this.f184661m = paymentsProductFeatureChecker;
        this.f184662n = splitBillDataSource;
        this.o = juniorDataSource;
        this.f184663p = splitBillItemsMapper;
        this.f184664q = splitBillItemizationItemsMapper;
        this.f184665r = itemizationItemsDetailsDataProvider;
        this.f184666s = contactsInteractor;
        this.f184667t = splitBillItemizationClickHandler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARN: Type inference failed for: r0v9, types: [aim.e, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r13v11, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r41v0, types: [java.util.List, mx0.i1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable Z2(kkf.e7 r74, tof.a3 r75, klf.r2 r76, java.util.Map r77, gim.c r78) {
        /*
            Method dump skipped, instruction units count: 1579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.e7.Z2(kkf.e7, tof.a3, klf.r2, java.util.Map, gim.c):java.io.Serializable");
    }

    public final cmf.p b3() {
        return new cmf.p(vkm.q.Q(((cw9.d) this.f184661m).f109573b.A("BILLS_AND_TAXES.split_bill"), new a7(null, this, 0)), new z5(3), zhm.v.k(this, this.f184667t), "SplitBill");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r3, java.lang.String r4, kotlin.coroutines.Continuation r5) {
        /*
            r2 = this;
            boolean r4 = r3 instanceof v61.d
            r5 = 0
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L17
            v61.d r3 = (v61.d) r3
            java.lang.String r3 = r3.e
            if (r3 != 0) goto Le
            goto L32
        Le:
            com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$BridgeDetails$ById$BridgeDestination r4 = new com.revolut.feature.payments.money_request.api.navigation.MoneyRequestFeatureConfig$BridgeDetails$ById$BridgeDestination
            r4.<init>(r3, r5, r5)
            r2.A2(r4)
            goto L33
        L17:
            boolean r4 = r3 instanceof com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState
            if (r4 == 0) goto L32
            com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState r3 = (com.revolut.feature.payments.splitbill.models.splitbilllink.SplitBillQrState) r3
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrDescriptor r4 = new com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrDescriptor
            com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData r1 = new com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrInputData
            r1.<init>(r3)
            r4.<init>(r1)
            com.revolut.kompot.navigable.vc.ViewController r3 = r2.o2(r4)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_FADE r4 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_FADE.f98307a
            r1 = 2
            yji.n.P2(r2, r3, r4, r5, r1)
            goto L33
        L32:
            r0 = r1
        L33:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kkf.e7.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
