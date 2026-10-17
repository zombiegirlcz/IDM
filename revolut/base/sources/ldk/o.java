package ldk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194173a;

    public o(String str) {
        this.f194173a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f194173a, ((o) obj2).f194173a);
    }

    public final int hashCode() {
        String str = this.f194173a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
