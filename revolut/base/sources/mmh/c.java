package mmh;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nmh.a f207223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f207224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f207225c;
    public final Data d;

    public c(nmh.a assetType, Data data, boolean z, Data swipeableAssets) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(swipeableAssets, "swipeableAssets");
        this.f207223a = assetType;
        this.f207224b = data;
        this.f207225c = z;
        this.d = swipeableAssets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f207223a == cVar.f207223a && Intrinsics.f(this.f207224b, cVar.f207224b) && this.f207225c == cVar.f207225c && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f207223a.hashCode() * 31;
        Data data = this.f207224b;
        return this.d.hashCode() + j6.a.c((iHashCode + (data == null ? 0 : data.hashCode())) * 31, 31, this.f207225c);
    }
}
