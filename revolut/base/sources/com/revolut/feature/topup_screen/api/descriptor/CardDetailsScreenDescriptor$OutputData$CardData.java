package com.revolut.feature.topup_screen.api.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.feature.topup_screen.common.CardDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ste.b;
import t61.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/topup_screen/api/descriptor/CardDetailsScreenDescriptor$OutputData$CardData", "Lste/b;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardDetailsScreenDescriptor$OutputData$CardData implements b, Parcelable {

    @NotNull
    public static final Parcelable.Creator<CardDetailsScreenDescriptor$OutputData$CardData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDetails f90484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yte.a f90485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f90486c;
    public final String d;
    public final CardholderVerificationStatus e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Boolean f90487g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CardDetails cardDetails = (CardDetails) parcel.readParcelable(CardDetailsScreenDescriptor$OutputData$CardData.class.getClassLoader());
            yte.a aVarValueOf = yte.a.valueOf(parcel.readString());
            j jVar = (j) parcel.readSerializable();
            String string = parcel.readString();
            Boolean boolValueOf = null;
            CardholderVerificationStatus cardholderVerificationStatusValueOf = parcel.readInt() == 0 ? null : CardholderVerificationStatus.valueOf(parcel.readString());
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CardDetailsScreenDescriptor$OutputData$CardData(cardDetails, aVarValueOf, jVar, string, cardholderVerificationStatusValueOf, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardDetailsScreenDescriptor$OutputData$CardData[i];
        }
    }

    public CardDetailsScreenDescriptor$OutputData$CardData(CardDetails cardDetails, yte.a addCardMode, j issuer, String str, CardholderVerificationStatus cardholderVerificationStatus, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        Intrinsics.checkNotNullParameter(addCardMode, "addCardMode");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        this.f90484a = cardDetails;
        this.f90485b = addCardMode;
        this.f90486c = issuer;
        this.d = str;
        this.e = cardholderVerificationStatus;
        this.f = str2;
        this.f90487g = bool;
    }

    public static CardDetailsScreenDescriptor$OutputData$CardData j(CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData, String str) {
        CardDetails cardDetails = cardDetailsScreenDescriptor$OutputData$CardData.f90484a;
        yte.a addCardMode = cardDetailsScreenDescriptor$OutputData$CardData.f90485b;
        j issuer = cardDetailsScreenDescriptor$OutputData$CardData.f90486c;
        String str2 = cardDetailsScreenDescriptor$OutputData$CardData.d;
        CardholderVerificationStatus cardholderVerificationStatus = cardDetailsScreenDescriptor$OutputData$CardData.e;
        Boolean bool = cardDetailsScreenDescriptor$OutputData$CardData.f90487g;
        cardDetailsScreenDescriptor$OutputData$CardData.getClass();
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        Intrinsics.checkNotNullParameter(addCardMode, "addCardMode");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        return new CardDetailsScreenDescriptor$OutputData$CardData(cardDetails, addCardMode, issuer, str2, cardholderVerificationStatus, str, bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardDetailsScreenDescriptor$OutputData$CardData)) {
            return false;
        }
        CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData = (CardDetailsScreenDescriptor$OutputData$CardData) obj2;
        return Intrinsics.f(this.f90484a, cardDetailsScreenDescriptor$OutputData$CardData.f90484a) && this.f90485b == cardDetailsScreenDescriptor$OutputData$CardData.f90485b && Intrinsics.f(this.f90486c, cardDetailsScreenDescriptor$OutputData$CardData.f90486c) && Intrinsics.f(this.d, cardDetailsScreenDescriptor$OutputData$CardData.d) && this.e == cardDetailsScreenDescriptor$OutputData$CardData.e && Intrinsics.f(this.f, cardDetailsScreenDescriptor$OutputData$CardData.f) && Intrinsics.f(this.f90487g, cardDetailsScreenDescriptor$OutputData$CardData.f90487g);
    }

    public final int hashCode() {
        int iHashCode = (this.f90486c.hashCode() + ((this.f90485b.hashCode() + (this.f90484a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CardholderVerificationStatus cardholderVerificationStatus = this.e;
        int iHashCode3 = (iHashCode2 + (cardholderVerificationStatus == null ? 0 : cardholderVerificationStatus.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f90487g;
        return iHashCode4 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90484a, i);
        dest.writeString(this.f90485b.name());
        dest.writeSerializable(this.f90486c);
        dest.writeString(this.d);
        CardholderVerificationStatus cardholderVerificationStatus = this.e;
        if (cardholderVerificationStatus == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cardholderVerificationStatus.name());
        }
        dest.writeString(this.f);
        Boolean bool = this.f90487g;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }
}
