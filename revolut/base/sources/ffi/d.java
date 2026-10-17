package ffi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f134813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f134814b;

    public d(String prompt, long j2) {
        Intrinsics.checkNotNullParameter(prompt, "prompt");
        this.f134813a = prompt;
        this.f134814b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f134813a, dVar.f134813a) && this.f134814b == dVar.f134814b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f134814b) + (this.f134813a.hashCode() * 31);
    }
}
