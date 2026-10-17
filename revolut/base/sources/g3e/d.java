package g3e;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f140266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f140268c;

    public d(int i, int i2, Set filterIds) {
        Intrinsics.checkNotNullParameter(filterIds, "filterIds");
        this.f140266a = i;
        this.f140267b = i2;
        this.f140268c = filterIds;
    }

    @Override // lk0.f
    /* JADX INFO: renamed from: a */
    public final int getF71990a() {
        return this.f140266a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f140266a == dVar.f140266a && this.f140267b == dVar.f140267b && Intrinsics.f(this.f140268c, dVar.f140268c);
    }

    public final int hashCode() {
        return this.f140268c.hashCode() + j6.a.b(this.f140267b, Integer.hashCode(this.f140266a) * 31, 31);
    }
}
