package ft4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f137925a;

    public r(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f137925a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r) && this.f137925a.equals(((r) obj2).f137925a);
    }

    public final int hashCode() {
        return this.f137925a.hashCode();
    }
}
