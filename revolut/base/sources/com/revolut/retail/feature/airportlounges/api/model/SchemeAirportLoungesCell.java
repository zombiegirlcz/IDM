package com.revolut.retail.feature.airportlounges.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/SchemeAirportLoungesCell;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Action", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemeAirportLoungesCell implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SchemeAirportLoungesCell> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f98934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f98935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f98936c;
    public final Action d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/SchemeAirportLoungesCell$Action;", "Landroid/os/Parcelable;", "<init>", "()V", "CopyCardNumber", "OpenApp", "Lcom/revolut/retail/feature/airportlounges/api/model/SchemeAirportLoungesCell$Action$CopyCardNumber;", "Lcom/revolut/retail/feature/airportlounges/api/model/SchemeAirportLoungesCell$Action$OpenApp;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Action implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/SchemeAirportLoungesCell$Action$CopyCardNumber;", "Lcom/revolut/retail/feature/airportlounges/api/model/SchemeAirportLoungesCell$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CopyCardNumber extends Action {

            @NotNull
            public static final Parcelable.Creator<CopyCardNumber> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f98937a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CopyCardNumber(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CopyCardNumber[i];
                }
            }

            public CopyCardNumber(String cardId) {
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                this.f98937a = cardId;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CopyCardNumber) && Intrinsics.f(this.f98937a, ((CopyCardNumber) obj2).f98937a);
            }

            public final int hashCode() {
                return this.f98937a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f98937a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/airportlounges/api/model/SchemeAirportLoungesCell$Action$OpenApp;", "Lcom/revolut/retail/feature/airportlounges/api/model/SchemeAirportLoungesCell$Action;", "", "toString", "()Ljava/lang/String;", "feature_retail_airport_lounges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenApp extends Action {

            @NotNull
            public static final Parcelable.Creator<OpenApp> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f98938a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new OpenApp(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OpenApp[i];
                }
            }

            public OpenApp(String deeplink) {
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                this.f98938a = deeplink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof OpenApp) && Intrinsics.f(this.f98938a, ((OpenApp) obj2).f98938a);
            }

            public final int hashCode() {
                return this.f98938a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f98938a);
            }
        }

        private Action() {
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SchemeAirportLoungesCell(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(SchemeAirportLoungesCell.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SchemeAirportLoungesCell[i];
        }
    }

    public SchemeAirportLoungesCell(String icon, String title, String subtitle, Action action) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f98934a = icon;
        this.f98935b = title;
        this.f98936c = subtitle;
        this.d = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SchemeAirportLoungesCell)) {
            return false;
        }
        SchemeAirportLoungesCell schemeAirportLoungesCell = (SchemeAirportLoungesCell) obj2;
        return Intrinsics.f(this.f98934a, schemeAirportLoungesCell.f98934a) && Intrinsics.f(this.f98935b, schemeAirportLoungesCell.f98935b) && Intrinsics.f(this.f98936c, schemeAirportLoungesCell.f98936c) && Intrinsics.f(this.d, schemeAirportLoungesCell.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f98934a.hashCode() * 31, 31, this.f98935b), 31, this.f98936c);
        Action action = this.d;
        return iC + (action == null ? 0 : action.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f98934a);
        dest.writeString(this.f98935b);
        dest.writeString(this.f98936c);
        dest.writeParcelable(this.d, i);
    }
}
