package hfk;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\t\u0010\u0012¨\u0006\u0014"}, d2 = {"Lhfk/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "type", "b", "duration", "Lmf0/a;", "c", "Lmf0/a;", "()Lmf0/a;", "price", "Lhfk/k;", "Lhfk/k;", "()Lhfk/k;", "layout", "feature_retail_pricing_plans_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("duration")
    private final String duration;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("price")
    private final mf0.a price;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("layout")
    private final k layout;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final k getLayout() {
        return this.layout;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final mf0.a getPrice() {
        return this.price;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.type, jVar.type) && Intrinsics.f(this.duration, jVar.duration) && Intrinsics.f(this.price, jVar.price) && Intrinsics.f(this.layout, jVar.layout);
    }

    public final int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.duration;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        mf0.a aVar = this.price;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        k kVar = this.layout;
        return iHashCode3 + (kVar != null ? kVar.hashCode() : 0);
    }
}
