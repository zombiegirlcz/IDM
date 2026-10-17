package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306712a;

    public h(String fullName) {
        Intrinsics.checkNotNullParameter(fullName, "fullName");
        this.f306712a = fullName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f306712a, ((h) obj2).f306712a);
    }

    public final int hashCode() {
        return this.f306712a.hashCode();
    }
}
