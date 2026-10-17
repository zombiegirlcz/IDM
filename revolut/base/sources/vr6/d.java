package vr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gs6.a f291515c;

    public d() {
        this(null, null, null, 7);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f291513a, dVar.f291513a) && Intrinsics.f(this.f291514b, dVar.f291514b) && this.f291515c == dVar.f291515c;
    }

    public final int hashCode() {
        String str = this.f291513a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f291514b;
        return this.f291515c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public d(String str, String str2, gs6.a urlVerificationMode, int i) {
        str = (i & 1) != 0 ? null : str;
        str2 = (i & 2) != 0 ? null : str2;
        urlVerificationMode = (i & 4) != 0 ? gs6.a.REGULAR : urlVerificationMode;
        Intrinsics.checkNotNullParameter(urlVerificationMode, "urlVerificationMode");
        this.f291513a = str;
        this.f291514b = str2;
        this.f291515c = urlVerificationMode;
    }
}
