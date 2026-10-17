package com.revolut.feature.credit.card.impl.ui.direct_debit;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "SetAccount", "Confirm", "Lcom/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$Step$Confirm;", "Lcom/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$Step$SetAccount;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditCardDirectDebitV3FlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$Step$Confirm;", "Lcom/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirm implements CreditCardDirectDebitV3FlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Confirm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f69267a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f69268b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirm(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirm[i];
            }
        }

        public Confirm(String clabe, String bankName) {
            Intrinsics.checkNotNullParameter(clabe, "clabe");
            Intrinsics.checkNotNullParameter(bankName, "bankName");
            this.f69267a = clabe;
            this.f69268b = bankName;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirm)) {
                return false;
            }
            Confirm confirm = (Confirm) obj2;
            return Intrinsics.f(this.f69267a, confirm.f69267a) && Intrinsics.f(this.f69268b, confirm.f69268b);
        }

        public final int hashCode() {
            return this.f69268b.hashCode() + (this.f69267a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f69267a);
            dest.writeString(this.f69268b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$Step$SetAccount;", "Lcom/revolut/feature/credit/card/impl/ui/direct_debit/CreditCardDirectDebitV3FlowContract$Step;", "<init>", "()V", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SetAccount implements CreditCardDirectDebitV3FlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SetAccount f69269a = new SetAccount();

        @NotNull
        public static final Parcelable.Creator<SetAccount> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SetAccount.f69269a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SetAccount[i];
            }
        }

        private SetAccount() {
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
}
