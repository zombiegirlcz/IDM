package iwi;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u0011"}, d2 = {"Liwi/g;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "value", "", "b", "J", "()J", "validUntil", "Ljava/lang/Long;", "()Ljava/lang/Long;", "validForSeconds", "feature_retail_airport_lounges_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final String value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("validUntil")
    private final long validUntil;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("validForSeconds")
    private final Long validForSeconds;

    public g(String value, long j2, Long l2) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.value = value;
        this.validUntil = j2;
        this.validForSeconds = l2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getValidForSeconds() {
        return this.validForSeconds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getValidUntil() {
        return this.validUntil;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.value, gVar.value) && this.validUntil == gVar.validUntil && Intrinsics.f(this.validForSeconds, gVar.validForSeconds);
    }

    public final int hashCode() {
        int iC = a0.d.c(this.value.hashCode() * 31, 31, this.validUntil);
        Long l2 = this.validForSeconds;
        return iC + (l2 == null ? 0 : l2.hashCode());
    }
}
