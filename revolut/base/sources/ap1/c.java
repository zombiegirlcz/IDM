package ap1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8057a;

    public c(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f8057a = code;
    }

    @Override // ap1.d
    public final String a() {
        return this.f8057a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f8057a, ((c) obj2).f8057a);
    }

    public final int hashCode() {
        return this.f8057a.hashCode();
    }
}
