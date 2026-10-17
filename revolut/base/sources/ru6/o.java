package ru6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257454a;

    public o(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f257454a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f257454a, ((o) obj2).f257454a);
    }

    public final int hashCode() {
        return this.f257454a.hashCode();
    }
}
