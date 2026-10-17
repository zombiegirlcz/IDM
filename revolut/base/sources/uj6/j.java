package uj6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280494c;

    public j(String institutionId, String institutionName, String str) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f280492a = institutionId;
        this.f280493b = institutionName;
        this.f280494c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f280492a, jVar.f280492a) && Intrinsics.f(this.f280493b, jVar.f280493b) && Intrinsics.f(this.f280494c, jVar.f280494c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f280492a.hashCode() * 31, 31, this.f280493b);
        String str = this.f280494c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
