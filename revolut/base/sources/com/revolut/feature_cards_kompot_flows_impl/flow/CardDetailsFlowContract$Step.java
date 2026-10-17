package com.revolut.feature_cards_kompot_flows_impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen.ShowCardPinScreenContract$InputData;
import com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ShowPin", "ShowPinWithCta", "ChangeCardLabel", "Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step$ChangeCardLabel;", "Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step$ShowPin;", "Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step$ShowPinWithCta;", "feature_cards_kompot_flows_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CardDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step$ChangeCardLabel;", "Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChangeCardLabel extends CardDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ChangeCardLabel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardLabelScreenContract$InputData f96647a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ChangeCardLabel((CardLabelScreenContract$InputData) parcel.readParcelable(ChangeCardLabel.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ChangeCardLabel[i];
            }
        }

        public ChangeCardLabel(CardLabelScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f96647a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ChangeCardLabel) && Intrinsics.f(this.f96647a, ((ChangeCardLabel) obj2).f96647a);
        }

        public final int hashCode() {
            return this.f96647a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96647a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step$ShowPin;", "Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowPin extends CardDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowPin> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShowCardPinScreenContract$InputData f96648a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowPin((ShowCardPinScreenContract$InputData) parcel.readParcelable(ShowPin.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowPin[i];
            }
        }

        public ShowPin(ShowCardPinScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f96648a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowPin) && Intrinsics.f(this.f96648a, ((ShowPin) obj2).f96648a);
        }

        public final int hashCode() {
            return this.f96648a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96648a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step$ShowPinWithCta;", "Lcom/revolut/feature_cards_kompot_flows_impl/flow/CardDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ShowPinWithCta extends CardDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ShowPinWithCta> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ShowCardPinWithCtaScreenContract$InputData f96649a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ShowPinWithCta((ShowCardPinWithCtaScreenContract$InputData) parcel.readParcelable(ShowPinWithCta.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ShowPinWithCta[i];
            }
        }

        public ShowPinWithCta(ShowCardPinWithCtaScreenContract$InputData inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f96649a = inputData;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShowPinWithCta) && Intrinsics.f(this.f96649a, ((ShowPinWithCta) obj2).f96649a);
        }

        public final int hashCode() {
            return this.f96649a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96649a, i);
        }
    }

    private CardDetailsFlowContract$Step() {
    }
}
