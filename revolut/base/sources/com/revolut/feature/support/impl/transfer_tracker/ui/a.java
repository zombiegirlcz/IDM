package com.revolut.feature.support.impl.transfer_tracker.ui;

import com.revolut.feature.support.impl.transfer_tracker.ui.InboundTransferTrackerFlowContract$Step;
import cp5.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import wde.e;
import wde.f;
import yki.b;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements e {
    public final wde.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final lee.a f89398p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final dee.e f89399q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f89400r;

    public a(wde.a formDestinationBuilder, lee.a transactionReferenceBottomSheetFactory, dee.e delayedTransferLearnMoreBottomSheetFactory) {
        Intrinsics.checkNotNullParameter(formDestinationBuilder, "formDestinationBuilder");
        Intrinsics.checkNotNullParameter(transactionReferenceBottomSheetFactory, "transactionReferenceBottomSheetFactory");
        Intrinsics.checkNotNullParameter(delayedTransferLearnMoreBottomSheetFactory, "delayedTransferLearnMoreBottomSheetFactory");
        this.o = formDestinationBuilder;
        this.f89398p = transactionReferenceBottomSheetFactory;
        this.f89399q = delayedTransferLearnMoreBottomSheetFactory;
        f fVar = new f(this, 0);
        this.f89400r = d.a(this, InboundTransferTrackerFlowContract$Step.InputForm.f89393a, f0.f322471a, fVar);
    }

    @Override // yki.g
    public final b s() {
        return this.f89400r;
    }
}
