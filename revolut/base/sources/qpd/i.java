package qpd;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f248356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f248357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f248358c;

    public i(Clause title, CompositeClause subtitle, Image icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f248356a = title;
        this.f248357b = subtitle;
        this.f248358c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f248356a.equals(iVar.f248356a) && this.f248357b.equals(iVar.f248357b) && this.f248358c.equals(iVar.f248358c);
    }

    public final int hashCode() {
        return this.f248358c.hashCode() + h30.l.c(this.f248357b, this.f248356a.hashCode() * 31, 31);
    }
}
