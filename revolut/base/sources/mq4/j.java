package mq4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarMenuItem;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aw0.e f207863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f207864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f207865c;
    public final Image d;
    public final NavBarMenuItem e;
    public final List f;

    public j(aw0.e actionFooterModel, TextLocalisedClause textLocalisedClause, TextLocalisedClause title, Image image, NavBarMenuItem navBarMenuItem, List items) {
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f207863a = actionFooterModel;
        this.f207864b = textLocalisedClause;
        this.f207865c = title;
        this.d = image;
        this.e = navBarMenuItem;
        this.f = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f207863a, jVar.f207863a) && Intrinsics.f(this.f207864b, jVar.f207864b) && Intrinsics.f(this.f207865c, jVar.f207865c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f207863a.hashCode() * 31;
        Clause clause = this.f207864b;
        int iA = t61.a.a((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.f207865c);
        Image image = this.d;
        int iHashCode2 = (iA + (image == null ? 0 : image.hashCode())) * 31;
        NavBarMenuItem navBarMenuItem = this.e;
        return this.f.hashCode() + ((iHashCode2 + (navBarMenuItem != null ? navBarMenuItem.hashCode() : 0)) * 31);
    }

    public /* synthetic */ j(aw0.e eVar, TextLocalisedClause textLocalisedClause, ResourceImage resourceImage, List list) {
        this(eVar, null, textLocalisedClause, resourceImage, null, list);
    }
}
