package t72;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f268411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f268412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f268413c;
    public final TextLocalisedClause d;

    public f(TextLocalisedClause title, TextLocalisedClause description, TextLocalisedClause action, Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f268411a = image;
        this.f268412b = title;
        this.f268413c = description;
        this.d = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f268411a.equals(fVar.f268411a) && this.f268412b.equals(fVar.f268412b) && this.f268413c.equals(fVar.f268413c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(t61.a.a(this.f268411a.hashCode() * 31, 31, this.f268412b), 31, this.f268413c);
    }
}
