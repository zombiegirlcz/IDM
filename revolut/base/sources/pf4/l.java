package pf4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235448a;

    public l(String str) {
        this.f235448a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f235448a, ((l) obj2).f235448a);
    }

    public final int hashCode() {
        String str = this.f235448a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
