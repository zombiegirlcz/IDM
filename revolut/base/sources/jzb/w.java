package jzb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179724a;

    public w(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f179724a = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f179724a, ((w) obj2).f179724a);
    }

    public final int hashCode() {
        return this.f179724a.hashCode();
    }
}
