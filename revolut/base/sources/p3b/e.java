package p3b;

import com.revolut.data.model.Data;
import com.revolut.feature.retail.cfd.api.domain.models.CfdExposureBreakdownTarget;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f232709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bfl.g f232710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2b.a f232711c;
    public final CfdExposureBreakdownTarget d;

    public e(Data data, bfl.g tradeSide, e2b.a orderType, CfdExposureBreakdownTarget exposureTarget) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(exposureTarget, "exposureTarget");
        this.f232709a = data;
        this.f232710b = tradeSide;
        this.f232711c = orderType;
        this.d = exposureTarget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f232709a, eVar.f232709a) && this.f232710b == eVar.f232710b && this.f232711c == eVar.f232711c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        Data data = this.f232709a;
        return this.d.hashCode() + ((this.f232711c.hashCode() + y.b(this.f232710b, (data == null ? 0 : data.hashCode()) * 31, 31)) * 31);
    }
}
