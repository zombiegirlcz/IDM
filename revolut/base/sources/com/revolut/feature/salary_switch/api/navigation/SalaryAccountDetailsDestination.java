package com.revolut.feature.salary_switch.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/salary_switch/api/navigation/SalaryAccountDetailsDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_salary_switch_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SalaryAccountDetailsDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SalaryAccountDetailsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f85226a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SalaryAccountDetailsDestination(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SalaryAccountDetailsDestination[i];
        }
    }

    public SalaryAccountDetailsDestination(String str) {
        this.f85226a = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF85226a() {
        return this.f85226a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SalaryAccountDetailsDestination) && Intrinsics.f(this.f85226a, ((SalaryAccountDetailsDestination) obj2).f85226a);
    }

    public final int hashCode() {
        String str = this.f85226a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f85226a);
    }

    public SalaryAccountDetailsDestination() {
        this(null);
    }
}
