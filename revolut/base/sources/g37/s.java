package g37;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f140226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f140227c;

    public s(TextLocalisedClause title, List actions, List menuItems) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f140225a = actions;
        this.f140226b = menuItems;
        this.f140227c = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f140225a, sVar.f140225a) && Intrinsics.f(this.f140226b, sVar.f140226b) && this.f140227c.equals(sVar.f140227c);
    }

    public final int hashCode() {
        return this.f140227c.hashCode() + p.a.d(this.f140225a.hashCode() * 31, 31, this.f140226b);
    }
}
