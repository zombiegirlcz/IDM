package lpl;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f199151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f199152b;

    public f(TextClause title, UrlImage icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f199151a = title;
        this.f199152b = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f199151a.equals(fVar.f199151a) && this.f199152b.equals(fVar.f199152b);
    }

    public final int hashCode() {
        return this.f199152b.hashCode() + (this.f199151a.hashCode() * 31);
    }
}
