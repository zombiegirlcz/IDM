package u6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\n\u0010\bR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0011\u0010\bR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0007\u001a\u0004\b\u000e\u0010\b¨\u0006\u0014"}, d2 = {"Lu6l/m;", "", "", "toString", "()Ljava/lang/String;", "Lu6l/l;", "a", "Lu6l/l;", "()Lu6l/l;", "atmWithdrawal", "b", "c", "ecommerce", "contactless", "d", "f", "pointOfSale", "e", "magstripe", "locationSecurity", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("atmWithdrawal")
    private final l atmWithdrawal;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("ecommerce")
    private final l ecommerce;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("contactless")
    private final l contactless;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("pointOfSale")
    private final l pointOfSale;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("magstripe")
    private final l magstripe;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("locationSecurity")
    private final l locationSecurity;

    public m(l lVar, l lVar2, l lVar3, l lVar4, l lVar5, l lVar6) {
        this.atmWithdrawal = lVar;
        this.ecommerce = lVar2;
        this.contactless = lVar3;
        this.pointOfSale = lVar4;
        this.magstripe = lVar5;
        this.locationSecurity = lVar6;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getAtmWithdrawal() {
        return this.atmWithdrawal;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final l getContactless() {
        return this.contactless;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final l getEcommerce() {
        return this.ecommerce;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final l getLocationSecurity() {
        return this.locationSecurity;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getMagstripe() {
        return this.magstripe;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.atmWithdrawal, mVar.atmWithdrawal) && Intrinsics.f(this.ecommerce, mVar.ecommerce) && Intrinsics.f(this.contactless, mVar.contactless) && Intrinsics.f(this.pointOfSale, mVar.pointOfSale) && Intrinsics.f(this.magstripe, mVar.magstripe) && Intrinsics.f(this.locationSecurity, mVar.locationSecurity);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final l getPointOfSale() {
        return this.pointOfSale;
    }

    public final int hashCode() {
        l lVar = this.atmWithdrawal;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        l lVar2 = this.ecommerce;
        int iHashCode2 = (iHashCode + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        l lVar3 = this.contactless;
        int iHashCode3 = (iHashCode2 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        l lVar4 = this.pointOfSale;
        int iHashCode4 = (iHashCode3 + (lVar4 == null ? 0 : lVar4.hashCode())) * 31;
        l lVar5 = this.magstripe;
        int iHashCode5 = (iHashCode4 + (lVar5 == null ? 0 : lVar5.hashCode())) * 31;
        l lVar6 = this.locationSecurity;
        return iHashCode5 + (lVar6 != null ? lVar6.hashCode() : 0);
    }
}
