package wi6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297818a;

    public k(String str) {
        this.f297818a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f297818a, ((k) obj2).f297818a);
    }

    public final int hashCode() {
        String str = this.f297818a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
