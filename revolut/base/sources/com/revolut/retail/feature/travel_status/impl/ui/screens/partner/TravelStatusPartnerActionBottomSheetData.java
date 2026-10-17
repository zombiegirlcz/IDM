package com.revolut.retail.feature.travel_status.impl.ui.screens.partner;

import a2l.p;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/screens/partner/TravelStatusPartnerActionBottomSheetData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "i2l/a", "Button", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelStatusPartnerActionBottomSheetData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelStatusPartnerActionBottomSheetData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f104319c;
    public final Button d;
    public final i2l.a e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/travel_status/impl/ui/screens/partner/TravelStatusPartnerActionBottomSheetData$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f104321b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button(parcel.readString(), p.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String label, p action) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f104320a = label;
            this.f104321b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f104320a, button.f104320a) && this.f104321b == button.f104321b;
        }

        public final int hashCode() {
            return this.f104321b.hashCode() + (this.f104320a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104320a);
            dest.writeString(this.f104321b.name());
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelStatusPartnerActionBottomSheetData(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Button.CREATOR.createFromParcel(parcel) : null, i2l.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelStatusPartnerActionBottomSheetData[i];
        }
    }

    public TravelStatusPartnerActionBottomSheetData(String title, String str, Button button, Button button2, i2l.a buttonLayout) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(buttonLayout, "buttonLayout");
        this.f104317a = title;
        this.f104318b = str;
        this.f104319c = button;
        this.d = button2;
        this.e = buttonLayout;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelStatusPartnerActionBottomSheetData)) {
            return false;
        }
        TravelStatusPartnerActionBottomSheetData travelStatusPartnerActionBottomSheetData = (TravelStatusPartnerActionBottomSheetData) obj2;
        return Intrinsics.f(this.f104317a, travelStatusPartnerActionBottomSheetData.f104317a) && Intrinsics.f(this.f104318b, travelStatusPartnerActionBottomSheetData.f104318b) && Intrinsics.f(this.f104319c, travelStatusPartnerActionBottomSheetData.f104319c) && Intrinsics.f(this.d, travelStatusPartnerActionBottomSheetData.d) && this.e == travelStatusPartnerActionBottomSheetData.e;
    }

    public final int hashCode() {
        int iHashCode = this.f104317a.hashCode() * 31;
        String str = this.f104318b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Button button = this.f104319c;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        Button button2 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (button2 != null ? button2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104317a);
        dest.writeString(this.f104318b);
        Button button = this.f104319c;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
        Button button2 = this.d;
        if (button2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button2.writeToParcel(dest, i);
        }
        dest.writeString(this.e.name());
    }
}
