package wj6;

import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.LimitConfig;
import com.revolut.feature.external_accounts.impl.ui.brazil.limits_update.tracking.ConsentLimitInputTrackableContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f297960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LimitConfig f297961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConsentLimitInputTrackableContext f297962c;
    public final boolean d;
    public final yj6.a e;

    public d(dj0.d currentLimit, LimitConfig limitConfig, ConsentLimitInputTrackableContext trackableContext, boolean z, yj6.a aVar) {
        Intrinsics.checkNotNullParameter(currentLimit, "currentLimit");
        Intrinsics.checkNotNullParameter(limitConfig, "limitConfig");
        Intrinsics.checkNotNullParameter(trackableContext, "trackableContext");
        this.f297960a = currentLimit;
        this.f297961b = limitConfig;
        this.f297962c = trackableContext;
        this.d = z;
        this.e = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f297960a, dVar.f297960a) && Intrinsics.f(this.f297961b, dVar.f297961b) && Intrinsics.f(this.f297962c, dVar.f297962c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f297962c.hashCode() + ((this.f297961b.hashCode() + (this.f297960a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        yj6.a aVar = this.e;
        return iC + (aVar == null ? 0 : aVar.hashCode());
    }
}
