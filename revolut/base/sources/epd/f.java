package epd;

import com.revolut.domain.models.transactions.CategoryColor;
import com.revolut.domain.models.transactions.CategoryImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CategoryColor f128165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CategoryImage f128166c;

    public f(String str, CategoryColor color, CategoryImage icon) {
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f128164a = str;
        this.f128165b = color;
        this.f128166c = icon;
    }

    public static f a(f fVar, String str, CategoryColor color, CategoryImage icon, int i) {
        if ((i & 1) != 0) {
            str = fVar.f128164a;
        }
        if ((i & 2) != 0) {
            color = fVar.f128165b;
        }
        if ((i & 4) != 0) {
            icon = fVar.f128166c;
        }
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new f(str, color, icon);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f128164a, fVar.f128164a) && this.f128165b == fVar.f128165b && this.f128166c == fVar.f128166c;
    }

    public final int hashCode() {
        String str = this.f128164a;
        return this.f128166c.hashCode() + ((this.f128165b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }
}
