package j2f;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f170847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f170848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f170849c;

    public f(UrlImage avatarImage, TextLocalisedClause title, TextClause subtitle) {
        Intrinsics.checkNotNullParameter(avatarImage, "avatarImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f170847a = avatarImage;
        this.f170848b = title;
        this.f170849c = subtitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f170847a.equals(fVar.f170847a) && this.f170848b.equals(fVar.f170848b) && this.f170849c.equals(fVar.f170849c);
    }

    public final int hashCode() {
        return this.f170849c.hashCode() + t61.a.a(this.f170847a.hashCode() * 31, 31, this.f170848b);
    }
}
