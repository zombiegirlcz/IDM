package com.revolut.feature.transfer_reasons.models.reason;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoEntry;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ttf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/reason/TransferReasonsValues;", "Landroid/os/Parcelable;", "Ljava/io/Serializable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferReasonsValues implements Parcelable, Serializable {

    @NotNull
    public static final Parcelable.Creator<TransferReasonsValues> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f92444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f92445b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92446c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AdditionalInfoEntry.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(TransferReasonsValues.class, parcel, arrayList2, iE, 1);
            }
            return new TransferReasonsValues(bVarValueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferReasonsValues[i];
        }
    }

    public TransferReasonsValues(b catalogue, List additionalInfo, List values) {
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f92444a = catalogue;
        this.f92445b = additionalInfo;
        this.f92446c = values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferReasonsValues)) {
            return false;
        }
        TransferReasonsValues transferReasonsValues = (TransferReasonsValues) obj2;
        return this.f92444a == transferReasonsValues.f92444a && Intrinsics.f(this.f92445b, transferReasonsValues.f92445b) && Intrinsics.f(this.f92446c, transferReasonsValues.f92446c);
    }

    public final int hashCode() {
        return this.f92446c.hashCode() + p.a.d(this.f92444a.hashCode() * 31, 31, this.f92445b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92444a.name());
        Iterator itV = p.a.v(this.f92445b, dest);
        while (itV.hasNext()) {
            ((AdditionalInfoEntry) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f92446c, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
