package ip0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class rg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f166181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f166182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f166183c;
    public final boolean d;

    public rg(Clause buttonText, Image image, LargeActionButton.ButtonStyle buttonStyle, boolean z) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
        this.f166181a = buttonText;
        this.f166182b = image;
        this.f166183c = buttonStyle;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rg)) {
            return false;
        }
        rg rgVar = (rg) obj2;
        return this.f166181a.equals(rgVar.f166181a) && Intrinsics.f(this.f166182b, rgVar.f166182b) && Intrinsics.f(this.f166183c, rgVar.f166183c) && this.d == rgVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f166181a.hashCode() * 31;
        Image image = this.f166182b;
        return Boolean.hashCode(this.d) + r6.b.d(this.f166183c, (iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31);
    }
}
