package com.revolut.feature.subaccount.impl.ui.edit_name;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/subaccount/impl/ui/edit_name/SubAccountEditNameContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SubAccountEditNameContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SubAccountEditNameContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SubaccountType f89083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f89084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f89085c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SubAccountEditNameContract$InputData((SubaccountType) parcel.readParcelable(SubAccountEditNameContract$InputData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubAccountEditNameContract$InputData[i];
        }
    }

    public SubAccountEditNameContract$InputData(SubaccountType subaccountType, String subaccountName, String subaccountId, boolean z) {
        Intrinsics.checkNotNullParameter(subaccountType, "subaccountType");
        Intrinsics.checkNotNullParameter(subaccountName, "subaccountName");
        Intrinsics.checkNotNullParameter(subaccountId, "subaccountId");
        this.f89083a = subaccountType;
        this.f89084b = subaccountName;
        this.f89085c = subaccountId;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SubAccountEditNameContract$InputData)) {
            return false;
        }
        SubAccountEditNameContract$InputData subAccountEditNameContract$InputData = (SubAccountEditNameContract$InputData) obj2;
        return Intrinsics.f(this.f89083a, subAccountEditNameContract$InputData.f89083a) && Intrinsics.f(this.f89084b, subAccountEditNameContract$InputData.f89084b) && Intrinsics.f(this.f89085c, subAccountEditNameContract$InputData.f89085c) && this.d == subAccountEditNameContract$InputData.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f89083a.hashCode() * 31, 31, this.f89084b), 31, this.f89085c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89083a, i);
        dest.writeString(this.f89084b);
        dest.writeString(this.f89085c);
        dest.writeInt(this.d ? 1 : 0);
    }

    public /* synthetic */ SubAccountEditNameContract$InputData(SubaccountType subaccountType, String str, String str2) {
        this(subaccountType, str, str2, false);
    }
}
