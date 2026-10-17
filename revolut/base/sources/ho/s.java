package ho;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes17.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f154193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f154194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f154195c;

    public s(int i, Map packagesOwners, boolean z) {
        Intrinsics.checkNotNullParameter(packagesOwners, "packagesOwners");
        this.f154193a = i;
        this.f154194b = z;
        this.f154195c = packagesOwners;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f154193a == sVar.f154193a && this.f154194b == sVar.f154194b && Intrinsics.f(this.f154195c, sVar.f154195c);
    }

    public final int hashCode() {
        return this.f154195c.hashCode() + j6.a.c(Integer.hashCode(this.f154193a) * 31, 31, this.f154194b);
    }

    public /* synthetic */ s(int i, int i2, Map map) {
        this(i, (i2 & 4) != 0 ? r0.g() : map, (i2 & 2) == 0);
    }
}
