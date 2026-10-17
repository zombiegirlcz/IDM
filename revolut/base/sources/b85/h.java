package b85;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f13099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f13100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TimeClause f13101c;
    public final LayeredImage d;

    public h(MoneyClause title, TextLocalisedClause subtitle, TimeClause description, LayeredImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f13099a = title;
        this.f13100b = subtitle;
        this.f13101c = description;
        this.d = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f13099a.equals(hVar.f13099a) && this.f13100b.equals(hVar.f13100b) && this.f13101c.equals(hVar.f13101c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h30.l.d(this.f13101c, t61.a.a(this.f13099a.hashCode() * 31, 31, this.f13100b), 31);
    }
}
