package com.fourthline.orca.internal;

import com.fourthline.orca.core.OnProductCompleted;
import com.fourthline.orca.document.DocumentCustomizationConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class lh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ml f30620a;

    public lh(lg1 networkConfig, um documentConfig, DocumentCustomizationConfig customizationConfig, OnProductCompleted completionBlock) {
        Intrinsics.checkNotNullParameter(networkConfig, "networkConfig");
        Intrinsics.checkNotNullParameter(documentConfig, "documentConfig");
        Intrinsics.checkNotNullParameter(customizationConfig, "customizationConfig");
        Intrinsics.checkNotNullParameter(completionBlock, "completionBlock");
        this.f30620a = new ml(networkConfig, documentConfig.e(), customizationConfig.getFlavor(), documentConfig, completionBlock, documentConfig);
    }

    public final ml a() {
        return this.f30620a;
    }

    public final r70 b() {
        return this.f30620a;
    }

    public final zq0 c() {
        return new zm(this.f30620a.g());
    }

    public final sy d() {
        return new sy("NavigationDestination.Document::class.java");
    }
}
