package d58;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f111397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111398b;

    public d(String code, String userName) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f111397a = code;
        this.f111398b = userName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f111397a, dVar.f111397a) && Intrinsics.f(this.f111398b, dVar.f111398b);
    }

    public final int hashCode() {
        return this.f111398b.hashCode() + (this.f111397a.hashCode() * 31);
    }
}
