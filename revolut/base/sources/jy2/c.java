package jy2;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iy2.b f179309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f179310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f179311c;
    public final Integer d;
    public final boolean e;

    public c(iy2.b card, Clause clause, Integer num, Integer num2, boolean z) {
        Intrinsics.checkNotNullParameter(card, "card");
        this.f179309a = card;
        this.f179310b = clause;
        this.f179311c = num;
        this.d = num2;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f179309a, cVar.f179309a) && Intrinsics.f(this.f179310b, cVar.f179310b) && Intrinsics.f(this.f179311c, cVar.f179311c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f179309a.hashCode() * 31;
        Clause clause = this.f179310b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Integer num = this.f179311c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }
}
