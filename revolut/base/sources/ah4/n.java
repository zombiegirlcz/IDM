package ah4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f4902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f4903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4904c;
    public final TextLocalisedClause d;
    public final c7 e;
    public final ArrayList f;

    public n(TextLocalisedClause title, TextClause textClause, boolean z, TextLocalisedClause buttonText, c7 buttonFooter, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(buttonFooter, "buttonFooter");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f4902a = title;
        this.f4903b = textClause;
        this.f4904c = z;
        this.d = buttonText;
        this.e = buttonFooter;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f4902a.equals(nVar.f4902a) && Intrinsics.f(this.f4903b, nVar.f4903b) && this.f4904c == nVar.f4904c && this.d.equals(nVar.d) && this.e.equals(nVar.e) && this.f.equals(nVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f4902a.hashCode() * 31;
        Clause clause = this.f4903b;
        return this.f.hashCode() + ((this.e.hashCode() + t61.a.a(j6.a.c((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f4904c), 31, this.d)) * 31);
    }
}
