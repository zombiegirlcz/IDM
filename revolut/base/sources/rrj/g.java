package rrj;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f256856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f256857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f256858c;
    public final List d;

    public g(MoneyClause title, Clause description, LayeredImage icon, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f256856a = title;
        this.f256857b = description;
        this.f256858c = icon;
        this.d = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f256856a.equals(gVar.f256856a) && this.f256857b.equals(gVar.f256857b) && this.f256858c.equals(gVar.f256858c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.e(this.f256858c, p.a.a(this.f256856a.hashCode() * 31, 31, this.f256857b), 31);
    }
}
