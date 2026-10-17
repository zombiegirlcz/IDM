package o74;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f222714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f222715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f222716c;
    public final TextLocalisedClause d;
    public final boolean e;

    public n(aim.e items, TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f222714a = items;
        this.f222715b = title;
        this.f222716c = description;
        this.d = buttonTitle;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f222714a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f222714a, nVar.f222714a) && this.f222715b.equals(nVar.f222715b) && this.f222716c.equals(nVar.f222716c) && this.d.equals(nVar.d) && this.e == nVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f222714a.hashCode() * 31, 31, this.f222715b), 31, this.f222716c), 31, this.d);
    }
}
