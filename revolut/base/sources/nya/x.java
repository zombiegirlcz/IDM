package nya;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f220764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f220765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f220766c;
    public final ArrayList d;

    public x(w layoutType, TextLocalisedClause goToButtonLabelClause, ResourceImage resourceImage, ArrayList items) {
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(goToButtonLabelClause, "goToButtonLabelClause");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220764a = layoutType;
        this.f220765b = goToButtonLabelClause;
        this.f220766c = resourceImage;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return this.f220764a.equals(xVar.f220764a) && this.f220765b.equals(xVar.f220765b) && Intrinsics.f(this.f220766c, xVar.f220766c) && this.d.equals(xVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(this.f220764a.hashCode() * 31, 31, this.f220765b);
        Image image = this.f220766c;
        return this.d.hashCode() + ((iA + (image == null ? 0 : image.hashCode())) * 31);
    }
}
