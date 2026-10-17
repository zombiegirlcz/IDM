package phc;

import do3.t;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f236265c;

    public i(String planId, String userId, t tVar) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.f236263a = planId;
        this.f236264b = userId;
        this.f236265c = tVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f236263a, iVar.f236263a) && Intrinsics.f(this.f236264b, iVar.f236264b) && this.f236265c == iVar.f236265c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f236263a.hashCode() * 31, 31, this.f236264b);
        t tVar = this.f236265c;
        return iC + (tVar == null ? 0 : tVar.hashCode());
    }
}
