package com.revolut.feature.external_accounts.impl.ui.apptoapp.flow.accounts_au;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.openbanking.ConsentPermission;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts_au/OpenBankingAuthAccountsAuFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "AccountsSelection", "AccessDetails", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts_au/OpenBankingAuthAccountsAuFlowContract$Step$AccessDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts_au/OpenBankingAuthAccountsAuFlowContract$Step$AccountsSelection;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OpenBankingAuthAccountsAuFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts_au/OpenBankingAuthAccountsAuFlowContract$Step$AccessDetails;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts_au/OpenBankingAuthAccountsAuFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccessDetails extends OpenBankingAuthAccountsAuFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<AccessDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f72501a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f72502b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(ConsentPermission.valueOf(parcel.readString()));
                }
                return new AccessDetails(string, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccessDetails[i];
            }
        }

        public AccessDetails(String clientName, List permissions) {
            Intrinsics.checkNotNullParameter(clientName, "clientName");
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f72501a = clientName;
            this.f72502b = permissions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccessDetails)) {
                return false;
            }
            AccessDetails accessDetails = (AccessDetails) obj2;
            return Intrinsics.f(this.f72501a, accessDetails.f72501a) && Intrinsics.f(this.f72502b, accessDetails.f72502b);
        }

        public final int hashCode() {
            return this.f72502b.hashCode() + (this.f72501a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f72501a);
            Iterator itV = p.a.v(this.f72502b, dest);
            while (itV.hasNext()) {
                dest.writeString(((ConsentPermission) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts_au/OpenBankingAuthAccountsAuFlowContract$Step$AccountsSelection;", "Lcom/revolut/feature/external_accounts/impl/ui/apptoapp/flow/accounts_au/OpenBankingAuthAccountsAuFlowContract$Step;", "<init>", "()V", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AccountsSelection extends OpenBankingAuthAccountsAuFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AccountsSelection f72503a = new AccountsSelection();

        @NotNull
        public static final Parcelable.Creator<AccountsSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AccountsSelection.f72503a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountsSelection[i];
            }
        }

        private AccountsSelection() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private OpenBankingAuthAccountsAuFlowContract$Step() {
    }
}
