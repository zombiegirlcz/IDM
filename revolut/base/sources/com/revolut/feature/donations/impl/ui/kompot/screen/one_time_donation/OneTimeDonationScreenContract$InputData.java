package com.revolut.feature.donations.impl.ui.kompot.screen.one_time_donation;

import android.os.Parcel;
import android.os.Parcelable;
import ba6.u;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/donations/impl/ui/kompot/screen/one_time_donation/OneTimeDonationScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OneTimeDonationScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<OneTimeDonationScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f72081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f72082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f72083c;
    public final Map d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            u uVarValueOf = u.valueOf(parcel.readString());
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            int iD = 0;
            while (iD != i) {
                iD = j6.a.d(parcel, linkedHashMap, parcel.readString(), iD, 1);
            }
            return new OneTimeDonationScreenContract$InputData(uVarValueOf, dVar, string, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OneTimeDonationScreenContract$InputData[i];
        }
    }

    public OneTimeDonationScreenContract$InputData(u donationMode, d dVar, String charityId, Map parameters) {
        Intrinsics.checkNotNullParameter(charityId, "charityId");
        Intrinsics.checkNotNullParameter(donationMode, "donationMode");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.f72081a = charityId;
        this.f72082b = donationMode;
        this.f72083c = dVar;
        this.d = parameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OneTimeDonationScreenContract$InputData)) {
            return false;
        }
        OneTimeDonationScreenContract$InputData oneTimeDonationScreenContract$InputData = (OneTimeDonationScreenContract$InputData) obj2;
        return Intrinsics.f(this.f72081a, oneTimeDonationScreenContract$InputData.f72081a) && this.f72082b == oneTimeDonationScreenContract$InputData.f72082b && Intrinsics.f(this.f72083c, oneTimeDonationScreenContract$InputData.f72083c) && Intrinsics.f(this.d, oneTimeDonationScreenContract$InputData.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f72082b.hashCode() + (this.f72081a.hashCode() * 31)) * 31;
        d dVar = this.f72083c;
        return this.d.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f72081a);
        dest.writeString(this.f72082b.name());
        dest.writeSerializable(this.f72083c);
        Iterator itZ = j6.a.z(this.d, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
