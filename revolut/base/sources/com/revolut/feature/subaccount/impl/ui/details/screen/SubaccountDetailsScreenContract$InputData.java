package com.revolut.feature.subaccount.impl.ui.details.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subaccount/impl/ui/details/screen/SubaccountDetailsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubaccountDetailsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubaccountDetailsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f89057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SubaccountType f89058b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubaccountDetailsScreenContract$InputData(parcel.readString(), (SubaccountType) parcel.readParcelable(SubaccountDetailsScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubaccountDetailsScreenContract$InputData[i];
        }
    }

    public SubaccountDetailsScreenContract$InputData(String id10, SubaccountType subaccountType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        this.f89057a = id10;
        this.f89058b = subaccountType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubaccountDetailsScreenContract$InputData)) {
            return false;
        }
        SubaccountDetailsScreenContract$InputData subaccountDetailsScreenContract$InputData = (SubaccountDetailsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f89057a, subaccountDetailsScreenContract$InputData.f89057a) && Intrinsics.f(this.f89058b, subaccountDetailsScreenContract$InputData.f89058b);
    }

    public final int hashCode() {
        return this.f89058b.hashCode() + (this.f89057a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f89057a);
        dest.writeParcelable(this.f89058b, i);
    }
}
