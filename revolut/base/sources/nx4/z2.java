package nx4;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004¨\u0006\n"}, d2 = {"Lnx4/z2;", "Lnx4/k0;", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "url", "shape", "feature_credit_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class z2 implements k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b(alternate = {"value"}, value = "url")
    @NotNull
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("shape")
    private final String shape;

    public z2(String url2, String str) {
        Intrinsics.checkNotNullParameter(url2, "url");
        this.url = url2;
        this.shape = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.url, z2Var.url) && Intrinsics.f(this.shape, z2Var.shape);
    }

    public final int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        String str = this.shape;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
