package cw7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f109562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f109563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f109564c;

    public h(Image image, TextClause textClause, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f109562a = image;
        this.f109563b = textClause;
        this.f109564c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f109564c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f109562a, hVar.f109562a) && Intrinsics.f(this.f109563b, hVar.f109563b) && Intrinsics.f(this.f109564c, hVar.f109564c);
    }

    public final int hashCode() {
        Image image = this.f109562a;
        int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
        Clause clause = this.f109563b;
        return this.f109564c.hashCode() + ((iHashCode + (clause != null ? clause.hashCode() : 0)) * 31);
    }
}
