package oq9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f227852a;

    public s(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f227852a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f227852a, ((s) obj2).f227852a);
    }

    public final int hashCode() {
        return this.f227852a.hashCode();
    }
}
