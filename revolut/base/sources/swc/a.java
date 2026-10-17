package swc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f266179a;

    public a(String str) {
        this.f266179a = str;
    }

    public final String a() {
        return this.f266179a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f266179a, ((a) obj2).f266179a);
    }

    public final int hashCode() {
        String str = this.f266179a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
