package av8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f9953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f9954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f9955c;
    public final TextLocalisedClause d;
    public final boolean e;

    public m(TextLocalisedClause toolbarTitle, TextLocalisedClause toolbarSubtitle, TextLocalisedClause goToButtonClause, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(goToButtonClause, "goToButtonClause");
        this.f9953a = items;
        this.f9954b = toolbarTitle;
        this.f9955c = toolbarSubtitle;
        this.d = goToButtonClause;
        this.e = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f9953a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f9953a, mVar.f9953a) && this.f9954b.equals(mVar.f9954b) && this.f9955c.equals(mVar.f9955c) && this.d.equals(mVar.d) && this.e == mVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.a(t61.a.a(t61.a.a(this.f9953a.hashCode() * 31, 31, this.f9954b), 31, this.f9955c), 31, this.d);
    }
}
