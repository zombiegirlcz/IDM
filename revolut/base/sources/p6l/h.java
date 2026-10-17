package p6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0007\u001a\u0004\b\u0011\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t¨\u0006\u0014"}, d2 = {"Lp6l/h;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "isLocationSecurityEnabled", "()Ljava/lang/Boolean;", "b", "isMagstripeDisabled", "c", "isAtmWithdrawalsDisabled", "d", "isEcommerceDisabled", "e", "isContactlessDisabled", "f", "isPointOfSaleDisabled", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("locationSecurityEnabled")
    private final Boolean isLocationSecurityEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("magstripeDisabled")
    private final Boolean isMagstripeDisabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("atmWithdrawalsDisabled")
    private final Boolean isAtmWithdrawalsDisabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("ecommerceDisabled")
    private final Boolean isEcommerceDisabled;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("contactlessDisabled")
    private final Boolean isContactlessDisabled;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("pointOfSaleDisabled")
    private final Boolean isPointOfSaleDisabled;

    public h(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6) {
        this.isLocationSecurityEnabled = bool;
        this.isMagstripeDisabled = bool2;
        this.isAtmWithdrawalsDisabled = bool3;
        this.isEcommerceDisabled = bool4;
        this.isContactlessDisabled = bool5;
        this.isPointOfSaleDisabled = bool6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.isLocationSecurityEnabled, hVar.isLocationSecurityEnabled) && Intrinsics.f(this.isMagstripeDisabled, hVar.isMagstripeDisabled) && Intrinsics.f(this.isAtmWithdrawalsDisabled, hVar.isAtmWithdrawalsDisabled) && Intrinsics.f(this.isEcommerceDisabled, hVar.isEcommerceDisabled) && Intrinsics.f(this.isContactlessDisabled, hVar.isContactlessDisabled) && Intrinsics.f(this.isPointOfSaleDisabled, hVar.isPointOfSaleDisabled);
    }

    public final int hashCode() {
        Boolean bool = this.isLocationSecurityEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isMagstripeDisabled;
        int iHashCode2 = (iHashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isAtmWithdrawalsDisabled;
        int iHashCode3 = (iHashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isEcommerceDisabled;
        int iHashCode4 = (iHashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.isContactlessDisabled;
        int iHashCode5 = (iHashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.isPointOfSaleDisabled;
        return iHashCode5 + (bool6 != null ? bool6.hashCode() : 0);
    }
}
