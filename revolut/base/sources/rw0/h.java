package rw0;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f257804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f257805b;

    public h(TextClause text, UrlImage urlImage) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f257804a = text;
        this.f257805b = urlImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f257804a.equals(hVar.f257804a) && Intrinsics.f(this.f257805b, hVar.f257805b);
    }

    public final int hashCode() {
        int iHashCode = this.f257804a.hashCode() * 31;
        Image image = this.f257805b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
