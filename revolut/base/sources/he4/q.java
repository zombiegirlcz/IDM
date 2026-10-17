package he4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f151589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f151590c;
    public final Clause d;
    public final Clause e;

    public q(TextLocalisedClause title, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, ResourceImage navigationIcon, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f151588a = items;
        this.f151589b = navigationIcon;
        this.f151590c = title;
        this.d = textLocalisedClause;
        this.e = textLocalisedClause2;
    }

    @Override // cli.p
    public final List c() {
        return this.f151588a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f151588a, qVar.f151588a) && this.f151589b.equals(qVar.f151589b) && this.f151590c.equals(qVar.f151590c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f151589b, this.f151588a.hashCode() * 31, 31), 31, this.f151590c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
