package e8l;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0013\u001a\u0004\b\u0005\u0010\u0014¨\u0006\u0016"}, d2 = {"Le8l/u;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "finalRate", "b", "d", "marketRate", "effectiveRate", "Le8l/a;", "Le8l/a;", "e", "()Le8l/a;", "totalMarkup", "", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "dealing", "feature_shared_market_data_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("finalRate")
    @NotNull
    private final String finalRate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("marketRate")
    @NotNull
    private final String marketRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("effectiveRate")
    private final String effectiveRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("totalMarkup")
    @NotNull
    private final a totalMarkup;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dealing")
    private final Boolean dealing;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Boolean getDealing() {
        return this.dealing;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEffectiveRate() {
        return this.effectiveRate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFinalRate() {
        return this.finalRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMarketRate() {
        return this.marketRate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final a getTotalMarkup() {
        return this.totalMarkup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.finalRate, uVar.finalRate) && Intrinsics.f(this.marketRate, uVar.marketRate) && Intrinsics.f(this.effectiveRate, uVar.effectiveRate) && Intrinsics.f(this.totalMarkup, uVar.totalMarkup) && Intrinsics.f(this.dealing, uVar.dealing);
    }

    public final int hashCode() {
        int iC = p.a.c(this.finalRate.hashCode() * 31, 31, this.marketRate);
        String str = this.effectiveRate;
        int iHashCode = (this.totalMarkup.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Boolean bool = this.dealing;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}
