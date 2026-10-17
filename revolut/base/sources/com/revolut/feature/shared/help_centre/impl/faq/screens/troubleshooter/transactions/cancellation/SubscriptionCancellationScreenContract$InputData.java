package com.revolut.feature.shared.help_centre.impl.faq.screens.troubleshooter.transactions.cancellation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.faq.FaqNodeBase;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"com/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/cancellation/SubscriptionCancellationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "RecurrentPayment", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/cancellation/SubscriptionCancellationScreenContract$InputData$RecurrentPayment;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface SubscriptionCancellationScreenContract$InputData extends IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/cancellation/SubscriptionCancellationScreenContract$InputData$RecurrentPayment;", "Lcom/revolut/feature/shared/help_centre/impl/faq/screens/troubleshooter/transactions/cancellation/SubscriptionCancellationScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_shared_help_centre_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RecurrentPayment implements SubscriptionCancellationScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<RecurrentPayment> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FaqNodeBase f86332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f86333c;
        public final String d;
        public final boolean e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RecurrentPayment(parcel.readString(), (FaqNodeBase) parcel.readParcelable(RecurrentPayment.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RecurrentPayment[i];
            }
        }

        public RecurrentPayment(String transactionId, FaqNodeBase faqNodeBase, String key, String title, boolean z) {
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(title, "title");
            this.f86331a = transactionId;
            this.f86332b = faqNodeBase;
            this.f86333c = key;
            this.d = title;
            this.e = z;
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
            return Intrinsics.f(this.f86331a, recurrentPayment.f86331a) && Intrinsics.f(this.f86332b, recurrentPayment.f86332b) && Intrinsics.f(this.f86333c, recurrentPayment.f86333c) && Intrinsics.f(this.d, recurrentPayment.d) && this.e == recurrentPayment.e;
        }

        public final int hashCode() {
            int iHashCode = this.f86331a.hashCode() * 31;
            FaqNodeBase faqNodeBase = this.f86332b;
            return Boolean.hashCode(this.e) + p.a.c(p.a.c((iHashCode + (faqNodeBase == null ? 0 : faqNodeBase.hashCode())) * 31, 31, this.f86333c), 31, this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f86331a);
            dest.writeParcelable(this.f86332b, i);
            dest.writeString(this.f86333c);
            dest.writeString(this.d);
            dest.writeInt(this.e ? 1 : 0);
        }
    }
}
