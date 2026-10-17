package kl7;

import com.revolut.feature.insurance_car.impl.data.model.Payment;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f185305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f185306c;
    public final boolean d;
    public final Payment e;
    public final i1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f185307g;

    public d2(String id10, LocalDate startDate, List optionIds, boolean z, Payment payment, i1 planPreview, ArrayList documents) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(optionIds, "optionIds");
        Intrinsics.checkNotNullParameter(payment, "payment");
        Intrinsics.checkNotNullParameter(planPreview, "planPreview");
        Intrinsics.checkNotNullParameter(documents, "documents");
        this.f185304a = id10;
        this.f185305b = startDate;
        this.f185306c = optionIds;
        this.d = z;
        this.e = payment;
        this.f = planPreview;
        this.f185307g = documents;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.f185304a, d2Var.f185304a) && Intrinsics.f(this.f185305b, d2Var.f185305b) && Intrinsics.f(this.f185306c, d2Var.f185306c) && this.d == d2Var.d && this.e.equals(d2Var.e) && this.f.equals(d2Var.f) && this.f185307g.equals(d2Var.f185307g);
    }

    public final int hashCode() {
        return this.f185307g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + j6.a.c(p.a.d(wp5.y.a(this.f185304a.hashCode() * 31, 31, this.f185305b), 31, this.f185306c), 31, this.d)) * 31)) * 31);
    }
}
