package bvb;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f18983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f18984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f18985c;
    public final Integer d;
    public final boolean e;

    public f(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, Integer num, int i) {
        textLocalisedClause = (i & 2) != 0 ? null : textLocalisedClause;
        textLocalisedClause2 = (i & 4) != 0 ? null : textLocalisedClause2;
        num = (i & 8) != 0 ? null : num;
        boolean z = (i & 16) == 0;
        Intrinsics.checkNotNullParameter(title, "title");
        this.f18983a = title;
        this.f18984b = textLocalisedClause;
        this.f18985c = textLocalisedClause2;
        this.d = num;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f18983a.equals(fVar.f18983a) && Intrinsics.f(this.f18984b, fVar.f18984b) && Intrinsics.f(this.f18985c, fVar.f18985c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        int iHashCode = this.f18983a.hashCode() * 31;
        Clause clause = this.f18984b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.f18985c;
        int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
        Integer num = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }
}
