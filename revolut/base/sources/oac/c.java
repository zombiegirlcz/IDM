package oac;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0011\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\r\u0010\u0004¨\u0006\u0015"}, d2 = {"Loac/c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "airportIataCode", "g", "terminal", "c", "gate", "d", "e", "scheduledTime", "actualTime", "f", "status", "punctuality", "Companion", "feature_revolut_pay_order_tracking_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("airportIataCode")
    @NotNull
    private final String airportIataCode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("terminal")
    private final String terminal;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("gate")
    private final String gate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("scheduledAirportTime")
    @NotNull
    private final String scheduledTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("actualAirportTime")
    @NotNull
    private final String actualTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("status")
    @NotNull
    private final String status;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("punctuality")
    private final String punctuality;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getActualTime() {
        return this.actualTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getAirportIataCode() {
        return this.airportIataCode;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getGate() {
        return this.gate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPunctuality() {
        return this.punctuality;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getScheduledTime() {
        return this.scheduledTime;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.airportIataCode, cVar.airportIataCode) && Intrinsics.f(this.terminal, cVar.terminal) && Intrinsics.f(this.gate, cVar.gate) && Intrinsics.f(this.scheduledTime, cVar.scheduledTime) && Intrinsics.f(this.actualTime, cVar.actualTime) && Intrinsics.f(this.status, cVar.status) && Intrinsics.f(this.punctuality, cVar.punctuality);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTerminal() {
        return this.terminal;
    }

    public final int hashCode() {
        int iHashCode = this.airportIataCode.hashCode() * 31;
        String str = this.terminal;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.gate;
        int iC = p.a.c(p.a.c(p.a.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.scheduledTime), 31, this.actualTime), 31, this.status);
        String str3 = this.punctuality;
        return iC + (str3 != null ? str3.hashCode() : 0);
    }
}
