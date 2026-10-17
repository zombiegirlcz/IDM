package hea;

import kotlin.jvm.internal.Intrinsics;
import l71.a;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xjg.l f151623a;

    public b(xjg.l displayedAppStyle) {
        a.h0 userCompanyRef = a.h0.f192478a;
        Intrinsics.checkNotNullParameter(userCompanyRef, "userCompanyRef");
        Intrinsics.checkNotNullParameter(displayedAppStyle, "displayedAppStyle");
        this.f151623a = displayedAppStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        Object obj3 = a.h0.f192478a;
        return obj3.equals(obj3) && Intrinsics.f(this.f151623a, bVar.f151623a);
    }

    public final int hashCode() {
        return this.f151623a.hashCode() + (a.h0.f192478a.hashCode() * 31);
    }
}
