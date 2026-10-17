package t3l;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f267821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f267822b;

    public c(a dismissType, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(dismissType, "dismissType");
        this.f267821a = dismissType;
        this.f267822b = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f267821a == cVar.f267821a && Intrinsics.f(this.f267822b, cVar.f267822b);
    }

    public final int hashCode() {
        int iHashCode = this.f267821a.hashCode() * 31;
        Parcelable parcelable = this.f267822b;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }
}
