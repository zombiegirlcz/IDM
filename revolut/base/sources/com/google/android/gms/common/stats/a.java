package com.google.android.gms.common.stats;

import android.graphics.RenderNode;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.fonts.Font;
import android.view.inspector.InspectionCompanion;
import java.io.File;

/* JADX INFO: loaded from: classes16.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ boolean B(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }

    public static /* synthetic */ RenderNode h() {
        return new RenderNode("AndroidEdgeEffectOverscrollEffect");
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable j(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    public static /* synthetic */ Font.Builder m(File file) {
        return new Font.Builder(file);
    }

    public static /* synthetic */ InspectionCompanion.UninitializedPropertyMapException p() {
        return new InspectionCompanion.UninitializedPropertyMapException();
    }
}
