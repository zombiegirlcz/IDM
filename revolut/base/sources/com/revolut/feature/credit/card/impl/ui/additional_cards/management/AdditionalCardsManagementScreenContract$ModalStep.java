package com.revolut.feature.credit.card.impl.ui.additional_cards.management;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/card/impl/ui/additional_cards/management/AdditionalCardsManagementScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "CancelInvitation", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/management/AdditionalCardsManagementScreenContract$ModalStep$CancelInvitation;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class AdditionalCardsManagementScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/additional_cards/management/AdditionalCardsManagementScreenContract$ModalStep$CancelInvitation;", "Lcom/revolut/feature/credit/card/impl/ui/additional_cards/management/AdditionalCardsManagementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelInvitation extends AdditionalCardsManagementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelInvitation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69030a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69031b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f69032c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelInvitation(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelInvitation[i];
            }
        }

        public CancelInvitation(String cardholderId, String firstName, String lastName) {
            Intrinsics.checkNotNullParameter(cardholderId, "cardholderId");
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(lastName, "lastName");
            this.f69030a = cardholderId;
            this.f69031b = firstName;
            this.f69032c = lastName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancelInvitation)) {
                return false;
            }
            CancelInvitation cancelInvitation = (CancelInvitation) obj2;
            return Intrinsics.f(this.f69030a, cancelInvitation.f69030a) && Intrinsics.f(this.f69031b, cancelInvitation.f69031b) && Intrinsics.f(this.f69032c, cancelInvitation.f69032c);
        }

        public final int hashCode() {
            return this.f69032c.hashCode() + p.a.c(this.f69030a.hashCode() * 31, 31, this.f69031b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69030a);
            dest.writeString(this.f69031b);
            dest.writeString(this.f69032c);
        }
    }

    private AdditionalCardsManagementScreenContract$ModalStep() {
    }
}
