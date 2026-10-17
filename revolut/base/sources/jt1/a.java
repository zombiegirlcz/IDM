package jt1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumContact f178273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hrf.f f178274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BizumTransferData f178275c;
    public final b d;
    public final int e;

    public a(BizumContact recipient, hrf.f direction, BizumTransferData bizumTransferData, b extraData, int i) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f178273a = recipient;
        this.f178274b = direction;
        this.f178275c = bizumTransferData;
        this.d = extraData;
        this.e = i;
    }

    public static a a(a aVar, BizumTransferData bizumTransferData, b bVar, int i, int i2) {
        BizumContact recipient = aVar.f178273a;
        hrf.f direction = aVar.f178274b;
        if ((i2 & 4) != 0) {
            bizumTransferData = aVar.f178275c;
        }
        BizumTransferData bizumTransferData2 = bizumTransferData;
        if ((i2 & 8) != 0) {
            bVar = aVar.d;
        }
        b extraData = bVar;
        if ((i2 & 16) != 0) {
            i = aVar.e;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        return new a(recipient, direction, bizumTransferData2, extraData, i);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f178273a, aVar.f178273a) && this.f178274b == aVar.f178274b && Intrinsics.f(this.f178275c, aVar.f178275c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f178274b.hashCode() + (this.f178273a.hashCode() * 31)) * 31;
        BizumTransferData bizumTransferData = this.f178275c;
        return Integer.hashCode(this.e) + ((this.d.hashCode() + ((iHashCode + (bizumTransferData == null ? 0 : bizumTransferData.hashCode())) * 31)) * 31);
    }
}
