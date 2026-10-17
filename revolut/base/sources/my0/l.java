package my0;

import aw0.r2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.ul;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class l extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r2 f210295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ul f210296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f210297c;

    public l(r2 moneyTitle, ul ulVar, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(moneyTitle, "moneyTitle");
        this.f210295a = moneyTitle;
        this.f210296b = ulVar;
        this.f210297c = textLocalisedClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f210295a.equals(lVar.f210295a) && this.f210296b.equals(lVar.f210296b) && this.f210297c.equals(lVar.f210297c);
    }

    public final int hashCode() {
        return j6.a.c(t61.a.a((this.f210296b.hashCode() + (this.f210295a.hashCode() * 31)) * 31, 961, this.f210297c), 31, false);
    }
}
