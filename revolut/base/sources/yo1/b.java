package yo1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000f\u001a\u0004\b\t\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\f\u0010\u0004¨\u0006\u0013"}, d2 = {"Lyo1/b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "subLabelKey", "b", "d", "subLabelDefaultValue", "c", "currency", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "limit", "searchPlaceholder", "feature_apm_bills_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("subLabelKey")
    private final String subLabelKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subLabelDefaultValue")
    private final String subLabelDefaultValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("limit")
    private final Integer limit;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("searchPlaceholder")
    private final String searchPlaceholder;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getLimit() {
        return this.limit;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSearchPlaceholder() {
        return this.searchPlaceholder;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSubLabelDefaultValue() {
        return this.subLabelDefaultValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubLabelKey() {
        return this.subLabelKey;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.subLabelKey, bVar.subLabelKey) && Intrinsics.f(this.subLabelDefaultValue, bVar.subLabelDefaultValue) && Intrinsics.f(this.currency, bVar.currency) && Intrinsics.f(this.limit, bVar.limit) && Intrinsics.f(this.searchPlaceholder, bVar.searchPlaceholder);
    }

    public final int hashCode() {
        String str = this.subLabelKey;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subLabelDefaultValue;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.limit;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.searchPlaceholder;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
