package uyd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f284236b;

    public q(String str, boolean z) {
        this.f284235a = str;
        this.f284236b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f284235a, qVar.f284235a) && this.f284236b == qVar.f284236b;
    }

    public final int hashCode() {
        String str = this.f284235a;
        return Boolean.hashCode(this.f284236b) + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
