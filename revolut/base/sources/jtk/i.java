package jtk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f178534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f178535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f178536c;
    public final Data d;
    public final boolean e;
    public final Data f;

    public i(Data instrument, Data instrumentDetails, Data instrumentSummary, Data corporateEventBanners, Data ipoLaunchWarning, boolean z) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentDetails, "instrumentDetails");
        Intrinsics.checkNotNullParameter(instrumentSummary, "instrumentSummary");
        Intrinsics.checkNotNullParameter(corporateEventBanners, "corporateEventBanners");
        Intrinsics.checkNotNullParameter(ipoLaunchWarning, "ipoLaunchWarning");
        this.f178534a = instrument;
        this.f178535b = instrumentDetails;
        this.f178536c = instrumentSummary;
        this.d = corporateEventBanners;
        this.e = z;
        this.f = ipoLaunchWarning;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f178534a, iVar.f178534a) && Intrinsics.f(this.f178535b, iVar.f178535b) && Intrinsics.f(this.f178536c, iVar.f178536c) && Intrinsics.f(this.d, iVar.d) && this.e == iVar.e && Intrinsics.f(this.f, iVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(kii.e.c(this.d, kii.e.c(this.f178536c, kii.e.c(this.f178535b, this.f178534a.hashCode() * 31, 31), 31), 31), 31, this.e);
    }
}
