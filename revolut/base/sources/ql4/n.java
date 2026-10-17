package ql4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f247150a;

    public n(g type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f247150a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f247150a == ((n) obj2).f247150a;
    }

    public final int hashCode() {
        return this.f247150a.hashCode();
    }
}
