package lb1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f193576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f193577c;
    public final TextLocalisedClause d;
    public final boolean e;

    public g(TextLocalisedClause toolbarTitle, TextLocalisedClause toolbarDescription, TextLocalisedClause continueButton, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarDescription, "toolbarDescription");
        Intrinsics.checkNotNullParameter(continueButton, "continueButton");
        this.f193575a = items;
        this.f193576b = toolbarTitle;
        this.f193577c = toolbarDescription;
        this.d = continueButton;
        this.e = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f193575a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f193575a, gVar.f193575a) && this.f193576b.equals(gVar.f193576b) && this.f193577c.equals(gVar.f193577c) && this.d.equals(gVar.d) && this.e == gVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f193575a.hashCode() * 31, 31, this.f193576b), 31, this.f193577c), 31, this.d);
    }
}
