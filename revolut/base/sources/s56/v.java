package s56;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f259996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f259997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AvatarModel.Default f259998c;

    public v(TextClause title, TextClause textClause, AvatarModel.Default r4) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f259996a = title;
        this.f259997b = textClause;
        this.f259998c = r4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f259996a.equals(vVar.f259996a) && Intrinsics.f(this.f259997b, vVar.f259997b) && this.f259998c.equals(vVar.f259998c);
    }

    public final int hashCode() {
        int iHashCode = this.f259996a.hashCode() * 31;
        Clause clause = this.f259997b;
        return this.f259998c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
