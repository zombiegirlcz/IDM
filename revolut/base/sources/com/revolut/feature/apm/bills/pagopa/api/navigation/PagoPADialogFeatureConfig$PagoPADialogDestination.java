package com.revolut.feature.apm.bills.pagopa.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/apm/bills/pagopa/api/navigation/PagoPADialogFeatureConfig$PagoPADialogDestination", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "<init>", "()V", "feature_apm_bills_pagopa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PagoPADialogFeatureConfig$PagoPADialogDestination extends InternalDestination<IOData$EmptyInput> implements KompotDestination {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PagoPADialogFeatureConfig$PagoPADialogDestination f61479b = new PagoPADialogFeatureConfig$PagoPADialogDestination();

    @NotNull
    public static final Parcelable.Creator<PagoPADialogFeatureConfig$PagoPADialogDestination> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return PagoPADialogFeatureConfig$PagoPADialogDestination.f61479b;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PagoPADialogFeatureConfig$PagoPADialogDestination[i];
        }
    }

    private PagoPADialogFeatureConfig$PagoPADialogDestination() {
        super(IOData$EmptyInput.f98299a);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(1);
    }
}
