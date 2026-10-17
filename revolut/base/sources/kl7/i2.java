package kl7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185342a;

    public i2(String str) {
        this.f185342a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i2) && Intrinsics.f(this.f185342a, ((i2) obj2).f185342a);
    }

    public final int hashCode() {
        String str = this.f185342a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
