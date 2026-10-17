package xz0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309766a;

    public h(String phone) {
        Intrinsics.checkNotNullParameter(phone, "phone");
        this.f309766a = phone;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f309766a, ((h) obj2).f309766a);
    }

    public final int hashCode() {
        return this.f309766a.hashCode();
    }
}
