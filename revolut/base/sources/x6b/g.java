package x6b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f303060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f303061b;

    public g(TextClause textClause, UrlImage urlImage) {
        this.f303060a = textClause;
        this.f303061b = urlImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f303060a, gVar.f303060a) && Intrinsics.f(this.f303061b, gVar.f303061b);
    }

    public final int hashCode() {
        Clause clause = this.f303060a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Image image = this.f303061b;
        return iHashCode + (image != null ? image.hashCode() : 0);
    }
}
