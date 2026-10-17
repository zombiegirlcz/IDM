package z5l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001b"}, d2 = {"Lz5l/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getBrand", "brand", "b", "getDesignCode", "designCode", "Lz5l/b;", "c", "Lz5l/b;", "getCustomisation", "()Lz5l/b;", "customisation", "", "d", "Z", "getVirtual", "()Z", "virtual", "e", "getCardProfileId", "cardProfileId", "feature_shared_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("designCode")
    @NotNull
    private final String designCode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("customisation")
    private final b customisation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("virtual")
    private final boolean virtual;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.brand, cVar.brand) && Intrinsics.f(this.designCode, cVar.designCode) && Intrinsics.f(this.customisation, cVar.customisation) && this.virtual == cVar.virtual && Intrinsics.f(this.cardProfileId, cVar.cardProfileId);
    }

    public final int hashCode() {
        int iC = p.a.c(this.brand.hashCode() * 31, 31, this.designCode);
        b bVar = this.customisation;
        int iC2 = j6.a.c((iC + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.virtual);
        String str = this.cardProfileId;
        return iC2 + (str != null ? str.hashCode() : 0);
    }
}
