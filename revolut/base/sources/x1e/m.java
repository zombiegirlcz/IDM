package x1e;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f302386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f302387c;

    public /* synthetic */ m(int i, String str, int i2, String str2) {
        if (6 != (i & 6)) {
            j1.f(k.f302384a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f302385a = null;
        } else {
            this.f302385a = str;
        }
        this.f302386b = i2;
        this.f302387c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f302385a, mVar.f302385a) && this.f302386b == mVar.f302386b && Intrinsics.f(this.f302387c, mVar.f302387c);
    }

    public final int hashCode() {
        String str = this.f302385a;
        return this.f302387c.hashCode() + j6.a.b(this.f302386b, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public m(String str, int i, String points) {
        Intrinsics.checkNotNullParameter(points, "points");
        this.f302385a = str;
        this.f302386b = i;
        this.f302387c = points;
    }
}
