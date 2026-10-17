package xkf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f306799a;

    public y(String gifUrl) {
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        this.f306799a = gifUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof y) && Intrinsics.f(this.f306799a, ((y) obj2).f306799a);
    }

    public final int hashCode() {
        return this.f306799a.hashCode();
    }
}
