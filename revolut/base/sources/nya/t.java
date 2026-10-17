package nya;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f220758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f220759b;

    public t(TextLocalisedClause text, ResourceImage image) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f220758a = text;
        this.f220759b = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return this.f220758a.equals(tVar.f220758a) && this.f220759b.equals(tVar.f220759b);
    }

    public final int hashCode() {
        return this.f220759b.hashCode() + (this.f220758a.hashCode() * 31);
    }
}
