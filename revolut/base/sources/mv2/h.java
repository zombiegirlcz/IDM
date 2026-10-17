package mv2;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f209100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f209101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f209102c;
    public final yy0.l d;
    public final List e;

    public h(TextLocalisedClause title, TextClause description, TextLocalisedClause secondDescription, yy0.l endImage, List menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(secondDescription, "secondDescription");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f209100a = title;
        this.f209101b = description;
        this.f209102c = secondDescription;
        this.d = endImage;
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
        return this.f209100a.equals(hVar.f209100a) && this.f209101b.equals(hVar.f209101b) && this.f209102c.equals(hVar.f209102c) && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + t61.a.a(v7.b(this.f209100a.hashCode() * 31, 31, this.f209101b), 31, this.f209102c)) * 31);
    }
}
