package zh9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f322309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u1 f322310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f322311c;
    public final wi0.b d;
    public final ArrayList e;
    public final dj0.d f;

    public n(b1 b1Var, u1 u1Var, LocalDate currentDate, wi0.b countryCode, ArrayList termsDetails, dj0.d minFeeAmount) {
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(termsDetails, "termsDetails");
        Intrinsics.checkNotNullParameter(minFeeAmount, "minFeeAmount");
        this.f322309a = b1Var;
        this.f322310b = u1Var;
        this.f322311c = currentDate;
        this.d = countryCode;
        this.e = termsDetails;
        this.f = minFeeAmount;
    }

    public final boolean a(q1 termDetails) {
        Intrinsics.checkNotNullParameter(termDetails, "termDetails");
        b1 b1Var = this.f322309a;
        if (!(b1Var instanceof z0)) {
            if (b1Var instanceof a1) {
                return true;
            }
            if (b1Var == null) {
                return false;
            }
            throw new NoWhenBranchMatchedException();
        }
        Iterator it8 = this.e.iterator();
        if (!it8.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it8.next();
        if (it8.hasNext()) {
            int i = ((q1) next).f322323a;
            do {
                Object next2 = it8.next();
                int i2 = ((q1) next2).f322323a;
                if (i > i2) {
                    next = next2;
                    i = i2;
                }
            } while (it8.hasNext());
        }
        return Intrinsics.f(next, termDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f322309a, nVar.f322309a) && Intrinsics.f(this.f322310b, nVar.f322310b) && Intrinsics.f(this.f322311c, nVar.f322311c) && this.d.equals(nVar.d) && this.e.equals(nVar.e) && this.f.equals(nVar.f);
    }

    public final int hashCode() {
        b1 b1Var = this.f322309a;
        int iHashCode = (b1Var == null ? 0 : b1Var.hashCode()) * 31;
        u1 u1Var = this.f322310b;
        return this.f.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, p.a.c(wp5.y.a((iHashCode + (u1Var != null ? u1Var.hashCode() : 0)) * 31, 31, this.f322311c), 31, this.d.f297794a), 31);
    }
}
