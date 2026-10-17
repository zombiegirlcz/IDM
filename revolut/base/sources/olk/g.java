package olk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226442a;

    public g(String str) {
        this.f226442a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f226442a, ((g) obj2).f226442a);
    }

    public final int hashCode() {
        String str = this.f226442a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
