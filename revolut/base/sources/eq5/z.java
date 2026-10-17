package eq5;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f128355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f128356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarModel.Default f128357c;

    public z(TextClause title, TextClause textClause, AvatarModel.Default r4) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f128355a = title;
        this.f128356b = textClause;
        this.f128357c = r4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z)) {
            return false;
        }
        z zVar = (z) obj2;
        return this.f128355a.equals(zVar.f128355a) && Intrinsics.f(this.f128356b, zVar.f128356b) && Intrinsics.f(this.f128357c, zVar.f128357c);
    }

    public final int hashCode() {
        int iHashCode = this.f128355a.hashCode() * 31;
        Clause clause = this.f128356b;
        int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
        AvatarModel.Default r2 = this.f128357c;
        return iHashCode2 + (r2 != null ? r2.hashCode() : 0);
    }
}
