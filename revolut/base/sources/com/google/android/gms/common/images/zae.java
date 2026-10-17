package com.google.android.gms.common.images;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.internal.base.zak;
import com.google.android.gms.internal.base.zal;
import com.youTransactor.uCube.rpc.Constants;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
public final class zae extends zag {

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    private final WeakReference f38011zac;

    public zae(ImageView imageView, int i) {
        super(Uri.EMPTY, i);
        Asserts.checkNotNull(imageView);
        this.f38011zac = new WeakReference(imageView);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zae)) {
            return false;
        }
        ImageView imageView = (ImageView) this.f38011zac.get();
        ImageView imageView2 = (ImageView) ((zae) obj2).f38011zac.get();
        return (imageView2 == null || imageView == null || !Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.common.images.zag
    public final void zaa(Drawable drawable, boolean z, boolean z3, boolean z4) {
        ImageView imageView = (ImageView) this.f38011zac.get();
        if (imageView != null) {
            if (!z3 && !z4 && (imageView instanceof zal)) {
                throw null;
            }
            boolean z6 = false;
            if (!z3 && !z) {
                z6 = true;
            }
            if (z6) {
                Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof zak) {
                    drawable2 = ((zak) drawable2).zaa();
                }
                drawable = new zak(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof zal) {
                throw null;
            }
            if (drawable == null || !z6) {
                return;
            }
            ((zak) drawable).zab(Constants.TAG_SUPPORTED_LOCALE_LIST);
        }
    }

    public zae(ImageView imageView, Uri uri2) {
        super(uri2, 0);
        Asserts.checkNotNull(imageView);
        this.f38011zac = new WeakReference(imageView);
    }
}
