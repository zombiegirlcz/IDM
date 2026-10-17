package z5l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015R\u001a\u0010\u001b\u001a\u00020\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u001e"}, d2 = {"Lz5l/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "state", "b", "i", "youthId", "c", "f", "id", "d", "e", "designCode", "brand", "Lz5l/d;", "Lz5l/d;", "()Lz5l/d;", "customisation", "", "Z", "h", "()Z", "virtual", "cardProfileId", "cardName", "feature_shared_card_request_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("youthId")
    private final String youthId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("designCode")
    @NotNull
    private final String designCode;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("brand")
    @NotNull
    private final String brand;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("customisation")
    private final d customisation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("virtual")
    private final boolean virtual;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("cardProfileId")
    private final String cardProfileId;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
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
    public final String getCardProfileId() {
        return this.cardProfileId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final d getCustomisation() {
        return this.customisation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDesignCode() {
        return this.designCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.state, eVar.state) && Intrinsics.f(this.youthId, eVar.youthId) && Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.designCode, eVar.designCode) && Intrinsics.f(this.brand, eVar.brand) && Intrinsics.f(this.customisation, eVar.customisation) && this.virtual == eVar.virtual && Intrinsics.f(this.cardProfileId, eVar.cardProfileId) && Intrinsics.f(this.cardName, eVar.cardName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getVirtual() {
        return this.virtual;
    }

    public final int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        String str = this.youthId;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.id), 31, this.designCode), 31, this.brand);
        d dVar = this.customisation;
        int iC2 = j6.a.c((iC + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.virtual);
        String str2 = this.cardProfileId;
        return this.cardName.hashCode() + ((iC2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getYouthId() {
        return this.youthId;
    }
}
