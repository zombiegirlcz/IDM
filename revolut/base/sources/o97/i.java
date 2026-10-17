package o97;

import java.io.Serializable;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f223108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f223109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f223110c;

    public i(List hints, Set placeholderIds, Set searchableIds) {
        Intrinsics.checkNotNullParameter(placeholderIds, "placeholderIds");
        Intrinsics.checkNotNullParameter(searchableIds, "searchableIds");
        Intrinsics.checkNotNullParameter(hints, "hints");
        this.f223108a = placeholderIds;
        this.f223109b = searchableIds;
        this.f223110c = hints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f223108a, iVar.f223108a) && Intrinsics.f(this.f223109b, iVar.f223109b) && Intrinsics.f(this.f223110c, iVar.f223110c);
    }

    public final int hashCode() {
        return this.f223110c.hashCode() + p.a.f(this.f223108a.hashCode() * 31, 31, this.f223109b);
    }
}
