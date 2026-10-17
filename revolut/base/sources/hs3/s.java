package hs3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class s implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154941c;
    public final String d;

    public s(String title, String infoButtonText, String str, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(infoButtonText, "infoButtonText");
        this.f154939a = title;
        this.f154940b = infoButtonText;
        this.f154941c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f154939a, sVar.f154939a) && Intrinsics.f(this.f154940b, sVar.f154940b) && Intrinsics.f(this.f154941c, sVar.f154941c) && Intrinsics.f(this.d, sVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f154939a.hashCode() * 31, 31, this.f154940b);
        String str = this.f154941c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
