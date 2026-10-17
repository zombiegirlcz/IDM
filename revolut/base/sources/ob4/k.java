package ob4;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f223882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f223883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f223884c;
    public final Clause d;
    public final Clause e;

    public k(ArrayList items, ResourceImage navigationIcon, TextLocalisedClause title, CompositeClause compositeClause, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f223882a = items;
        this.f223883b = navigationIcon;
        this.f223884c = title;
        this.d = compositeClause;
        this.e = textLocalisedClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f223882a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f223882a.equals(kVar.f223882a) && this.f223883b.equals(kVar.f223883b) && this.f223884c.equals(kVar.f223884c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f223883b, this.f223882a.hashCode() * 31, 31), 31, this.f223884c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
