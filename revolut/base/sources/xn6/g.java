package xn6;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Parcelable f307322a;

    public g(Parcelable item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f307322a = item;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f307322a, ((g) obj2).f307322a);
    }

    public final int hashCode() {
        return this.f307322a.hashCode();
    }
}
