package bo;

import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeMark;

/* JADX INFO: loaded from: classes17.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeMark f17255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17256c;
    public final int d;

    public i(String nonce, TimeMark timeMark, String str, int i) {
        Intrinsics.checkNotNullParameter(nonce, "nonce");
        Intrinsics.checkNotNullParameter(timeMark, "timeMark");
        this.f17254a = nonce;
        this.f17255b = timeMark;
        this.f17256c = str;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f17254a, iVar.f17254a) && Intrinsics.f(this.f17255b, iVar.f17255b) && Intrinsics.f(this.f17256c, iVar.f17256c) && this.d == iVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f17255b.hashCode() + (this.f17254a.hashCode() * 31)) * 31;
        String str = this.f17256c;
        return Integer.hashCode(this.d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public /* synthetic */ i(String str, TimeMark timeMark, String str2, int i, int i2) {
        this(str, timeMark, (i & 4) != 0 ? null : str2, 1);
    }
}
