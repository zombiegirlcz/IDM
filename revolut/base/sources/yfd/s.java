package yfd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f313224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f313225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.revolut.feature.shared_separate_favourites.common.screen.add_asset.a f313226c;
    public final Clause d;
    public final ArrayList e;

    public s(Clause toolbarTitle, List toolbarMenuItems, com.revolut.feature.shared_separate_favourites.common.screen.add_asset.a buttonState, TextLocalisedClause textLocalisedClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarMenuItems, "toolbarMenuItems");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f313224a = toolbarTitle;
        this.f313225b = toolbarMenuItems;
        this.f313226c = buttonState;
        this.d = textLocalisedClause;
        this.e = items;
    }

    @Override // jki.n
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f313224a.equals(sVar.f313224a) && Intrinsics.f(this.f313225b, sVar.f313225b) && this.f313226c.equals(sVar.f313226c) && Intrinsics.f(this.d, sVar.d) && this.e.equals(sVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f313226c.hashCode() + p.a.d(this.f313224a.hashCode() * 31, 31, this.f313225b)) * 31;
        Clause clause = this.d;
        return this.e.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
