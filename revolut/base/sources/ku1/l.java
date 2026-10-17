package ku1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189617a;

    public l(String str) {
        this.f189617a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f189617a, ((l) obj2).f189617a);
    }

    public final int hashCode() {
        String str = this.f189617a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
