package hb0;

import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.EntitiesListItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendScreen f150540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EntitiesListItem f150541b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f150542c;
    public final int d;

    public h(BackendScreen screen, EntitiesListItem item, boolean z, int i) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f150540a = screen;
        this.f150541b = item;
        this.f150542c = z;
        this.d = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f150540a, hVar.f150540a) && Intrinsics.f(this.f150541b, hVar.f150541b) && this.f150542c == hVar.f150542c && this.d == hVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.c((this.f150541b.hashCode() + (this.f150540a.hashCode() * 31)) * 31, 31, this.f150542c);
    }
}
