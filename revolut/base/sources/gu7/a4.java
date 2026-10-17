package gu7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f146713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f146714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f146715c;

    public a4(Object obj2, String text, String uri2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(uri2, "uri");
        this.f146713a = text;
        this.f146714b = uri2;
        this.f146715c = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj2;
        return Intrinsics.f(this.f146713a, a4Var.f146713a) && Intrinsics.f(this.f146714b, a4Var.f146714b) && Intrinsics.f(this.f146715c, a4Var.f146715c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f146713a.hashCode() * 31, 31, this.f146714b);
        Object obj2 = this.f146715c;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }
}
