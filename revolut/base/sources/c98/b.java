package c98;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0018"}, d2 = {"Lc98/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "id", "b", "d", "designCode", "c", "brand", "Lc98/a;", "Lc98/a;", "()Lc98/a;", "customisation", "", "Z", "f", "()Z", "virtual", "cardProfileId", "feature_junior_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("designCode")
    @NotNull
    private final String designCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("customisation")
    private final a customisation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("virtual")
    private final boolean virtual;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("cardProfileId")
    @NotNull
    private final String cardProfileId;

    public b(String id10, String designCode, String brand, a aVar, boolean z, String cardProfileId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(designCode, "designCode");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(cardProfileId, "cardProfileId");
        this.id = id10;
        this.designCode = designCode;
        this.brand = brand;
        this.customisation = aVar;
        this.virtual = z;
        this.cardProfileId = cardProfileId;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getBrand() {
        return this.brand;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCardProfileId() {
        return this.cardProfileId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getCustomisation() {
        return this.customisation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDesignCode() {
        return this.designCode;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.id, bVar.id) && Intrinsics.f(this.designCode, bVar.designCode) && Intrinsics.f(this.brand, bVar.brand) && Intrinsics.f(this.customisation, bVar.customisation) && this.virtual == bVar.virtual && Intrinsics.f(this.cardProfileId, bVar.cardProfileId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getVirtual() {
        return this.virtual;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.designCode), 31, this.brand);
        a aVar = this.customisation;
        return this.cardProfileId.hashCode() + j6.a.c((iC + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.virtual);
    }
}
