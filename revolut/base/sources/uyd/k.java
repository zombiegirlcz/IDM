package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.api.models.StatementsType;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f284214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f284216c;
    public final StatementsFormat d;
    public final StatementsType e;
    public final boolean f;

    public k(LocalDate from, LocalDate to6, ArrayList currencies, StatementsFormat format, StatementsType type, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f284214a = from;
        this.f284215b = to6;
        this.f284216c = currencies;
        this.d = format;
        this.e = type;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f284214a, kVar.f284214a) && Intrinsics.f(this.f284215b, kVar.f284215b) && this.f284216c.equals(kVar.f284216c) && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c((this.e.hashCode() + ((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f284216c, wp5.y.a(this.f284214a.hashCode() * 31, 31, this.f284215b), 31)) * 31)) * 31, 31, false);
    }
}
