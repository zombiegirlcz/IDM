package bvh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u000f"}, d2 = {"Lbvh/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getRemovedCountry", "removedCountry", "b", "getAddedCountry", "addedCountry", "c", "getAddedTin", "addedTin", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("removedCountry")
    @NotNull
    private final String removedCountry;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("addedCountry")
    @NotNull
    private final String addedCountry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("addedTin")
    private final String addedTin;

    public v(String removedCountry, String addedCountry, String str) {
        Intrinsics.checkNotNullParameter(removedCountry, "removedCountry");
        Intrinsics.checkNotNullParameter(addedCountry, "addedCountry");
        this.removedCountry = removedCountry;
        this.addedCountry = addedCountry;
        this.addedTin = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.removedCountry, vVar.removedCountry) && Intrinsics.f(this.addedCountry, vVar.addedCountry) && Intrinsics.f(this.addedTin, vVar.addedTin);
    }

    public final int hashCode() {
        int iC = p.a.c(this.removedCountry.hashCode() * 31, 31, this.addedCountry);
        String str = this.addedTin;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
