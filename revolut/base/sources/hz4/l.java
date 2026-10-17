package hz4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f157027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f157028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f157029c;

    public l(TextLocalisedClause title, TextLocalisedClause description, ResourceImage navigationIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f157027a = title;
        this.f157028b = description;
        this.f157029c = navigationIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f157027a.equals(lVar.f157027a) && this.f157028b.equals(lVar.f157028b) && this.f157029c.equals(lVar.f157029c);
    }

    public final int hashCode() {
        return this.f157029c.hashCode() + t61.a.a(this.f157027a.hashCode() * 31, 31, this.f157028b);
    }
}
