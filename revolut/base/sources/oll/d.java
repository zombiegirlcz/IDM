package oll;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226453a;

    public d(String str) {
        this.f226453a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f226453a, ((d) obj2).f226453a);
    }

    public final int hashCode() {
        String str = this.f226453a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
