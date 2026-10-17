package tbj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u0006\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u0010\u0010\u0015R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u000e\u0010\u0019¨\u0006\u001b"}, d2 = {"Ltbj/f;", "", "", "toString", "()Ljava/lang/String;", "", "a", "J", "f", "()J", "updatedAt", "b", "Ljava/lang/String;", "addressId", "c", "address", "d", "e", "returnHash", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "netAmount", "Ltbj/e;", "Ltbj/e;", "()Ltbj/e;", "fee", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("updatedAt")
    private final long updatedAt;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("addressId")
    @NotNull
    private final String addressId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    private final String address;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("blockchainHash")
    private final String returnHash;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("netAmount")
    private final jo3.a netAmount;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("fee")
    private final e fee;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAddressId() {
        return this.addressId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.a getNetAmount() {
        return this.netAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getReturnHash() {
        return this.returnHash;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.updatedAt == fVar.updatedAt && Intrinsics.f(this.addressId, fVar.addressId) && Intrinsics.f(this.address, fVar.address) && Intrinsics.f(this.returnHash, fVar.returnHash) && Intrinsics.f(this.netAmount, fVar.netAmount) && Intrinsics.f(this.fee, fVar.fee);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }

    public final int hashCode() {
        int iC = p.a.c(Long.hashCode(this.updatedAt) * 31, 31, this.addressId);
        String str = this.address;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.returnHash;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        jo3.a aVar = this.netAmount;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        e eVar = this.fee;
        return iHashCode3 + (eVar != null ? eVar.hashCode() : 0);
    }
}
