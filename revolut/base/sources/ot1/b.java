package ot1;

import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferData;
import com.revolut.feature.apm.bizum.impl.ui.transfer.transfer.BizumTransferReviewInfo;
import com.revolut.feature.apm.core.models.recipients.BizumContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BizumContact f229384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BizumTransferReviewInfo f229385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BizumTransferData f229386c;
    public final c d;

    public b(BizumContact recipient, BizumTransferReviewInfo reviewInfo, BizumTransferData transferData, c cVar) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f229384a = recipient;
        this.f229385b = reviewInfo;
        this.f229386c = transferData;
        this.d = cVar;
    }

    public static b a(b bVar, c cVar) {
        BizumContact recipient = bVar.f229384a;
        BizumTransferReviewInfo reviewInfo = bVar.f229385b;
        BizumTransferData transferData = bVar.f229386c;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        return new b(recipient, reviewInfo, transferData, cVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f229384a, bVar.f229384a) && Intrinsics.f(this.f229385b, bVar.f229385b) && Intrinsics.f(this.f229386c, bVar.f229386c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f229386c.hashCode() + ((this.f229385b.hashCode() + (this.f229384a.hashCode() * 31)) * 31)) * 31;
        c cVar = this.d;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }
}
