package fgl;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends LayerDrawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f135091a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Drawable[] layers, int i) {
        super(layers);
        Intrinsics.checkNotNullParameter(layers, "layers");
        this.f135091a = i;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f135091a;
    }

    @Override // android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f135091a;
    }
}
