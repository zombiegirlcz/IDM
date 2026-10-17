package jtd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f178472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f178473b;

    public a(int i, String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f178472a = i;
        this.f178473b = key;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f178472a == aVar.f178472a && Intrinsics.f(this.f178473b, aVar.f178473b);
    }

    public final int hashCode() {
        return this.f178473b.hashCode() + (Integer.hashCode(this.f178472a) * 31);
    }
}
