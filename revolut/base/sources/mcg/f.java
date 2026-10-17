package mcg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f204351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f204352b;

    public f() {
        this(0);
    }

    public static f a(f fVar, Data favorites, Data lifestyleBorderlessFooter, int i) {
        if ((i & 1) != 0) {
            favorites = fVar.f204351a;
        }
        if ((i & 2) != 0) {
            lifestyleBorderlessFooter = fVar.f204352b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        return new f(favorites, lifestyleBorderlessFooter);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f204351a, fVar.f204351a) && Intrinsics.f(this.f204352b, fVar.f204352b);
    }

    public final int hashCode() {
        return this.f204352b.hashCode() + (this.f204351a.hashCode() * 31);
    }

    public f(Data favorites, Data lifestyleBorderlessFooter) {
        Intrinsics.checkNotNullParameter(favorites, "favorites");
        Intrinsics.checkNotNullParameter(lifestyleBorderlessFooter, "lifestyleBorderlessFooter");
        this.f204351a = favorites;
        this.f204352b = lifestyleBorderlessFooter;
    }

    public /* synthetic */ f(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, false, 7, null));
    }
}
