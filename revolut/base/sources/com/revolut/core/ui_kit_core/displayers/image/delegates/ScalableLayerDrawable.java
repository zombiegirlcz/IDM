package com.revolut.core.ui_kit_core.displayers.image.delegates;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/delegates/ScalableLayerDrawable;", "Landroid/graphics/drawable/LayerDrawable;", "ui_kit_core_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class ScalableLayerDrawable extends LayerDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f59817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f59818b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScalableLayerDrawable(Drawable[] layers, Integer num, Integer num2) {
        super(layers);
        Intrinsics.checkNotNullParameter(layers, "layers");
        this.f59817a = num;
        this.f59818b = num2;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Integer num = this.f59818b;
        return num != null ? num.intValue() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Integer num = this.f59817a;
        return num != null ? num.intValue() : super.getIntrinsicWidth();
    }
}
