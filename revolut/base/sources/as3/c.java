package as3;

import dj0.d;
import grl.r2;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8792c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f8793g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r2 f8794h;

    public c(String str, String str2, String str3, String str4, String str5, String str6, d dVar, r2 r2Var) {
        this.f8790a = str;
        this.f8791b = str2;
        this.f8792c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f8793g = dVar;
        this.f8794h = r2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f8790a, cVar.f8790a) && Intrinsics.f(this.f8791b, cVar.f8791b) && Intrinsics.f(this.f8792c, cVar.f8792c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f8793g, cVar.f8793g) && this.f8794h == cVar.f8794h;
    }

    public final int hashCode() {
        String str = this.f8790a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8791b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8792c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        d dVar = this.f8793g;
        int iHashCode7 = (iHashCode6 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        r2 r2Var = this.f8794h;
        return iHashCode7 + (r2Var != null ? r2Var.hashCode() : 0);
    }
}
