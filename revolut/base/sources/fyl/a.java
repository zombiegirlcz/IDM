package fyl;

import iyl.d;
import koi.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f139061a;

    public a(d globeModel) {
        Intrinsics.checkNotNullParameter("GM_GLOBE_LIST_ID", "listId");
        Intrinsics.checkNotNullParameter(globeModel, "globeModel");
        this.f139061a = globeModel;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF53816a() {
        return "GM_GLOBE_LIST_ID";
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f139061a.equals(((a) obj2).f139061a);
    }

    public final int hashCode() {
        return this.f139061a.hashCode() + 582538703;
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (oldItem instanceof a) {
            return new b(!((a) oldItem).f139061a.equals(this.f139061a));
        }
        return null;
    }
}
