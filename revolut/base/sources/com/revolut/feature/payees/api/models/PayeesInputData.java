package com.revolut.feature.payees.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/api/models/PayeesInputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payees_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PayeesInputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PayeesInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PayeesTargetUser f78987a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PayeesInputData((PayeesTargetUser) parcel.readParcelable(PayeesInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PayeesInputData[i];
        }
    }

    public PayeesInputData(PayeesTargetUser targetUser) {
        Intrinsics.checkNotNullParameter(targetUser, "targetUser");
        this.f78987a = targetUser;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof PayeesInputData) && Intrinsics.f(this.f78987a, ((PayeesInputData) obj2).f78987a);
    }

    public final int hashCode() {
        return this.f78987a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f78987a, i);
    }
}
