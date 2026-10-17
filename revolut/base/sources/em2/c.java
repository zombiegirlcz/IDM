package em2;

import aw0.s8;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import ehe.n;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f127574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LottieImage f127575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UrlImage f127576c;
    public final Color d;
    public final s8 e;

    public c(String id10, LottieImage animation, UrlImage thumbnailImage, Color averageColorForPalette, s8 paletteType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(animation, "animation");
        Intrinsics.checkNotNullParameter(thumbnailImage, "thumbnailImage");
        Intrinsics.checkNotNullParameter(averageColorForPalette, "averageColorForPalette");
        Intrinsics.checkNotNullParameter(paletteType, "paletteType");
        this.f127574a = id10;
        this.f127575b = animation;
        this.f127576c = thumbnailImage;
        this.d = averageColorForPalette;
        this.e = paletteType;
    }

    @Override // em2.e
    public final String a() {
        return this.f127574a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f127574a, cVar.f127574a) && this.f127575b.equals(cVar.f127575b) && this.f127576c.equals(cVar.f127576c) && this.d.equals(cVar.d) && this.e == cVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + n.d(this.d, v7.g(this.f127576c, (this.f127575b.hashCode() + (this.f127574a.hashCode() * 31)) * 31, 31), 31);
    }
}
