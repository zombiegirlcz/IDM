package m37;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f202291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f202292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f202293c;

    public a(TextLocalisedClause title, TextLocalisedClause description, ResourceImage icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f202291a = title;
        this.f202292b = description;
        this.f202293c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f202291a.equals(aVar.f202291a) && this.f202292b.equals(aVar.f202292b) && this.f202293c.equals(aVar.f202293c);
    }

    public final int hashCode() {
        return this.f202293c.hashCode() + t61.a.a(this.f202291a.hashCode() * 31, 31, this.f202292b);
    }
}
