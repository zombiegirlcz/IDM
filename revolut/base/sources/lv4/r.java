package lv4;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f200308a;

    public r(TextLocalisedClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        q parcel = q.f200307a;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        this.f200308a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r) || !this.f200308a.equals(((r) obj2).f200308a)) {
            return false;
        }
        Object obj3 = q.f200307a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return q.f200307a.hashCode() + (this.f200308a.hashCode() * 31);
    }
}
