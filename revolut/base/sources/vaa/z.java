package vaa;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f287219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f287220b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f287221c;

    public z(TextLocalisedClause title, LayeredImage layeredImage) {
        zhm.f0 menuItems = zhm.f0.f322471a;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f287219a = title;
        this.f287220b = menuItems;
        this.f287221c = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f287219a.equals(zVar.f287219a) && Intrinsics.f(this.f287220b, zVar.f287220b) && this.f287221c.equals(zVar.f287221c);
    }

    public final int hashCode() {
        return this.f287221c.hashCode() + p.a.d(this.f287219a.hashCode() * 961, 31, this.f287220b);
    }
}
