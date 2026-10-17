package uj6;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f280500c;
    public final String d;
    public final we6.k e;
    public final yte.n f;

    public l(String institutionId, String institutionName, dj0.d amount, String str, we6.k context, yte.n contextType) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        this.f280498a = institutionId;
        this.f280499b = institutionName;
        this.f280500c = amount;
        this.d = str;
        this.e = context;
        this.f = contextType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f280498a, lVar.f280498a) && Intrinsics.f(this.f280499b, lVar.f280499b) && Intrinsics.f(this.f280500c, lVar.f280500c) && Intrinsics.f(this.d, lVar.d) && this.e == lVar.e && this.f == lVar.f;
    }

    public final int hashCode() {
        int iC = v7.c(p.a.c(this.f280498a.hashCode() * 31, 31, this.f280499b), 31, this.f280500c);
        String str = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31);
    }
}
