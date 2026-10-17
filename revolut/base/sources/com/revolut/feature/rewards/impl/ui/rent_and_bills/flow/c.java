package com.revolut.feature.rewards.impl.ui.rent_and_bills.flow;

import com.revolut.feature.rewards.impl.ui.rent_and_bills.screen.unlink_payment.RentAndBillsUnlinkPaymentsStatusDialogFactory;
import d8l.d;
import eub.i;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import wde.f;
import wic.e;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends h implements wic.b {

    @NotNull
    public static final e Companion = new e();
    public final RentAndBillsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zic.b f84974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f84975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ejc.a f84976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ejc.b f84977s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RentAndBillsUnlinkPaymentsStatusDialogFactory f84978t;
    public final yki.i u;

    public c(RentAndBillsFlowContract$InputData inputData, zic.b rentAndBillsHomeBottomSheetProvider, i revPointsOptInInteractor, ejc.a allowanceDetailsBottomSheetProvider, ejc.b earnRateDetailsBottomSheetProvider, RentAndBillsUnlinkPaymentsStatusDialogFactory rentAndBillsUnlinkPaymentsStatusDialogFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rentAndBillsHomeBottomSheetProvider, "rentAndBillsHomeBottomSheetProvider");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(allowanceDetailsBottomSheetProvider, "allowanceDetailsBottomSheetProvider");
        Intrinsics.checkNotNullParameter(earnRateDetailsBottomSheetProvider, "earnRateDetailsBottomSheetProvider");
        Intrinsics.checkNotNullParameter(rentAndBillsUnlinkPaymentsStatusDialogFactory, "rentAndBillsUnlinkPaymentsStatusDialogFactory");
        this.o = inputData;
        this.f84974p = rentAndBillsHomeBottomSheetProvider;
        this.f84975q = revPointsOptInInteractor;
        this.f84976r = allowanceDetailsBottomSheetProvider;
        this.f84977s = earnRateDetailsBottomSheetProvider;
        this.f84978t = rentAndBillsUnlinkPaymentsStatusDialogFactory;
        this.u = d.a(this, new f(this, 12));
    }

    @Override // yki.j
    public final void M0() {
        l2(new w76.a(this, null, 14), new wic.c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
