package jcl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\f\u0010\u0004¨\u0006\u0014"}, d2 = {"Ljcl/f;", "", "", "toString", "()Ljava/lang/String;", "Lko3/b;", "a", "Lko3/b;", "d", "()Lko3/b;", "openingPrice", "Ljo3/b;", "b", "Ljo3/b;", "c", "()Ljo3/b;", "margin", "exposure", "Ljava/lang/String;", "leverage", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("openingPrice")
    @NotNull
    private final ko3.b openingPrice;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("margin")
    @NotNull
    private final jo3.b margin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("exposure")
    @NotNull
    private final jo3.b exposure;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("leverage")
    @NotNull
    private final String leverage;

    public f(ko3.b openingPrice, jo3.b margin, jo3.b exposure, String leverage) {
        Intrinsics.checkNotNullParameter(openingPrice, "openingPrice");
        Intrinsics.checkNotNullParameter(margin, "margin");
        Intrinsics.checkNotNullParameter(exposure, "exposure");
        Intrinsics.checkNotNullParameter(leverage, "leverage");
        this.openingPrice = openingPrice;
        this.margin = margin;
        this.exposure = exposure;
        this.leverage = leverage;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.b getExposure() {
        return this.exposure;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLeverage() {
        return this.leverage;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.b getMargin() {
        return this.margin;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ko3.b getOpeningPrice() {
        return this.openingPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.openingPrice, fVar.openingPrice) && Intrinsics.f(this.margin, fVar.margin) && Intrinsics.f(this.exposure, fVar.exposure) && Intrinsics.f(this.leverage, fVar.leverage);
    }

    public final int hashCode() {
        return this.leverage.hashCode() + y.e(this.exposure, y.e(this.margin, this.openingPrice.hashCode() * 31, 31), 31);
    }
}
