package ysg;

import a0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\u0011\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0019"}, d2 = {"Lysg/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "g", "type", "b", "counterType", "c", "f", "name", "d", "currency", "", "e", "J", "()J", "currentValue", "Ljava/lang/Long;", "()Ljava/lang/Long;", "minValue", "maxValue", "feature_wallets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("counterType")
    @NotNull
    private final String counterType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("name")
    @NotNull
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("currentValue")
    private final long currentValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("minValue")
    private final Long minValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxValue")
    private final long maxValue;

    public a(String type, String counterType, String name, String currency, long j2, Long l2, long j3) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(counterType, "counterType");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.type = type;
        this.counterType = counterType;
        this.name = name;
        this.currency = currency;
        this.currentValue = j2;
        this.minValue = l2;
        this.maxValue = j3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCounterType() {
        return this.counterType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getMaxValue() {
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
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.type, aVar.type) && Intrinsics.f(this.counterType, aVar.counterType) && Intrinsics.f(this.name, aVar.name) && Intrinsics.f(this.currency, aVar.currency) && this.currentValue == aVar.currentValue && Intrinsics.f(this.minValue, aVar.minValue) && this.maxValue == aVar.maxValue;
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
        int iC = d.c(p.a.c(p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.counterType), 31, this.name), 31, this.currency), 31, this.currentValue);
        Long l2 = this.minValue;
        return Long.hashCode(this.maxValue) + ((iC + (l2 == null ? 0 : l2.hashCode())) * 31);
    }
}
