package g8a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f141329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f141330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f141331c;
    public final List d;
    public final String e;
    public final String f;

    public q() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f141329a == qVar.f141329a && Intrinsics.f(this.f141330b, qVar.f141330b) && Intrinsics.f(this.f141331c, qVar.f141331c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f);
    }

    public final int hashCode() {
        r rVar = this.f141329a;
        int iHashCode = (rVar == null ? 0 : rVar.hashCode()) * 31;
        l lVar = this.f141330b;
        int iHashCode2 = (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        n nVar = this.f141331c;
        int iD = p.a.d((iHashCode2 + (nVar == null ? 0 : nVar.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int iHashCode3 = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public q(r rVar, l lVar, n nVar, List additionalInformation, String str, String str2) {
        Intrinsics.checkNotNullParameter(additionalInformation, "additionalInformation");
        this.f141329a = rVar;
        this.f141330b = lVar;
        this.f141331c = nVar;
        this.d = additionalInformation;
        this.e = str;
        this.f = str2;
    }

    public q(int i) {
        this(null, null, null, f0.f322471a, null, null);
    }
}
