package com.revolut.retail.feature.crypto.disclaimer.api.navigation;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/crypto/disclaimer/api/navigation/RetailRevolutXDifferenceDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "<init>", "()V", "feature_crypto_disclaimer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RetailRevolutXDifferenceDescriptor implements ParcelableControllerDescriptor<q> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RetailRevolutXDifferenceDescriptor f100022a = new RetailRevolutXDifferenceDescriptor();

    @NotNull
    public static final Parcelable.Creator<RetailRevolutXDifferenceDescriptor> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return RetailRevolutXDifferenceDescriptor.f100022a;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RetailRevolutXDifferenceDescriptor[i];
        }
    }

    private RetailRevolutXDifferenceDescriptor() {
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
