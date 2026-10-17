package i09;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends com.revolut.feature.learn.shared.impl.ui.course.overview.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f157327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f157328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f157329c;
    public final Clause d;
    public final com.revolut.feature.learn.shared.impl.ui.course.overview.c e;
    public final UrlImage f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f157330g;

    public j(TextClause title, TextClause description, ResourceImage resourceImage, Clause clause, com.revolut.feature.learn.shared.impl.ui.course.overview.c progress, UrlImage image, f0 menuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(progress, "progress");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f157327a = title;
        this.f157328b = description;
        this.f157329c = resourceImage;
        this.d = clause;
        this.e = progress;
        this.f = image;
        this.f157330g = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f157327a.equals(jVar.f157327a) && this.f157328b.equals(jVar.f157328b) && Intrinsics.f(this.f157329c, jVar.f157329c) && Intrinsics.f(this.d, jVar.d) && this.e.equals(jVar.e) && this.f.equals(jVar.f) && Intrinsics.f(this.f157330g, jVar.f157330g);
    }

    public final int hashCode() {
        int iB = v7.b(this.f157327a.hashCode() * 31, 31, this.f157328b);
        Image image = this.f157329c;
        int iHashCode = (iB + (image == null ? 0 : image.hashCode())) * 31;
        Clause clause = this.d;
        return this.f157330g.hashCode() + v7.g(this.f, (this.e.hashCode() + ((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31)) * 31, 31);
    }
}
