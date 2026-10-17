package n93;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import h30.l;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f213548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f213549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f213550c;
    public final TextClause d;
    public final Clause e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f213551g;

    public c(String listId, TextClause title, CompositeClause subtitle, TextClause primaryValue, Clause secondaryValue, Image icon, b bVar) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryValue, "primaryValue");
        Intrinsics.checkNotNullParameter(secondaryValue, "secondaryValue");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f213548a = listId;
        this.f213549b = title;
        this.f213550c = subtitle;
        this.d = primaryValue;
        this.e = secondaryValue;
        this.f = icon;
        this.f213551g = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f213548a, cVar.f213548a) && this.f213549b.equals(cVar.f213549b) && this.f213550c.equals(cVar.f213550c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && this.f.equals(cVar.f) && this.f213551g.equals(cVar.f213551g);
    }

    public final int hashCode() {
        return this.f213551g.f213547a.hashCode() + a10.b.c(this.f, p.a.a(v7.b(l.c(this.f213550c, v7.b(this.f213548a.hashCode() * 31, 31, this.f213549b), 31), 31, this.d), 31, this.e), 31);
    }
}
