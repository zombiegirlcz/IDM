package hcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lhcl/p;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "underlyingAssetType", "", "b", "Z", "()Z", "leveraged", "brand", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("underlyingAssetType")
    private final String underlyingAssetType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("leveraged")
    private final boolean leveraged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    private final String brand;

    public p(String str, String str2, boolean z) {
        this.underlyingAssetType = str;
        this.leveraged = z;
        this.brand = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getLeveraged() {
        return this.leveraged;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUnderlyingAssetType() {
        return this.underlyingAssetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.underlyingAssetType, pVar.underlyingAssetType) && this.leveraged == pVar.leveraged && Intrinsics.f(this.brand, pVar.brand);
    }

    public final int hashCode() {
        String str = this.underlyingAssetType;
        int iC = j6.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.leveraged);
        String str2 = this.brand;
        return iC + (str2 != null ? str2.hashCode() : 0);
    }
}
