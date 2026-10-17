package ik7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f161902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hha.d f161903c;
    public final TextClause d;

    public d(boolean z, long j2, hha.d currentPlan) {
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        this.f161901a = z;
        this.f161902b = j2;
        this.f161903c = currentPlan;
        this.d = new TextClause(ch.qos.logback.core.util.a.p(j2, "%"), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f161901a == dVar.f161901a && this.f161902b == dVar.f161902b && Intrinsics.f(this.f161903c, dVar.f161903c);
    }

    public final int hashCode() {
        return this.f161903c.hashCode() + a0.d.c(Boolean.hashCode(this.f161901a) * 31, 31, this.f161902b);
    }
}
