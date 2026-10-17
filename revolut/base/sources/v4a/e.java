package v4a;

import com.revolut.data.model.Data;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f285997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f285998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WhoToTransferFilter f285999c;
    public final WhoToTransferActionItem d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f286000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3a.c f286001h;

    public e(String str, Data searchResults, WhoToTransferFilter whoToTransferFilter, WhoToTransferActionItem whoToTransferActionItem, boolean z, boolean z3, boolean z4, m3a.c transferFeatures) {
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(transferFeatures, "transferFeatures");
        this.f285997a = str;
        this.f285998b = searchResults;
        this.f285999c = whoToTransferFilter;
        this.d = whoToTransferActionItem;
        this.e = z;
        this.f = z3;
        this.f286000g = z4;
        this.f286001h = transferFeatures;
    }

    public static e a(e eVar, String str, Data data, WhoToTransferFilter whoToTransferFilter, WhoToTransferActionItem whoToTransferActionItem, boolean z, boolean z3, m3a.c cVar, int i) {
        if ((i & 1) != 0) {
            str = eVar.f285997a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            data = eVar.f285998b;
        }
        Data searchResults = data;
        if ((i & 4) != 0) {
            whoToTransferFilter = eVar.f285999c;
        }
        WhoToTransferFilter whoToTransferFilter2 = whoToTransferFilter;
        if ((i & 8) != 0) {
            whoToTransferActionItem = eVar.d;
        }
        WhoToTransferActionItem whoToTransferActionItem2 = whoToTransferActionItem;
        boolean z4 = eVar.e;
        if ((i & 32) != 0) {
            z = eVar.f;
        }
        boolean z6 = z;
        if ((i & 64) != 0) {
            z3 = eVar.f286000g;
        }
        boolean z11 = z3;
        m3a.c transferFeatures = (i & 128) != 0 ? eVar.f286001h : cVar;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(transferFeatures, "transferFeatures");
        return new e(str2, searchResults, whoToTransferFilter2, whoToTransferActionItem2, z4, z6, z11, transferFeatures);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f285997a, eVar.f285997a) && Intrinsics.f(this.f285998b, eVar.f285998b) && Intrinsics.f(this.f285999c, eVar.f285999c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && this.f286000g == eVar.f286000g && Intrinsics.f(this.f286001h, eVar.f286001h);
    }

    public final int hashCode() {
        String str = this.f285997a;
        int iC = kii.e.c(this.f285998b, (str == null ? 0 : str.hashCode()) * 31, 31);
        WhoToTransferFilter whoToTransferFilter = this.f285999c;
        int iHashCode = (iC + (whoToTransferFilter == null ? 0 : whoToTransferFilter.hashCode())) * 31;
        WhoToTransferActionItem whoToTransferActionItem = this.d;
        return this.f286001h.hashCode() + j6.a.c(j6.a.c(j6.a.c((iHashCode + (whoToTransferActionItem != null ? whoToTransferActionItem.hashCode() : 0)) * 31, 31, this.e), 31, this.f), 31, this.f286000g);
    }
}
