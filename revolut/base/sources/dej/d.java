package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113515a;

    public d(String backendValue) {
        Intrinsics.checkNotNullParameter(backendValue, "backendValue");
        this.f113515a = backendValue;
    }

    @Override // dej.c
    public final String a() {
        return this.f113515a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f113515a, ((d) obj2).f113515a);
    }

    public final int hashCode() {
        return this.f113515a.hashCode();
    }
}
