package kfj;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lkfj/k1;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "minLength", "maxLength", "c", "Ljava/lang/String;", "regex", "", "d", "Z", "()Z", "required", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("minLength")
    private final Long minLength;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("maxLength")
    private final Long maxLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("regex")
    private final String regex;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("required")
    private final boolean required;

    public k1(String str, boolean z, Long l2, Long l3) {
        this.minLength = l2;
        this.maxLength = l3;
        this.regex = str;
        this.required = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getMaxLength() {
        return this.maxLength;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getMinLength() {
        return this.minLength;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRegex() {
        return this.regex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getRequired() {
        return this.required;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.minLength, k1Var.minLength) && Intrinsics.f(this.maxLength, k1Var.maxLength) && Intrinsics.f(this.regex, k1Var.regex) && this.required == k1Var.required;
    }

    public final int hashCode() {
        Long l2 = this.minLength;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.maxLength;
        int iHashCode2 = (iHashCode + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.regex;
        return Boolean.hashCode(this.required) + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
