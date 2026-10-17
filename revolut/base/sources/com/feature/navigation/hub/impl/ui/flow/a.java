package com.feature.navigation.hub.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.feature.navigation.hub.impl.ui.flow.NavigationHubFlowContract$Step;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        String string = parcel.readString();
        int i = parcel.readInt();
        LinkedHashMap linkedHashMap = new LinkedHashMap(i);
        int iD = 0;
        while (iD != i) {
            iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
        }
        return new NavigationHubFlowContract$Step.InnerForm(string, linkedHashMap);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new NavigationHubFlowContract$Step.InnerForm[i];
    }
}
