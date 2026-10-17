package mw0;

import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f209278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f209279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Parcelable f209280c;

    public a(ArrayList sections, c cVar, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f209278a = sections;
        this.f209279b = cVar;
        this.f209280c = parcelable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f209278a.equals(aVar.f209278a) && Intrinsics.f(this.f209279b, aVar.f209279b) && Intrinsics.f(this.f209280c, aVar.f209280c);
    }

    public final int hashCode() {
        int iHashCode = this.f209278a.hashCode() * 31;
        c cVar = this.f209279b;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Parcelable parcelable = this.f209280c;
        return iHashCode2 + (parcelable != null ? parcelable.hashCode() : 0);
    }
}
