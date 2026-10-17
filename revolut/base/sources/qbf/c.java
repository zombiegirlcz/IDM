package qbf;

import java.time.Period;
import java.time.ZonedDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015¨\u0006\u0017"}, d2 = {"Lqbf/c;", "", "", "toString", "()Ljava/lang/String;", "Ljava/time/Period;", "a", "Ljava/time/Period;", "()Ljava/time/Period;", "duration", "Ljava/time/ZonedDateTime;", "b", "Ljava/time/ZonedDateTime;", "()Ljava/time/ZonedDateTime;", "endDate", "c", "Ljava/lang/String;", "d", "termsUrl", "Ljo3/a;", "Ljo3/a;", "()Ljo3/a;", "fee", "feature_trading_add_ons_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("duration")
    @NotNull
    private final Period duration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("endDate")
    private final ZonedDateTime endDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("termsUrl")
    private final String termsUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("fee")
    @NotNull
    private final jo3.a fee;

    public c(Period duration, ZonedDateTime zonedDateTime, String str, jo3.a fee2) {
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.duration = duration;
        this.endDate = zonedDateTime;
        this.termsUrl = str;
        this.fee = fee2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Period getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final ZonedDateTime getEndDate() {
        return this.endDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getTermsUrl() {
        return this.termsUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.duration, cVar.duration) && Intrinsics.f(this.endDate, cVar.endDate) && Intrinsics.f(this.termsUrl, cVar.termsUrl) && Intrinsics.f(this.fee, cVar.fee);
    }

    public final int hashCode() {
        int iHashCode = this.duration.hashCode() * 31;
        ZonedDateTime zonedDateTime = this.endDate;
        int iHashCode2 = (iHashCode + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31;
        String str = this.termsUrl;
        return this.fee.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }
}
