package e4l;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000b\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000e\u0010\u0004R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0016"}, d2 = {"Le4l/b;", "", "", "toString", "()Ljava/lang/String;", "Le4l/c;", "a", "Le4l/c;", "e", "()Le4l/c;", "takeProfit", "b", "d", "stopLoss", "c", "Ljava/lang/String;", "orderId", "requestedChangesState", "", "Ljava/util/List;", "()Ljava/util/List;", "allowed", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("takeProfit")
    private final c takeProfit;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("stopLoss")
    private final c stopLoss;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("orderId")
    private final String orderId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("requestedChangesState")
    private final String requestedChangesState;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("allowed")
    private final List<String> allowed;

    public b(c cVar, c cVar2, String str, String str2, ArrayList arrayList) {
        this.takeProfit = cVar;
        this.stopLoss = cVar2;
        this.orderId = str;
        this.requestedChangesState = str2;
        this.allowed = arrayList;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getAllowed() {
        return this.allowed;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getRequestedChangesState() {
        return this.requestedChangesState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getStopLoss() {
        return this.stopLoss;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getTakeProfit() {
        return this.takeProfit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.takeProfit, bVar.takeProfit) && Intrinsics.f(this.stopLoss, bVar.stopLoss) && Intrinsics.f(this.orderId, bVar.orderId) && Intrinsics.f(this.requestedChangesState, bVar.requestedChangesState) && Intrinsics.f(this.allowed, bVar.allowed);
    }

    public final int hashCode() {
        c cVar = this.takeProfit;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        c cVar2 = this.stopLoss;
        int iHashCode2 = (iHashCode + (cVar2 == null ? 0 : cVar2.hashCode())) * 31;
        String str = this.orderId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.requestedChangesState;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list = this.allowed;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
