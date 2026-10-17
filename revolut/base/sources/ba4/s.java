package ba4;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class s implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f13908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f13909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f13910c;
    public final CompositeClause d;
    public final TextLocalisedClause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13911g;

    public s(aim.e items, ResourceImage navigationIcon, TextLocalisedClause title, CompositeClause description, TextLocalisedClause buttonTitle, TextLocalisedClause textLocalisedClause, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f13908a = items;
        this.f13909b = navigationIcon;
        this.f13910c = title;
        this.d = description;
        this.e = buttonTitle;
        this.f = textLocalisedClause;
        this.f13911g = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f13908a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f13908a, sVar.f13908a) && this.f13909b.equals(sVar.f13909b) && this.f13910c.equals(sVar.f13910c) && this.d.equals(sVar.d) && this.e.equals(sVar.e) && Intrinsics.f(this.f, sVar.f) && this.f13911g == sVar.f13911g;
    }

    public final int hashCode() {
        int iA = t61.a.a(h30.l.c(this.d, t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f13909b, this.f13908a.hashCode() * 31, 31), 31, this.f13910c), 31), 31, this.e);
        Clause clause = this.f;
        return Boolean.hashCode(this.f13911g) + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
