package com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow;

import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$Step;
import fnc.s;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import s1a.f;
import tof.a3;
import v1a.d;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements v1a.b {

    @NotNull
    public static final d Companion = new d();
    public final SplitBillQrFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s f79875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f79876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a3 f79877r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yki.a f79878s;

    public c(SplitBillQrFlowContract$InputData inputData, s splitBillLinkInteractor, f splitBillLinkBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(splitBillLinkInteractor, "splitBillLinkInteractor");
        Intrinsics.checkNotNullParameter(splitBillLinkBottomSheetProvider, "splitBillLinkBottomSheetProvider");
        this.o = inputData;
        this.f79875p = splitBillLinkInteractor;
        this.f79876q = splitBillLinkBottomSheetProvider;
        this.f79877r = inputData.f79865a.f79828a.getF79953b();
        v1a.c cVar = new v1a.c(this, 0);
        this.f79878s = cp5.d.a(this, SplitBillQrFlowContract$Step.QrScreen.f79869a, f0.f322471a, cVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f79878s;
    }
}
