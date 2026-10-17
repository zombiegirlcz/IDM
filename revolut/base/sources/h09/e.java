package h09;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f148334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f148335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f148336c;

    public e(Clause clause, Integer num, Integer num2) {
        this.f148334a = clause;
        this.f148335b = num;
        this.f148336c = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f148334a, eVar.f148334a) && Intrinsics.f(this.f148335b, eVar.f148335b) && Intrinsics.f(this.f148336c, eVar.f148336c);
    }

    public final int hashCode() {
        Clause clause = this.f148334a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Integer num = this.f148335b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f148336c;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }
}
