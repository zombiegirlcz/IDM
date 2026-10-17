package xgd;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f305683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f305684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f305685c;

    public m() {
        this(0);
    }

    public static m a(m mVar, Data watchlistsActionsInfo, List list, String str, int i) {
        if ((i & 1) != 0) {
            watchlistsActionsInfo = mVar.f305683a;
        }
        if ((i & 2) != 0) {
            list = mVar.f305684b;
        }
        if ((i & 4) != 0) {
            str = mVar.f305685c;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(watchlistsActionsInfo, "watchlistsActionsInfo");
        return new m(watchlistsActionsInfo, str, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f305683a, mVar.f305683a) && Intrinsics.f(this.f305684b, mVar.f305684b) && Intrinsics.f(this.f305685c, mVar.f305685c);
    }

    public final int hashCode() {
        int iHashCode = this.f305683a.hashCode() * 31;
        List list = this.f305684b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f305685c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public m(Data watchlistsActionsInfo, String str, List list) {
        Intrinsics.checkNotNullParameter(watchlistsActionsInfo, "watchlistsActionsInfo");
        this.f305683a = watchlistsActionsInfo;
        this.f305684b = list;
        this.f305685c = str;
    }

    public /* synthetic */ m(int i) {
        this(new Data(null, null, false, 7, null), null, null);
    }
}
