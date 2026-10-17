package zs2;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f324797c;

    public m(TextLocalisedClause hint, List items, List actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f324795a = items;
        this.f324796b = actions;
        this.f324797c = hint;
    }

    @Override // cli.p
    public final List c() {
        return this.f324795a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f324795a, mVar.f324795a) && Intrinsics.f(this.f324796b, mVar.f324796b) && this.f324797c.equals(mVar.f324797c);
    }

    public final int hashCode() {
        return this.f324797c.hashCode() + p.a.d(this.f324795a.hashCode() * 31, 31, this.f324796b);
    }
}
