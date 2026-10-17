package zw7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f325787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f325788c;
    public final String d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f325789g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g1 f325790h;

    public h0(String id10, g0 type, String displayName, String coverageAmount, ArrayList quotes, ArrayList coverages, ArrayList documents, g1 g1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(coverageAmount, "coverageAmount");
        Intrinsics.checkNotNullParameter(quotes, "quotes");
        Intrinsics.checkNotNullParameter(coverages, "coverages");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f325786a = id10;
        this.f325787b = type;
        this.f325788c = displayName;
        this.d = coverageAmount;
        this.e = quotes;
        this.f = coverages;
        this.f325789g = documents;
        this.f325790h = g1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return Intrinsics.f(this.f325786a, h0Var.f325786a) && this.f325787b == h0Var.f325787b && Intrinsics.f(this.f325788c, h0Var.f325788c) && Intrinsics.f(this.d, h0Var.d) && this.e.equals(h0Var.e) && this.f.equals(h0Var.f) && this.f325789g.equals(h0Var.f325789g) && Intrinsics.f(this.f325790h, h0Var.f325790h);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f325789g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c(p.a.c((this.f325787b.hashCode() + (this.f325786a.hashCode() * 31)) * 31, 31, this.f325788c), 31, this.d), 31), 31), 31);
        g1 g1Var = this.f325790h;
        return iB + (g1Var == null ? 0 : g1Var.hashCode());
    }
}
