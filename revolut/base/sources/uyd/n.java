package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.api.models.StatementsType;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f284228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f284230c;
    public final StatementsFormat d;
    public final StatementsType e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f284231g;

    public n(LocalDate from, LocalDate to6, ArrayList currencies, StatementsFormat format, StatementsType type, String str, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f284228a = from;
        this.f284229b = to6;
        this.f284230c = currencies;
        this.d = format;
        this.e = type;
        this.f = str;
        this.f284231g = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f284228a, nVar.f284228a) && Intrinsics.f(this.f284229b, nVar.f284229b) && this.f284230c.equals(nVar.f284230c) && this.d == nVar.d && this.e == nVar.e && Intrinsics.f(this.f, nVar.f) && this.f284231g == nVar.f284231g;
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f284230c, wp5.y.a(this.f284228a.hashCode() * 31, 31, this.f284229b), 31)) * 31)) * 31;
        String str = this.f;
        return Boolean.hashCode(this.f284231g) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
