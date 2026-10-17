package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.money_input;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xy3.h;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/money_input/MoneyInputControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MoneyInputControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<MoneyInputControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zv3.a f68024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f68025b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MoneyInputControllerContract$InputData(zv3.a.valueOf(parcel.readString()), (h) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MoneyInputControllerContract$InputData[i];
        }
    }

    public MoneyInputControllerContract$InputData(zv3.a navigationIcon, h configuration) {
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f68024a = navigationIcon;
        this.f68025b = configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MoneyInputControllerContract$InputData)) {
            return false;
        }
        MoneyInputControllerContract$InputData moneyInputControllerContract$InputData = (MoneyInputControllerContract$InputData) obj2;
        return this.f68024a == moneyInputControllerContract$InputData.f68024a && Intrinsics.f(this.f68025b, moneyInputControllerContract$InputData.f68025b);
    }

    public final int hashCode() {
        return this.f68025b.hashCode() + (this.f68024a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f68024a.name());
        dest.writeSerializable(this.f68025b);
    }
}
