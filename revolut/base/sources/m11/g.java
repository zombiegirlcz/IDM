package m11;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f201177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f201178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f201179c;
    public final aw0.i d;
    public final boolean e;
    public final List f;

    public g(String backgroundVideoLink, TextLocalisedClause title, Clause subtitle, aw0.i footerModel, boolean z, List items) {
        Intrinsics.checkNotNullParameter(backgroundVideoLink, "backgroundVideoLink");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(footerModel, "footerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f201177a = backgroundVideoLink;
        this.f201178b = title;
        this.f201179c = subtitle;
        this.d = footerModel;
        this.e = z;
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
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f201177a.equals(gVar.f201177a) && this.f201178b.equals(gVar.f201178b) && this.f201179c.equals(gVar.f201179c) && this.d.equals(gVar.d) && this.e == gVar.e && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c((this.d.hashCode() + p.a.b(t61.a.a(this.f201177a.hashCode() * 31, 31, this.f201178b), 31, this.f201179c)) * 31, 31, this.e);
    }
}
