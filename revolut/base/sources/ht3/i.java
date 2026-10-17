package ht3;

import dx4.a1;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a1 f155280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f155281c;

    public i(a1 a1Var, String text, String str) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f155279a = text;
        this.f155280b = a1Var;
        this.f155281c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f155279a, iVar.f155279a) && this.f155280b == iVar.f155280b && Intrinsics.f(this.f155281c, iVar.f155281c);
    }

    public final int hashCode() {
        int iHashCode = this.f155279a.hashCode() * 31;
        a1 a1Var = this.f155280b;
        int iHashCode2 = (iHashCode + (a1Var == null ? 0 : a1Var.hashCode())) * 31;
        String str = this.f155281c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
