package efe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f125323b;

    public d(String packageName) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        this.f125322a = packageName;
        this.f125323b = packageName;
    }

    @Override // efe.h
    public final String a() {
        return this.f125323b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f125322a, ((d) obj2).f125322a);
    }

    public final int hashCode() {
        return this.f125322a.hashCode();
    }
}
