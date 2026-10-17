package b11;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f11703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f11704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11705c;

    public a(TextLocalisedClause planClause, LocalDate dueDate, boolean z) {
        Intrinsics.checkNotNullParameter(planClause, "planClause");
        Intrinsics.checkNotNullParameter(dueDate, "dueDate");
        this.f11703a = planClause;
        this.f11704b = dueDate;
        this.f11705c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f11703a.equals(aVar.f11703a) && Intrinsics.f(this.f11704b, aVar.f11704b) && this.f11705c == aVar.f11705c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11705c) + y.a(this.f11703a.hashCode() * 31, 31, this.f11704b);
    }
}
