package uyd;

import com.revolut.feature.statements.api.models.StatementsFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f284237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f284238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f284239c;
    public final StatementsFormat d;
    public final boolean e;

    public r(LocalDate from, LocalDate to6, ArrayList accountIds, StatementsFormat format, boolean z) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(accountIds, "accountIds");
        Intrinsics.checkNotNullParameter(format, "format");
        this.f284237a = from;
        this.f284238b = to6;
        this.f284239c = accountIds;
        this.d = format;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f284237a, rVar.f284237a) && Intrinsics.f(this.f284238b, rVar.f284238b) && this.f284239c.equals(rVar.f284239c) && this.d == rVar.d && this.e == rVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f284239c, wp5.y.a(this.f284237a.hashCode() * 31, 31, this.f284238b), 31)) * 31);
    }
}
