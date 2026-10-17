package com.fourthline.vision.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ef {
    public static final boolean isPortrait(@NotNull df dfVar) {
        Intrinsics.checkNotNullParameter(dfVar, "<this>");
        return dfVar.getOrientationHint() == 0 || dfVar.getOrientationHint() == 180;
    }
}
