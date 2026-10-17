package q6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\u0004R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0006\u001a\u0004\b%\u0010\u0004¨\u0006'"}, d2 = {"Lq6l/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBrand", "brand", "b", "getDesignCode", "designCode", "", "c", "Z", "getDisposable", "()Z", "disposable", "d", "getReplaceableCardId", "replaceableCardId", "e", "getLabel", "label", "f", "getWalletId", "walletId", "Lq6l/k;", "g", "Lq6l/k;", "getPocketConfig", "()Lq6l/k;", "pocketConfig", "h", "getSubProductType", "subProductType", "i", "getCardProfileId", "cardProfileId", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    private final String brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("design")
    @NotNull
    private final String designCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("disposable")
    private final boolean disposable;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("replaceableCardId")
    private final String replaceableCardId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("label")
    private final String label;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("walletId")
    private final String walletId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("pocketConfig")
    private final k pocketConfig;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("subProductType")
    private final String subProductType;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    public l(String str, String designCode, boolean z, String str2, String str3, String str4, k kVar, String str5, String str6) {
        Intrinsics.checkNotNullParameter(designCode, "designCode");
        this.brand = str;
        this.designCode = designCode;
        this.disposable = z;
        this.replaceableCardId = str2;
        this.label = str3;
        this.walletId = str4;
        this.pocketConfig = kVar;
        this.subProductType = str5;
        this.cardProfileId = str6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.brand, lVar.brand) && Intrinsics.f(this.designCode, lVar.designCode) && this.disposable == lVar.disposable && Intrinsics.f(this.replaceableCardId, lVar.replaceableCardId) && Intrinsics.f(this.label, lVar.label) && Intrinsics.f(this.walletId, lVar.walletId) && Intrinsics.f(this.pocketConfig, lVar.pocketConfig) && Intrinsics.f(this.subProductType, lVar.subProductType) && Intrinsics.f(this.cardProfileId, lVar.cardProfileId);
    }

    public final int hashCode() {
        String str = this.brand;
        int iC = j6.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.designCode), 31, this.disposable);
        String str2 = this.replaceableCardId;
        int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.label;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.walletId;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        k kVar = this.pocketConfig;
        int iHashCode4 = (iHashCode3 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        String str5 = this.subProductType;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cardProfileId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }
}
