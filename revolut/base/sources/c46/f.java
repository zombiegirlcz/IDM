package c46;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f21086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f21087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f21088c;
    public final Image d;
    public final Image e;

    public f(Clause clause, Clause title, TextLocalisedClause description, Image endIconImage, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endIconImage, "endIconImage");
        this.f21086a = clause;
        this.f21087b = title;
        this.f21088c = description;
        this.d = endIconImage;
        this.e = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f21086a, fVar.f21086a) && this.f21087b.equals(fVar.f21087b) && this.f21088c.equals(fVar.f21088c) && this.d.equals(fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        Clause clause = this.f21086a;
        int iC = a10.b.c(this.d, t61.a.a(p.a.b((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f21087b), 31, this.f21088c), 31);
        Image image = this.e;
        return iC + (image != null ? image.hashCode() : 0);
    }
}
