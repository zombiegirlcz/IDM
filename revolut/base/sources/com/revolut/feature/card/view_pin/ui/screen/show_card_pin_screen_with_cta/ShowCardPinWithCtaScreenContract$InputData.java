package com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/ShowCardPinWithCtaScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "ViewPinImmediately", "ViewPinAfterCtaClick", "Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/ShowCardPinWithCtaScreenContract$InputData$ViewPinAfterCtaClick;", "Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/ShowCardPinWithCtaScreenContract$InputData$ViewPinImmediately;", "feature_card_view_pin_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ShowCardPinWithCtaScreenContract$InputData implements IOData$Input {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/ShowCardPinWithCtaScreenContract$InputData$ViewPinAfterCtaClick;", "Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/ShowCardPinWithCtaScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_view_pin_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewPinAfterCtaClick extends ShowCardPinWithCtaScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ViewPinAfterCtaClick> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f64418b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f64419c;
        public final Clause d;
        public final Image e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ViewPinAfterCtaClick(parcel.readString(), (Clause) parcel.readParcelable(ViewPinAfterCtaClick.class.getClassLoader()), (Clause) parcel.readParcelable(ViewPinAfterCtaClick.class.getClassLoader()), (Clause) parcel.readParcelable(ViewPinAfterCtaClick.class.getClassLoader()), (Image) parcel.readParcelable(ViewPinAfterCtaClick.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewPinAfterCtaClick[i];
            }
        }

        public ViewPinAfterCtaClick(String cardId, Clause clause, Clause clause2, Clause clause3, Image image) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64417a = cardId;
            this.f64418b = clause;
            this.f64419c = clause2;
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
            if (!(obj2 instanceof ViewPinAfterCtaClick)) {
                return false;
            }
            ViewPinAfterCtaClick viewPinAfterCtaClick = (ViewPinAfterCtaClick) obj2;
            return Intrinsics.f(this.f64417a, viewPinAfterCtaClick.f64417a) && Intrinsics.f(this.f64418b, viewPinAfterCtaClick.f64418b) && Intrinsics.f(this.f64419c, viewPinAfterCtaClick.f64419c) && Intrinsics.f(this.d, viewPinAfterCtaClick.d) && Intrinsics.f(this.e, viewPinAfterCtaClick.e);
        }

        @Override // com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData
        /* JADX INFO: renamed from: getCardId, reason: from getter */
        public final String getF64420a() {
            return this.f64417a;
        }

        public final int hashCode() {
            int iHashCode = this.f64417a.hashCode() * 31;
            Clause clause = this.f64418b;
            int iHashCode2 = (iHashCode + (clause == null ? 0 : clause.hashCode())) * 31;
            Clause clause2 = this.f64419c;
            int iHashCode3 = (iHashCode2 + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            Clause clause3 = this.d;
            int iHashCode4 = (iHashCode3 + (clause3 == null ? 0 : clause3.hashCode())) * 31;
            Image image = this.e;
            return iHashCode4 + (image != null ? image.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64417a);
            dest.writeParcelable(this.f64418b, i);
            dest.writeParcelable(this.f64419c, i);
            dest.writeParcelable(this.d, i);
            dest.writeParcelable(this.e, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/ShowCardPinWithCtaScreenContract$InputData$ViewPinImmediately;", "Lcom/revolut/feature/card/view_pin/ui/screen/show_card_pin_screen_with_cta/ShowCardPinWithCtaScreenContract$InputData;", "", "toString", "()Ljava/lang/String;", "feature_card_view_pin_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ViewPinImmediately extends ShowCardPinWithCtaScreenContract$InputData {

        @NotNull
        public static final Parcelable.Creator<ViewPinImmediately> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64420a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64421b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f64422c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ViewPinImmediately(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ViewPinImmediately[i];
            }
        }

        public ViewPinImmediately(String cardId, boolean z, boolean z3) {
            Intrinsics.checkNotNullParameter(cardId, "cardId");
            this.f64420a = cardId;
            this.f64421b = z;
            this.f64422c = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ViewPinImmediately)) {
                return false;
            }
            ViewPinImmediately viewPinImmediately = (ViewPinImmediately) obj2;
            return Intrinsics.f(this.f64420a, viewPinImmediately.f64420a) && this.f64421b == viewPinImmediately.f64421b && this.f64422c == viewPinImmediately.f64422c;
        }

        @Override // com.revolut.feature.card.view_pin.ui.screen.show_card_pin_screen_with_cta.ShowCardPinWithCtaScreenContract$InputData
        /* JADX INFO: renamed from: getCardId, reason: from getter */
        public final String getF64420a() {
            return this.f64420a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f64422c) + j6.a.c(this.f64420a.hashCode() * 31, 31, this.f64421b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f64420a);
            dest.writeInt(this.f64421b ? 1 : 0);
            dest.writeInt(this.f64422c ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: getCardId */
    public abstract String getF64420a();
}
