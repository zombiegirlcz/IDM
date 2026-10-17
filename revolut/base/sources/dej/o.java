package dej;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f113608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f113610c;
    public final String d;

    public o(p pVar, String label, String str, String str2) {
        Intrinsics.checkNotNullParameter(label, "label");
        this.f113608a = pVar;
        this.f113609b = label;
        this.f113610c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f113608a == oVar.f113608a && Intrinsics.f(this.f113609b, oVar.f113609b) && Intrinsics.f(this.f113610c, oVar.f113610c) && Intrinsics.f(this.d, oVar.d);
    }

    public final int hashCode() {
        p pVar = this.f113608a;
        int iC = p.a.c((pVar == null ? 0 : pVar.hashCode()) * 31, 31, this.f113609b);
        String str = this.f113610c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
