package ou3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f229815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f229816c;
    public final f d;
    public final r e;

    public s(String title, String description, String image, f fVar, r rVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f229814a = title;
        this.f229815b = description;
        this.f229816c = image;
        this.d = fVar;
        this.e = rVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f229814a, sVar.f229814a) && Intrinsics.f(this.f229815b, sVar.f229815b) && Intrinsics.f(this.f229816c, sVar.f229816c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f229814a.hashCode() * 31, 31, this.f229815b), 31, this.f229816c);
        f fVar = this.d;
        int iHashCode = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
        r rVar = this.e;
        return iHashCode + (rVar != null ? rVar.hashCode() : 0);
    }
}
