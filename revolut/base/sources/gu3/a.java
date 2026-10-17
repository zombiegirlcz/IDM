package gu3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f146690c;
    public final String d;
    public final String e;

    public a(String title, String description, String str, String primaryButton, String str2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        this.f146688a = title;
        this.f146689b = description;
        this.f146690c = str;
        this.d = primaryButton;
        this.e = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f146688a, aVar.f146688a) && Intrinsics.f(this.f146689b, aVar.f146689b) && Intrinsics.f(this.f146690c, aVar.f146690c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f146688a.hashCode() * 31, 31, this.f146689b);
        String str = this.f146690c;
        int iC2 = p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
        String str2 = this.e;
        return iC2 + (str2 != null ? str2.hashCode() : 0);
    }
}
