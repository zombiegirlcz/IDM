package wjh;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f298088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f298089b;

    public a(TextLocalisedClause title, Image image) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f298088a = title;
        this.f298089b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f298088a.equals(aVar.f298088a) && Intrinsics.f(this.f298089b, aVar.f298089b);
    }

    public final int hashCode() {
        return this.f298089b.hashCode() + (this.f298088a.hashCode() * 31);
    }
}
