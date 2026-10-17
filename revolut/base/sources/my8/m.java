package my8;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f210389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f210390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f210391c;
    public final p d;
    public final String e;
    public final String f;

    public m(float f, float f4, w pageType, p pVar, String pageName, String str) {
        Intrinsics.checkNotNullParameter(pageType, "pageType");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.f210389a = f;
        this.f210390b = f4;
        this.f210391c = pageType;
        this.d = pVar;
        this.e = pageName;
        this.f = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Float.compare(this.f210389a, mVar.f210389a) == 0 && Float.compare(this.f210390b, mVar.f210390b) == 0 && this.f210391c == mVar.f210391c && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f210391c.hashCode() + m72.b.b(this.f210390b, Float.hashCode(this.f210389a) * 31, 31)) * 31;
        p pVar = this.d;
        int iC = p.a.c((iHashCode + (pVar == null ? 0 : pVar.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
