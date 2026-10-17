package yxg;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f317687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f317688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayeredImage f317689c;
    public final List d;

    public f(TextLocalisedClause title, CompositeClause compositeClause, LayeredImage endImage, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f317687a = title;
        this.f317688b = compositeClause;
        this.f317689c = endImage;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f317687a.equals(fVar.f317687a) && Intrinsics.f(this.f317688b, fVar.f317688b) && this.f317689c.equals(fVar.f317689c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f317687a.hashCode() * 31;
        Clause clause = this.f317688b;
        return this.d.hashCode() + l.e(this.f317689c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
