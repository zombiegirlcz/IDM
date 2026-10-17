package v84;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f286710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f286711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f286712c;
    public final LayeredImage d;

    public f(ArrayList items, TextLocalisedClause navBarTitle, TextClause navBarDescription, LayeredImage icon) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        Intrinsics.checkNotNullParameter(navBarDescription, "navBarDescription");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f286710a = items;
        this.f286711b = navBarTitle;
        this.f286712c = navBarDescription;
        this.d = icon;
    }

    @Override // jki.n
    public final List c() {
        return this.f286710a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f286710a.equals(fVar.f286710a) && this.f286711b.equals(fVar.f286711b) && this.f286712c.equals(fVar.f286712c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + v7.b(t61.a.a(this.f286710a.hashCode() * 31, 31, this.f286711b), 31, this.f286712c);
    }
}
