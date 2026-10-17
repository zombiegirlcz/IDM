package vag;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d extends com.revolut.feature.travel.hotels.impl.ui_kompot.flow.property.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f287288a;

    public d(List roomsList) {
        Intrinsics.checkNotNullParameter(roomsList, "roomsList");
        this.f287288a = roomsList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f287288a, ((d) obj2).f287288a);
    }

    public final int hashCode() {
        return this.f287288a.hashCode();
    }
}
