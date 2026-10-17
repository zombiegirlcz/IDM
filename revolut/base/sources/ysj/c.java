package ysj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f316468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f316469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f316470c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f316471g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f316472h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f316473j;

    public /* synthetic */ c(int i, n nVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, t tVar) {
        if (255 != (i & 255)) {
            j1.f(a.f316467a.getDescriptor(), i, 255);
            throw null;
        }
        this.f316468a = nVar;
        this.f316469b = str;
        this.f316470c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f316471g = str6;
        this.f316472h = str7;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.f316473j = null;
        } else {
            this.f316473j = tVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f316468a, cVar.f316468a) && Intrinsics.f(this.f316469b, cVar.f316469b) && Intrinsics.f(this.f316470c, cVar.f316470c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f316471g, cVar.f316471g) && Intrinsics.f(this.f316472h, cVar.f316472h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f316473j, cVar.f316473j);
    }

    public final int hashCode() {
        int iHashCode = this.f316468a.hashCode() * 31;
        String str = this.f316469b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f316470c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f316471g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f316472h;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        t tVar = this.f316473j;
        return iHashCode9 + (tVar != null ? tVar.hashCode() : 0);
    }

    public c(n amount, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, t tVar) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f316468a = amount;
        this.f316469b = str;
        this.f316470c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.f316471g = str6;
        this.f316472h = str7;
        this.i = str8;
        this.f316473j = tVar;
    }
}
