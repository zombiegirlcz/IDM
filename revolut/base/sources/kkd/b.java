package kkd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184575a;

    public b(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f184575a = deeplink;
    }

    @Override // kkd.c
    public final String a() {
        return this.f184575a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f184575a, ((b) obj2).f184575a);
    }

    public final int hashCode() {
        return this.f184575a.hashCode();
    }
}
