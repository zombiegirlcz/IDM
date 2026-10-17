package tbj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011¨\u0006\u0013"}, d2 = {"Ltbj/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "pocketId", "b", "address", "c", "e", "tag", "blockchain", "", "Z", "()Z", "directDepositSupported", "feature_crypto_deposits_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketId")
    @NotNull
    private final String pocketId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("address")
    @NotNull
    private final String address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("destinationTag")
    private final String tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("blockchain")
    private final String blockchain;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("directDepositSupported")
    private final boolean directDepositSupported;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getBlockchain() {
        return this.blockchain;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getDirectDepositSupported() {
        return this.directDepositSupported;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPocketId() {
        return this.pocketId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.pocketId, cVar.pocketId) && Intrinsics.f(this.address, cVar.address) && Intrinsics.f(this.tag, cVar.tag) && Intrinsics.f(this.blockchain, cVar.blockchain) && this.directDepositSupported == cVar.directDepositSupported;
    }

    public final int hashCode() {
        int iC = p.a.c(this.pocketId.hashCode() * 31, 31, this.address);
        String str = this.tag;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.blockchain;
        return Boolean.hashCode(this.directDepositSupported) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
