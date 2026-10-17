package sne;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f264563a;

    public d(String str) {
        this.f264563a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f264563a, ((d) obj2).f264563a);
    }

    public final int hashCode() {
        String str = this.f264563a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
