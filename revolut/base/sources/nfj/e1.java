package nfj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214938a;

    public e1(String str) {
        this.f214938a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e1) && Intrinsics.f(this.f214938a, ((e1) obj2).f214938a);
    }

    public final int hashCode() {
        String str = this.f214938a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
