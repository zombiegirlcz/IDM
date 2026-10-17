package ea4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f124140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f124141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f124142c;
    public final Clause d;
    public final Clause e;
    public final TextLocalisedClause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f124143g;

    public s(ArrayList items, ResourceImage navigationIcon, TextLocalisedClause title, CompositeClause compositeClause, TextLocalisedClause textLocalisedClause, TextLocalisedClause buttonTitle, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f124140a = items;
        this.f124141b = navigationIcon;
        this.f124142c = title;
        this.d = compositeClause;
        this.e = textLocalisedClause;
        this.f = buttonTitle;
        this.f124143g = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f124140a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f124140a.equals(sVar.f124140a) && this.f124141b.equals(sVar.f124141b) && this.f124142c.equals(sVar.f124142c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e) && this.f.equals(sVar.f) && this.f124143g == sVar.f124143g;
    }

    public final int hashCode() {
        int iA = t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f124141b, this.f124140a.hashCode() * 31, 31), 31, this.f124142c);
        Clause clause = this.d;
        int iHashCode = (iA + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return Boolean.hashCode(this.f124143g) + t61.a.a((iHashCode + (clause2 != null ? clause2.hashCode() : 0)) * 31, 31, this.f);
    }
}
