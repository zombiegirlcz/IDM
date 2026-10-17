package uw5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283558a;

    public a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f283558a = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f283558a, ((a) obj2).f283558a);
    }

    public final int hashCode() {
        return this.f283558a.hashCode() * 29791;
    }
}
