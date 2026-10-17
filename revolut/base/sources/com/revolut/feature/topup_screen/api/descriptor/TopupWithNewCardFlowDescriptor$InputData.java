package com.revolut.feature.topup_screen.api.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t61.j;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/api/descriptor/TopupWithNewCardFlowDescriptor$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopupWithNewCardFlowDescriptor$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TopupWithNewCardFlowDescriptor$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardDetails f90499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yte.a f90500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f90501c;
    public final d d;
    public final TopUpTarget e;
    public final TopUpContext f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f90502g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f90503h;
    public final Boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            CardDetails cardDetails = (CardDetails) parcel.readParcelable(TopupWithNewCardFlowDescriptor$InputData.class.getClassLoader());
            yte.a aVarValueOf = yte.a.valueOf(parcel.readString());
            j jVar = (j) parcel.readSerializable();
            d dVar = (d) parcel.readSerializable();
            TopUpTarget topUpTarget = (TopUpTarget) parcel.readParcelable(TopupWithNewCardFlowDescriptor$InputData.class.getClassLoader());
            TopUpContext topUpContext = (TopUpContext) parcel.readParcelable(TopupWithNewCardFlowDescriptor$InputData.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new TopupWithNewCardFlowDescriptor$InputData(cardDetails, aVarValueOf, jVar, dVar, topUpTarget, topUpContext, string, string2, boolValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopupWithNewCardFlowDescriptor$InputData[i];
        }
    }

    public TopupWithNewCardFlowDescriptor$InputData(CardDetails cardDetails, yte.a addCardMode, j issuer, d dVar, TopUpTarget topUpTarget, TopUpContext topUpContext, String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(cardDetails, "cardDetails");
        Intrinsics.checkNotNullParameter(addCardMode, "addCardMode");
        Intrinsics.checkNotNullParameter(issuer, "issuer");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        this.f90499a = cardDetails;
        this.f90500b = addCardMode;
        this.f90501c = issuer;
        this.d = dVar;
        this.e = topUpTarget;
        this.f = topUpContext;
        this.f90502g = str;
        this.f90503h = str2;
        this.i = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TopupWithNewCardFlowDescriptor$InputData)) {
            return false;
        }
        TopupWithNewCardFlowDescriptor$InputData topupWithNewCardFlowDescriptor$InputData = (TopupWithNewCardFlowDescriptor$InputData) obj2;
        return Intrinsics.f(this.f90499a, topupWithNewCardFlowDescriptor$InputData.f90499a) && this.f90500b == topupWithNewCardFlowDescriptor$InputData.f90500b && Intrinsics.f(this.f90501c, topupWithNewCardFlowDescriptor$InputData.f90501c) && Intrinsics.f(this.d, topupWithNewCardFlowDescriptor$InputData.d) && Intrinsics.f(this.e, topupWithNewCardFlowDescriptor$InputData.e) && Intrinsics.f(this.f, topupWithNewCardFlowDescriptor$InputData.f) && Intrinsics.f(this.f90502g, topupWithNewCardFlowDescriptor$InputData.f90502g) && Intrinsics.f(this.f90503h, topupWithNewCardFlowDescriptor$InputData.f90503h) && Intrinsics.f(this.i, topupWithNewCardFlowDescriptor$InputData.i);
    }

    public final int hashCode() {
        int iHashCode = (this.f90501c.hashCode() + ((this.f90500b.hashCode() + (this.f90499a.hashCode() * 31)) * 31)) * 31;
        d dVar = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31;
        TopUpContext topUpContext = this.f;
        int iHashCode3 = (iHashCode2 + (topUpContext == null ? 0 : topUpContext.hashCode())) * 31;
        String str = this.f90502g;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90503h;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.i;
        return iHashCode5 + (bool != null ? bool.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f90499a, i);
        dest.writeString(this.f90500b.name());
        dest.writeSerializable(this.f90501c);
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f90502g);
        dest.writeString(this.f90503h);
        Boolean bool = this.i;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
    }

    public /* synthetic */ TopupWithNewCardFlowDescriptor$InputData(CardDetails cardDetails, yte.a aVar, j jVar, d dVar, TopUpTarget topUpTarget, String str, String str2, Boolean bool, int i) {
        this(cardDetails, aVar, jVar, dVar, topUpTarget, (TopUpContext) null, str, (i & 128) != 0 ? null : str2, (i & 256) != 0 ? null : bool);
    }
}
