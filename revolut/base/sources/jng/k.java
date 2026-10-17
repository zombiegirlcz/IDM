package jng;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Ljng/k;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "occupation", "", "Ljng/j;", "Ljava/util/List;", "()Ljava/util/List;", "identificationNumbers", "feature_user_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("occupation")
    private final String occupation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("identificationNumbers")
    private final List<j> identificationNumbers;

    public k(String str, ArrayList arrayList) {
        this.occupation = str;
        this.identificationNumbers = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getIdentificationNumbers() {
        return this.identificationNumbers;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOccupation() {
        return this.occupation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.occupation, kVar.occupation) && Intrinsics.f(this.identificationNumbers, kVar.identificationNumbers);
    }

    public final int hashCode() {
        String str = this.occupation;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<j> list = this.identificationNumbers;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }
}
