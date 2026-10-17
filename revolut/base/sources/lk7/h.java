package lk7;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f196277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CdnImage f196278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.k f196279c;
    public final List d;
    public final List e;

    public h(Clause title, CdnImage backgroundImage, aw0.k kVar, List actions, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f196277a = title;
        this.f196278b = backgroundImage;
        this.f196279c = kVar;
        this.d = actions;
        this.e = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f196277a, hVar.f196277a) && Intrinsics.f(this.f196278b, hVar.f196278b) && Intrinsics.f(this.f196279c, hVar.f196279c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f196278b.hashCode() + (this.f196277a.hashCode() * 31)) * 31;
        aw0.k kVar = this.f196279c;
        return this.e.hashCode() + p.a.d((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.d);
    }

    public h(TextClause textClause, CdnImage cdnImage, int i) {
        TextClause textClause2;
        if ((i & 1) != 0) {
            m70.a.c(t0.f186434a);
            textClause2 = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause2 = textClause;
        }
        f0 f0Var = f0.f322471a;
        this(textClause2, cdnImage, null, f0Var, f0Var);
    }
}
