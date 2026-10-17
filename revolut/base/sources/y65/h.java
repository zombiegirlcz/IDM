package y65;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f311160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f311161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f311162c;
    public final LayeredImage d;

    public h(MoneyClause title, TextLocalisedClause subtitle, TextLocalisedClause description, LayeredImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f311160a = title;
        this.f311161b = subtitle;
        this.f311162c = description;
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
        return this.f311160a.equals(hVar.f311160a) && this.f311161b.equals(hVar.f311161b) && this.f311162c.equals(hVar.f311162c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f311160a.hashCode() * 31, 31, this.f311161b), 31, this.f311162c);
    }
}
