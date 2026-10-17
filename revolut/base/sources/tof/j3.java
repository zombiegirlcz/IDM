package tof;

import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j3 extends i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f272844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f272845c;
    public final CategoryImage d;
    public final CategoryColor e;

    public j3(CategoryColor categoryColor, CategoryImage categoryImage, String id10, String walletId, String name) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f272843a = id10;
        this.f272844b = walletId;
        this.f272845c = name;
        this.d = categoryImage;
        this.e = categoryColor;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj2;
        return Intrinsics.f(this.f272843a, j3Var.f272843a) && Intrinsics.f(this.f272844b, j3Var.f272844b) && Intrinsics.f(this.f272845c, j3Var.f272845c) && this.d == j3Var.d && this.e == j3Var.e;
    }

    @Override // tof.i3
    public final String getId() {
        return this.f272843a;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f272843a.hashCode() * 31, 31, this.f272844b), 31, this.f272845c);
        CategoryImage categoryImage = this.d;
        int iHashCode = (iC + (categoryImage == null ? 0 : categoryImage.hashCode())) * 31;
        CategoryColor categoryColor = this.e;
        return iHashCode + (categoryColor != null ? categoryColor.hashCode() : 0);
    }
}
