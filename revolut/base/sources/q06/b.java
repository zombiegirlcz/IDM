package q06;

import android.os.Parcelable;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MainScreenTab f241167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Parcelable f241168b;

    public b(MainScreenTab tab2, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(tab2, "tab");
        this.f241167a = tab2;
        this.f241168b = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f241167a, bVar.f241167a) && Intrinsics.f(this.f241168b, bVar.f241168b);
    }

    public final int hashCode() {
        int iHashCode = this.f241167a.f83420a.hashCode() * 31;
        Parcelable parcelable = this.f241168b;
        return iHashCode + (parcelable == null ? 0 : parcelable.hashCode());
    }
}
