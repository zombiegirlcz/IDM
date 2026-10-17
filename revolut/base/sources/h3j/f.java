package h3j;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f149148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f149149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f149150c;

    public f(TextClause title, Clause clause, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f149148a = title;
        this.f149149b = clause;
        this.f149150c = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f149148a.equals(fVar.f149148a) && this.f149149b.equals(fVar.f149149b) && Intrinsics.f(this.f149150c, fVar.f149150c);
    }

    public final int hashCode() {
        return this.f149150c.hashCode() + p.a.b(this.f149148a.hashCode() * 31, 31, this.f149149b);
    }
}
