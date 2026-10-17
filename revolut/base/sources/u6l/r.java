package u6l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\t\u0010\fR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u000e\u0010\u0012¨\u0006\u0014"}, d2 = {"Lu6l/r;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "currency", "Ljo3/b;", "b", "Ljo3/b;", "d", "()Ljo3/b;", "value", "c", "maxValue", "", "Z", "()Z", "required", "feature_shared_cards_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    @NotNull
    private final String currency;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final jo3.b value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxValue")
    private final jo3.b maxValue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    public r(String currency, jo3.b bVar, jo3.b bVar2, boolean z) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.currency = currency;
        this.value = bVar;
        this.maxValue = bVar2;
        this.required = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.b getMaxValue() {
        return this.maxValue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final jo3.b getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.currency, rVar.currency) && Intrinsics.f(this.value, rVar.value) && Intrinsics.f(this.maxValue, rVar.maxValue) && this.required == rVar.required;
    }

    public final int hashCode() {
        int iHashCode = this.currency.hashCode() * 31;
        jo3.b bVar = this.value;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        jo3.b bVar2 = this.maxValue;
        return Boolean.hashCode(this.required) + ((iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0)) * 31);
    }
}
