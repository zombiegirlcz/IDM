package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ml extends ol {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f165397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f165398b;

    public ml(Image image, Integer num) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f165397a = image;
        this.f165398b = num;
    }

    @Override // ip0.ul
    public final Integer a() {
        return this.f165398b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ml)) {
            return false;
        }
        ml mlVar = (ml) obj2;
        return Intrinsics.f(this.f165397a, mlVar.f165397a) && this.f165398b.equals(mlVar.f165398b);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription */
    public final Clause getD() {
        return null;
    }

    public final int hashCode() {
        return this.f165398b.hashCode() + (this.f165397a.hashCode() * 961);
    }
}
