package ru6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257447a;

    public b0(String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f257447a = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f257447a, ((b0) obj2).f257447a);
    }

    public final int hashCode() {
        return this.f257447a.hashCode();
    }
}
