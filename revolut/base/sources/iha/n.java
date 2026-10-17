package iha;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f161340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f161341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f161342c;
    public final k d;

    public n(s sVar, String title, q description, k kVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f161340a = sVar;
        this.f161341b = title;
        this.f161342c = description;
        this.d = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f161340a, nVar.f161340a) && Intrinsics.f(this.f161341b, nVar.f161341b) && Intrinsics.f(this.f161342c, nVar.f161342c) && Intrinsics.f(this.d, nVar.d);
    }

    public final int hashCode() {
        s sVar = this.f161340a;
        int iHashCode = (this.f161342c.hashCode() + p.a.c((sVar == null ? 0 : sVar.f161352a.hashCode()) * 31, 31, this.f161341b)) * 31;
        k kVar = this.d;
        return iHashCode + (kVar != null ? kVar.hashCode() : 0);
    }
}
