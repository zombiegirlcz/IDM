package com.revolut.feature.direct_deposit.impl.ui_kompot.screen.preview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import com.revolut.kompot.common.IOData$Input;
import h96.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/direct_deposit/impl/ui_kompot/screen/preview/DirectDepositPreviewContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_direct_deposit_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DirectDepositPreviewContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DirectDepositPreviewContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f71953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f71954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DepositAmount f71955c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DirectDepositPreviewContract$InputData(d.valueOf(parcel.readString()), parcel.readString(), (DepositAmount) parcel.readParcelable(DirectDepositPreviewContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DirectDepositPreviewContract$InputData[i];
        }
    }

    public DirectDepositPreviewContract$InputData(d mode, String companyName, DepositAmount depositAmount) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        Intrinsics.checkNotNullParameter(depositAmount, "depositAmount");
        this.f71953a = mode;
        this.f71954b = companyName;
        this.f71955c = depositAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DirectDepositPreviewContract$InputData)) {
            return false;
        }
        DirectDepositPreviewContract$InputData directDepositPreviewContract$InputData = (DirectDepositPreviewContract$InputData) obj2;
        return this.f71953a == directDepositPreviewContract$InputData.f71953a && Intrinsics.f(this.f71954b, directDepositPreviewContract$InputData.f71954b) && Intrinsics.f(this.f71955c, directDepositPreviewContract$InputData.f71955c);
    }

    public final int hashCode() {
        return this.f71955c.hashCode() + p.a.c(this.f71953a.hashCode() * 31, 31, this.f71954b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71953a.name());
        dest.writeString(this.f71954b);
        dest.writeParcelable(this.f71955c, i);
    }
}
