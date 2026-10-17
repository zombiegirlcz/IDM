package a9g;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"La9g/l0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "colour", "b", "light", "feature_travel_hotels_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("colour")
    private final String colour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("light")
    private final String light;

    public l0(String str, String str2) {
        this.colour = str;
        this.light = str2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getColour() {
        return this.colour;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLight() {
        return this.light;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.colour, l0Var.colour) && Intrinsics.f(this.light, l0Var.light);
    }

    public final int hashCode() {
        String str = this.colour;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.light;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
