package prh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f239022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f239023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f239024c;
    public final List d;
    public final b e;

    public g(TextLocalisedClause screenTitle, TextLocalisedClause infoTitle, TextLocalisedClause infoSubtitle, List additionalInfoItems, b acceptDeclineButtons) {
        Intrinsics.checkNotNullParameter(screenTitle, "screenTitle");
        Intrinsics.checkNotNullParameter(infoTitle, "infoTitle");
        Intrinsics.checkNotNullParameter(infoSubtitle, "infoSubtitle");
        Intrinsics.checkNotNullParameter(additionalInfoItems, "additionalInfoItems");
        Intrinsics.checkNotNullParameter(acceptDeclineButtons, "acceptDeclineButtons");
        this.f239022a = screenTitle;
        this.f239023b = infoTitle;
        this.f239024c = infoSubtitle;
        this.d = additionalInfoItems;
        this.e = acceptDeclineButtons;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f239022a.equals(gVar.f239022a) && this.f239023b.equals(gVar.f239023b) && this.f239024c.equals(gVar.f239024c) && Intrinsics.f(this.d, gVar.d) && this.e.equals(gVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(t61.a.a(t61.a.a(this.f239022a.hashCode() * 31, 31, this.f239023b), 31, this.f239024c), 31, this.d);
    }
}
