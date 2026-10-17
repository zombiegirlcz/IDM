package pf4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f235444c;

    public j(String actionId, String parameterKey, long j2) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        Intrinsics.checkNotNullParameter(parameterKey, "parameterKey");
        this.f235442a = actionId;
        this.f235443b = parameterKey;
        this.f235444c = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f235442a, jVar.f235442a) && Intrinsics.f(this.f235443b, jVar.f235443b) && this.f235444c == jVar.f235444c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f235444c) + p.a.c(this.f235442a.hashCode() * 31, 31, this.f235443b);
    }
}
