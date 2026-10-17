package rr;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f256605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f256606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f256607c;

    public c() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f256605a, cVar.f256605a) && Intrinsics.f(this.f256606b, cVar.f256606b) && Intrinsics.f(this.f256607c, cVar.f256607c);
    }

    public final int hashCode() {
        String str = this.f256605a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Set set = this.f256606b;
        int iHashCode2 = (iHashCode + (set == null ? 0 : set.hashCode())) * 31;
        String str2 = this.f256607c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public c(String str, Set set, String str2) {
        this.f256605a = str;
        this.f256606b = set;
        this.f256607c = str2;
    }
}
