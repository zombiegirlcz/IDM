package bec;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f14805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f14806b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f14807c;

    public r(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f14805a = title;
        this.f14806b = textLocalisedClause;
        this.f14807c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f14805a.equals(rVar.f14805a) && Intrinsics.f(this.f14806b, rVar.f14806b) && this.f14807c == rVar.f14807c;
    }

    public final int hashCode() {
        int iHashCode = this.f14805a.hashCode() * 31;
        Clause clause = this.f14806b;
        return Boolean.hashCode(this.f14807c) + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
