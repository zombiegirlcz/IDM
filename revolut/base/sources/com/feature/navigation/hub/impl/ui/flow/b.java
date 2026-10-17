package com.feature.navigation.hub.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new NavigationHubFlowContract$Step.InnerWorkflow(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NavigationHubFlowContract$Step.InnerWorkflow[i];
    }
}
