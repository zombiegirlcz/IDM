package mib;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205638a;

    public d(String str) {
        this.f205638a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f205638a, ((d) obj2).f205638a);
    }

    public final int hashCode() {
        String str = this.f205638a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
