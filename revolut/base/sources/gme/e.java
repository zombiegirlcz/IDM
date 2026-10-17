package gme;

import android.os.Parcelable;
import com.revolut.analytics.ads.model.ViewableRecordItem$Type;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements com.revolut.analytics.ads.model.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k19.c f144812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zn.c f144813b;

    public e(k19.c action, zn.c trackingItem) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(trackingItem, "trackingItem");
        this.f144812a = action;
        this.f144813b = trackingItem;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String J0() {
        return this.f144813b.f323637b;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String N0() {
        return this.f144813b.f323636a;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer R0() {
        return this.f144813b.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f144812a, eVar.f144812a) && Intrinsics.f(this.f144813b, eVar.f144813b);
    }

    @Override // zn.d
    public final Parcelable getAnalyticsContext() {
        this.f144813b.getClass();
        return null;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final String getIdentifier() {
        return this.f144813b.getIdentifier();
    }

    @Override // com.revolut.analytics.ads.model.a
    public final Integer getPosition() {
        return this.f144813b.d;
    }

    public final int hashCode() {
        return this.f144813b.hashCode() + (this.f144812a.hashCode() * 31);
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String n1() {
        return this.f144813b.f;
    }

    @Override // com.revolut.analytics.ads.model.a
    public final String o0() {
        return this.f144813b.f323638c;
    }

    @Override // com.revolut.analytics.ads.model.a, zn.d
    public final ViewableRecordItem$Type p0() {
        return this.f144813b.p0();
    }
}
