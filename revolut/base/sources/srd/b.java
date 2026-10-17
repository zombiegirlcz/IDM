package srd;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LayeredImage f265163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f265164b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CompositeClause f265165c;

    public b(LayeredImage icon, TextClause title, CompositeClause compositeClause) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f265163a = icon;
        this.f265164b = title;
        this.f265165c = compositeClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f265163a.equals(bVar.f265163a) && this.f265164b.equals(bVar.f265164b) && this.f265165c.equals(bVar.f265165c);
    }

    public final int hashCode() {
        return this.f265165c.hashCode() + v7.b(this.f265163a.hashCode() * 31, 31, this.f265164b);
    }
}
