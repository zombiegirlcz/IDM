package ke4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f182996b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f182997c;
    public final Clause d;
    public final boolean e;
    public final TextLocalisedClause f;

    public o(aim.e items, ResourceImage navigationIcon, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, boolean z, TextLocalisedClause buttonText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f182995a = items;
        this.f182996b = navigationIcon;
        this.f182997c = title;
        this.d = textLocalisedClause;
        this.e = z;
        this.f = buttonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f182995a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f182995a, oVar.f182995a) && this.f182996b.equals(oVar.f182996b) && this.f182997c.equals(oVar.f182997c) && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e && this.f.equals(oVar.f);
    }

    public final int hashCode() {
        int iA = t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f182996b, this.f182995a.hashCode() * 31, 31), 31, this.f182997c);
        Clause clause = this.d;
        return this.f.hashCode() + j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
    }
}
