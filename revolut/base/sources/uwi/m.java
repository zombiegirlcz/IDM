package uwi;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f283680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f283681b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283682c;

    public m(String loungeId, String str, boolean z) {
        Intrinsics.checkNotNullParameter(loungeId, "loungeId");
        this.f283680a = loungeId;
        this.f283681b = z;
        this.f283682c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f283680a, mVar.f283680a) && this.f283681b == mVar.f283681b && Intrinsics.f(this.f283682c, mVar.f283682c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f283680a.hashCode() * 31, 31, this.f283681b);
        String str = this.f283682c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
