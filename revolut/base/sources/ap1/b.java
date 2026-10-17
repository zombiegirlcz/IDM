package ap1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8056a;

    public b(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f8056a = code;
    }

    @Override // ap1.d
    public final String a() {
        return this.f8056a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f8056a, ((b) obj2).f8056a);
    }

    public final int hashCode() {
        return this.f8056a.hashCode();
    }
}
