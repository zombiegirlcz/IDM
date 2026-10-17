package com.fourthline.vision.internal;

import com.google.mlkit.common.MlKitException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public abstract class e9 {
    public static final boolean isMissingModelsException(@NotNull Throwable th10) {
        Intrinsics.checkNotNullParameter(th10, "<this>");
        return (th10 instanceof MlKitException) && ((MlKitException) th10).f49665a == 14;
    }
}
