package ly4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f200689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f200690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f200691c;

    public m(TextLocalisedClause title, TextLocalisedClause description, ResourceImage navigationIcon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f200689a = title;
        this.f200690b = description;
        this.f200691c = navigationIcon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return this.f200689a.equals(mVar.f200689a) && this.f200690b.equals(mVar.f200690b) && this.f200691c.equals(mVar.f200691c);
    }

    public final int hashCode() {
        return this.f200691c.hashCode() + t61.a.a(this.f200689a.hashCode() * 31, 31, this.f200690b);
    }
}
