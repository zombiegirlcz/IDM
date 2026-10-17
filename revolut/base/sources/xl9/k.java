package xl9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f306963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f306964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlVideo f306965c;
    public final List d;
    public final aw0.e e;

    public k(TextLocalisedClause textLocalisedClause, TextLocalisedClause description, UrlVideo background, aim.e items, aw0.e footer) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f306963a = textLocalisedClause;
        this.f306964b = description;
        this.f306965c = background;
        this.d = items;
        this.e = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f306963a.equals(kVar.f306963a) && this.f306964b.equals(kVar.f306964b) && this.f306965c.equals(kVar.f306965c) && Intrinsics.f(this.d, kVar.d) && this.e.equals(kVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d((this.f306965c.hashCode() + t61.a.a(this.f306963a.hashCode() * 31, 31, this.f306964b)) * 31, 31, this.d);
    }
}
