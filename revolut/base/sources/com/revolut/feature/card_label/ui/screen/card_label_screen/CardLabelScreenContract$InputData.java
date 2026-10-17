package com.revolut.feature.card_label.ui.screen.card_label_screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "CardInfo", "InputTextFieldConfiguration", "feature_card_label_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardLabelScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardLabelScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardInfo f64760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f64762c;
    public final InputTextFieldConfiguration d;
    public final boolean e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData$CardInfo;", "Landroid/os/Parcelable;", "Id", "Label", "Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData$CardInfo$Id;", "Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData$CardInfo$Label;", "feature_card_label_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface CardInfo extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData$CardInfo$Id;", "Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData$CardInfo;", "", "toString", "()Ljava/lang/String;", "feature_card_label_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Id implements CardInfo {

            @NotNull
            public static final Parcelable.Creator<Id> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64763a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Id(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Id[i];
                }
            }

            public Id(String cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f64763a = cardId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Id) && Intrinsics.f(this.f64763a, ((Id) obj2).f64763a);
            }

            @Override // com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData.CardInfo
            /* JADX INFO: renamed from: getCardId, reason: from getter */
            public final String getF64764a() {
                return this.f64763a;
            }

            public final int hashCode() {
                return this.f64763a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f64763a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData$CardInfo$Label;", "Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData$CardInfo;", "", "toString", "()Ljava/lang/String;", "feature_card_label_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Label implements CardInfo {

            @NotNull
            public static final Parcelable.Creator<Label> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64764a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64765b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Label(parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Label[i];
                }
            }

            public Label(String cardId, String label) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                Intrinsics.checkNotNullParameter(label, "label");
                this.f64764a = cardId;
                this.f64765b = label;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Label)) {
                    return false;
                }
                Label label = (Label) obj2;
                return Intrinsics.f(this.f64764a, label.f64764a) && Intrinsics.f(this.f64765b, label.f64765b);
            }

            @Override // com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData.CardInfo
            /* JADX INFO: renamed from: getCardId, reason: from getter */
            public final String getF64764a() {
                return this.f64764a;
            }

            public final int hashCode() {
                return this.f64765b.hashCode() + (this.f64764a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f64764a);
                dest.writeString(this.f64765b);
            }
        }

        /* JADX INFO: renamed from: getCardId */
        String getF64764a();
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardLabelScreenContract$InputData((CardInfo) parcel.readParcelable(CardLabelScreenContract$InputData.class.getClassLoader()), parcel.readInt(), (Clause) parcel.readParcelable(CardLabelScreenContract$InputData.class.getClassLoader()), InputTextFieldConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardLabelScreenContract$InputData[i];
        }
    }

    public CardLabelScreenContract$InputData(CardInfo cardInfo, int i, Clause clause, InputTextFieldConfiguration inputTextFieldConfiguration, boolean z) {
        Intrinsics.checkNotNullParameter(cardInfo, "cardInfo");
        Intrinsics.checkNotNullParameter(inputTextFieldConfiguration, "inputTextFieldConfiguration");
        this.f64760a = cardInfo;
        this.f64761b = i;
        this.f64762c = clause;
        this.d = inputTextFieldConfiguration;
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
        if (!(obj2 instanceof CardLabelScreenContract$InputData)) {
            return false;
        }
        CardLabelScreenContract$InputData cardLabelScreenContract$InputData = (CardLabelScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64760a, cardLabelScreenContract$InputData.f64760a) && this.f64761b == cardLabelScreenContract$InputData.f64761b && Intrinsics.f(this.f64762c, cardLabelScreenContract$InputData.f64762c) && Intrinsics.f(this.d, cardLabelScreenContract$InputData.d) && this.e == cardLabelScreenContract$InputData.e;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.f64761b, this.f64760a.hashCode() * 31, 31);
        Clause clause = this.f64762c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((iB + (clause == null ? 0 : clause.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64760a, i);
        dest.writeInt(this.f64761b);
        dest.writeParcelable(this.f64762c, i);
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card_label/ui/screen/card_label_screen/CardLabelScreenContract$InputData$InputTextFieldConfiguration;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_card_label_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputTextFieldConfiguration implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<InputTextFieldConfiguration> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f64766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f64767b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputTextFieldConfiguration((Clause) parcel.readParcelable(InputTextFieldConfiguration.class.getClassLoader()), (Clause) parcel.readParcelable(InputTextFieldConfiguration.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputTextFieldConfiguration[i];
            }
        }

        public InputTextFieldConfiguration(Clause clause, Clause clause2) {
            this.f64766a = clause;
            this.f64767b = clause2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InputTextFieldConfiguration)) {
                return false;
            }
            InputTextFieldConfiguration inputTextFieldConfiguration = (InputTextFieldConfiguration) obj2;
            return Intrinsics.f(this.f64766a, inputTextFieldConfiguration.f64766a) && Intrinsics.f(this.f64767b, inputTextFieldConfiguration.f64767b);
        }

        public final int hashCode() {
            Clause clause = this.f64766a;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            Clause clause2 = this.f64767b;
            return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f64766a, i);
            dest.writeParcelable(this.f64767b, i);
        }

        public InputTextFieldConfiguration() {
            this(null, null);
        }
    }
}
