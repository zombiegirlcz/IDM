package ku8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f189746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f189747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f189748c;
    public final TextLocalisedClause d;
    public final boolean e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f189749g;

    public q(List items, TextLocalisedClause toolbarTitle, TextLocalisedClause toolbarSubtitle, TextLocalisedClause continueButtonText, boolean z, TextLocalisedClause changeCitizenshipButtonText, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(continueButtonText, "continueButtonText");
        Intrinsics.checkNotNullParameter(changeCitizenshipButtonText, "changeCitizenshipButtonText");
        this.f189746a = items;
        this.f189747b = toolbarTitle;
        this.f189748c = toolbarSubtitle;
        this.d = continueButtonText;
        this.e = z;
        this.f = changeCitizenshipButtonText;
        this.f189749g = z3;
    }

    @Override // cli.p
    public final List c() {
        return this.f189746a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f189746a, qVar.f189746a) && this.f189747b.equals(qVar.f189747b) && this.f189748c.equals(qVar.f189748c) && this.d.equals(qVar.d) && this.e == qVar.e && this.f.equals(qVar.f) && this.f189749g == qVar.f189749g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f189749g) + t61.a.a(j6.a.c(t61.a.a(t61.a.a(t61.a.a(this.f189746a.hashCode() * 31, 31, this.f189747b), 31, this.f189748c), 31, this.d), 31, this.e), 31, this.f);
    }
}
