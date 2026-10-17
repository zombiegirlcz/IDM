package l8a;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0006\u0010\r¨\u0006\u000f"}, d2 = {"Ll8a/w;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Boolean;", "b", "()Ljava/lang/Boolean;", "variable", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "minimum", "feature_pix_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("variable")
    private final Boolean variable;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("minimum")
    private final jo3.a minimum;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getMinimum() {
        return this.minimum;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getVariable() {
        return this.variable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.variable, wVar.variable) && Intrinsics.f(this.minimum, wVar.minimum);
    }

    public final int hashCode() {
        Boolean bool = this.variable;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        jo3.a aVar = this.minimum;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }
}
