package gsf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\fR\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u000f\u0010\f¨\u0006\u0011"}, d2 = {"Lgsf/l;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "catalogue", "", "Lgsf/e;", "Ljava/util/List;", "()Ljava/util/List;", "additionalInfo", "Lgsf/n;", "c", "values", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("catalogue")
    private final String catalogue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("additionalInfo")
    private final List<e> additionalInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("values")
    private final List<n> values;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAdditionalInfo() {
        return this.additionalInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCatalogue() {
        return this.catalogue;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getValues() {
        return this.values;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.catalogue, lVar.catalogue) && Intrinsics.f(this.additionalInfo, lVar.additionalInfo) && Intrinsics.f(this.values, lVar.values);
    }

    public final int hashCode() {
        String str = this.catalogue;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<e> list = this.additionalInfo;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<n> list2 = this.values;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }
}
