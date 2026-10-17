package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ai0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final oim.n f26804a;

    public ai0(oim.n body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f26804a = body;
    }

    public final oim.n a() {
        return this.f26804a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof ai0) && Intrinsics.f(this.f26804a, ((ai0) obj2).f26804a);
    }

    public int hashCode() {
        return this.f26804a.hashCode();
    }

    public String toString() {
        return "OrcaPage(body=" + this.f26804a + ")";
    }
}
