package xu3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f308933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ht3.l0 f308934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ht3.l0 f308935c;
    public final d d;
    public final m0 e;
    public final a0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0 f308936g;

    public n0(m mVar, ht3.l0 l0Var, ht3.l0 l0Var2, d addEvidence, m0 summary, a0 mainApplicantStatusPopup, a0 a0Var) {
        Intrinsics.checkNotNullParameter(addEvidence, "addEvidence");
        Intrinsics.checkNotNullParameter(summary, "summary");
        Intrinsics.checkNotNullParameter(mainApplicantStatusPopup, "mainApplicantStatusPopup");
        this.f308933a = mVar;
        this.f308934b = l0Var;
        this.f308935c = l0Var2;
        this.d = addEvidence;
        this.e = summary;
        this.f = mainApplicantStatusPopup;
        this.f308936g = a0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj2;
        return Intrinsics.f(this.f308933a, n0Var.f308933a) && Intrinsics.f(this.f308934b, n0Var.f308934b) && Intrinsics.f(this.f308935c, n0Var.f308935c) && Intrinsics.f(this.d, n0Var.d) && Intrinsics.f(this.e, n0Var.e) && Intrinsics.f(this.f, n0Var.f) && Intrinsics.f(this.f308936g, n0Var.f308936g);
    }

    public final int hashCode() {
        m mVar = this.f308933a;
        int iHashCode = (mVar == null ? 0 : mVar.hashCode()) * 31;
        ht3.l0 l0Var = this.f308934b;
        int iHashCode2 = (iHashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        ht3.l0 l0Var2 = this.f308935c;
        int iHashCode3 = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((iHashCode2 + (l0Var2 == null ? 0 : l0Var2.hashCode())) * 31)) * 31)) * 31)) * 31;
        a0 a0Var = this.f308936g;
        return iHashCode3 + (a0Var != null ? a0Var.hashCode() : 0);
    }
}
