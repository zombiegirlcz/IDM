package cea;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f23448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f23449b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f23450c;

    public l(TextLocalisedClause title, Clause subtitle, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f23448a = title;
        this.f23449b = subtitle;
        this.f23450c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f23448a.equals(lVar.f23448a) && Intrinsics.f(this.f23449b, lVar.f23449b) && this.f23450c.equals(lVar.f23450c);
    }

    public final int hashCode() {
        return this.f23450c.hashCode() + p.a.a(this.f23448a.hashCode() * 31, 31, this.f23449b);
    }
}
