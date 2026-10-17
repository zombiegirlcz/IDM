package com.feature.feature_meta_sso_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.feature.feature_meta_sso_api.navigation.OutputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new OutputData.Success(parcel.readString());
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new OutputData.Success[i];
    }
}
