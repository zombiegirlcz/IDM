package zw7;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.LocalDate;

/* JADX INFO: loaded from: classes4.dex */
public final class r0 extends s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f325839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f325840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0 f325841c;
    public final String d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f325842g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f325843h;
    public final w i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s f325844j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t0 f325845l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l1 f325846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f325847n;
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k1 f325848p;

    public r0(String id10, String number, g0 planName, String planDisplayName, LocalDate startDate, LocalDate endDate, String coverageAmount, String paymentAmount, w paymentFrequency, s insurer, ArrayList documents, t0 status, l1 cancellationReason, ArrayList coverages, ArrayList restrictions, k1 k1Var) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(planName, "planName");
        Intrinsics.checkNotNullParameter(planDisplayName, "planDisplayName");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(coverageAmount, "coverageAmount");
        Intrinsics.checkNotNullParameter(paymentAmount, "paymentAmount");
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(insurer, "insurer");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(cancellationReason, "cancellationReason");
        Intrinsics.checkNotNullParameter(coverages, "coverages");
        Intrinsics.checkNotNullParameter(restrictions, "restrictions");
        this.f325839a = id10;
        this.f325840b = number;
        this.f325841c = planName;
        this.d = planDisplayName;
        this.e = startDate;
        this.f = endDate;
        this.f325842g = coverageAmount;
        this.f325843h = paymentAmount;
        this.i = paymentFrequency;
        this.f325844j = insurer;
        this.k = documents;
        this.f325845l = status;
        this.f325846m = cancellationReason;
        this.f325847n = coverages;
        this.o = restrictions;
        this.f325848p = k1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj2;
        return Intrinsics.f(this.f325839a, r0Var.f325839a) && Intrinsics.f(this.f325840b, r0Var.f325840b) && this.f325841c == r0Var.f325841c && Intrinsics.f(this.d, r0Var.d) && Intrinsics.f(this.e, r0Var.e) && Intrinsics.f(this.f, r0Var.f) && Intrinsics.f(this.f325842g, r0Var.f325842g) && Intrinsics.f(this.f325843h, r0Var.f325843h) && this.i == r0Var.i && this.f325844j.equals(r0Var.f325844j) && this.k.equals(r0Var.k) && this.f325845l == r0Var.f325845l && this.f325846m == r0Var.f325846m && this.f325847n.equals(r0Var.f325847n) && this.o.equals(r0Var.o) && Intrinsics.f(this.f325848p, r0Var.f325848p);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.o, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f325847n, (this.f325846m.hashCode() + ((this.f325845l.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, (this.f325844j.hashCode() + ((this.i.hashCode() + p.a.c(p.a.c(com.revolut.data.database.models.openbanking.d.g(this.f, com.revolut.data.database.models.openbanking.d.g(this.e, p.a.c((this.f325841c.hashCode() + p.a.c(this.f325839a.hashCode() * 31, 31, this.f325840b)) * 31, 31, this.d), 31), 31), 31, this.f325842g), 31, this.f325843h)) * 31)) * 31, 31)) * 31)) * 31, 31), 31);
        k1 k1Var = this.f325848p;
        return iB + (k1Var == null ? 0 : k1Var.hashCode());
    }
}
