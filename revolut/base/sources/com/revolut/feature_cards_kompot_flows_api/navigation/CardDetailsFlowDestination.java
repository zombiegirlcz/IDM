package com.revolut.feature_cards_kompot_flows_api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.kompot.common.InternalDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0002\u0007\bJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$InputData;", "", "", "toString", "()Ljava/lang/String;", "InputData", "StartType", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDetailsFlowDestination extends InternalDestination<InputData> implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<CardDetailsFlowDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StartType f96626b;

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$InputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InputData implements IOData$Input {

        @NotNull
        public static final Parcelable.Creator<InputData> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final StartType f96627a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InputData((StartType) parcel.readParcelable(InputData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InputData[i];
            }
        }

        public InputData(StartType startType) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            this.f96627a = startType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InputData) && Intrinsics.f(this.f96627a, ((InputData) obj2).f96627a);
        }

        public final int hashCode() {
            return this.f96627a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f96627a, i);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType;", "Landroid/os/Parcelable;", "<init>", "()V", "ShowPin", "ShowPinWithCtaImmediately", "ShowPinWithCtaAfterClick", "ChangeCardLabel", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType$ChangeCardLabel;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType$ShowPin;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType$ShowPinWithCtaAfterClick;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType$ShowPinWithCtaImmediately;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class StartType implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType$ChangeCardLabel;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ChangeCardLabel extends StartType {

            @NotNull
            public static final Parcelable.Creator<ChangeCardLabel> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96628a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f96629b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ChangeCardLabel(parcel.readString(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ChangeCardLabel[i];
                }
            }

            public ChangeCardLabel(String cardId, int i) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f96628a = cardId;
                this.f96629b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ChangeCardLabel)) {
                    return false;
                }
                ChangeCardLabel changeCardLabel = (ChangeCardLabel) obj2;
                return Intrinsics.f(this.f96628a, changeCardLabel.f96628a) && this.f96629b == changeCardLabel.f96629b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f96629b) + (this.f96628a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96628a);
                dest.writeInt(this.f96629b);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType$ShowPin;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPin extends StartType {

            @NotNull
            public static final Parcelable.Creator<ShowPin> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96630a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f96631b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f96632c;
            public final boolean d;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowPin(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowPin[i];
                }
            }

            public ShowPin(String cardId, boolean z, boolean z3, boolean z4) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f96630a = cardId;
                this.f96631b = z;
                this.f96632c = z3;
                this.d = z4;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ShowPin)) {
                    return false;
                }
                ShowPin showPin = (ShowPin) obj2;
                return Intrinsics.f(this.f96630a, showPin.f96630a) && this.f96631b == showPin.f96631b && this.f96632c == showPin.f96632c && this.d == showPin.d;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(this.f96630a.hashCode() * 31, 31, this.f96631b), 31, this.f96632c);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96630a);
                dest.writeInt(this.f96631b ? 1 : 0);
                dest.writeInt(this.f96632c ? 1 : 0);
                dest.writeInt(this.d ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType$ShowPinWithCtaAfterClick;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPinWithCtaAfterClick extends StartType {

            @NotNull
            public static final Parcelable.Creator<ShowPinWithCtaAfterClick> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96633a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Clause f96634b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Clause f96635c;
            public final Clause d;
            public final Image e;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowPinWithCtaAfterClick(parcel.readString(), (Clause) parcel.readParcelable(ShowPinWithCtaAfterClick.class.getClassLoader()), (Clause) parcel.readParcelable(ShowPinWithCtaAfterClick.class.getClassLoader()), (Clause) parcel.readParcelable(ShowPinWithCtaAfterClick.class.getClassLoader()), (Image) parcel.readParcelable(ShowPinWithCtaAfterClick.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowPinWithCtaAfterClick[i];
                }
            }

            public ShowPinWithCtaAfterClick(String cardId, Clause clause, Clause clause2, Clause clause3, Image image) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f96633a = cardId;
                this.f96634b = clause;
                this.f96635c = clause2;
                this.d = clause3;
                this.e = image;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ShowPinWithCtaAfterClick)) {
                    return false;
                }
                ShowPinWithCtaAfterClick showPinWithCtaAfterClick = (ShowPinWithCtaAfterClick) obj2;
                return Intrinsics.f(this.f96633a, showPinWithCtaAfterClick.f96633a) && Intrinsics.f(this.f96634b, showPinWithCtaAfterClick.f96634b) && Intrinsics.f(this.f96635c, showPinWithCtaAfterClick.f96635c) && Intrinsics.f(this.d, showPinWithCtaAfterClick.d) && Intrinsics.f(this.e, showPinWithCtaAfterClick.e);
            }

            public final int hashCode() {
                int iHashCode = this.f96633a.hashCode() * 31;
                Clause clause = this.f96634b;
                int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
                Clause clause2 = this.f96635c;
                int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
                Clause clause3 = this.d;
                int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
                Image image = this.e;
                return iHashCode4 + (image != null ? image.hashCode() : 0);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96633a);
                dest.writeParcelable(this.f96634b, i);
                dest.writeParcelable(this.f96635c, i);
                dest.writeParcelable(this.d, i);
                dest.writeParcelable(this.e, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType$ShowPinWithCtaImmediately;", "Lcom/revolut/feature_cards_kompot_flows_api/navigation/CardDetailsFlowDestination$StartType;", "", "toString", "()Ljava/lang/String;", "feature_cards_kompot_flows_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPinWithCtaImmediately extends StartType {

            @NotNull
            public static final Parcelable.Creator<ShowPinWithCtaImmediately> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f96636a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f96637b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f96638c;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowPinWithCtaImmediately(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowPinWithCtaImmediately[i];
                }
            }

            public ShowPinWithCtaImmediately(String cardId, boolean z, boolean z3) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f96636a = cardId;
                this.f96637b = z;
                this.f96638c = z3;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof ShowPinWithCtaImmediately)) {
                    return false;
                }
                ShowPinWithCtaImmediately showPinWithCtaImmediately = (ShowPinWithCtaImmediately) obj2;
                return Intrinsics.f(this.f96636a, showPinWithCtaImmediately.f96636a) && this.f96637b == showPinWithCtaImmediately.f96637b && this.f96638c == showPinWithCtaImmediately.f96638c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f96638c) + j6.a.c(this.f96636a.hashCode() * 31, 31, this.f96637b);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f96636a);
                dest.writeInt(this.f96637b ? 1 : 0);
                dest.writeInt(this.f96638c ? 1 : 0);
            }
        }

        private StartType() {
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardDetailsFlowDestination((StartType) parcel.readParcelable(CardDetailsFlowDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDetailsFlowDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardDetailsFlowDestination(StartType startType) {
        super(new InputData(startType));
        Intrinsics.checkNotNullParameter(startType, "startType");
        this.f96626b = startType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CardDetailsFlowDestination) && Intrinsics.f(this.f96626b, ((CardDetailsFlowDestination) obj2).f96626b);
    }

    public final int hashCode() {
        return this.f96626b.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f96626b, i);
    }
}
