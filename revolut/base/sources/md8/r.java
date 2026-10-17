package md8;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f204522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f204523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f204524c;
    public final TextLocalisedClause d;
    public final TextLocalisedClause e;
    public final Clause f;

    public /* synthetic */ r(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, TextLocalisedClause textLocalisedClause4, TextLocalisedClause textLocalisedClause5, int i) {
        this((i & 1) == 0, textLocalisedClause, textLocalisedClause2, textLocalisedClause3, textLocalisedClause4, (i & 32) != 0 ? null : textLocalisedClause5);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return this.f204522a == rVar.f204522a && Intrinsics.f(this.f204523b, rVar.f204523b) && Intrinsics.f(this.f204524c, rVar.f204524c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(t61.a.a(Boolean.hashCode(this.f204522a) * 31, 31, this.f204523b), 31, this.f204524c);
        TextLocalisedClause textLocalisedClause = this.d;
        int iA2 = t61.a.a((iA + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31, 31, this.e);
        Clause clause = this.f;
        return iA2 + (clause != null ? clause.hashCode() : 0);
    }

    public r(boolean z, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause textLocalisedClause, TextLocalisedClause primaryActionLabel, Clause clause) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryActionLabel, "primaryActionLabel");
        this.f204522a = z;
        this.f204523b = title;
        this.f204524c = description;
        this.d = textLocalisedClause;
        this.e = primaryActionLabel;
        this.f = clause;
    }
}
