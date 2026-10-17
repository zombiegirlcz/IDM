package pcd;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f234892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f234893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f234894c;

    public t(String challengeId, long j2, String str) {
        Intrinsics.checkNotNullParameter(challengeId, "challengeId");
        this.f234892a = challengeId;
        this.f234893b = j2;
        this.f234894c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f234892a, tVar.f234892a) && this.f234893b == tVar.f234893b && Intrinsics.f(this.f234894c, tVar.f234894c);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.f234892a.hashCode() * 31, 31, this.f234893b);
        String str = this.f234894c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
