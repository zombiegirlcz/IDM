package yei;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lyei/j;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "general", "additional", "feature_travel_hotels_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("general")
    private final String general;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("additional")
    private final String additional;

    public j(String str, String str2) {
        this.general = str;
        this.additional = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getAdditional() {
        return this.additional;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getGeneral() {
        return this.general;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.general, jVar.general) && Intrinsics.f(this.additional, jVar.additional);
    }

    public final int hashCode() {
        String str = this.general;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.additional;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
