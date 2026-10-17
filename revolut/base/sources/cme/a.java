package cme;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k19.c f25212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn.c f25213b;

    public a(k19.c action, zn.c trackingItem) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingItem, "trackingItem");
        this.f25212a = action;
        this.f25213b = trackingItem;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f25213b.f323637b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f25213b.f323636a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return this.f25213b.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f25212a, aVar.f25212a) && Intrinsics.f(this.f25213b, aVar.f25213b);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        this.f25213b.getClass();
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final String getIdentifier() {
        return this.f25213b.getIdentifier();
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.f25213b.d;
    }

    public final int hashCode() {
        return this.f25213b.hashCode() + (this.f25212a.hashCode() * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return this.f25213b.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f25213b.f323638c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return this.f25213b.p0();
    }
}
