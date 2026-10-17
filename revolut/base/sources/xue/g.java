package xue;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\r\u0010\nR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0007\u0010\nR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\b\u001a\u0004\b\u0011\u0010\n¨\u0006\u0013"}, d2 = {"Lxue/g;", "", "", "toString", "()Ljava/lang/String;", "", "Lxue/d;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "storedMethods", "Lxue/f;", "b", "otherMethods", "Lxue/e;", "bannerMethods", "d", "supportedCurrencyCodes", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("storedMethods")
    @NotNull
    private final List<d> storedMethods;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("otherMethods")
    @NotNull
    private final List<f> otherMethods;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("bannerMethods")
    @NotNull
    private final List<e> bannerMethods;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("supportedCurrencies")
    @NotNull
    private final List<String> supportedCurrencyCodes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getBannerMethods() {
        return this.bannerMethods;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getOtherMethods() {
        return this.otherMethods;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final List getStoredMethods() {
        return this.storedMethods;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getSupportedCurrencyCodes() {
        return this.supportedCurrencyCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.storedMethods, gVar.storedMethods) && Intrinsics.f(this.otherMethods, gVar.otherMethods) && Intrinsics.f(this.bannerMethods, gVar.bannerMethods) && Intrinsics.f(this.supportedCurrencyCodes, gVar.supportedCurrencyCodes);
    }

    public final int hashCode() {
        return this.supportedCurrencyCodes.hashCode() + p.a.d(p.a.d(this.storedMethods.hashCode() * 31, 31, this.otherMethods), 31, this.bannerMethods);
    }
}
