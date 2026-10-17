package ro1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f255800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f255801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f255802c;
    public final String d;
    public final a e;
    public final String f;

    public b(dj0.d amount, List inputs, String str, String str2, a aVar, String str3) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(inputs, "inputs");
        this.f255800a = amount;
        this.f255801b = inputs;
        this.f255802c = str;
        this.d = str2;
        this.e = aVar;
        this.f = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f255800a, bVar.f255800a) && Intrinsics.f(this.f255801b, bVar.f255801b) && Intrinsics.f(this.f255802c, bVar.f255802c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f255800a.hashCode() * 31, 31, this.f255801b);
        String str = this.f255802c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        a aVar = this.e;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str3 = this.f;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }
}
