package x3g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f302751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f302752b;

    public i(String str, List experiences) {
        Intrinsics.checkNotNullParameter(experiences, "experiences");
        this.f302751a = str;
        this.f302752b = experiences;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f302751a, iVar.f302751a) && Intrinsics.f(this.f302752b, iVar.f302752b);
    }

    public final int hashCode() {
        String str = this.f302751a;
        return this.f302752b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
