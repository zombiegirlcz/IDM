package ps9;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f239440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f239441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ImageWithAnimatedBackgroundView.Model f239442c;

    public q(TextClause title, CompositeClause compositeClause, ImageWithAnimatedBackgroundView.Model image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f239440a = title;
        this.f239441b = compositeClause;
        this.f239442c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f239440a.equals(qVar.f239440a) && Intrinsics.f(this.f239441b, qVar.f239441b) && this.f239442c.equals(qVar.f239442c);
    }

    public final int hashCode() {
        int iHashCode = this.f239440a.hashCode() * 31;
        Clause clause = this.f239441b;
        return this.f239442c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
