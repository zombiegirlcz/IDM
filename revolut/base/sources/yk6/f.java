package yk6;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f314581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f314582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f314583c;

    public f(Image image, TextClause actionStatusLabel, MoneyClause title) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(actionStatusLabel, "actionStatusLabel");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f314581a = image;
        this.f314582b = actionStatusLabel;
        this.f314583c = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f314581a.equals(fVar.f314581a) && this.f314582b.equals(fVar.f314582b) && this.f314583c.equals(fVar.f314583c);
    }

    public final int hashCode() {
        return this.f314583c.hashCode() + v7.b(this.f314581a.hashCode() * 31, 31, this.f314582b);
    }
}
