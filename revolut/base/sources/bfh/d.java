package bfh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.shared.feature.wealth.ui_kit.models.image.InstrumentImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f14984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f14985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InstrumentImage f14986c;
    public final List d;

    public d(TextClause title, TextClause textClause, InstrumentImage image, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f14984a = title;
        this.f14985b = textClause;
        this.f14986c = image;
        this.d = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f14984a.equals(dVar.f14984a) && Intrinsics.f(this.f14985b, dVar.f14985b) && this.f14986c.equals(dVar.f14986c) && this.d.equals(dVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f14984a.hashCode() * 31;
        Clause clause = this.f14985b;
        return this.d.hashCode() + ((this.f14986c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31)) * 31);
    }
}
