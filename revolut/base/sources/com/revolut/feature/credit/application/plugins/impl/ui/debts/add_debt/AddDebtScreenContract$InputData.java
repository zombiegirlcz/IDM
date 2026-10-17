package com.revolut.feature.credit.application.plugins.impl.ui.debts.add_debt;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pu3.d;
import xi0.b;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts/add_debt/AddDebtScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddDebtScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddDebtScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f67426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f67427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CreditApplicationPluginFlowContract$Configuration f67428c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddDebtScreenContract$InputData(d.valueOf(parcel.readString()), (b) parcel.readSerializable(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(AddDebtScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddDebtScreenContract$InputData[i];
        }
    }

    public AddDebtScreenContract$InputData(d debtType, b currency, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
        Intrinsics.checkNotNullParameter(debtType, "debtType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
        this.f67426a = debtType;
        this.f67427b = currency;
        this.f67428c = pluginConfiguration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddDebtScreenContract$InputData)) {
            return false;
        }
        AddDebtScreenContract$InputData addDebtScreenContract$InputData = (AddDebtScreenContract$InputData) obj2;
        return this.f67426a == addDebtScreenContract$InputData.f67426a && Intrinsics.f(this.f67427b, addDebtScreenContract$InputData.f67427b) && Intrinsics.f(this.f67428c, addDebtScreenContract$InputData.f67428c);
    }

    public final int hashCode() {
        return this.f67428c.hashCode() + l.j(this.f67427b, this.f67426a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f67426a.name());
        dest.writeSerializable(this.f67427b);
        dest.writeParcelable(this.f67428c, i);
    }
}
