package lbc;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f193640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f193641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f193642c;
    public final List d;
    public final List e;

    public n(TextClause title, TextLocalisedClause subtitle, Image icon, List actionItems, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actionItems, "actionItems");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f193640a = title;
        this.f193641b = subtitle;
        this.f193642c = icon;
        this.d = actionItems;
        this.e = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f193640a.equals(nVar.f193640a) && this.f193641b.equals(nVar.f193641b) && this.f193642c.equals(nVar.f193642c) && Intrinsics.f(this.d, nVar.d) && Intrinsics.f(this.e, nVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(a10.b.c(this.f193642c, t61.a.a(this.f193640a.hashCode() * 31, 31, this.f193641b), 31), 31, this.d);
    }
}
