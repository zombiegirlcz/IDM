package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class mb implements rb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final fd f31145a;

    public mb(fd country) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.f31145a = country;
    }

    public final fd a() {
        return this.f31145a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof mb) && Intrinsics.f(this.f31145a, ((mb) obj2).f31145a);
    }

    public int hashCode() {
        return this.f31145a.hashCode();
    }

    public String toString() {
        return "OnSelected(country=" + this.f31145a + ")";
    }
}
