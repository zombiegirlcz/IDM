package ou3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f229796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f229797c;

    public j(String title, a1 icon, f fVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f229795a = title;
        this.f229796b = icon;
        this.f229797c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f229795a, jVar.f229795a) && this.f229796b == jVar.f229796b && Intrinsics.f(this.f229797c, jVar.f229797c);
    }

    public final int hashCode() {
        int iHashCode = (this.f229796b.hashCode() + (this.f229795a.hashCode() * 31)) * 31;
        f fVar = this.f229797c;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }
}
