package ksc;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f189413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrc.k f189414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f189415c;

    public d(String legalEntityId, vrc.k purpose, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(legalEntityId, "legalEntityId");
        Intrinsics.checkNotNullParameter(purpose, "purpose");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f189413a = legalEntityId;
        this.f189414b = purpose;
        this.f189415c = analyticsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f189413a, dVar.f189413a) && this.f189414b == dVar.f189414b && Intrinsics.f(this.f189415c, dVar.f189415c);
    }

    public final int hashCode() {
        return this.f189415c.hashCode() + ((this.f189414b.hashCode() + (this.f189413a.hashCode() * 31)) * 31);
    }
}
