package jj9;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f174784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f174785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yx4.b f174786c;
    public final Image d;

    public d(MoneyClause title, CompositeClause description, yx4.b bVar, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f174784a = title;
        this.f174785b = description;
        this.f174786c = bVar;
        this.d = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f174784a.equals(dVar.f174784a) && this.f174785b.equals(dVar.f174785b) && Intrinsics.f(this.f174786c, dVar.f174786c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = h30.l.c(this.f174785b, this.f174784a.hashCode() * 31, 31);
        yx4.b bVar = this.f174786c;
        return this.d.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}
