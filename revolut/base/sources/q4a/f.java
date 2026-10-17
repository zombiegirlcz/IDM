package q4a;

import aw0.k9;
import com.revolut.data.model.Data;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f242096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f242097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f242098c;
    public final WhoToTransferFilter d;
    public final Data e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final k9 f242099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g f242100h;
    public final boolean i;

    public f(boolean z, boolean z3, String str, WhoToTransferFilter whoToTransferFilter, Data searchResults, boolean z4, k9 searchFieldExtraButtons, g paymentsSearchGridData, boolean z6) {
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        Intrinsics.checkNotNullParameter(paymentsSearchGridData, "paymentsSearchGridData");
        this.f242096a = z;
        this.f242097b = z3;
        this.f242098c = str;
        this.d = whoToTransferFilter;
        this.e = searchResults;
        this.f = z4;
        this.f242099g = searchFieldExtraButtons;
        this.f242100h = paymentsSearchGridData;
        this.i = z6;
    }

    public static f a(f fVar, boolean z, boolean z3, String str, WhoToTransferFilter whoToTransferFilter, Data data, boolean z4, k9 k9Var, g gVar, int i) {
        if ((i & 1) != 0) {
            z = fVar.f242096a;
        }
        boolean z6 = z;
        if ((i & 2) != 0) {
            z3 = fVar.f242097b;
        }
        boolean z11 = z3;
        if ((i & 4) != 0) {
            str = fVar.f242098c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            whoToTransferFilter = fVar.d;
        }
        WhoToTransferFilter whoToTransferFilter2 = whoToTransferFilter;
        if ((i & 16) != 0) {
            data = fVar.e;
        }
        Data searchResults = data;
        boolean z12 = (i & 32) != 0 ? fVar.f : z4;
        k9 searchFieldExtraButtons = (i & 64) != 0 ? fVar.f242099g : k9Var;
        g paymentsSearchGridData = (i & 128) != 0 ? fVar.f242100h : gVar;
        boolean z29 = (i & 256) != 0 ? fVar.i : true;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(searchFieldExtraButtons, "searchFieldExtraButtons");
        Intrinsics.checkNotNullParameter(paymentsSearchGridData, "paymentsSearchGridData");
        return new f(z6, z11, str2, whoToTransferFilter2, searchResults, z12, searchFieldExtraButtons, paymentsSearchGridData, z29);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f242096a == fVar.f242096a && this.f242097b == fVar.f242097b && Intrinsics.f(this.f242098c, fVar.f242098c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && this.f == fVar.f && Intrinsics.f(this.f242099g, fVar.f242099g) && Intrinsics.f(this.f242100h, fVar.f242100h) && this.i == fVar.i;
    }

    public final int hashCode() {
        int iC = j6.a.c(Boolean.hashCode(this.f242096a) * 31, 31, this.f242097b);
        String str = this.f242098c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        WhoToTransferFilter whoToTransferFilter = this.d;
        return Boolean.hashCode(this.i) + ((this.f242100h.hashCode() + ((this.f242099g.hashCode() + j6.a.c(kii.e.c(this.e, (iHashCode + (whoToTransferFilter != null ? whoToTransferFilter.hashCode() : 0)) * 31, 31), 31, this.f)) * 31)) * 31);
    }
}
