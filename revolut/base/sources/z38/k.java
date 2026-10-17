package z38;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004¨\u0006\u0018"}, d2 = {"Lz38/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "", "Lz38/j;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "pockets", "c", "f", "lastFour", "d", "expiryDate", "design", "brand", "cardName", "feature_joint_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pockets")
    @NotNull
    private final List<j> pockets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lastFour")
    private final String lastFour;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("expiryDate")
    private final String expiryDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("design")
    @NotNull
    private final String design;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardName")
    @NotNull
    private final String cardName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardName() {
        return this.cardName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDesign() {
        return this.design;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getExpiryDate() {
        return this.expiryDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.id, kVar.id) && Intrinsics.f(this.pockets, kVar.pockets) && Intrinsics.f(this.lastFour, kVar.lastFour) && Intrinsics.f(this.expiryDate, kVar.expiryDate) && Intrinsics.f(this.design, kVar.design) && Intrinsics.f(this.brand, kVar.brand) && Intrinsics.f(this.cardName, kVar.cardName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getLastFour() {
        return this.lastFour;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final List getPockets() {
        return this.pockets;
    }

    public final int hashCode() {
        int iD = p.a.d(this.id.hashCode() * 31, 31, this.pockets);
        String str = this.lastFour;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.expiryDate;
        return this.cardName.hashCode() + p.a.c(p.a.c((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.design), 31, this.brand);
    }
}
