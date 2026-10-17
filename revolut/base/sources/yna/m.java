package yna;

import kotlin.jvm.internal.Intrinsics;
import yna.a;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends a.AbstractC1757a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f315360a;

    public m(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f315360a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f315360a, ((m) obj2).f315360a);
    }

    public final int hashCode() {
        return this.f315360a.hashCode();
    }
}
