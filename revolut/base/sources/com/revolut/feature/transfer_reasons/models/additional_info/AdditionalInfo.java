package com.revolut.feature.transfer_reasons.models.additional_info;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ttf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/additional_info/AdditionalInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92402c;
    public final String d;
    public final AdditionalInfoFooter e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AdditionalInfoField.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AdditionalInfo(bVarValueOf, arrayList, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdditionalInfoFooter.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInfo[i];
        }
    }

    public AdditionalInfo(b catalogue, List additionalInfo, String str, String str2, AdditionalInfoFooter additionalInfoFooter) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.f92400a = catalogue;
        this.f92401b = additionalInfo;
        this.f92402c = str;
        this.d = str2;
        this.e = additionalInfoFooter;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInfo)) {
            return false;
        }
        AdditionalInfo additionalInfo = (AdditionalInfo) obj2;
        return this.f92400a == additionalInfo.f92400a && Intrinsics.f(this.f92401b, additionalInfo.f92401b) && Intrinsics.f(this.f92402c, additionalInfo.f92402c) && Intrinsics.f(this.d, additionalInfo.d) && Intrinsics.f(this.e, additionalInfo.e);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f92400a.hashCode() * 31, 31, this.f92401b);
        String str = this.f92402c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdditionalInfoFooter additionalInfoFooter = this.e;
        return iHashCode2 + (additionalInfoFooter != null ? additionalInfoFooter.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92400a.name());
        Iterator itV = p.a.v(this.f92401b, dest);
        while (itV.hasNext()) {
            ((AdditionalInfoField) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f92402c);
        dest.writeString(this.d);
        AdditionalInfoFooter additionalInfoFooter = this.e;
        if (additionalInfoFooter == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalInfoFooter.writeToParcel(dest, i);
        }
    }
}
