package dq5;

import aii.r;
import bq5.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f116916a;

    public d(j0 recipientType) {
        Intrinsics.checkNotNullParameter(recipientType, "recipientType");
        this.f116916a = recipientType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f116916a == ((d) obj2).f116916a;
    }

    public final int hashCode() {
        return this.f116916a.hashCode();
    }
}
