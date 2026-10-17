package zd7;

import ip0.u00;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f321319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f321320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f321321c;
    public final u00 d;
    public final boolean e;

    public a() {
        this(false, null, 31);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f321319a == aVar.f321319a && this.f321320b == aVar.f321320b && Intrinsics.f(this.f321321c, aVar.f321321c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + p.a.d(j6.a.c(Boolean.hashCode(this.f321319a) * 31, 31, this.f321320b), 31, this.f321321c)) * 31);
    }

    public a(boolean z, u00 cameraSide, int i) {
        z = (i & 1) != 0 ? false : z;
        boolean z3 = (i & 2) == 0;
        f0 customButtons = f0.f322471a;
        cameraSide = (i & 8) != 0 ? u00.BACK : cameraSide;
        boolean z4 = (i & 16) == 0;
        Intrinsics.checkNotNullParameter(customButtons, "customButtons");
        Intrinsics.checkNotNullParameter(cameraSide, "cameraSide");
        this.f321319a = z;
        this.f321320b = z3;
        this.f321321c = customButtons;
        this.d = cameraSide;
        this.e = z4;
    }
}
