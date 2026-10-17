package vpl;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f291273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f291274b;

    public b(int i, Image backgroundImage) {
        Intrinsics.checkNotNullParameter(backgroundImage, "backgroundImage");
        this.f291273a = i;
        this.f291274b = backgroundImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f291273a == bVar.f291273a && Intrinsics.f(this.f291274b, bVar.f291274b);
    }

    public final int hashCode() {
        return this.f291274b.hashCode() + (Integer.hashCode(this.f291273a) * 31);
    }
}
