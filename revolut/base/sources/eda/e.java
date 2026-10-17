package eda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.d f124961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f124962b;

    public e(io3.d pocket, boolean z) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        this.f124961a = pocket;
        this.f124962b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f124961a, eVar.f124961a) && this.f124962b == eVar.f124962b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f124962b) + (this.f124961a.hashCode() * 31);
    }
}
