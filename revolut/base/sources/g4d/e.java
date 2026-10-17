package g4d;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0018\u0010\u0004R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\u0004R\u001c\u0010 \u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001a\u0010\u0004R\u001c\u0010#\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b\u001d\u0010\u0004¨\u0006$"}, d2 = {"Lg4d/e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "f", "id", "b", "getState", "state", "c", "e", "fromAssetType", "d", "from", "k", "toCurrency", "Ljava/math/BigDecimal;", "Ljava/math/BigDecimal;", "i", "()Ljava/math/BigDecimal;", "targetRate", "g", "createdAt", "h", "completedAt", "note", "j", "l", "type", "frequency", "percentage", "m", "timeRange", "feature_separate_favourites_item_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("baseAssetType")
    @NotNull
    private final String fromAssetType;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("base")
    @NotNull
    private final String from;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("counter")
    @NotNull
    private final String toCurrency;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("targetRate")
    private final BigDecimal targetRate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("createdDate")
    @NotNull
    private final String createdAt;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("completedDate")
    private final String completedAt;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @lg.b("note")
    private final String note;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    private final String type;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @lg.b("percentage")
    private final String percentage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeRange")
    private final String timeRange;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCompletedAt() {
        return this.completedAt;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getFromAssetType() {
        return this.fromAssetType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.id, eVar.id) && Intrinsics.f(this.state, eVar.state) && Intrinsics.f(this.fromAssetType, eVar.fromAssetType) && Intrinsics.f(this.from, eVar.from) && Intrinsics.f(this.toCurrency, eVar.toCurrency) && Intrinsics.f(this.targetRate, eVar.targetRate) && Intrinsics.f(this.createdAt, eVar.createdAt) && Intrinsics.f(this.completedAt, eVar.completedAt) && Intrinsics.f(this.note, eVar.note) && Intrinsics.f(this.type, eVar.type) && Intrinsics.f(this.frequency, eVar.frequency) && Intrinsics.f(this.percentage, eVar.percentage) && Intrinsics.f(this.timeRange, eVar.timeRange);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getPercentage() {
        return this.percentage;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(this.id.hashCode() * 31, 31, this.state), 31, this.fromAssetType), 31, this.from), 31, this.toCurrency);
        BigDecimal bigDecimal = this.targetRate;
        int iC2 = p.a.c((iC + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31, 31, this.createdAt);
        String str = this.completedAt;
        int iHashCode = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.note;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.frequency;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.percentage;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.timeRange;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final BigDecimal getTargetRate() {
        return this.targetRate;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getTimeRange() {
        return this.timeRange;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getToCurrency() {
        return this.toCurrency;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
