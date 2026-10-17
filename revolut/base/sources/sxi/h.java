package sxi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.navbar.IconNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f266501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f266502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f266503c;
    public final IconNavBarMenuItem d;

    public h(TextClause textClause, List headerImages, boolean z, IconNavBarMenuItem iconNavBarMenuItem) {
        Intrinsics.checkNotNullParameter(headerImages, "headerImages");
        this.f266501a = textClause;
        this.f266502b = headerImages;
        this.f266503c = z;
        this.d = iconNavBarMenuItem;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f266501a, hVar.f266501a) && Intrinsics.f(this.f266502b, hVar.f266502b) && this.f266503c == hVar.f266503c && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        Clause clause = this.f266501a;
        int iC = j6.a.c(p.a.d((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f266502b), 31, this.f266503c);
        IconNavBarMenuItem iconNavBarMenuItem = this.d;
        return iC + (iconNavBarMenuItem != null ? iconNavBarMenuItem.hashCode() : 0);
    }
}
