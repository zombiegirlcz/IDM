package p6g;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f233285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f233286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f233287c;

    public i(h referenceDates, h targetDates, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(referenceDates, "referenceDates");
        Intrinsics.checkNotNullParameter(targetDates, "targetDates");
        this.f233285a = referenceDates;
        this.f233286b = targetDates;
        this.f233287c = textLocalisedClause;
    }

    @Override // p6g.y
    public final Clause a() {
        return this.f233287c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f233285a.equals(iVar.f233285a) && this.f233286b.equals(iVar.f233286b) && this.f233287c.equals(iVar.f233287c);
    }

    public final int hashCode() {
        return this.f233287c.hashCode() + ((this.f233286b.hashCode() + (this.f233285a.hashCode() * 31)) * 31);
    }
}
