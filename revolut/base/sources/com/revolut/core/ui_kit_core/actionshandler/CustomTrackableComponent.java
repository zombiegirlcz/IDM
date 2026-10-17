package com.revolut.core.ui_kit_core.actionshandler;

import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import yhm.d;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/actionshandler/CustomTrackableComponent;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@d
public final /* data */ class CustomTrackableComponent implements TrackableItem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Parcelable f59774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f59775b;

    public CustomTrackableComponent(Parcelable parcelable, Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        this.f59774a = parcelable;
        this.f59775b = clazz;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomTrackableComponent)) {
            return false;
        }
        CustomTrackableComponent customTrackableComponent = (CustomTrackableComponent) obj2;
        return Intrinsics.f(this.f59774a, customTrackableComponent.f59774a) && Intrinsics.f(this.f59775b, customTrackableComponent.f59775b);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final Parcelable getAnalyticsContext() {
        return this.f59774a;
    }

    public final int hashCode() {
        Parcelable parcelable = this.f59774a;
        return this.f59775b.hashCode() + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public final void setAnalyticsContext(Parcelable parcelable) {
        this.f59774a = parcelable;
    }
}
