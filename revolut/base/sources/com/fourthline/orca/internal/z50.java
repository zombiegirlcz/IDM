package com.fourthline.orca.internal;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes23.dex */
public abstract class z50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f35525a = CompositionLocalKt.staticCompositionLocalOf(new vt1(0));

    /* JADX INFO: Access modifiers changed from: private */
    public static final za a() {
        throw new UninitializedPropertyAccessException("Compose UI Feature Config is not initialised.");
    }

    public static final ProvidableCompositionLocal b() {
        return f35525a;
    }
}
