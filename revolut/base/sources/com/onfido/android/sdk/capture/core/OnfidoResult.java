package com.onfido.android.sdk.capture.core;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.onfido.android.sdk.capture.core.config.Flow;
import com.onfido.android.sdk.capture.internal.util.annotation.InternalOnfidoApi;
import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@InternalOnfidoApi
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0006HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/onfido/android/sdk/capture/core/OnfidoResult;", "Landroid/os/Parcelable;", "result", "", "Lcom/onfido/android/sdk/capture/core/config/Flow$Result;", "isSuccess", "", "(Ljava/util/List;Z)V", "()Z", "getResult", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class OnfidoResult implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OnfidoResult> CREATOR = new Creator();
    private final boolean isSuccess;

    @NotNull
    private final List<Flow.Result> result;

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OnfidoResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnfidoResult createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(OnfidoResult.class, parcel, arrayList, iE, 1);
            }
            return new OnfidoResult(arrayList, parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final OnfidoResult[] newArray(int i) {
            return new OnfidoResult[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OnfidoResult(@NotNull List<? extends Flow.Result> result, boolean z) {
        Intrinsics.checkNotNullParameter(result, "result");
        this.result = result;
        this.isSuccess = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OnfidoResult copy$default(OnfidoResult onfidoResult, List list, boolean z, int i, Object obj2) {
        if ((i & 1) != 0) {
            list = onfidoResult.result;
        }
        if ((i & 2) != 0) {
            z = onfidoResult.isSuccess;
        }
        return onfidoResult.copy(list, z);
    }

    @NotNull
    public final List<Flow.Result> component1() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public final OnfidoResult copy(@NotNull List<? extends Flow.Result> result, boolean isSuccess) {
        Intrinsics.checkNotNullParameter(result, "result");
        return new OnfidoResult(result, isSuccess);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OnfidoResult)) {
            return false;
        }
        OnfidoResult onfidoResult = (OnfidoResult) other;
        return Intrinsics.f(this.result, onfidoResult.result) && this.isSuccess == onfidoResult.isSuccess;
    }

    @NotNull
    public final List<Flow.Result> getResult() {
        return this.result;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSuccess) + (this.result.hashCode() * 31);
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("OnfidoResult(result=");
        sb6.append(this.result);
        sb6.append(", isSuccess=");
        return a.x(sb6, this.isSuccess, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Iterator itV = p.a.v(this.result, parcel);
        while (itV.hasNext()) {
            parcel.writeParcelable((Parcelable) itV.next(), flags);
        }
        parcel.writeInt(this.isSuccess ? 1 : 0);
    }
}
