package ezk;

import cli.j;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f130974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f130975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f130976c;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data freeStocksCampaign, Data instruments, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            freeStocksCampaign = aVar.f130974a;
        }
        if ((i & 2) != 0) {
            instruments = aVar.f130975b;
        }
        List list = arrayList;
        if ((i & 4) != 0) {
            list = aVar.f130976c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(freeStocksCampaign, "freeStocksCampaign");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        return new a(freeStocksCampaign, instruments, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f130974a, aVar.f130974a) && Intrinsics.f(this.f130975b, aVar.f130975b) && Intrinsics.f(this.f130976c, aVar.f130976c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f130975b, this.f130974a.hashCode() * 31, 31);
        List list = this.f130976c;
        return iC + (list == null ? 0 : list.hashCode());
    }

    public a(Data freeStocksCampaign, Data instruments, List list) {
        Intrinsics.checkNotNullParameter(freeStocksCampaign, "freeStocksCampaign");
        Intrinsics.checkNotNullParameter(instruments, "instruments");
        this.f130974a = freeStocksCampaign;
        this.f130975b = instruments;
        this.f130976c = list;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null);
    }
}
