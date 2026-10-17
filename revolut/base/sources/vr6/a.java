package vr6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f291505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f291506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f291507c;

    public a() {
        this(null, null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f291505a, aVar.f291505a) && Intrinsics.f(this.f291506b, aVar.f291506b) && Intrinsics.f(this.f291507c, aVar.f291507c);
    }

    public final int hashCode() {
        String str = this.f291505a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f291506b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f291507c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public a(String str, String str2, String str3) {
        this.f291505a = str;
        this.f291506b = str2;
        this.f291507c = str3;
    }
}
