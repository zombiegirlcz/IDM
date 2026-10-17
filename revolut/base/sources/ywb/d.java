package ywb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f317402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f317403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f317404c;

    public d() {
        this(0);
    }

    public static d a(d dVar, Data voucherProductGroupResponseData, Data userVoucherListData, String str, int i) {
        if ((i & 1) != 0) {
            voucherProductGroupResponseData = dVar.f317402a;
        }
        if ((i & 2) != 0) {
            userVoucherListData = dVar.f317403b;
        }
        if ((i & 4) != 0) {
            str = dVar.f317404c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(voucherProductGroupResponseData, "voucherProductGroupResponseData");
        Intrinsics.checkNotNullParameter(userVoucherListData, "userVoucherListData");
        return new d(voucherProductGroupResponseData, userVoucherListData, str);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f317402a, dVar.f317402a) && Intrinsics.f(this.f317403b, dVar.f317403b) && Intrinsics.f(this.f317404c, dVar.f317404c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f317403b, this.f317402a.hashCode() * 31, 31);
        String str = this.f317404c;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public d(Data voucherProductGroupResponseData, Data userVoucherListData, String str) {
        Intrinsics.checkNotNullParameter(voucherProductGroupResponseData, "voucherProductGroupResponseData");
        Intrinsics.checkNotNullParameter(userVoucherListData, "userVoucherListData");
        this.f317402a = voucherProductGroupResponseData;
        this.f317403b = userVoucherListData;
        this.f317404c = str;
    }

    public /* synthetic */ d(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null);
    }
}
