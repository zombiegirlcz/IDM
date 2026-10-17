package vml;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290620a;

    public f(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f290620a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f290620a, ((f) obj2).f290620a);
    }

    public final int hashCode() {
        return this.f290620a.hashCode();
    }
}
