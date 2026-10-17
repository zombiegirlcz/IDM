package umd;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f281287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f281288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f281289c;
    public final List d;

    public d(List items, AnimatedBackgroundType.Base background, TextLocalisedClause textLocalisedClause, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f281287a = items;
        this.f281288b = background;
        this.f281289c = textLocalisedClause;
        this.d = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f281287a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f281287a, dVar.f281287a) && Intrinsics.f(this.f281288b, dVar.f281288b) && Intrinsics.f(this.f281289c, dVar.f281289c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f281288b.hashCode() + (this.f281287a.hashCode() * 31)) * 31;
        Clause clause = this.f281289c;
        return this.d.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
