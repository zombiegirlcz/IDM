package zhf;

import k71.q;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f322420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f322421c;

    public j(String widgetId, q extraData, a3 transaction) {
        Intrinsics.checkNotNullParameter(widgetId, "widgetId");
        Intrinsics.checkNotNullParameter(transaction, "transaction");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        this.f322419a = widgetId;
        this.f322420b = transaction;
        this.f322421c = extraData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f322419a, jVar.f322419a) && Intrinsics.f(this.f322420b, jVar.f322420b) && Intrinsics.f(this.f322421c, jVar.f322421c);
    }

    public final int hashCode() {
        return this.f322421c.hashCode() + y.f(this.f322420b, this.f322419a.hashCode() * 31, 31);
    }
}
