package mx0;

import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class lc implements mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f209807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f209808c;

    public lc(Parcelable parcelable, Image image, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f209806a = id10;
        this.f209807b = parcelable;
        this.f209808c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof lc)) {
            return false;
        }
        lc lcVar = (lc) obj2;
        return Intrinsics.f(this.f209806a, lcVar.f209806a) && Intrinsics.f(this.f209807b, lcVar.f209807b) && Intrinsics.f(this.f209808c, lcVar.f209808c);
    }

    public final int hashCode() {
        int iHashCode = this.f209806a.hashCode() * 31;
        Parcelable parcelable = this.f209807b;
        return this.f209808c.hashCode() + ((iHashCode + (parcelable == null ? 0 : parcelable.hashCode())) * 31);
    }
}
