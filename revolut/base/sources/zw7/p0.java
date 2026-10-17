package zw7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f325830c;
    public final o0 d;
    public final ArrayList e;
    public final l0 f;

    public p0(String quoteRequestId, String quoteOptionId, n0 priceChange, o0 o0Var, ArrayList planDetails, l0 petUpdates) {
        Intrinsics.checkNotNullParameter(quoteRequestId, "quoteRequestId");
        Intrinsics.checkNotNullParameter(quoteOptionId, "quoteOptionId");
        Intrinsics.checkNotNullParameter(priceChange, "priceChange");
        Intrinsics.checkNotNullParameter(planDetails, "planDetails");
        Intrinsics.checkNotNullParameter(petUpdates, "petUpdates");
        this.f325828a = quoteRequestId;
        this.f325829b = quoteOptionId;
        this.f325830c = priceChange;
        this.d = o0Var;
        this.e = planDetails;
        this.f = petUpdates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f325828a, p0Var.f325828a) && Intrinsics.f(this.f325829b, p0Var.f325829b) && this.f325830c.equals(p0Var.f325830c) && Intrinsics.f(this.d, p0Var.d) && this.e.equals(p0Var.e) && this.f.equals(p0Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f325830c.hashCode() + p.a.c(this.f325828a.hashCode() * 31, 31, this.f325829b)) * 31;
        o0 o0Var = this.d;
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode + (o0Var == null ? 0 : o0Var.f325822a.hashCode())) * 31, 31);
    }
}
