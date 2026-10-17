package hs3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154869a;

    public b1(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f154869a = deeplink;
    }

    @Override // hs3.i1
    public final String N7() {
        return "Deeplink";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b1) && Intrinsics.f(this.f154869a, ((b1) obj2).f154869a);
    }

    public final int hashCode() {
        return this.f154869a.hashCode();
    }
}
