package wbg;

import com.revolut.feature.travel.hotels.impl.declaration.kompot.TravelHotelsRoomDetailsParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k0 extends m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelHotelsRoomDetailsParams f296184a;

    public k0(TravelHotelsRoomDetailsParams data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f296184a = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k0) && Intrinsics.f(this.f296184a, ((k0) obj2).f296184a);
    }

    public final int hashCode() {
        return this.f296184a.hashCode();
    }
}
