package com.revolut.feature.retail.cobranded_cards.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/cobranded_cards/api/domain/model/CobrandedCardsPlanAdditionalValue;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_cobranded_cards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CobrandedCardsPlanAdditionalValue implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CobrandedCardsPlanAdditionalValue> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f82312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CobrandedCardsPlanAdditionalValueCta f82313c;
    public final ArrayList d;
    public final ParameterisedHyperText e;
    public final List f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            CobrandedCardsPlanAdditionalValueCta cobrandedCardsPlanAdditionalValueCtaCreateFromParcel = parcel.readInt() == 0 ? null : CobrandedCardsPlanAdditionalValueCta.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsPlanAdditionalValueSection.CREATOR, parcel, arrayList2, iA2, 1);
            }
            ParameterisedHyperText parameterisedHyperText = (ParameterisedHyperText) parcel.readParcelable(CobrandedCardsPlanAdditionalValue.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(CobrandedCardsPlanCardFees.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new CobrandedCardsPlanAdditionalValue(string, string2, cobrandedCardsPlanAdditionalValueCtaCreateFromParcel, arrayList2, parameterisedHyperText, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CobrandedCardsPlanAdditionalValue[i];
        }
    }

    public CobrandedCardsPlanAdditionalValue(String title, String str, CobrandedCardsPlanAdditionalValueCta cobrandedCardsPlanAdditionalValueCta, ArrayList sections, ParameterisedHyperText parameterisedHyperText, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f82311a = title;
        this.f82312b = str;
        this.f82313c = cobrandedCardsPlanAdditionalValueCta;
        this.d = sections;
        this.e = parameterisedHyperText;
        this.f = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CobrandedCardsPlanAdditionalValue)) {
            return false;
        }
        CobrandedCardsPlanAdditionalValue cobrandedCardsPlanAdditionalValue = (CobrandedCardsPlanAdditionalValue) obj2;
        return Intrinsics.f(this.f82311a, cobrandedCardsPlanAdditionalValue.f82311a) && Intrinsics.f(this.f82312b, cobrandedCardsPlanAdditionalValue.f82312b) && Intrinsics.f(this.f82313c, cobrandedCardsPlanAdditionalValue.f82313c) && this.d.equals(cobrandedCardsPlanAdditionalValue.d) && Intrinsics.f(this.e, cobrandedCardsPlanAdditionalValue.e) && Intrinsics.f(this.f, cobrandedCardsPlanAdditionalValue.f);
    }

    public final int hashCode() {
        int iHashCode = this.f82311a.hashCode() * 31;
        String str = this.f82312b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CobrandedCardsPlanAdditionalValueCta cobrandedCardsPlanAdditionalValueCta = this.f82313c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iHashCode2 + (cobrandedCardsPlanAdditionalValueCta == null ? 0 : cobrandedCardsPlanAdditionalValueCta.f82320a.hashCode())) * 31, 31);
        ParameterisedHyperText parameterisedHyperText = this.e;
        int iHashCode3 = (iB + (parameterisedHyperText == null ? 0 : parameterisedHyperText.f74758a.hashCode())) * 31;
        List list = this.f;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82311a);
        dest.writeString(this.f82312b);
        CobrandedCardsPlanAdditionalValueCta cobrandedCardsPlanAdditionalValueCta = this.f82313c;
        if (cobrandedCardsPlanAdditionalValueCta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            cobrandedCardsPlanAdditionalValueCta.writeToParcel(dest, i);
        }
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((CobrandedCardsPlanAdditionalValueSection) itY.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
        List list = this.f;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((CobrandedCardsPlanCardFees) itQ.next()).writeToParcel(dest, i);
        }
    }
}
