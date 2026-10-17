package p68;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f233227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f233228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f233229c;
    public final Clause d;
    public final Clause e;

    public g(List items, ResourceImage navBarNavigationImage, TextLocalisedClause title, TextLocalisedClause textLocalisedClause, Clause buttonText) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarNavigationImage, "navBarNavigationImage");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f233227a = items;
        this.f233228b = navBarNavigationImage;
        this.f233229c = title;
        this.d = textLocalisedClause;
        this.e = buttonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f233227a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f233227a.equals(gVar.f233227a) && this.f233228b.equals(gVar.f233228b) && this.f233229c.equals(gVar.f233229c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iA = t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f233228b, this.f233227a.hashCode() * 31, 31), 31, this.f233229c);
        Clause clause = this.d;
        return this.e.hashCode() + ((iA + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
