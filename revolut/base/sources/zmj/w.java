package zmj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323596a;

    public w(String str) {
        this.f323596a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f323596a, ((w) obj2).f323596a);
    }

    public final int hashCode() {
        String str = this.f323596a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
