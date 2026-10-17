package lmb;

import kotlin.jvm.internal.Intrinsics;
import nii.g0;
import nii.m0;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pcd.s f196924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m0 f196925b;

    public h(pcd.s account, g0 g0Var) {
        Intrinsics.checkNotNullParameter(account, "account");
        this.f196924a = account;
        this.f196925b = g0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f196924a, hVar.f196924a) && Intrinsics.f(this.f196925b, hVar.f196925b);
    }

    public final int hashCode() {
        int iHashCode = this.f196924a.hashCode() * 31;
        m0 m0Var = this.f196925b;
        return iHashCode + (m0Var == null ? 0 : m0Var.hashCode());
    }
}
