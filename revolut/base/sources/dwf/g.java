package dwf;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f120378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f120379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f120380c;
    public final LayeredImage d;

    public g(TextClause title, CompositeClause description, TextClause textClause, LayeredImage image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f120378a = title;
        this.f120379b = description;
        this.f120380c = textClause;
        this.d = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f120378a.equals(gVar.f120378a) && this.f120379b.equals(gVar.f120379b) && Intrinsics.f(this.f120380c, gVar.f120380c) && this.d.equals(gVar.d);
    }

    public final int hashCode() {
        int iC = h30.l.c(this.f120379b, this.f120378a.hashCode() * 31, 31);
        Clause clause = this.f120380c;
        return this.d.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
