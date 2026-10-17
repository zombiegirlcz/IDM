package com.revolut.feature.payees.impl.ui.payees_select;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.junior_transfer.api.navigation.JuniorBlockInboundTransferNavigation$Junior;
import com.revolut.feature.payees.impl.ui.PayeesFlowType;
import com.revolut.kompot.navigable.flow.FlowStep;
import ehe.n;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/payees/impl/ui/payees_select/PayeesSelectScreenContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "ConfirmationForCurrentUser", "ConfirmationForJunior", "Lcom/revolut/feature/payees/impl/ui/payees_select/PayeesSelectScreenContract$Step$ConfirmationForCurrentUser;", "Lcom/revolut/feature/payees/impl/ui/payees_select/PayeesSelectScreenContract$Step$ConfirmationForJunior;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PayeesSelectScreenContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_select/PayeesSelectScreenContract$Step$ConfirmationForCurrentUser;", "Lcom/revolut/feature/payees/impl/ui/payees_select/PayeesSelectScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationForCurrentUser implements PayeesSelectScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmationForCurrentUser> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PayeesFlowType f79025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f79026b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                PayeesFlowType payeesFlowType = (PayeesFlowType) j6.a.f(parcel, "parcel", ConfirmationForCurrentUser.class);
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iE = 0;
                while (iE != i) {
                    iE = d.e(ConfirmationForCurrentUser.class, parcel, linkedHashSet, iE, 1);
                }
                return new ConfirmationForCurrentUser(payeesFlowType, linkedHashSet);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationForCurrentUser[i];
            }
        }

        public ConfirmationForCurrentUser(PayeesFlowType flowType, AbstractSet recipients) {
            Intrinsics.checkNotNullParameter(flowType, "flowType");
            Intrinsics.checkNotNullParameter(recipients, "recipients");
            this.f79025a = flowType;
            this.f79026b = recipients;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmationForCurrentUser)) {
                return false;
            }
            ConfirmationForCurrentUser confirmationForCurrentUser = (ConfirmationForCurrentUser) obj2;
            return Intrinsics.f(this.f79025a, confirmationForCurrentUser.f79025a) && Intrinsics.f(this.f79026b, confirmationForCurrentUser.f79026b);
        }

        public final int hashCode() {
            return this.f79026b.hashCode() + (this.f79025a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79025a, i);
            Iterator itV = n.v(this.f79026b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payees/impl/ui/payees_select/PayeesSelectScreenContract$Step$ConfirmationForJunior;", "Lcom/revolut/feature/payees/impl/ui/payees_select/PayeesSelectScreenContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_payees_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmationForJunior implements PayeesSelectScreenContract$Step {

        @NotNull
        public static final Parcelable.Creator<ConfirmationForJunior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final JuniorBlockInboundTransferNavigation$Junior f79027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f79028b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                JuniorBlockInboundTransferNavigation$Junior juniorBlockInboundTransferNavigation$Junior = (JuniorBlockInboundTransferNavigation$Junior) j6.a.f(parcel, "parcel", ConfirmationForJunior.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ConfirmationForJunior.class, parcel, arrayList, iE, 1);
                }
                return new ConfirmationForJunior(juniorBlockInboundTransferNavigation$Junior, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ConfirmationForJunior[i];
            }
        }

        public ConfirmationForJunior(JuniorBlockInboundTransferNavigation$Junior junior, List senders) {
            Intrinsics.checkNotNullParameter(junior, "junior");
            Intrinsics.checkNotNullParameter(senders, "senders");
            this.f79027a = junior;
            this.f79028b = senders;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ConfirmationForJunior)) {
                return false;
            }
            ConfirmationForJunior confirmationForJunior = (ConfirmationForJunior) obj2;
            return Intrinsics.f(this.f79027a, confirmationForJunior.f79027a) && Intrinsics.f(this.f79028b, confirmationForJunior.f79028b);
        }

        public final int hashCode() {
            return this.f79028b.hashCode() + (this.f79027a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f79027a, i);
            Iterator itV = p.a.v(this.f79028b, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
