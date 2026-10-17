package ocg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f224235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224236b;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data favorites, Data lifestyleBorderlessFooter, int i) {
        if ((i & 1) != 0) {
            favorites = gVar.f224235a;
        }
        if ((i & 2) != 0) {
            lifestyleBorderlessFooter = gVar.f224236b;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        return new g(favorites, lifestyleBorderlessFooter);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f224235a, gVar.f224235a) && Intrinsics.f(this.f224236b, gVar.f224236b);
    }

    public final int hashCode() {
        return this.f224236b.hashCode() + (this.f224235a.hashCode() * 31);
    }

    public g(Data favorites, Data lifestyleBorderlessFooter) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        this.f224235a = favorites;
        this.f224236b = lifestyleBorderlessFooter;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null));
    }
}
