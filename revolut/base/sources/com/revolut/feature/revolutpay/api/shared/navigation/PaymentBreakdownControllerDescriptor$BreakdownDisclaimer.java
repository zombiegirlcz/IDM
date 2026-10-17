package com.revolut.feature.revolutpay.api.shared.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer", "Landroid/os/Parcelable;", "Default", "Custom", "Empty", "Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer$Custom;", "Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer$Default;", "Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer$Empty;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PaymentBreakdownControllerDescriptor$BreakdownDisclaimer extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer$Custom;", "Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom implements PaymentBreakdownControllerDescriptor$BreakdownDisclaimer {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f84437a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom((Clause) parcel.readParcelable(Custom.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(Clause clause) {
            Intrinsics.checkNotNullParameter(clause, "clause");
            this.f84437a = clause;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custom) && Intrinsics.f(this.f84437a, ((Custom) obj2).f84437a);
        }

        public final int hashCode() {
            return this.f84437a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f84437a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer$Default;", "Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default implements PaymentBreakdownControllerDescriptor$BreakdownDisclaimer {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f84438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n6c.a f84439b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(e.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : n6c.a.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(e assetType, n6c.a aVar) {
            Intrinsics.checkNotNullParameter(assetType, "assetType");
            this.f84438a = assetType;
            this.f84439b = aVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return this.f84438a == r56.f84438a && this.f84439b == r56.f84439b;
        }

        public final int hashCode() {
            int iHashCode = this.f84438a.hashCode() * 31;
            n6c.a aVar = this.f84439b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f84438a.name());
            n6c.a aVar = this.f84439b;
            if (aVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(aVar.name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer$Empty;", "Lcom/revolut/feature/revolutpay/api/shared/navigation/PaymentBreakdownControllerDescriptor$BreakdownDisclaimer;", "<init>", "()V", "feature_revolut_pay_shared_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty implements PaymentBreakdownControllerDescriptor$BreakdownDisclaimer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f84440a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f84440a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
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
