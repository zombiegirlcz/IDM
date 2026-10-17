package ms0;

import android.graphics.Bitmap;
import android.graphics.PorterDuffColorFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class t3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f208441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Bitmap f208442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap f208443c;
    public final PorterDuffColorFilter d;
    public final PorterDuffColorFilter e;

    public t3(Bitmap filledIconBitmap, Bitmap halfFilledIconBitmap, Bitmap borderedIconBitmap, PorterDuffColorFilter ratingColorFilter, PorterDuffColorFilter backgroundColorFilter) {
        Intrinsics.checkNotNullParameter(filledIconBitmap, "filledIconBitmap");
        Intrinsics.checkNotNullParameter(halfFilledIconBitmap, "halfFilledIconBitmap");
        Intrinsics.checkNotNullParameter(borderedIconBitmap, "borderedIconBitmap");
        Intrinsics.checkNotNullParameter(ratingColorFilter, "ratingColorFilter");
        Intrinsics.checkNotNullParameter(backgroundColorFilter, "backgroundColorFilter");
        this.f208441a = filledIconBitmap;
        this.f208442b = halfFilledIconBitmap;
        this.f208443c = borderedIconBitmap;
        this.d = ratingColorFilter;
        this.e = backgroundColorFilter;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj2;
        return Intrinsics.f(this.f208441a, t3Var.f208441a) && Intrinsics.f(this.f208442b, t3Var.f208442b) && Intrinsics.f(this.f208443c, t3Var.f208443c) && this.d.equals(t3Var.d) && this.e.equals(t3Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.f208443c.hashCode() + ((this.f208442b.hashCode() + (this.f208441a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
