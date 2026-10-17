package obg;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f223945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f223946b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f223947c;

    public l(TextClause title, TextLocalisedClause description, ResourceImage descriptionImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionImage, "descriptionImage");
        this.f223945a = title;
        this.f223946b = description;
        this.f223947c = descriptionImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f223945a.equals(lVar.f223945a) && this.f223946b.equals(lVar.f223946b) && this.f223947c.equals(lVar.f223947c);
    }

    public final int hashCode() {
        return this.f223947c.hashCode() + t61.a.a(this.f223945a.hashCode() * 31, 31, this.f223946b);
    }
}
