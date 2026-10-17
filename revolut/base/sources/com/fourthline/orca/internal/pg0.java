package com.fourthline.orca.internal;

import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.view.ComponentActivity;
import kotlin.UninitializedPropertyAccessException;

/* JADX INFO: loaded from: classes23.dex */
public abstract class pg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ProvidableCompositionLocal f31959a = CompositionLocalKt.staticCompositionLocalOf(new wp1(27));

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentActivity a() {
        throw new UninitializedPropertyAccessException("Local Activity not initialised.");
    }

    public static final ProvidableCompositionLocal b() {
        return f31959a;
    }
}
