package com.revolut.core.ui_kit.delegates;

import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import ip0.lg0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class xg implements zp0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ihm.k f55604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg0 f55605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ SmartTileExchangeDelegate.Model f55606c;

    public xg(ihm.k kVar, lg0 lg0Var, SmartTileExchangeDelegate.Model model) {
        this.f55604a = kVar;
        this.f55605b = lg0Var;
        this.f55606c = model;
    }

    @Override // zp0.c
    public final void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        this.f55604a.onNext(new zg(formattedValue, this.f55605b, this.f55606c));
    }
}
