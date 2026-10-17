package x23;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.CardPersonalisationView;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UrlImage f302470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f302471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f302472c;
    public final TextLocalisedClause d;
    public final CompositeClause e;
    public final CardPersonalisationView.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f302473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f302474h;
    public final LottieImage i;

    public h(UrlImage image, ArrayList points, int i, TextLocalisedClause movingHintLabel, CompositeClause pinToAdjustHintLabel, CardPersonalisationView.b toolsConfiguration, boolean z, boolean z3, LottieImage lottieImage) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(movingHintLabel, "movingHintLabel");
        Intrinsics.checkNotNullParameter(pinToAdjustHintLabel, "pinToAdjustHintLabel");
        Intrinsics.checkNotNullParameter(toolsConfiguration, "toolsConfiguration");
        this.f302470a = image;
        this.f302471b = points;
        this.f302472c = i;
        this.d = movingHintLabel;
        this.e = pinToAdjustHintLabel;
        this.f = toolsConfiguration;
        this.f302473g = z;
        this.f302474h = z3;
        this.i = lottieImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f302470a.equals(hVar.f302470a) && this.f302471b.equals(hVar.f302471b) && this.f302472c == hVar.f302472c && this.d.equals(hVar.d) && this.e.equals(hVar.e) && this.f.equals(hVar.f) && this.f302473g == hVar.f302473g && this.f302474h == hVar.f302474h && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c((this.f.hashCode() + h30.l.c(this.e, t61.a.a(j6.a.b(this.f302472c, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f302471b, this.f302470a.hashCode() * 31, 31), 31), 31, this.d), 31)) * 31, 31, this.f302473g), 31, this.f302474h);
        LottieImage lottieImage = this.i;
        return iC + (lottieImage == null ? 0 : lottieImage.hashCode());
    }
}
