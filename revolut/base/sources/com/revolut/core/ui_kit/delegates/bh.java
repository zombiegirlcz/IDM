package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmartTileSendMoneyDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class bh implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ihm.k f53737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SmartTileSendMoneyDelegate.Model f53738b;

    public bh(ihm.k kVar, SmartTileSendMoneyDelegate.Model model) {
        this.f53737a = kVar;
        this.f53738b = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f53737a.onNext(new ch(formattedValue, this.f53738b));
    }
}
