package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class zaf extends zag {

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final WeakReference f38012zac;

    public zaf(ImageManager.OnImageLoadedListener onImageLoadedListener, Uri uri2) {
        super(uri2, 0);
        Asserts.checkNotNull(onImageLoadedListener);
        this.f38012zac = new WeakReference(onImageLoadedListener);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zaf)) {
            return false;
        }
        zaf zafVar = (zaf) obj2;
        ImageManager.OnImageLoadedListener onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f38012zac.get();
        ImageManager.OnImageLoadedListener onImageLoadedListener2 = (ImageManager.OnImageLoadedListener) zafVar.f38012zac.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && Objects.equal(onImageLoadedListener2, onImageLoadedListener) && Objects.equal(zafVar.zaa, this.zaa);
    }

    public final int hashCode() {
        return Objects.hashCode(this.zaa);
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z, boolean z3, boolean z4) {
        ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (z3 || (onImageLoadedListener = (ImageManager.OnImageLoadedListener) this.f38012zac.get()) == null) {
            return;
        }
        onImageLoadedListener.onImageLoaded(this.zaa.zaa, drawable, z4);
    }
}
