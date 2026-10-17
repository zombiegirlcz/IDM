package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j10 extends c8g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f164777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f164778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f164779c;

    public j10(TextLocalisedClause title, TextLocalisedClause subtitle, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f164777a = title;
        this.f164778b = subtitle;
        this.f164779c = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j10)) {
            return false;
        }
        j10 j10Var = (j10) obj2;
        return this.f164777a.equals(j10Var.f164777a) && this.f164778b.equals(j10Var.f164778b) && this.f164779c.equals(j10Var.f164779c);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + org.bouncycastle.jcajce.provider.digest.a.b(this.f164779c, t61.a.a(this.f164777a.hashCode() * 31, 31, this.f164778b), 31);
    }

    @Override // c8g.a
    public final Clause u() {
        return this.f164777a;
    }
}
