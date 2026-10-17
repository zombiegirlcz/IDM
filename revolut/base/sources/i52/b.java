package i52;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.models.transfers.ApmTransferDestination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferContract$InputData;
import com.revolut.feature.apm.core.ui.api.navigation.ApmTransferDirection;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferData;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models.TransferReviewInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmTransferDestination f158546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmTransferDirection f158547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmProduct f158548c;
    public final TransferReviewInfo d;
    public final TransferData e;
    public final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ApmTransferContract$InputData.FooterConfig f158549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f158550h;
    public final Clause i;

    public b(ApmTransferDestination destinationConfig, ApmTransferDirection direction, ApmProduct product, TransferReviewInfo reviewInfo, TransferData transferData, c cVar, ApmTransferContract$InputData.FooterConfig footerConfig, boolean z, Clause clause) {
        Intrinsics.checkNotNullParameter(destinationConfig, "destinationConfig");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        this.f158546a = destinationConfig;
        this.f158547b = direction;
        this.f158548c = product;
        this.d = reviewInfo;
        this.e = transferData;
        this.f = cVar;
        this.f158549g = footerConfig;
        this.f158550h = z;
        this.i = clause;
    }

    public static b a(b bVar, c cVar, Clause clause, int i) {
        ApmTransferDestination destinationConfig = bVar.f158546a;
        ApmTransferDirection direction = bVar.f158547b;
        ApmProduct product = bVar.f158548c;
        TransferReviewInfo reviewInfo = bVar.d;
        TransferData transferData = bVar.e;
        if ((i & 32) != 0) {
            cVar = bVar.f;
        }
        c cVar2 = cVar;
        ApmTransferContract$InputData.FooterConfig footerConfig = bVar.f158549g;
        boolean z = bVar.f158550h;
        if ((i & 256) != 0) {
            clause = bVar.i;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(destinationConfig, "destinationConfig");
        Intrinsics.checkNotNullParameter(direction, "direction");
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(reviewInfo, "reviewInfo");
        Intrinsics.checkNotNullParameter(transferData, "transferData");
        return new b(destinationConfig, direction, product, reviewInfo, transferData, cVar2, footerConfig, z, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f158546a, bVar.f158546a) && Intrinsics.f(this.f158547b, bVar.f158547b) && Intrinsics.f(this.f158548c, bVar.f158548c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f158549g, bVar.f158549g) && this.f158550h == bVar.f158550h && Intrinsics.f(this.i, bVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.f158548c.hashCode() + ((this.f158547b.hashCode() + (this.f158546a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        c cVar = this.f;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        ApmTransferContract$InputData.FooterConfig footerConfig = this.f158549g;
        int iC = j6.a.c((iHashCode2 + (footerConfig == null ? 0 : footerConfig.hashCode())) * 31, 31, this.f158550h);
        Clause clause = this.i;
        return iC + (clause != null ? clause.hashCode() : 0);
    }
}
