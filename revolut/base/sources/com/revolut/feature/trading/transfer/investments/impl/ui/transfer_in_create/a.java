package com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create;

import android.os.Parcelable;
import com.revolut.core.ui_kit.views.slider_layout.SliderLayout;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.navigation.MainContainerScreenFeatureConfig;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_create.TransferInFlowContract$Step;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import z9f.b;
import z9f.c;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yki.a f91588p;

    public a(c inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = e.b(this, new TransferInFlowContract$State(0));
        this.f91588p = cp5.d.a(this, new TransferInFlowContract$Step.BrokerSelection(inputData.f320333a), f0.f322471a, new yz4.b(this, 21));
    }

    public final void I2() {
        C1(u0.c(new MainContainerScreenFeatureConfig(new MainContainerScreenDestination.JustShow(ibb.c.f160141b.f83420a, (SliderLayout.SlidingSpec) null, (Parcelable) null, 14), 335577088, false)));
    }

    @Override // qki.e
    public final d getState() {
        return this.o;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91588p;
    }
}
