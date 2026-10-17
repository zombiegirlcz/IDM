package d6g;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f111531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f111532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f111533c;
    public final UrlImage d;

    public a(CompositeClause toolbarTitle, CompositeClause title, CompositeClause description, UrlImage backgroundImage) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.f111531a = toolbarTitle;
        this.f111532b = title;
        this.f111533c = description;
        this.d = backgroundImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f111531a.equals(aVar.f111531a) && this.f111532b.equals(aVar.f111532b) && this.f111533c.equals(aVar.f111533c) && this.d.equals(aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + l.c(this.f111533c, l.c(this.f111532b, this.f111531a.hashCode() * 31, 31), 31);
    }
}
