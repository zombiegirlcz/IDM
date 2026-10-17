package jch;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f172808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f172809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f172810c;
    public final ArrayList d;

    public o(TextLocalisedClause toolbarTitle, List toolbarMenuItems, TextLocalisedClause buttonTextClause, ArrayList items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(toolbarMenuItems, "toolbarMenuItems");
        Intrinsics.checkNotNullParameter(buttonTextClause, "buttonTextClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172808a = toolbarTitle;
        this.f172809b = toolbarMenuItems;
        this.f172810c = buttonTextClause;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return this.f172808a.equals(oVar.f172808a) && Intrinsics.f(this.f172809b, oVar.f172809b) && this.f172810c.equals(oVar.f172810c) && this.d.equals(oVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(p.a.d(this.f172808a.hashCode() * 31, 31, this.f172809b), 31, this.f172810c);
    }
}
