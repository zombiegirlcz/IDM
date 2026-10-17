package ly4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f200692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f200693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f200694c;
    public final List d;

    public n(m toolbar, TextLocalisedClause textLocalisedClause, TextLocalisedClause buttonTitle, List items) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f200692a = toolbar;
        this.f200693b = textLocalisedClause;
        this.f200694c = buttonTitle;
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
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return this.f200692a.equals(nVar.f200692a) && this.f200693b.equals(nVar.f200693b) && this.f200694c.equals(nVar.f200694c) && this.d.equals(nVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f200692a.hashCode() * 31, 31, this.f200693b), 31, this.f200694c);
    }
}
