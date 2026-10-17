package com.feature.navigation.hub.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import cm.c;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p.a;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/feature/navigation/hub/api/navigation/NavigationHubDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "feature_navigation_hub_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NavigationHubDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<NavigationHubDestination> CREATOR = new c(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26216a;

    public NavigationHubDestination(String stepId) {
        Intrinsics.checkNotNullParameter(stepId, "stepId");
        this.f26216a = stepId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof NavigationHubDestination) && Intrinsics.f(this.f26216a, ((NavigationHubDestination) obj2).f26216a);
    }

    public final int hashCode() {
        return this.f26216a.hashCode();
    }

    public final String toString() {
        return a.p("NavigationHubDestination(stepId=", this.f26216a, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f26216a);
    }
}
