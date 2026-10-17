package ru6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f257451a;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof g) {
            return Intrinsics.f(this.f257451a, ((g) obj2).f257451a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f257451a.hashCode();
    }

    public final String toString() {
        return p.a.p("CustomFieldValue(value=", this.f257451a, ")");
    }
}
