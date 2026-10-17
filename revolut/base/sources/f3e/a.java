package f3e;

import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPoints f131958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f131959c;

    public a(String str, RevPoints revPoints, boolean z) {
        this.f131957a = str;
        this.f131958b = revPoints;
        this.f131959c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f131957a, aVar.f131957a) && Intrinsics.f(this.f131958b, aVar.f131958b) && this.f131959c == aVar.f131959c;
    }

    public final int hashCode() {
        String str = this.f131957a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        RevPoints revPoints = this.f131958b;
        return Boolean.hashCode(this.f131959c) + ((iHashCode + (revPoints != null ? revPoints.f83960a.hashCode() : 0)) * 31);
    }
}
