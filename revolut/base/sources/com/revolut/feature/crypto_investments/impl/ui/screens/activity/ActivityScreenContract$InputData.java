package com.revolut.feature.crypto_investments.impl.ui.screens.activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pt5.b;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/crypto_investments/impl/ui/screens/activity/ActivityScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_crypto_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ActivityScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ActivityScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f71426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoInvestmentsFeatureConfig.CurrencyMode f71427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f71428c;
    public final Clause d;
    public final lt5.a e;
    public final i7 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i7 f71429g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivityScreenContract$InputData(b.valueOf(parcel.readString()), (CryptoInvestmentsFeatureConfig.CurrencyMode) parcel.readParcelable(ActivityScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (Clause) parcel.readParcelable(ActivityScreenContract$InputData.class.getClassLoader()), lt5.a.valueOf(parcel.readString()), (i7) parcel.readSerializable(), (i7) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActivityScreenContract$InputData[i];
        }
    }

    public ActivityScreenContract$InputData(b activityTab, CryptoInvestmentsFeatureConfig.CurrencyMode currencyMode, boolean z, Clause clause, lt5.a source, i7 i7Var, i7 i7Var2) {
        Intrinsics.checkNotNullParameter(activityTab, "activityTab");
        Intrinsics.checkNotNullParameter(currencyMode, "currencyMode");
        Intrinsics.checkNotNullParameter(source, "source");
        this.f71426a = activityTab;
        this.f71427b = currencyMode;
        this.f71428c = z;
        this.d = clause;
        this.e = source;
        this.f = i7Var;
        this.f71429g = i7Var2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ActivityScreenContract$InputData)) {
            return false;
        }
        ActivityScreenContract$InputData activityScreenContract$InputData = (ActivityScreenContract$InputData) obj2;
        return this.f71426a == activityScreenContract$InputData.f71426a && Intrinsics.f(this.f71427b, activityScreenContract$InputData.f71427b) && this.f71428c == activityScreenContract$InputData.f71428c && Intrinsics.f(this.d, activityScreenContract$InputData.d) && this.e == activityScreenContract$InputData.e && Intrinsics.f(this.f, activityScreenContract$InputData.f) && Intrinsics.f(this.f71429g, activityScreenContract$InputData.f71429g);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f71427b.hashCode() + (this.f71426a.hashCode() * 31)) * 31, 31, this.f71428c);
        Clause clause = this.d;
        int iHashCode = (this.e.hashCode() + ((iC + (clause == null ? 0 : clause.hashCode())) * 31)) * 31;
        i7 i7Var = this.f;
        int iHashCode2 = (iHashCode + (i7Var == null ? 0 : i7Var.hashCode())) * 31;
        i7 i7Var2 = this.f71429g;
        return iHashCode2 + (i7Var2 != null ? i7Var2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71426a.name());
        dest.writeParcelable(this.f71427b, i);
        dest.writeInt(this.f71428c ? 1 : 0);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f71429g);
    }
}
