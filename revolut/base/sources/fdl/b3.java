package fdl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0016"}, d2 = {"Lfdl/b3;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "h", "timeZone", "b", "code", "c", "d", "defaultOpen", "defaultClose", "e", "defaultPreMarketOpen", "f", "defaultAfterHoursClose", "g", "defaultRecurringOpen", "defaultRecurringClose", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("timeZone")
    @NotNull
    private final String timeZone;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("exchange")
    @NotNull
    private final String code;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultOpen")
    @NotNull
    private final String defaultOpen;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("defaultClose")
    @NotNull
    private final String defaultClose;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("defaultPreMarketOpen")
    @NotNull
    private final String defaultPreMarketOpen;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("defaultAfterHoursClose")
    @NotNull
    private final String defaultAfterHoursClose;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultRecurringOpen")
    private final String defaultRecurringOpen;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("defaultRecurringClose")
    private final String defaultRecurringClose;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDefaultAfterHoursClose() {
        return this.defaultAfterHoursClose;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDefaultClose() {
        return this.defaultClose;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getDefaultOpen() {
        return this.defaultOpen;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getDefaultPreMarketOpen() {
        return this.defaultPreMarketOpen;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b3)) {
            return false;
        }
        b3 b3Var = (b3) obj2;
        return Intrinsics.f(this.timeZone, b3Var.timeZone) && Intrinsics.f(this.code, b3Var.code) && Intrinsics.f(this.defaultOpen, b3Var.defaultOpen) && Intrinsics.f(this.defaultClose, b3Var.defaultClose) && Intrinsics.f(this.defaultPreMarketOpen, b3Var.defaultPreMarketOpen) && Intrinsics.f(this.defaultAfterHoursClose, b3Var.defaultAfterHoursClose) && Intrinsics.f(this.defaultRecurringOpen, b3Var.defaultRecurringOpen) && Intrinsics.f(this.defaultRecurringClose, b3Var.defaultRecurringClose);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getDefaultRecurringClose() {
        return this.defaultRecurringClose;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getDefaultRecurringOpen() {
        return this.defaultRecurringOpen;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getTimeZone() {
        return this.timeZone;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.timeZone.hashCode() * 31, 31, this.code), 31, this.defaultOpen), 31, this.defaultClose), 31, this.defaultPreMarketOpen), 31, this.defaultAfterHoursClose);
        String str = this.defaultRecurringOpen;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.defaultRecurringClose;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
