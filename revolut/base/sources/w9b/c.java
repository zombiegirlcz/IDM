package w9b;

import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f295708a;

    public c(String str) {
        this.f295708a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f295708a, ((c) obj2).f295708a);
    }

    public final int hashCode() {
        String str = this.f295708a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
