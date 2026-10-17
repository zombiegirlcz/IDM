package ueg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a0 extends com.revolut.feature.travel.hotels.impl.ui_kompot.screen.search_results.map.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f279362a;

    public a0(List roomsList) {
        Intrinsics.checkNotNullParameter(roomsList, "roomsList");
        this.f279362a = roomsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a0) && Intrinsics.f(this.f279362a, ((a0) obj2).f279362a);
    }

    public final int hashCode() {
        return this.f279362a.hashCode();
    }
}
