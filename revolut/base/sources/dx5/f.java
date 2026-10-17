package dx5;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120875b;

    public f() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f120874a, fVar.f120874a) && Intrinsics.f(this.f120875b, fVar.f120875b);
    }

    public final int hashCode() {
        String str = this.f120874a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120875b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public f(String str, String str2) {
        this.f120874a = str;
        this.f120875b = str2;
    }
}
