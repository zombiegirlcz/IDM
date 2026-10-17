package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class v implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f113202b;

    public v(String value, x popup) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.f113201a = value;
        this.f113202b = popup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f113201a, vVar.f113201a) && Intrinsics.f(this.f113202b, vVar.f113202b);
    }

    public final int hashCode() {
        return this.f113202b.hashCode() + (this.f113201a.hashCode() * 31);
    }
}
