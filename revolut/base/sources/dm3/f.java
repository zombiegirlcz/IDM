package dm3;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f115834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f115835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarModel.Default f115836c;

    public f(TextClause title, TextClause textClause, AvatarModel.Default icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f115834a = title;
        this.f115835b = textClause;
        this.f115836c = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f115834a.equals(fVar.f115834a) && Intrinsics.f(this.f115835b, fVar.f115835b) && this.f115836c.equals(fVar.f115836c);
    }

    public final int hashCode() {
        int iHashCode = this.f115834a.hashCode() * 31;
        Clause clause = this.f115835b;
        return this.f115836c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
