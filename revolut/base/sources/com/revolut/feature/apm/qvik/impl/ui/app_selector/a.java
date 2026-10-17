package com.revolut.feature.apm.qvik.impl.ui.app_selector;

import com.revolut.feature.apm.qvik.api.navigation.QvikAppSelectorNavigation$InputData;
import com.revolut.feature.apm.qvik.impl.ui.app_selector.QvikAppSelectorFlowContract$Step;
import cp5.d;
import kc2.b;
import kotlin.jvm.internal.Intrinsics;
import n8i.e;
import nc2.c;
import oki.h;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements c {
    public final QvikAppSelectorNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final nc2.a f62806p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f62807q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f62808r;

    public a(QvikAppSelectorNavigation$InputData inputData, nc2.a dialogProvider, b interactor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dialogProvider, "dialogProvider");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.o = inputData;
        this.f62806p = dialogProvider;
        this.f62807q = interactor;
        e eVar = new e(this, 6);
        this.f62808r = d.a(this, QvikAppSelectorFlowContract$Step.Dialog.f62805a, f0.f322471a, eVar);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f62808r;
    }
}
