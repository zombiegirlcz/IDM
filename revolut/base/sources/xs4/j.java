package xs4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f308400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f308401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f308402c;
    public final boolean d;

    public j(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, ResourceImage navigationIcon, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        this.f308400a = title;
        this.f308401b = textLocalisedClause;
        this.f308402c = navigationIcon;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f308400a.equals(jVar.f308400a) && Intrinsics.f(this.f308401b, jVar.f308401b) && this.f308402c.equals(jVar.f308402c) && this.d == jVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f308400a.hashCode() * 31;
        Clause clause = this.f308401b;
        return Boolean.hashCode(this.d) + org.bouncycastle.jcajce.provider.digest.a.b(this.f308402c, (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31, 31);
    }
}
