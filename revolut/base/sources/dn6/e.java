package dn6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f116221a;

    public e(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f116221a = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f116221a, ((e) obj2).f116221a);
    }

    public final int hashCode() {
        return this.f116221a.hashCode();
    }
}
