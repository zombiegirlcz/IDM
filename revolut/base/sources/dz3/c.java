package dz3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f121230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f121231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f121232c;
    public final String d;
    public final String e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f121233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xi0.b f121234h;

    public c(String title, String str, String str2, String str3, String str4, b primaryButton, b bVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f121230a = title;
        this.f121231b = str;
        this.f121232c = str2;
        this.d = str3;
        this.e = str4;
        this.f = primaryButton;
        this.f121233g = bVar;
        this.f121234h = currency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f121230a, cVar.f121230a) && Intrinsics.f(this.f121231b, cVar.f121231b) && Intrinsics.f(this.f121232c, cVar.f121232c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f121233g, cVar.f121233g) && Intrinsics.f(this.f121234h, cVar.f121234h);
    }

    public final int hashCode() {
        int iHashCode = this.f121230a.hashCode() * 31;
        String str = this.f121231b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f121232c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31;
        b bVar = this.f121233g;
        return this.f121234h.hashCode() + ((iHashCode5 + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}
