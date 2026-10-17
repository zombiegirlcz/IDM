package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154872c;
    public final String d;

    public c(String str, String str2, String str3, String str4) {
        this.f154870a = str;
        this.f154871b = str2;
        this.f154872c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f154870a, cVar.f154870a) && Intrinsics.f(this.f154871b, cVar.f154871b) && Intrinsics.f(this.f154872c, cVar.f154872c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        String str = this.f154870a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f154871b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f154872c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
