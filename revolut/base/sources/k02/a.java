package k02;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lk02/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Z", "c", "()Z", "variable", "Ljo3/a;", "b", "Ljo3/a;", "()Ljo3/a;", "minimum", "maximum", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("variable")
    private final boolean variable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimum")
    private final jo3.a minimum;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("maximum")
    private final jo3.a maximum;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getMaximum() {
        return this.maximum;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final jo3.a getMinimum() {
        return this.minimum;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getVariable() {
        return this.variable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.variable == aVar.variable && Intrinsics.f(this.minimum, aVar.minimum) && Intrinsics.f(this.maximum, aVar.maximum);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.variable) * 31;
        jo3.a aVar = this.minimum;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.maximum;
        return iHashCode2 + (aVar2 != null ? aVar2.hashCode() : 0);
    }
}
