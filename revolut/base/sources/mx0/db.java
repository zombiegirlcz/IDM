package mx0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bb f209658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cb f209659c;
    public final int d;
    public final boolean e;

    public db(List icons, bb imageSize, cb listOrderType, int i, boolean z) {
        Intrinsics.checkNotNullParameter(icons, "icons");
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        Intrinsics.checkNotNullParameter(listOrderType, "listOrderType");
        this.f209657a = icons;
        this.f209658b = imageSize;
        this.f209659c = listOrderType;
        this.d = i;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof db)) {
            return false;
        }
        db dbVar = (db) obj2;
        return Intrinsics.f(this.f209657a, dbVar.f209657a) && this.f209658b == dbVar.f209658b && this.f209659c == dbVar.f209659c && this.d == dbVar.d && this.e == dbVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.b(this.d, (this.f209659c.hashCode() + ((this.f209658b.hashCode() + (this.f209657a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public /* synthetic */ db(List list, bb bbVar, int i, boolean z, int i2) {
        this(list, (i2 & 2) != 0 ? bb.REGULAR : bbVar, cb.BOTTOM_TO_TOP, (i2 & 8) != 0 ? 8 : i, (i2 & 16) != 0 ? false : z);
    }
}
