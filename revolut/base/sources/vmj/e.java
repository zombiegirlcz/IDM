package vmj;

import com.revolut.core.ui_kit_core.displayers.image.models.QrCodeImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final QrCodeImage f290604a;

    public e(QrCodeImage image) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f290604a = image;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f290604a, ((e) obj2).f290604a);
    }

    public final int hashCode() {
        return this.f290604a.hashCode();
    }
}
