package bs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18035a;

    public d(String str) {
        this.f18035a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f18035a, ((d) obj2).f18035a);
    }

    public final int hashCode() {
        String str = this.f18035a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
