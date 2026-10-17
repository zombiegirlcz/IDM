package e94;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f123913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f123914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f123915c;
    public final boolean d;
    public final List e;

    public n(aim.e items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f123913a = title;
        this.f123914b = description;
        this.f123915c = buttonTitle;
        this.d = z;
        this.e = items;
    }

    @Override // cli.p
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f123913a.equals(nVar.f123913a) && this.f123914b.equals(nVar.f123914b) && this.f123915c.equals(nVar.f123915c) && this.d == nVar.d && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(t61.a.a(t61.a.a(this.f123913a.hashCode() * 31, 31, this.f123914b), 31, this.f123915c), 31, this.d);
    }
}
