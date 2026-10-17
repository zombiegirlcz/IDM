package orl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0006\u001a\u0004\b\u001f\u0010\u0004R\u001a\u0010&\u001a\u00020!8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lorl/v;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getSecurityRef", "securityRef", "b", "getSide", "side", "c", "getType", "type", "d", "getTimeInForce", "timeInForce", "Lorl/r;", "e", "Lorl/r;", "getValue", "()Lorl/r;", "value", "Lko3/a;", "f", "Lko3/a;", "getClientPricePrecise", "()Lko3/a;", "clientPricePrecise", "g", "getPositionId", "positionId", "Le4l/b;", "h", "Le4l/b;", "getExitStrategies", "()Le4l/b;", "exitStrategies", "feature_trading_orders_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("ref")
    @NotNull
    private final String securityRef;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("side")
    @NotNull
    private final String side;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("type")
    @NotNull
    private final String type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("timeInForce")
    @NotNull
    private final String timeInForce;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("value")
    @NotNull
    private final r value;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("clientPricePrecise")
    @NotNull
    private final ko3.a clientPricePrecise;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @lg.b("positionId")
    @NotNull
    private final String positionId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @lg.b("exitStrategies")
    @NotNull
    private final e4l.b exitStrategies;

    public v(String securityRef, String side, String timeInForce, r value, ko3.a clientPricePrecise, String positionId, e4l.b exitStrategies) {
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        Intrinsics.checkNotNullParameter(side, "side");
        Intrinsics.checkNotNullParameter("BRACKET", "type");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(clientPricePrecise, "clientPricePrecise");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(exitStrategies, "exitStrategies");
        this.securityRef = securityRef;
        this.side = side;
        this.type = "BRACKET";
        this.timeInForce = timeInForce;
        this.value = value;
        this.clientPricePrecise = clientPricePrecise;
        this.positionId = positionId;
        this.exitStrategies = exitStrategies;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.securityRef, vVar.securityRef) && Intrinsics.f(this.side, vVar.side) && Intrinsics.f(this.type, vVar.type) && Intrinsics.f(this.timeInForce, vVar.timeInForce) && Intrinsics.f(this.value, vVar.value) && Intrinsics.f(this.clientPricePrecise, vVar.clientPricePrecise) && Intrinsics.f(this.positionId, vVar.positionId) && Intrinsics.f(this.exitStrategies, vVar.exitStrategies);
    }

    public final int hashCode() {
        return this.exitStrategies.hashCode() + p.a.c((this.clientPricePrecise.hashCode() + ((this.value.hashCode() + p.a.c(p.a.c(p.a.c(this.securityRef.hashCode() * 31, 31, this.side), 31, this.type), 31, this.timeInForce)) * 31)) * 31, 31, this.positionId);
    }
}
