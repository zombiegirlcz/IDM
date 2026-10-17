package hj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f152628b;

    public c(String str, String str2) {
        this.f152627a = str;
        this.f152628b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f152627a, cVar.f152627a) && Intrinsics.f(this.f152628b, cVar.f152628b);
    }

    public final int hashCode() {
        String str = this.f152627a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f152628b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
