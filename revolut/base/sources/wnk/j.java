package wnk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298851a;

    public j(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f298851a = code;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f298851a, ((j) obj2).f298851a);
    }

    public final int hashCode() {
        return this.f298851a.hashCode();
    }
}
