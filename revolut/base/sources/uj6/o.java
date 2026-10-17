package uj6;

import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends com.revolut.feature.external_accounts.impl.ui.brazil.inbound_openbanking.mandate_preview.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitConfig f280507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConsentLimitInputTrackableContext.InboundConsentLimit f280508c;

    public o(String fieldId, LimitConfig limitConfig, ConsentLimitInputTrackableContext.InboundConsentLimit trackableContext) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
        Intrinsics.checkNotNullParameter(trackableContext, "trackableContext");
        this.f280506a = fieldId;
        this.f280507b = limitConfig;
        this.f280508c = trackableContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f280506a, oVar.f280506a) && this.f280507b.equals(oVar.f280507b) && this.f280508c.equals(oVar.f280508c);
    }

    public final int hashCode() {
        return this.f280508c.hashCode() + ((this.f280507b.hashCode() + (this.f280506a.hashCode() * 31)) * 31);
    }
}
