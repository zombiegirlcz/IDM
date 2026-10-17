package wed;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class r implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f296751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f296752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f296753c;
    public final ArrayList d;

    public r(List actions, TextLocalisedClause navBarTitle, List navBarMenuItems, ArrayList items) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f296751a = actions;
        this.f296752b = navBarTitle;
        this.f296753c = navBarMenuItems;
        this.d = items;
    }

    @Override // jki.n
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f296751a, rVar.f296751a) && this.f296752b.equals(rVar.f296752b) && Intrinsics.f(this.f296753c, rVar.f296753c) && this.d.equals(rVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(t61.a.a(this.f296751a.hashCode() * 31, 31, this.f296752b), 31, this.f296753c);
    }
}
