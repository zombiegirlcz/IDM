package mx0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class zb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f210148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb f210149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f210150c;
    public final Long d;
    public final boolean e;

    public zb(Clause textClause, yb color, Integer num, Long l2, boolean z) {
        Intrinsics.checkNotNullParameter(textClause, "textClause");
        Intrinsics.checkNotNullParameter(color, "color");
        this.f210148a = textClause;
        this.f210149b = color;
        this.f210150c = num;
        this.d = l2;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zb)) {
            return false;
        }
        zb zbVar = (zb) obj2;
        return Intrinsics.f(this.f210148a, zbVar.f210148a) && this.f210149b == zbVar.f210149b && Intrinsics.f(this.f210150c, zbVar.f210150c) && Intrinsics.f(this.d, zbVar.d) && this.e == zbVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f210149b.hashCode() + (this.f210148a.hashCode() * 31)) * 31;
        Integer num = this.f210150c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public /* synthetic */ zb(TextLocalisedClause textLocalisedClause, yb ybVar, Long l2) {
        this(textLocalisedClause, ybVar, null, l2, false);
    }
}
