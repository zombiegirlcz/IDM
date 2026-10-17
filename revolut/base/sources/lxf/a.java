package lxf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f200566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f200567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f200568c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextLocalisedClause f200569g;

    public a(TextLocalisedClause emptyStateTitle, TextLocalisedClause emptyStateDescription, TextLocalisedClause textLocalisedClause, TextLocalisedClause emptyStateTitleUpcoming, TextLocalisedClause emptyStateSubtitleUpcoming, TextLocalisedClause actionTitlePastAndCancelled, TextLocalisedClause buttonPastAndCancelled) {
        Intrinsics.checkNotNullParameter(emptyStateTitle, "emptyStateTitle");
        Intrinsics.checkNotNullParameter(emptyStateDescription, "emptyStateDescription");
        Intrinsics.checkNotNullParameter(emptyStateTitleUpcoming, "emptyStateTitleUpcoming");
        Intrinsics.checkNotNullParameter(emptyStateSubtitleUpcoming, "emptyStateSubtitleUpcoming");
        Intrinsics.checkNotNullParameter(actionTitlePastAndCancelled, "actionTitlePastAndCancelled");
        Intrinsics.checkNotNullParameter(buttonPastAndCancelled, "buttonPastAndCancelled");
        Intrinsics.checkNotNullParameter("3D300", "imageCdnId");
        this.f200566a = emptyStateTitle;
        this.f200567b = emptyStateDescription;
        this.f200568c = textLocalisedClause;
        this.d = emptyStateTitleUpcoming;
        this.e = emptyStateSubtitleUpcoming;
        this.f = actionTitlePastAndCancelled;
        this.f200569g = buttonPastAndCancelled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f200566a.equals(aVar.f200566a) && this.f200567b.equals(aVar.f200567b) && Intrinsics.f(this.f200568c, aVar.f200568c) && this.d.equals(aVar.d) && this.e.equals(aVar.e) && this.f.equals(aVar.f) && this.f200569g.equals(aVar.f200569g);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f200566a.hashCode() * 31, 31, this.f200567b);
        Clause clause = this.f200568c;
        return ((this.f200569g.hashCode() + t61.a.a(t61.a.a(t61.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31) + 49175906;
    }
}
