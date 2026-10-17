package com.feature.navigation.hub.impl.ui.hub;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ma.h;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/feature/navigation/hub/impl/ui/hub/NavigationHubControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavigationHubControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NavigationHubControllerContract$InputData> CREATOR = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26224a;

    public NavigationHubControllerContract$InputData(String stepId) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.f26224a = stepId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof NavigationHubControllerContract$InputData) && Intrinsics.f(this.f26224a, ((NavigationHubControllerContract$InputData) obj2).f26224a);
    }

    public final int hashCode() {
        return this.f26224a.hashCode();
    }

    public final String toString() {
        return a.p("InputData(stepId=", this.f26224a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f26224a);
    }
}
