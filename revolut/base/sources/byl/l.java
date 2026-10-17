package byl;

import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f19880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UrlImage f19881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f19882c;

    public l(UrlImage leftImage, UrlImage centerImage, UrlImage rightImage) {
        Intrinsics.checkNotNullParameter(leftImage, "leftImage");
        Intrinsics.checkNotNullParameter(centerImage, "centerImage");
        Intrinsics.checkNotNullParameter(rightImage, "rightImage");
        this.f19880a = leftImage;
        this.f19881b = centerImage;
        this.f19882c = rightImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f19880a.equals(lVar.f19880a) && this.f19881b.equals(lVar.f19881b) && this.f19882c.equals(lVar.f19882c);
    }

    public final int hashCode() {
        return this.f19882c.hashCode() + v7.g(this.f19881b, this.f19880a.hashCode() * 31, 31);
    }
}
