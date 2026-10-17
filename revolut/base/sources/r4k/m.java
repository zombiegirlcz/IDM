package r4k;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kq2.a f251483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kq2.f f251484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n61.d f251485c;
    public final boolean d;
    public final prf.g e;
    public final TransferTrustData f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f251486g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f251487h;
    public final j i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final n61.q f251488j;
    public final Clause k;

    public m(kq2.a aVar, kq2.f fVar, n61.d dVar, boolean z, prf.g countryData, TransferTrustData trustData, Map additionalInputConfigs, boolean z3, j bankTransferReviewType, n61.q qVar, Clause clause) {
        Intrinsics.checkNotNullParameter(countryData, "countryData");
        Intrinsics.checkNotNullParameter(trustData, "trustData");
        Intrinsics.checkNotNullParameter(additionalInputConfigs, "additionalInputConfigs");
        Intrinsics.checkNotNullParameter(bankTransferReviewType, "bankTransferReviewType");
        this.f251483a = aVar;
        this.f251484b = fVar;
        this.f251485c = dVar;
        this.d = z;
        this.e = countryData;
        this.f = trustData;
        this.f251486g = additionalInputConfigs;
        this.f251487h = z3;
        this.i = bankTransferReviewType;
        this.f251488j = qVar;
        this.k = clause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f251483a, mVar.f251483a) && Intrinsics.f(this.f251484b, mVar.f251484b) && Intrinsics.f(this.f251485c, mVar.f251485c) && this.d == mVar.d && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f251486g, mVar.f251486g) && this.f251487h == mVar.f251487h && this.i == mVar.i && Intrinsics.f(this.f251488j, mVar.f251488j) && Intrinsics.f(this.k, mVar.k);
    }

    public final int hashCode() {
        kq2.a aVar = this.f251483a;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        kq2.f fVar = this.f251484b;
        int iHashCode2 = (iHashCode + (fVar == null ? 0 : fVar.hashCode())) * 31;
        n61.d dVar = this.f251485c;
        int iHashCode3 = (this.i.hashCode() + j6.a.c(p.a.e((this.f.hashCode() + ((this.e.hashCode() + j6.a.c((iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d)) * 31)) * 31, 31, this.f251486g), 31, this.f251487h)) * 31;
        n61.q qVar = this.f251488j;
        int iHashCode4 = (iHashCode3 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Clause clause = this.k;
        return iHashCode4 + (clause != null ? clause.hashCode() : 0);
    }
}
