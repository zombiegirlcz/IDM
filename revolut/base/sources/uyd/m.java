package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.api.models.StatementsType;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f284221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f284223c;
    public final xi0.b d;
    public final StatementsFormat e;
    public final StatementsType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f284224g;

    public m(String juniorId, LocalDate from, LocalDate to6, xi0.b ccy, StatementsFormat format, StatementsType type, boolean z) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(ccy, "ccy");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f284221a = juniorId;
        this.f284222b = from;
        this.f284223c = to6;
        this.d = ccy;
        this.e = format;
        this.f = type;
        this.f284224g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f284221a, mVar.f284221a) && Intrinsics.f(this.f284222b, mVar.f284222b) && Intrinsics.f(this.f284223c, mVar.f284223c) && Intrinsics.f(this.d, mVar.d) && this.e == mVar.e && this.f == mVar.f && this.f284224g == mVar.f284224g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284224g) + ((this.f.hashCode() + ((this.e.hashCode() + h30.l.j(this.d, wp5.y.a(wp5.y.a(this.f284221a.hashCode() * 31, 31, this.f284222b), 31, this.f284223c), 31)) * 31)) * 31);
    }
}
