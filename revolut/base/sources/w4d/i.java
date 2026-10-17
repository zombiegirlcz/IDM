package w4d;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f294550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f294552c;

    public i(NavBarWithContainerBackground background, String currentSelectedOptionId, ArrayList options) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(currentSelectedOptionId, "currentSelectedOptionId");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f294550a = background;
        this.f294551b = currentSelectedOptionId;
        this.f294552c = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f294550a, iVar.f294550a) && Intrinsics.f(this.f294551b, iVar.f294551b) && this.f294552c.equals(iVar.f294552c);
    }

    public final int hashCode() {
        return this.f294552c.hashCode() + p.a.c(this.f294550a.hashCode() * 31, 31, this.f294551b);
    }
}
