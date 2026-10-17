package oga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f225074a;

    public h(dj0.d value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f225074a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f225074a, ((h) obj2).f225074a);
    }

    public final int hashCode() {
        return this.f225074a.hashCode();
    }
}
