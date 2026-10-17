package no6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217922a;

    public b() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f217922a, ((b) obj2).f217922a);
    }

    public final int hashCode() {
        String str = this.f217922a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public b(String str) {
        this.f217922a = str;
    }
}
