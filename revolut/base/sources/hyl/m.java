package hyl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f156917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f156918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f156919c;
    public final String d;
    public final List e;

    public m(l quality, List activeCountries, List markers, String str, List edgeFade) {
        Intrinsics.checkNotNullParameter(quality, "quality");
        Intrinsics.checkNotNullParameter(activeCountries, "activeCountries");
        Intrinsics.checkNotNullParameter(markers, "markers");
        Intrinsics.checkNotNullParameter(edgeFade, "edgeFade");
        this.f156917a = quality;
        this.f156918b = activeCountries;
        this.f156919c = markers;
        this.d = str;
        this.e = edgeFade;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f156917a == mVar.f156917a && Intrinsics.f(this.f156918b, mVar.f156918b) && Intrinsics.f(this.f156919c, mVar.f156919c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.d(this.f156917a.hashCode() * 31, 31, this.f156918b), 31, this.f156919c);
        String str = this.d;
        return this.e.hashCode() + j6.a.c(j6.a.c(j6.a.c((iD + (str == null ? 0 : str.hashCode())) * 31, 31, true), 961, false), 31, false);
    }
}
