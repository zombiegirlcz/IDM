package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.troubleshooter;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/troubleshooter/UpcomingTransactionTroubleshooterScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "RecurrentPayment", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/troubleshooter/UpcomingTransactionTroubleshooterScreenContract$InputData$RecurrentPayment;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UpcomingTransactionTroubleshooterScreenContract$InputData implements IOData$Input {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqNodeBase f86357a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/troubleshooter/UpcomingTransactionTroubleshooterScreenContract$InputData$RecurrentPayment;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/troubleshooter/UpcomingTransactionTroubleshooterScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurrentPayment extends UpcomingTransactionTroubleshooterScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RecurrentPayment> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86358b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final FaqNodeBase f86359c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurrentPayment(parcel.readString(), (FaqNodeBase) parcel.readParcelable(RecurrentPayment.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurrentPayment[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RecurrentPayment(String transactionId, FaqNodeBase faqNodeBase, boolean z) {
            super(faqNodeBase);
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            this.f86358b = transactionId;
            this.f86359c = faqNodeBase;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RecurrentPayment)) {
                return false;
            }
            RecurrentPayment recurrentPayment = (RecurrentPayment) obj2;
            return Intrinsics.f(this.f86358b, recurrentPayment.f86358b) && Intrinsics.f(this.f86359c, recurrentPayment.f86359c) && this.d == recurrentPayment.d;
        }

        public final int hashCode() {
            int iHashCode = this.f86358b.hashCode() * 31;
            FaqNodeBase faqNodeBase = this.f86359c;
            return Boolean.hashCode(this.d) + ((iHashCode + (faqNodeBase == null ? 0 : faqNodeBase.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86358b);
            dest.writeParcelable(this.f86359c, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    public UpcomingTransactionTroubleshooterScreenContract$InputData(FaqNodeBase faqNodeBase) {
        this.f86357a = faqNodeBase;
    }
}
