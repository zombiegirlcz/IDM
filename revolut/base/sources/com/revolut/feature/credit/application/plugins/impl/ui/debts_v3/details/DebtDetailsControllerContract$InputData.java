package com.revolut.feature.credit.application.plugins.impl.ui.debts_v3.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my3.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v3/details/DebtDetailsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DebtDetailsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<DebtDetailsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f67501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f67502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f67503c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DebtDetailsControllerContract$InputData(parcel.readString(), parcel.readString(), (p) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DebtDetailsControllerContract$InputData[i];
        }
    }

    public DebtDetailsControllerContract$InputData(String applicationId, String str, p form) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Intrinsics.checkNotNullParameter(form, "form");
        this.f67501a = applicationId;
        this.f67502b = str;
        this.f67503c = form;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof DebtDetailsControllerContract$InputData)) {
            return false;
        }
        DebtDetailsControllerContract$InputData debtDetailsControllerContract$InputData = (DebtDetailsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f67501a, debtDetailsControllerContract$InputData.f67501a) && Intrinsics.f(this.f67502b, debtDetailsControllerContract$InputData.f67502b) && Intrinsics.f(this.f67503c, debtDetailsControllerContract$InputData.f67503c);
    }

    public final int hashCode() {
        int iHashCode = this.f67501a.hashCode() * 31;
        String str = this.f67502b;
        return this.f67503c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67501a);
        dest.writeString(this.f67502b);
        dest.writeSerializable(this.f67503c);
    }
}
