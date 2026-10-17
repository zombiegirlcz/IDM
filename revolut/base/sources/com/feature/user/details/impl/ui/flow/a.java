package com.feature.user.details.impl.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.feature.user.details.impl.ui.flow.UserDetailsFlowContract$Step;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return UserDetailsFlowContract$Step.UserDetailsStep.f26233a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UserDetailsFlowContract$Step.UserDetailsStep[i];
    }
}
