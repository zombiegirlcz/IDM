package com.revolut.feature.transfer_reasons.models.additional_info;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import stf.b;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/transfer_reasons/models/additional_info/AdditionalInfoField;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_transfer_reasons_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInfoField implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalInfoField> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f92408c;
    public final b d;
    public final boolean e;
    public final AdditionalInfoValidation f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final stf.a f92409g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f92410h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            int iA = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            ArrayList arrayList = null;
            AdditionalInfoValidation additionalInfoValidationCreateFromParcel = parcel.readInt() == 0 ? null : AdditionalInfoValidation.CREATOR.createFromParcel(parcel);
            stf.a aVarValueOf = parcel.readInt() == 0 ? null : stf.a.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(AdditionalInfoFieldOption.CREATOR, parcel, arrayList2, iA, i);
                }
                arrayList = arrayList2;
            }
            return new AdditionalInfoField(string, string2, string3, bVarValueOf, z, additionalInfoValidationCreateFromParcel, aVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInfoField[i];
        }
    }

    public AdditionalInfoField(String id10, String label, String str, b valueType, boolean z, AdditionalInfoValidation additionalInfoValidation, stf.a aVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(valueType, "valueType");
        this.f92406a = id10;
        this.f92407b = label;
        this.f92408c = str;
        this.d = valueType;
        this.e = z;
        this.f = additionalInfoValidation;
        this.f92409g = aVar;
        this.f92410h = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInfoField)) {
            return false;
        }
        AdditionalInfoField additionalInfoField = (AdditionalInfoField) obj2;
        return Intrinsics.f(this.f92406a, additionalInfoField.f92406a) && Intrinsics.f(this.f92407b, additionalInfoField.f92407b) && Intrinsics.f(this.f92408c, additionalInfoField.f92408c) && this.d == additionalInfoField.d && this.e == additionalInfoField.e && Intrinsics.f(this.f, additionalInfoField.f) && this.f92409g == additionalInfoField.f92409g && Intrinsics.f(this.f92410h, additionalInfoField.f92410h);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f92406a.hashCode() * 31, 31, this.f92407b);
        String str = this.f92408c;
        int iC2 = j6.a.c((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.e);
        AdditionalInfoValidation additionalInfoValidation = this.f;
        int iHashCode = (iC2 + (additionalInfoValidation == null ? 0 : additionalInfoValidation.hashCode())) * 31;
        stf.a aVar = this.f92409g;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        List list = this.f92410h;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92406a);
        dest.writeString(this.f92407b);
        dest.writeString(this.f92408c);
        dest.writeString(this.d.name());
        dest.writeInt(this.e ? 1 : 0);
        AdditionalInfoValidation additionalInfoValidation = this.f;
        if (additionalInfoValidation == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            additionalInfoValidation.writeToParcel(dest, i);
        }
        stf.a aVar = this.f92409g;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        List list = this.f92410h;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((AdditionalInfoFieldOption) itQ.next()).writeToParcel(dest, i);
        }
    }
}
