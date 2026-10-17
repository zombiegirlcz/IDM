package krf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188860a;

    public d(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f188860a = description;
    }

    @Override // krf.c
    public final String a() {
        return this.f188860a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f188860a, ((d) obj2).f188860a);
    }

    public final int hashCode() {
        return this.f188860a.hashCode();
    }
}
