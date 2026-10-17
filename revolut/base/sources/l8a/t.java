package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\n\u0010\u0011R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0011R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0011R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u001a\u0010\u0011¨\u0006\u001c"}, d2 = {"Ll8a/t;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getMessage", "message", "", "b", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "code", "Ljo3/a;", "c", "Ljo3/a;", "()Ljo3/a;", "exceedingValue", "d", "getMaxValue", "maxValue", "e", "getMinValue", "minValue", "f", "getValue", "value", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("code")
    private final Integer code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exceedingValue")
    private final jo3.a exceedingValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("maxValue")
    private final jo3.a maxValue;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("minValue")
    private final jo3.a minValue;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("value")
    private final jo3.a value;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Integer getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getExceedingValue() {
        return this.exceedingValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.message, tVar.message) && Intrinsics.f(this.code, tVar.code) && Intrinsics.f(this.exceedingValue, tVar.exceedingValue) && Intrinsics.f(this.maxValue, tVar.maxValue) && Intrinsics.f(this.minValue, tVar.minValue) && Intrinsics.f(this.value, tVar.value);
    }

    public final int hashCode() {
        String str = this.message;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.code;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        jo3.a aVar = this.exceedingValue;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.maxValue;
        int iHashCode4 = (iHashCode3 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.minValue;
        int iHashCode5 = (iHashCode4 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        jo3.a aVar4 = this.value;
        return iHashCode5 + (aVar4 != null ? aVar4.hashCode() : 0);
    }
}
