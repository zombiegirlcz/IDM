package gll;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f144728a;

    public d() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f144728a, ((d) obj2).f144728a);
    }

    public final int hashCode() {
        String str = this.f144728a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public d(String str) {
        this.f144728a = str;
    }
}
