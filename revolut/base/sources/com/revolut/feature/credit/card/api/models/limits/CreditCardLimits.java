package com.revolut.feature.credit.card.api.models.limits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.card.api.models.presentation.CreditCardDialogModel;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/limits/CreditCardLimits;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Direction", "Limit", "Error", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardLimits implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditCardLimits> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Direction f68816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Direction f68817b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/limits/CreditCardLimits$Direction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Direction implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Direction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Limit f68818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Limit f68819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f68820c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Direction(parcel.readInt() == 0 ? null : Limit.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Limit.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Direction[i];
            }
        }

        public Direction(Limit limit, Limit limit2, String str) {
            this.f68818a = limit;
            this.f68819b = limit2;
            this.f68820c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Direction)) {
                return false;
            }
            Direction direction = (Direction) obj2;
            return Intrinsics.f(this.f68818a, direction.f68818a) && Intrinsics.f(this.f68819b, direction.f68819b) && Intrinsics.f(this.f68820c, direction.f68820c);
        }

        public final int hashCode() {
            Limit limit = this.f68818a;
            int iHashCode = (limit == null ? 0 : limit.hashCode()) * 31;
            Limit limit2 = this.f68819b;
            int iHashCode2 = (iHashCode + (limit2 == null ? 0 : limit2.hashCode())) * 31;
            String str = this.f68820c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Limit limit = this.f68818a;
            if (limit == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                limit.writeToParcel(dest, i);
            }
            Limit limit2 = this.f68819b;
            if (limit2 == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                limit2.writeToParcel(dest, i);
            }
            dest.writeString(this.f68820c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/limits/CreditCardLimits$Error;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Error implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f68821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreditCardDialogModel f68822b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Error(parcel.readString(), parcel.readInt() == 0 ? null : CreditCardDialogModel.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        public Error(String label, CreditCardDialogModel creditCardDialogModel) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.f68821a = label;
            this.f68822b = creditCardDialogModel;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Error)) {
                return false;
            }
            Error error = (Error) obj2;
            return Intrinsics.f(this.f68821a, error.f68821a) && Intrinsics.f(this.f68822b, error.f68822b);
        }

        public final int hashCode() {
            int iHashCode = this.f68821a.hashCode() * 31;
            CreditCardDialogModel creditCardDialogModel = this.f68822b;
            return iHashCode + (creditCardDialogModel == null ? 0 : creditCardDialogModel.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f68821a);
            CreditCardDialogModel creditCardDialogModel = this.f68822b;
            if (creditCardDialogModel == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                creditCardDialogModel.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/card/api/models/limits/CreditCardLimits$Limit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Limit implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Limit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f68823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Error f68825c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Limit((d) parcel.readSerializable(), parcel.readString(), Error.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Limit[i];
            }
        }

        public Limit(d amount, String title, Error error) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(error, "error");
            this.f68823a = amount;
            this.f68824b = title;
            this.f68825c = error;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Limit)) {
                return false;
            }
            Limit limit = (Limit) obj2;
            return Intrinsics.f(this.f68823a, limit.f68823a) && Intrinsics.f(this.f68824b, limit.f68824b) && Intrinsics.f(this.f68825c, limit.f68825c);
        }

        public final int hashCode() {
            return this.f68825c.hashCode() + p.a.c(this.f68823a.hashCode() * 31, 31, this.f68824b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68823a);
            dest.writeString(this.f68824b);
            this.f68825c.writeToParcel(dest, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardLimits(parcel.readInt() == 0 ? null : Direction.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Direction.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardLimits[i];
        }
    }

    public CreditCardLimits(Direction direction, Direction direction2) {
        this.f68816a = direction;
        this.f68817b = direction2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardLimits)) {
            return false;
        }
        CreditCardLimits creditCardLimits = (CreditCardLimits) obj2;
        return Intrinsics.f(this.f68816a, creditCardLimits.f68816a) && Intrinsics.f(this.f68817b, creditCardLimits.f68817b);
    }

    public final int hashCode() {
        Direction direction = this.f68816a;
        int iHashCode = (direction == null ? 0 : direction.hashCode()) * 31;
        Direction direction2 = this.f68817b;
        return iHashCode + (direction2 != null ? direction2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Direction direction = this.f68816a;
        if (direction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            direction.writeToParcel(dest, i);
        }
        Direction direction2 = this.f68817b;
        if (direction2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            direction2.writeToParcel(dest, i);
        }
    }
}
