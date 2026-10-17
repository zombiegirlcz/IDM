package zzg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f326748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f326749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f326750c;
    public final String d;

    public r(q key, List instruments, String str, String str2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f326748a = key;
        this.f326749b = instruments;
        this.f326750c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f326748a, rVar.f326748a) && Intrinsics.f(this.f326749b, rVar.f326749b) && Intrinsics.f(this.f326750c, rVar.f326750c) && Intrinsics.f(this.d, rVar.d);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f326748a.hashCode() * 31, 31, this.f326749b);
        String str = this.f326750c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
