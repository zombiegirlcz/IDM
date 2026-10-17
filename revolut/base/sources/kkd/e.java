package kkd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f184577a;

    public e(c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f184577a = event;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f184577a, ((e) obj2).f184577a);
    }

    public final int hashCode() {
        return this.f184577a.hashCode();
    }
}
