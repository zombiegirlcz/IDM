package kkd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f184574a;

    public a(String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f184574a = deeplink;
    }

    @Override // kkd.c
    public final String a() {
        return this.f184574a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f184574a, ((a) obj2).f184574a);
    }

    public final int hashCode() {
        return this.f184574a.hashCode();
    }
}
