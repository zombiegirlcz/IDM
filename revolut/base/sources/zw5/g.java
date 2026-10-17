package zw5;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f325734b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f325735c;
    public final boolean d;
    public final List e;

    public g(String collectionName, Image image, boolean z, boolean z3, List items) {
        Intrinsics.checkNotNullParameter(collectionName, "collectionName");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f325733a = collectionName;
        this.f325734b = image;
        this.f325735c = z;
        this.d = z3;
        this.e = items;
    }

    @Override // jki.n
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f325733a, gVar.f325733a) && Intrinsics.f(this.f325734b, gVar.f325734b) && this.f325735c == gVar.f325735c && this.d == gVar.d && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f325733a.hashCode() * 31;
        Image image = this.f325734b;
        return this.e.hashCode() + j6.a.c(j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f325735c), 31, this.d);
    }
}
