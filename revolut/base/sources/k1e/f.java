package k1e;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import h30.l;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f180219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f180220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f180221c;
    public final LayeredImage d;
    public final LayeredImage e;
    public final List f;

    public f(MoneyClause title, TextLocalisedClause subtitle, TimeClause secondarySubtitle, LayeredImage icon, LayeredImage badge, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(secondarySubtitle, "secondarySubtitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f180219a = title;
        this.f180220b = subtitle;
        this.f180221c = secondarySubtitle;
        this.d = icon;
        this.e = badge;
        this.f = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f180219a.equals(fVar.f180219a) && this.f180220b.equals(fVar.f180220b) && this.f180221c.equals(fVar.f180221c) && this.d.equals(fVar.d) && this.e.equals(fVar.e) && Intrinsics.f(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + l.e(this.e, l.e(this.d, l.d(this.f180221c, t61.a.a(this.f180219a.hashCode() * 31, 31, this.f180220b), 31), 31), 31);
    }
}
