package uag;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.home.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f278646a;

    public m(List roomsList) {
        Intrinsics.checkNotNullParameter(roomsList, "roomsList");
        this.f278646a = roomsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f278646a, ((m) obj2).f278646a);
    }

    public final int hashCode() {
        return this.f278646a.hashCode();
    }
}
