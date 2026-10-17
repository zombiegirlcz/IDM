package mx0;

import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CdnImage f209604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f209605b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f209606c;

    public b7(CdnImage image, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.f209604a = image;
        this.f209605b = num;
        this.f209606c = num2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b7)) {
            return false;
        }
        b7 b7Var = (b7) obj2;
        return this.f209604a.equals(b7Var.f209604a) && this.f209605b.equals(b7Var.f209605b) && this.f209606c.equals(b7Var.f209606c);
    }

    public final int hashCode() {
        return this.f209606c.hashCode() + ((this.f209605b.hashCode() + (this.f209604a.hashCode() * 31)) * 31);
    }
}
