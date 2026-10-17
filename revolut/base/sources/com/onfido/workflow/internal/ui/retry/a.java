package com.onfido.workflow.internal.ui.retry;

import android.os.Parcel;
import android.os.Parcelable;
import com.onfido.workflow.internal.ui.retry.RetryWorkflowViewDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        return new RetryWorkflowViewDescriptor(RetryWorkflowViewDescriptor.StringResIds.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : RetryWorkflowViewDescriptor.Texts.CREATOR.createFromParcel(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new RetryWorkflowViewDescriptor[i];
    }
}
