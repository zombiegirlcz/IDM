package com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pu3.d;
import qu3.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "AddNewDebt", "UpdateDebt", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$InputData$AddNewDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$InputData$UpdateDebt;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface DebtDetailsControllerContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$InputData$AddNewDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddNewDebt implements DebtDetailsControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<AddNewDebt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f67467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f67468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xi0.b f67469c;
        public final CreditApplicationPluginFlowContract$Configuration d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AddNewDebt(d.valueOf(parcel.readString()), parcel.readString(), (xi0.b) parcel.readSerializable(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(AddNewDebt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddNewDebt[i];
            }
        }

        public AddNewDebt(d debtType, String str, xi0.b currency, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
            Intrinsics.checkNotNullParameter(debtType, "debtType");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f67467a = debtType;
            this.f67468b = str;
            this.f67469c = currency;
            this.d = pluginConfiguration;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsControllerContract$InputData
        /* JADX INFO: renamed from: O0, reason: from getter */
        public final CreditApplicationPluginFlowContract$Configuration getF67471b() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AddNewDebt)) {
                return false;
            }
            AddNewDebt addNewDebt = (AddNewDebt) obj2;
            return this.f67467a == addNewDebt.f67467a && Intrinsics.f(this.f67468b, addNewDebt.f67468b) && Intrinsics.f(this.f67469c, addNewDebt.f67469c) && Intrinsics.f(this.d, addNewDebt.d);
        }

        public final int hashCode() {
            int iHashCode = this.f67467a.hashCode() * 31;
            String str = this.f67468b;
            return this.d.hashCode() + l.j(this.f67469c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f67467a.name());
            dest.writeString(this.f67468b);
            dest.writeSerializable(this.f67469c);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$InputData$UpdateDebt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/debts_v2/details/DebtDetailsControllerContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UpdateDebt implements DebtDetailsControllerContract$InputData {

        @NotNull
        public static final Parcelable.Creator<UpdateDebt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f67470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditApplicationPluginFlowContract$Configuration f67471b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UpdateDebt((e) parcel.readSerializable(), (CreditApplicationPluginFlowContract$Configuration) parcel.readParcelable(UpdateDebt.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateDebt[i];
            }
        }

        public UpdateDebt(e debt, CreditApplicationPluginFlowContract$Configuration pluginConfiguration) {
            Intrinsics.checkNotNullParameter(debt, "debt");
            Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
            this.f67470a = debt;
            this.f67471b = pluginConfiguration;
        }

        @Override // com.revolut.feature.credit.application.plugins.impl.ui.debts_v2.details.DebtDetailsControllerContract$InputData
        /* JADX INFO: renamed from: O0, reason: from getter */
        public final CreditApplicationPluginFlowContract$Configuration getF67471b() {
            return this.f67471b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof UpdateDebt)) {
                return false;
            }
            UpdateDebt updateDebt = (UpdateDebt) obj2;
            return Intrinsics.f(this.f67470a, updateDebt.f67470a) && Intrinsics.f(this.f67471b, updateDebt.f67471b);
        }

        public final int hashCode() {
            return this.f67471b.hashCode() + (this.f67470a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67470a);
            dest.writeParcelable(this.f67471b, i);
        }
    }

    /* JADX INFO: renamed from: O0 */
    CreditApplicationPluginFlowContract$Configuration getF67471b();
}
