package no6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217926a;

    public g() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f217926a, ((g) obj2).f217926a);
    }

    public final int hashCode() {
        String str = this.f217926a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public g(String str) {
        this.f217926a = str;
    }
}
