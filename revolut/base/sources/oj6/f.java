package oj6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f225742c;

    public f(String institutionId, String institutionName, String str) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f225740a = institutionId;
        this.f225741b = institutionName;
        this.f225742c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f225740a, fVar.f225740a) && Intrinsics.f(this.f225741b, fVar.f225741b) && Intrinsics.f(this.f225742c, fVar.f225742c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f225740a.hashCode() * 31, 31, this.f225741b);
        String str = this.f225742c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
