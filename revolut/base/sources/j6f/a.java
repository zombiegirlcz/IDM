package j6f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f171739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m6f.r f171740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f171741c;
    public final boolean d;

    public a() {
        this(0);
    }

    public static a a(a aVar, Data allocationItemsData, m6f.r selectedTab, Data data, boolean z, int i) {
        if ((i & 1) != 0) {
            allocationItemsData = aVar.f171739a;
        }
        if ((i & 2) != 0) {
            selectedTab = aVar.f171740b;
        }
        if ((i & 4) != 0) {
            data = aVar.f171741c;
        }
        if ((i & 8) != 0) {
            z = aVar.d;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(allocationItemsData, "allocationItemsData");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        return new a(allocationItemsData, selectedTab, data, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f171739a, aVar.f171739a) && this.f171740b == aVar.f171740b && Intrinsics.f(this.f171741c, aVar.f171741c) && this.d == aVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f171740b.hashCode() + (this.f171739a.hashCode() * 31)) * 31;
        Data data = this.f171741c;
        return Boolean.hashCode(this.d) + ((iHashCode + (data == null ? 0 : data.hashCode())) * 31);
    }

    public a(Data allocationItemsData, m6f.r selectedTab, Data data, boolean z) {
        Intrinsics.checkNotNullParameter(allocationItemsData, "allocationItemsData");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f171739a = allocationItemsData;
        this.f171740b = selectedTab;
        this.f171741c = data;
        this.d = z;
    }

    public /* synthetic */ a(int i) {
        this(new Data(null, null, false, 7, null), m6f.r.ASSETS, null, false);
    }
}
