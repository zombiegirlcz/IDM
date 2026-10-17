package bvh;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004¨\u0006\u0012"}, d2 = {"Lbvh/f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getCountry", "country", "Lbvh/i0;", "b", "Lbvh/i0;", "getValue", "()Lbvh/i0;", "value", "c", "getFrequency", "frequency", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("country")
    @NotNull
    private final String country;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("value")
    private final i0 value;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("frequency")
    private final String frequency;

    public f(String country, i0 i0Var, String str) {
        Intrinsics.checkNotNullParameter(country, "country");
        this.country = country;
        this.value = i0Var;
        this.frequency = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.country, fVar.country) && Intrinsics.f(this.value, fVar.value) && Intrinsics.f(this.frequency, fVar.frequency);
    }

    public final int hashCode() {
        int iHashCode = this.country.hashCode() * 31;
        i0 i0Var = this.value;
        int iHashCode2 = (iHashCode + (i0Var == null ? 0 : i0Var.hashCode())) * 31;
        String str = this.frequency;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
