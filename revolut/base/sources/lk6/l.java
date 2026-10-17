package lk6;

import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f196249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitConfig f196250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConsentLimitInputTrackableContext.OutboundConsentLimit f196251c;

    public l(String fieldId, LimitConfig limitConfig, ConsentLimitInputTrackableContext.OutboundConsentLimit trackableContext) {
        Intrinsics.checkNotNullParameter(fieldId, "fieldId");
        Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
        Intrinsics.checkNotNullParameter(trackableContext, "trackableContext");
        this.f196249a = fieldId;
        this.f196250b = limitConfig;
        this.f196251c = trackableContext;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f196249a, lVar.f196249a) && this.f196250b.equals(lVar.f196250b) && this.f196251c.equals(lVar.f196251c);
    }

    public final int hashCode() {
        return this.f196251c.f72641a.hashCode() + ((this.f196250b.hashCode() + (this.f196249a.hashCode() * 31)) * 31);
    }
}
