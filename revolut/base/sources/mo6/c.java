package mo6;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207557a;

    public c(String str) {
        this.f207557a = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f207557a, ((c) obj2).f207557a);
    }

    public final int hashCode() {
        String str = this.f207557a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
