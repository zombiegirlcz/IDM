package jq4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f177452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f177453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f177454c;
    public final List d;
    public final List e;

    public j(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, ResourceImage naviIcon, List actions, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(naviIcon, "naviIcon");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f177452a = title;
        this.f177453b = textLocalisedClause;
        this.f177454c = naviIcon;
        this.d = actions;
        this.e = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f177452a.equals(jVar.f177452a) && Intrinsics.f(this.f177453b, jVar.f177453b) && this.f177454c.equals(jVar.f177454c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f177452a.hashCode() * 31;
        Clause clause = this.f177453b;
        return this.e.hashCode() + p.a.d(org.bouncycastle.jcajce.provider.digest.a.b(this.f177454c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31), 31, this.d);
    }
}
