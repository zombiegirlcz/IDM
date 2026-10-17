package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class a70 implements ge1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Coordinate f26720a;

    public a70(Coordinate location) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f26720a = location;
    }

    public final Coordinate a() {
        return this.f26720a;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a70) && Intrinsics.f(this.f26720a, ((a70) obj2).f26720a);
    }

    public int hashCode() {
        return this.f26720a.hashCode();
    }

    public String toString() {
        return "Result(location=" + this.f26720a + ")";
    }
}
