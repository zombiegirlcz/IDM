package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f233278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f233279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f233280c;

    public e(long j2, LocalDate referenceDate, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        this.f233278a = j2;
        this.f233279b = referenceDate;
        this.f233280c = textLocalisedClause;
    }

    @Override // p6g.y
    public final Clause a() {
        return this.f233280c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f233278a == eVar.f233278a && Intrinsics.f(this.f233279b, eVar.f233279b) && this.f233280c.equals(eVar.f233280c);
    }

    public final int hashCode() {
        return this.f233280c.hashCode() + wp5.y.a(Long.hashCode(this.f233278a) * 31, 31, this.f233279b);
    }
}
