package zsg;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004¨\u0006\u0017"}, d2 = {"Lzsg/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "type", "b", "counterType", "c", "f", "name", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "currentValue", "e", "minValue", "maxValue", "currency", "feature_wallets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterType")
    private final String counterType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currentValue")
    private final Long currentValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("minValue")
    private final Long minValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("maxValue")
    private final Long maxValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCounterType() {
        return this.counterType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getMinValue() {
        return this.minValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.counterType, bVar.counterType) && Intrinsics.f(this.name, bVar.name) && Intrinsics.f(this.currentValue, bVar.currentValue) && Intrinsics.f(this.minValue, bVar.minValue) && Intrinsics.f(this.maxValue, bVar.maxValue) && Intrinsics.f(this.currency, bVar.currency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.counterType;
        int iC = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.name);
        Long l2 = this.currentValue;
        int iHashCode2 = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.minValue;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.maxValue;
        int iHashCode4 = (iHashCode3 + (l4 == null ? 0 : l4.hashCode())) * 31;
        String str2 = this.currency;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }
}
