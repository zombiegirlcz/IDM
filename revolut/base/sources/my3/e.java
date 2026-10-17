package my3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f210309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f210310c;
    public final a1 d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f210311g;

    public e(String id10, String title, String str, a1 a1Var, String value, String str2, p pVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f210308a = id10;
        this.f210309b = title;
        this.f210310c = str;
        this.d = a1Var;
        this.e = value;
        this.f = str2;
        this.f210311g = pVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f210308a, eVar.f210308a) && Intrinsics.f(this.f210309b, eVar.f210309b) && Intrinsics.f(this.f210310c, eVar.f210310c) && this.d == eVar.d && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f210311g, eVar.f210311g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f210308a.hashCode() * 31, 31, this.f210309b);
        String str = this.f210310c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        a1 a1Var = this.d;
        int iC2 = p.a.c((iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode2 = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        p pVar = this.f210311g;
        return iHashCode2 + (pVar != null ? pVar.hashCode() : 0);
    }
}
