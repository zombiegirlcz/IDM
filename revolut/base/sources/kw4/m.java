package kw4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f190234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f190235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f190236c;
    public final ResourceImage d;
    public final List e;

    public m(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause toolbarTitle, ResourceImage icon, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f190234a = title;
        this.f190235b = description;
        this.f190236c = toolbarTitle;
        this.d = icon;
        this.e = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f190234a.equals(mVar.f190234a) && this.f190235b.equals(mVar.f190235b) && this.f190236c.equals(mVar.f190236c) && this.d.equals(mVar.d) && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + org.bouncycastle.jcajce.provider.digest.a.b(this.d, t61.a.a(t61.a.a(this.f190234a.hashCode() * 31, 31, this.f190235b), 31, this.f190236c), 31);
    }
}
