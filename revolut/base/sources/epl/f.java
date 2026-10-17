package epl;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.badge.RetailBadge;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f128206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f128207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f128208c;
    public final List d;

    public f(TextClause title, TextLocalisedClause description, UrlImage icon, List filters) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        RetailBadge iconBadge = RetailBadge.f58066a;
        Intrinsics.checkNotNullParameter(iconBadge, "iconBadge");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f128206a = title;
        this.f128207b = description;
        this.f128208c = icon;
        this.d = filters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        if (!this.f128206a.equals(fVar.f128206a) || !this.f128207b.equals(fVar.f128207b) || !this.f128208c.equals(fVar.f128208c)) {
            return false;
        }
        Object obj3 = RetailBadge.f58066a;
        return obj3.equals(obj3) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((RetailBadge.f58066a.hashCode() + v7.g(this.f128208c, t61.a.a(this.f128206a.hashCode() * 31, 31, this.f128207b), 31)) * 31);
    }
}
