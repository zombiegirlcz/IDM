package com.revolut.feature.rev_points.giftcards.impl.ui.screen.giftcarddetails;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.rev_points.models.RevPoints;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Checkout", "Balance", "EarnOptions", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep$Balance;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep$Checkout;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep$EarnOptions;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class RevPointsGiftcardDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep$Balance;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Balance extends RevPointsGiftcardDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Balance f83711a = new Balance();

        @NotNull
        public static final Parcelable.Creator<Balance> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Balance.f83711a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Balance[i];
            }
        }

        private Balance() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep$Checkout;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checkout extends RevPointsGiftcardDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Checkout> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f83712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f83713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RevPoints f83714c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checkout(parcel.readString(), parcel.readString(), (RevPoints) parcel.readParcelable(Checkout.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checkout[i];
            }
        }

        public Checkout(String groupId, String selectedVoucherId, RevPoints selectedVoucherPointsAmount) {
            Intrinsics.checkNotNullParameter(groupId, "groupId");
            Intrinsics.checkNotNullParameter(selectedVoucherId, "selectedVoucherId");
            Intrinsics.checkNotNullParameter(selectedVoucherPointsAmount, "selectedVoucherPointsAmount");
            this.f83712a = groupId;
            this.f83713b = selectedVoucherId;
            this.f83714c = selectedVoucherPointsAmount;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Checkout)) {
                return false;
            }
            Checkout checkout = (Checkout) obj2;
            return Intrinsics.f(this.f83712a, checkout.f83712a) && Intrinsics.f(this.f83713b, checkout.f83713b) && Intrinsics.f(this.f83714c, checkout.f83714c);
        }

        public final int hashCode() {
            return this.f83714c.f83960a.hashCode() + p.a.c(this.f83712a.hashCode() * 31, 31, this.f83713b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f83712a);
            dest.writeString(this.f83713b);
            dest.writeParcelable(this.f83714c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep$EarnOptions;", "Lcom/revolut/feature/rev_points/giftcards/impl/ui/screen/giftcarddetails/RevPointsGiftcardDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EarnOptions extends RevPointsGiftcardDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<EarnOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f83715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Double f83716b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EarnOptions((Clause) parcel.readParcelable(EarnOptions.class.getClassLoader()), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EarnOptions[i];
            }
        }

        public EarnOptions(Clause title, Double d) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.f83715a = title;
            this.f83716b = d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EarnOptions)) {
                return false;
            }
            EarnOptions earnOptions = (EarnOptions) obj2;
            return Intrinsics.f(this.f83715a, earnOptions.f83715a) && Intrinsics.f(this.f83716b, earnOptions.f83716b);
        }

        public final int hashCode() {
            int iHashCode = this.f83715a.hashCode() * 31;
            Double d = this.f83716b;
            return iHashCode + (d == null ? 0 : d.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f83715a, i);
            Double d = this.f83716b;
            if (d == null) {
                dest.writeInt(0);
            } else {
                org.bouncycastle.jcajce.provider.digest.a.v(dest, 1, d);
            }
        }
    }

    private RevPointsGiftcardDetailsScreenContract$ModalStep() {
    }
}
