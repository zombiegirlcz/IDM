package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class z {

    @NotNull
    public static final y Companion = new y();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f259222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259224c;

    public /* synthetic */ z(int i, int i2, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(x.f259218a.getDescriptor(), i, 3);
            throw null;
        }
        this.f259222a = i2;
        this.f259223b = str;
        if ((i & 4) == 0) {
            this.f259224c = null;
        } else {
            this.f259224c = str2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f259222a == zVar.f259222a && Intrinsics.f(this.f259223b, zVar.f259223b) && Intrinsics.f(this.f259224c, zVar.f259224c);
    }

    public final int hashCode() {
        int iC = p.a.c(Integer.hashCode(this.f259222a) * 31, 31, this.f259223b);
        String str = this.f259224c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public z(int i, String title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f259222a = i;
        this.f259223b = title;
        this.f259224c = str;
    }
}
