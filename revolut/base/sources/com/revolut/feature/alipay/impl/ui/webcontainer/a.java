package com.revolut.feature.alipay.impl.ui.webcontainer;

import com.revolut.feature.alipay.impl.ui.webcontainer.AlipayPlusWebContainerContract$Step;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerParams;
import com.revolut.feature.alipay_plus.mpm.webcontainer.APMPMWebContainerRuntime;
import d8l.d;
import fgj.g;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import yki.b;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements fl1.a {
    public final AlipayPlusWebContainerContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f61099p;

    public a(AlipayPlusWebContainerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = inputData;
        this.f61099p = d.a(this, new g(this, 12));
    }

    @Override // yji.l
    public final void K1() {
        APMPMWebContainerRuntime aPMPMWebContainerRuntime = APMPMWebContainerRuntime.INSTANCE;
        AlipayPlusWebContainerContract$InputData alipayPlusWebContainerContract$InputData = this.o;
        aPMPMWebContainerRuntime.notifyDestroyed(alipayPlusWebContainerContract$InputData.f61096h, new APMPMWebContainerParams(alipayPlusWebContainerContract$InputData.a(), alipayPlusWebContainerContract$InputData.f61093b, alipayPlusWebContainerContract$InputData.f61094c, alipayPlusWebContainerContract$InputData.d, alipayPlusWebContainerContract$InputData.e, alipayPlusWebContainerContract$InputData.f, alipayPlusWebContainerContract$InputData.f61095g).toExtras(alipayPlusWebContainerContract$InputData.f61096h));
    }

    @Override // yki.j
    public final void M0() {
        h.t2(this, this.f61099p, new AlipayPlusWebContainerContract$Step.WebContainer(this.o), false, null, false, 12);
    }

    @Override // yki.g
    public final b s() {
        return this.f61099p;
    }
}
