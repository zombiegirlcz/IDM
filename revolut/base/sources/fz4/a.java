package fz4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f139084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f139085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f139086c;

    public a(String pattern, String placeHolder, String allowedChars) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(placeHolder, "placeHolder");
        Intrinsics.checkNotNullParameter(allowedChars, "allowedChars");
        this.f139084a = pattern;
        this.f139085b = placeHolder;
        this.f139086c = allowedChars;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f139084a, aVar.f139084a) && Intrinsics.f(this.f139085b, aVar.f139085b) && Intrinsics.f(this.f139086c, aVar.f139086c);
    }

    public final int hashCode() {
        return this.f139086c.hashCode() + p.a.c(this.f139084a.hashCode() * 31, 31, this.f139085b);
    }
}
