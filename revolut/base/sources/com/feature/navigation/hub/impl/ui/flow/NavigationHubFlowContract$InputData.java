package com.feature.navigation.hub.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/feature/navigation/hub/impl/ui/flow/NavigationHubFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "feature_navigation_hub_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavigationHubFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<NavigationHubFlowContract$InputData> CREATOR = new cm.c(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26217a;

    public NavigationHubFlowContract$InputData(String stepId) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.f26217a = stepId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof NavigationHubFlowContract$InputData) && Intrinsics.f(this.f26217a, ((NavigationHubFlowContract$InputData) obj2).f26217a);
    }

    public final int hashCode() {
        return this.f26217a.hashCode();
    }

    public final String toString() {
        return p.a.p("InputData(stepId=", this.f26217a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f26217a);
    }
}
