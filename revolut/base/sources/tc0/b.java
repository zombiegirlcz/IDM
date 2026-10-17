package tc0;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f269564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f269565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f269566c;

    public b(TextClause textClause, List items) {
        ResourceImage navigationImage = new ResourceImage(R$drawable.uikit_icn_24_back_button_arrow, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationImage, "navigationImage");
        this.f269564a = textClause;
        this.f269565b = items;
        this.f269566c = navigationImage;
    }

    @Override // cli.p
    public final List c() {
        return this.f269565b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f269564a, bVar.f269564a) && Intrinsics.f(this.f269565b, bVar.f269565b) && Intrinsics.f(this.f269566c, bVar.f269566c);
    }

    public final int hashCode() {
        Clause clause = this.f269564a;
        return this.f269566c.hashCode() + p.a.d((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f269565b);
    }
}
