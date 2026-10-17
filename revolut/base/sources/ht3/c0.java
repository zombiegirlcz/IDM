package ht3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155259a;

    public c0(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f155259a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f155259a, ((c0) obj2).f155259a);
    }

    public final int hashCode() {
        return this.f155259a.hashCode();
    }
}
