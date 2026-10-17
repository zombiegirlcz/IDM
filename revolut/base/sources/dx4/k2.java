package dx4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k2 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120650c;
    public final d1 d;
    public final l e;
    public final boolean f;

    public k2(String id10, String title, String description, d1 image, l lVar, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f120648a = id10;
        this.f120649b = title;
        this.f120650c = description;
        this.d = image;
        this.e = lVar;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj2;
        return Intrinsics.f(this.f120648a, k2Var.f120648a) && Intrinsics.f(this.f120649b, k2Var.f120649b) && Intrinsics.f(this.f120650c, k2Var.f120650c) && Intrinsics.f(this.d, k2Var.d) && Intrinsics.f(this.e, k2Var.e) && this.f == k2Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f120648a.hashCode() * 31, 31, this.f120649b), 31, this.f120650c)) * 31;
        l lVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31);
    }
}
