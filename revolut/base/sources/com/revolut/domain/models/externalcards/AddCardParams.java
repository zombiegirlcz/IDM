package com.revolut.domain.models.externalcards;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.common.CardDetails;
import dj0.d;
import io3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.j;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/domain/models/externalcards/AddCardParams;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddCardParams implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AddCardParams> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardDetails f60307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f60308c;
    public final j d;
    public final l e;
    public final TopUpContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f60309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Boolean f60310h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            CardDetails cardDetails = (CardDetails) parcel.readParcelable(AddCardParams.class.getClassLoader());
            d dVar = (d) parcel.readSerializable();
            j jVar = (j) parcel.readSerializable();
            l lVarValueOf = l.valueOf(parcel.readString());
            TopUpContext topUpContext = (TopUpContext) parcel.readParcelable(AddCardParams.class.getClassLoader());
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new AddCardParams(string, cardDetails, dVar, jVar, lVarValueOf, topUpContext, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddCardParams[i];
        }
    }

    public AddCardParams(String addMode, CardDetails cardDetails, d dVar, j issuer, l pocketType, TopUpContext topUpContext, String str, Boolean bool) {
        Intrinsics.checkNotNullParameter(addMode, "addMode");
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(topUpContext, "topUpContext");
        this.f60306a = addMode;
        this.f60307b = cardDetails;
        this.f60308c = dVar;
        this.d = issuer;
        this.e = pocketType;
        this.f = topUpContext;
        this.f60309g = str;
        this.f60310h = bool;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final TopUpContext getF() {
        return this.f;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getF60306a() {
        return this.f60306a;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CardDetails getF60307b() {
        return this.f60307b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF60309g() {
        return this.f60309g;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final j getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final l getE() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddCardParams)) {
            return false;
        }
        AddCardParams addCardParams = (AddCardParams) obj2;
        return Intrinsics.f(this.f60306a, addCardParams.f60306a) && Intrinsics.f(this.f60307b, addCardParams.f60307b) && Intrinsics.f(this.f60308c, addCardParams.f60308c) && Intrinsics.f(this.d, addCardParams.d) && this.e == addCardParams.e && Intrinsics.f(this.f, addCardParams.f) && Intrinsics.f(this.f60309g, addCardParams.f60309g) && Intrinsics.f(this.f60310h, addCardParams.f60310h);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getF60308c() {
        return this.f60308c;
    }

    public final int hashCode() {
        int iHashCode = (this.f60307b.hashCode() + (this.f60306a.hashCode() * 31)) * 31;
        d dVar = this.f60308c;
        int iHashCode2 = (this.f.hashCode() + t61.a.c(this.e, (this.d.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31)) * 31;
        String str = this.f60309g;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.f60310h;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String j() {
        return this.f60307b.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60306a);
        dest.writeParcelable(this.f60307b, i);
        dest.writeSerializable(this.f60308c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e.name());
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f60309g);
        Boolean bool = this.f60310h;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final Boolean getF60310h() {
        return this.f60310h;
    }
}
