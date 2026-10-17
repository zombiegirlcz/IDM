package mii;

import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f205877b;

    public o(Parcelable parcelable, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f205876a = id10;
        this.f205877b = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f205876a, oVar.f205876a) && Intrinsics.f(this.f205877b, oVar.f205877b);
    }

    public final int hashCode() {
        int iHashCode = this.f205876a.hashCode() * 31;
        Parcelable parcelable = this.f205877b;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }
}
