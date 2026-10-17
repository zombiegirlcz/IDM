package jkd;

import aii.e;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotChecklistPayload f175159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f175160b;

    public a(SlotChecklistPayload payload, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f175159a = payload;
        this.f175160b = analyticsProduct;
    }

    public final AnalyticsProduct b() {
        return this.f175160b;
    }

    public final SlotChecklistPayload c() {
        return this.f175159a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f175159a, aVar.f175159a) && Intrinsics.f(this.f175160b, aVar.f175160b);
    }

    public final int hashCode() {
        return this.f175160b.hashCode() + (this.f175159a.hashCode() * 31);
    }
}
