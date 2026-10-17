package dx4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d3 implements j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f120574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f120575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f120576c;
    public final String d;

    public d3(String str, String regex, String str2, String str3) {
        Intrinsics.checkNotNullParameter(regex, "regex");
        this.f120574a = str;
        this.f120575b = regex;
        this.f120576c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d3)) {
            return false;
        }
        d3 d3Var = (d3) obj2;
        return Intrinsics.f(this.f120574a, d3Var.f120574a) && Intrinsics.f(this.f120575b, d3Var.f120575b) && Intrinsics.f(this.f120576c, d3Var.f120576c) && Intrinsics.f(this.d, d3Var.d);
    }

    public final int hashCode() {
        String str = this.f120574a;
        int iC = p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f120575b);
        String str2 = this.f120576c;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode + (str3 != null ? str3.hashCode() : 0);
    }
}
