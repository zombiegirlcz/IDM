package com.google.android.material.color;

import android.content.Context;
import android.content.res.loader.ResourcesLoader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\tH\u0007¨\u0006\u000b"}, d2 = {"Lcom/google/android/material/color/ColorResourcesLoaderCreatorAccessor;", "", "<init>", "()V", "create", "Landroid/content/res/loader/ResourcesLoader;", "context", "Landroid/content/Context;", "colorMapping", "", "", "feature_shared_ui_personalisation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ColorResourcesLoaderCreatorAccessor {

    @NotNull
    public static final ColorResourcesLoaderCreatorAccessor INSTANCE = new ColorResourcesLoaderCreatorAccessor();

    private ColorResourcesLoaderCreatorAccessor() {
    }

    public final ResourcesLoader create(@NotNull Context context, @NotNull Map<Integer, Integer> colorMapping) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(colorMapping, "colorMapping");
        return ColorResourcesLoaderCreator.create(context, colorMapping);
    }
}
