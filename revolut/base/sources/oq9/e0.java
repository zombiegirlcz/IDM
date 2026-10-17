package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227813b;

    public e0(String firstName, String code) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f227812a = firstName;
        this.f227813b = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f227812a, e0Var.f227812a) && Intrinsics.f(this.f227813b, e0Var.f227813b);
    }

    public final int hashCode() {
        return this.f227813b.hashCode() + (this.f227812a.hashCode() * 31);
    }
}
