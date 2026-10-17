package ieg;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.r0;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f160720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f160721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f160722c;
    public final xag.c d;

    public m() {
        this(0);
    }

    public static m a(m mVar, Data draft, Data roomsListMap, Map userRoomOccupancySelectionMap, xag.c filters, int i) {
        if ((i & 1) != 0) {
            draft = mVar.f160720a;
        }
        if ((i & 2) != 0) {
            roomsListMap = mVar.f160721b;
        }
        if ((i & 4) != 0) {
            userRoomOccupancySelectionMap = mVar.f160722c;
        }
        if ((i & 8) != 0) {
            filters = mVar.d;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(roomsListMap, "roomsListMap");
        Intrinsics.checkNotNullParameter(userRoomOccupancySelectionMap, "userRoomOccupancySelectionMap");
        Intrinsics.checkNotNullParameter(filters, "filters");
        return new m(draft, roomsListMap, userRoomOccupancySelectionMap, filters);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f160720a, mVar.f160720a) && Intrinsics.f(this.f160721b, mVar.f160721b) && Intrinsics.f(this.f160722c, mVar.f160722c) && Intrinsics.f(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.e(kii.e.c(this.f160721b, this.f160720a.hashCode() * 31, 31), 31, this.f160722c);
    }

    public m(Data draft, Data roomsListMap, Map userRoomOccupancySelectionMap, xag.c filters) {
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(roomsListMap, "roomsListMap");
        Intrinsics.checkNotNullParameter(userRoomOccupancySelectionMap, "userRoomOccupancySelectionMap");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f160720a = draft;
        this.f160721b = roomsListMap;
        this.f160722c = userRoomOccupancySelectionMap;
        this.d = filters;
    }

    public m(int i) {
        Data data = new Data(null, null, false, 7, null);
        Data data2 = new Data(null, null, false, 7, null);
        Map mapG = r0.g();
        r.Companion.getClass();
        this(data, data2, mapG, l.f160719b);
    }
}
