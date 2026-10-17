package imk;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f162548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f162549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f162550c;
    public final com.revolut.core.ui_kit.models.l d;

    public v(TextLocalisedClause title, Image image, boolean z, com.revolut.core.ui_kit.models.l theme) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(theme, "theme");
        this.f162548a = title;
        this.f162549b = image;
        this.f162550c = z;
        this.d = theme;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f162548a.equals(vVar.f162548a) && Intrinsics.f(this.f162549b, vVar.f162549b) && this.f162550c == vVar.f162550c && this.d == vVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f162548a.hashCode() * 31;
        Image image = this.f162549b;
        return this.d.hashCode() + j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f162550c);
    }
}
