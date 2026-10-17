package ngb;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f215127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f215128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f215129c;
    public final TextLocalisedClause d;

    public a(TextLocalisedClause title, TextLocalisedClause subtitle, TextLocalisedClause textLocalisedClause, TextLocalisedClause action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f215127a = title;
        this.f215128b = subtitle;
        this.f215129c = textLocalisedClause;
        this.d = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f215127a.equals(aVar.f215127a) && this.f215128b.equals(aVar.f215128b) && Intrinsics.f(this.f215129c, aVar.f215129c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f215127a.hashCode() * 31, 31, this.f215128b);
        TextLocalisedClause textLocalisedClause = this.f215129c;
        return t61.a.a((iA + (textLocalisedClause == null ? 0 : textLocalisedClause.hashCode())) * 31, 31, this.d);
    }
}
