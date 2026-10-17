package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f233275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f233276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f233277c;

    public d(long j2, LocalDate referenceDate, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(referenceDate, "referenceDate");
        this.f233275a = j2;
        this.f233276b = referenceDate;
        this.f233277c = textLocalisedClause;
    }

    @Override // p6g.y
    public final Clause a() {
        return this.f233277c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f233275a == dVar.f233275a && Intrinsics.f(this.f233276b, dVar.f233276b) && this.f233277c.equals(dVar.f233277c);
    }

    public final int hashCode() {
        return this.f233277c.hashCode() + wp5.y.a(Long.hashCode(this.f233275a) * 31, 31, this.f233276b);
    }
}
