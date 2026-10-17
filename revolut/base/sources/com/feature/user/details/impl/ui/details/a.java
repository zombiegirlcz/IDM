package com.feature.user.details.impl.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.feature.user.details.impl.ui.details.UserDetailsControllerContract$ModalStep;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.readInt();
        return UserDetailsControllerContract$ModalStep.ChatDialogStep.f26228a;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new UserDetailsControllerContract$ModalStep.ChatDialogStep[i];
    }
}
