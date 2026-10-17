package bg2;

import aw0.j8;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f15064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f15065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f15066c;
    public final Image d;
    public final boolean e;

    public l(List items, j8 navBarModel, f fVar, Image upiLogo, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(upiLogo, "upiLogo");
        this.f15064a = items;
        this.f15065b = navBarModel;
        this.f15066c = fVar;
        this.d = upiLogo;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f15064a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f15064a, lVar.f15064a) && Intrinsics.f(this.f15065b, lVar.f15065b) && Intrinsics.f(this.f15066c, lVar.f15066c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f15065b.hashCode() + (this.f15064a.hashCode() * 31)) * 31;
        f fVar = this.f15066c;
        return Boolean.hashCode(this.e) + a10.b.c(this.d, (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31, 31);
    }
}
