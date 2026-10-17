package com.revolut.feature.credit.card.impl.ui.limit_hub.limit_increase_preference;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xp3.d;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/limit_hub/limit_increase_preference/CreditCardLimitIncreasePreferenceContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardLimitIncreasePreferenceContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardLimitIncreasePreferenceContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f69538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f69539c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            d dVarValueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(d.valueOf(parcel.readString()));
            }
            return new CreditCardLimitIncreasePreferenceContract$InputData(string, dVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardLimitIncreasePreferenceContract$InputData[i];
        }
    }

    public CreditCardLimitIncreasePreferenceContract$InputData(String facilityId, d dVar, ArrayList availableOptions) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        this.f69537a = facilityId;
        this.f69538b = dVar;
        this.f69539c = availableOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardLimitIncreasePreferenceContract$InputData)) {
            return false;
        }
        CreditCardLimitIncreasePreferenceContract$InputData creditCardLimitIncreasePreferenceContract$InputData = (CreditCardLimitIncreasePreferenceContract$InputData) obj2;
        return Intrinsics.f(this.f69537a, creditCardLimitIncreasePreferenceContract$InputData.f69537a) && this.f69538b == creditCardLimitIncreasePreferenceContract$InputData.f69538b && this.f69539c.equals(creditCardLimitIncreasePreferenceContract$InputData.f69539c);
    }

    public final int hashCode() {
        int iHashCode = this.f69537a.hashCode() * 31;
        d dVar = this.f69538b;
        return this.f69539c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69537a);
        d dVar = this.f69538b;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        Iterator itY = j6.a.y(this.f69539c, dest);
        while (itY.hasNext()) {
            dest.writeString(((d) itY.next()).name());
        }
    }
}
