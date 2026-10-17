package em2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f127588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThemedBackgroundKey f127589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainerBackground f127590c;
    public final Image d;
    public final List e;

    public i(Clause name, ThemedBackgroundKey bgKey, NavBarWithContainerBackground background, Image icon, List list) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgKey, "bgKey");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f127588a = name;
        this.f127589b = bgKey;
        this.f127590c = background;
        this.d = icon;
        this.e = list;
    }

    public static i a(i iVar, NavBarWithContainerBackground background) {
        Clause name = iVar.f127588a;
        ThemedBackgroundKey bgKey = iVar.f127589b;
        Image icon = iVar.d;
        List list = iVar.e;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(bgKey, "bgKey");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new i(name, bgKey, background, icon, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f127588a, iVar.f127588a) && Intrinsics.f(this.f127589b, iVar.f127589b) && Intrinsics.f(this.f127590c, iVar.f127590c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.d, (this.f127590c.hashCode() + ((this.f127589b.hashCode() + (this.f127588a.hashCode() * 31)) * 31)) * 31, 31);
        List list = this.e;
        return iC + (list == null ? 0 : list.hashCode());
    }
}
