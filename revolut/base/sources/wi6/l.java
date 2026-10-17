package wi6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f297819a;

    public l(String str) {
        this.f297819a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f297819a, ((l) obj2).f297819a);
    }

    public final int hashCode() {
        String str = this.f297819a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
