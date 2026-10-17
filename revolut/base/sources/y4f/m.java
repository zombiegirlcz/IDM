package y4f;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f310910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f310911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f310912c;

    public m(TextLocalisedClause toolbarTitle, TextLocalisedClause toolbarSubtitle, List items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarSubtitle, "toolbarSubtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f310910a = toolbarTitle;
        this.f310911b = toolbarSubtitle;
        this.f310912c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f310912c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f310910a.equals(mVar.f310910a) && this.f310911b.equals(mVar.f310911b) && Intrinsics.f(this.f310912c, mVar.f310912c);
    }

    public final int hashCode() {
        return this.f310912c.hashCode() + t61.a.a(this.f310910a.hashCode() * 31, 31, this.f310911b);
    }
}
