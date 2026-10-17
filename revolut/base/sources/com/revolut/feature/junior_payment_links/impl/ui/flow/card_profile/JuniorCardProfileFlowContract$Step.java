package com.revolut.feature.junior_payment_links.impl.ui.flow.card_profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.junior_payment_links.api.model.PaymentLinkCustomAmountBundle;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"com/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "PaymentLinksConsent", "CardProfile", "CustomAmountSetup", "Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step$CardProfile;", "Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step$CustomAmountSetup;", "Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step$PaymentLinksConsent;", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface JuniorCardProfileFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step$CardProfile;", "Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step;", "<init>", "()V", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CardProfile implements JuniorCardProfileFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CardProfile f77080a = new CardProfile();

        @NotNull
        public static final Parcelable.Creator<CardProfile> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CardProfile.f77080a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardProfile[i];
            }
        }

        private CardProfile() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step$CustomAmountSetup;", "Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CustomAmountSetup implements JuniorCardProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CustomAmountSetup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PaymentLinkCustomAmountBundle f77081a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CustomAmountSetup((PaymentLinkCustomAmountBundle) parcel.readParcelable(CustomAmountSetup.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CustomAmountSetup[i];
            }
        }

        public CustomAmountSetup(PaymentLinkCustomAmountBundle initialCustomAmountBundle) {
            Intrinsics.checkNotNullParameter(initialCustomAmountBundle, "initialCustomAmountBundle");
            this.f77081a = initialCustomAmountBundle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CustomAmountSetup) && Intrinsics.f(this.f77081a, ((CustomAmountSetup) obj2).f77081a);
        }

        public final int hashCode() {
            return this.f77081a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f77081a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step$PaymentLinksConsent;", "Lcom/revolut/feature/junior_payment_links/impl/ui/flow/card_profile/JuniorCardProfileFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_junior_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PaymentLinksConsent implements JuniorCardProfileFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PaymentLinksConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f77082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f77084c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PaymentLinksConsent(parcel.readInt() != 0, parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PaymentLinksConsent[i];
            }
        }

        public PaymentLinksConsent(boolean z, String firstName, String username) {
            Intrinsics.checkNotNullParameter(firstName, "firstName");
            Intrinsics.checkNotNullParameter(username, "username");
            this.f77082a = z;
            this.f77083b = firstName;
            this.f77084c = username;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PaymentLinksConsent)) {
                return false;
            }
            PaymentLinksConsent paymentLinksConsent = (PaymentLinksConsent) obj2;
            return this.f77082a == paymentLinksConsent.f77082a && Intrinsics.f(this.f77083b, paymentLinksConsent.f77083b) && Intrinsics.f(this.f77084c, paymentLinksConsent.f77084c);
        }

        public final int hashCode() {
            return this.f77084c.hashCode() + p.a.c(Boolean.hashCode(this.f77082a) * 31, 31, this.f77083b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f77082a ? 1 : 0);
            dest.writeString(this.f77083b);
            dest.writeString(this.f77084c);
        }
    }
}
