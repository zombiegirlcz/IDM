package ge1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f143208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cd1.e f143209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f143210c;

    public f(Data catalogue, cd1.e shoppingCart, boolean z) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(shoppingCart, "shoppingCart");
        this.f143208a = catalogue;
        this.f143209b = shoppingCart;
        this.f143210c = z;
    }

    public static f a(f fVar, Data catalogue, cd1.e shoppingCart, int i) {
        if ((i & 1) != 0) {
            catalogue = fVar.f143208a;
        }
        if ((i & 2) != 0) {
            shoppingCart = fVar.f143209b;
        }
        boolean z = (i & 4) != 0 ? fVar.f143210c : true;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(shoppingCart, "shoppingCart");
        return new f(catalogue, shoppingCart, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f143208a, fVar.f143208a) && Intrinsics.f(this.f143209b, fVar.f143209b) && this.f143210c == fVar.f143210c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f143210c) + ((this.f143209b.hashCode() + (this.f143208a.hashCode() * 31)) * 31);
    }
}
