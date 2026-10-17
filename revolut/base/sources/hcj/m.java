package hcj;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f150911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f150912c;

    public m(CompositeClause navBarSubtitle, TextLocalisedClause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarSubtitle, "navBarSubtitle");
        this.f150910a = items;
        this.f150911b = navBarTitle;
        this.f150912c = navBarSubtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f150910a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f150910a, mVar.f150910a) && this.f150911b.equals(mVar.f150911b) && this.f150912c.equals(mVar.f150912c);
    }

    public final int hashCode() {
        return this.f150912c.hashCode() + t61.a.a(this.f150910a.hashCode() * 31, 31, this.f150911b);
    }
}
