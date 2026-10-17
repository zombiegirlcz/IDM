package rua;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257507a;

    public b(String fullName) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f257507a = fullName;
    }

    @Override // rua.c
    public final String displayName() {
        return this.f257507a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f257507a, ((b) obj2).f257507a);
    }

    public final int hashCode() {
        return this.f257507a.hashCode();
    }
}
