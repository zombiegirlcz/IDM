package g42;

import cli.j;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f140320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f140321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f140322c;
    public final Clause d;

    public a(Data termsData, int i, Clause clause, Clause clause2) {
        Intrinsics.checkNotNullParameter(termsData, "termsData");
        this.f140320a = termsData;
        this.f140321b = i;
        this.f140322c = clause;
        this.d = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f140320a, aVar.f140320a) && this.f140321b == aVar.f140321b && Intrinsics.f(this.f140322c, aVar.f140322c) && Intrinsics.f(this.d, aVar.d);
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f140321b, this.f140320a.hashCode() * 31, 31);
        Clause clause = this.f140322c;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.d;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
