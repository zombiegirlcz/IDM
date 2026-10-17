package ahg;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f5115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f5116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f5117c;

    public f(UrlImage avatarImage, TextLocalisedClause title, TextClause subtitle) {
        Intrinsics.checkNotNullParameter(avatarImage, "avatarImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f5115a = avatarImage;
        this.f5116b = title;
        this.f5117c = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f5115a.equals(fVar.f5115a) && this.f5116b.equals(fVar.f5116b) && this.f5117c.equals(fVar.f5117c);
    }

    public final int hashCode() {
        return this.f5117c.hashCode() + t61.a.a(this.f5115a.hashCode() * 31, 31, this.f5116b);
    }
}
