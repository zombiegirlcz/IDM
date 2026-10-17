package nel;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f214630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f214631c;
    public final boolean d;

    public v(String name, boolean z, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f214629a = name;
        this.f214630b = z;
        this.f214631c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f214629a, vVar.f214629a) && this.f214630b == vVar.f214630b && this.f214631c == vVar.f214631c && this.d == vVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f214629a.hashCode() * 31, 31, this.f214630b), 31, this.f214631c);
    }
}
