package com.revolut.ui_kit.payments.personalisation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.ui_kit.payments.R$id;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/ui_kit/payments/personalisation/AmountPersonalisationTransition;", "Lcom/revolut/kompot/navigable/TransitionAnimation$ViewDelegated;", "FromAmountToGallery", "FromGalleryToAmount", "Lcom/revolut/ui_kit/payments/personalisation/AmountPersonalisationTransition$FromAmountToGallery;", "Lcom/revolut/ui_kit/payments/personalisation/AmountPersonalisationTransition$FromGalleryToAmount;", "ui_kit_payments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AmountPersonalisationTransition extends TransitionAnimation.ViewDelegated {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/ui_kit/payments/personalisation/AmountPersonalisationTransition$FromAmountToGallery;", "Lcom/revolut/ui_kit/payments/personalisation/AmountPersonalisationTransition;", "", "toString", "()Ljava/lang/String;", "ui_kit_payments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromAmountToGallery implements AmountPersonalisationTransition {

        @NotNull
        public static final Parcelable.Creator<FromAmountToGallery> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f107115a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromAmountToGallery(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FromAmountToGallery[i];
            }
        }

        public FromAmountToGallery(String str) {
            this.f107115a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FromAmountToGallery) && Intrinsics.f(this.f107115a, ((FromAmountToGallery) obj2).f107115a);
        }

        public final int hashCode() {
            String str = this.f107115a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f107115a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/ui_kit/payments/personalisation/AmountPersonalisationTransition$FromGalleryToAmount;", "Lcom/revolut/ui_kit/payments/personalisation/AmountPersonalisationTransition;", "", "toString", "()Ljava/lang/String;", "ui_kit_payments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FromGalleryToAmount implements AmountPersonalisationTransition {

        @NotNull
        public static final Parcelable.Creator<FromGalleryToAmount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f107116a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FromGalleryToAmount(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FromGalleryToAmount[i];
            }
        }

        public FromGalleryToAmount(String personalisationId) {
            Intrinsics.checkNotNullParameter(personalisationId, "personalisationId");
            this.f107116a = personalisationId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FromGalleryToAmount) && Intrinsics.f(this.f107116a, ((FromGalleryToAmount) obj2).f107116a);
        }

        public final int hashCode() {
            return this.f107116a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f107116a);
        }
    }

    @Override // com.revolut.kompot.navigable.TransitionAnimation.ViewDelegated
    /* JADX INFO: renamed from: b0 */
    default int getF107122a() {
        return R$id.transferFlow_rootController;
    }
}
