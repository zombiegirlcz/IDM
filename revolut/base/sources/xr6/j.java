package xr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f308263a;

    public j(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f308263a = email;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f308263a, ((j) obj2).f308263a);
    }

    public final int hashCode() {
        return this.f308263a.hashCode();
    }
}
