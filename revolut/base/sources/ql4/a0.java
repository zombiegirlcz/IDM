package ql4;

import ip0.v7;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f247086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f247087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f247088c;
    public final ArrayList d;

    public a0(e0 eligibilityStatus, z zVar, dj0.d minDownPayment, ArrayList documents) {
        Intrinsics.checkNotNullParameter(eligibilityStatus, "eligibilityStatus");
        Intrinsics.checkNotNullParameter(minDownPayment, "minDownPayment");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f247086a = eligibilityStatus;
        this.f247087b = zVar;
        this.f247088c = minDownPayment;
        this.d = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return this.f247086a == a0Var.f247086a && Intrinsics.f(this.f247087b, a0Var.f247087b) && this.f247088c.equals(a0Var.f247088c) && this.d.equals(a0Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f247086a.hashCode() * 31;
        z zVar = this.f247087b;
        return this.d.hashCode() + v7.c((iHashCode + (zVar == null ? 0 : zVar.f247199a.hashCode())) * 31, 31, this.f247088c);
    }
}
