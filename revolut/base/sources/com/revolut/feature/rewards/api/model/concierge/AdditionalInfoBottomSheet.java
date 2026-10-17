package com.revolut.feature.rewards.api.model.concierge;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/concierge/AdditionalInfoBottomSheet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalInfoBottomSheet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdditionalInfoBottomSheet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f84771c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(Cell.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new AdditionalInfoBottomSheet(string, string2, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalInfoBottomSheet[i];
        }
    }

    public AdditionalInfoBottomSheet(String title, String str, String str2, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f84769a = title;
        this.f84770b = str;
        this.f84771c = arrayList;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalInfoBottomSheet)) {
            return false;
        }
        AdditionalInfoBottomSheet additionalInfoBottomSheet = (AdditionalInfoBottomSheet) obj2;
        return Intrinsics.f(this.f84769a, additionalInfoBottomSheet.f84769a) && Intrinsics.f(this.f84770b, additionalInfoBottomSheet.f84770b) && Intrinsics.f(this.f84771c, additionalInfoBottomSheet.f84771c) && Intrinsics.f(this.d, additionalInfoBottomSheet.d);
    }

    public final int hashCode() {
        int iHashCode = this.f84769a.hashCode() * 31;
        String str = this.f84770b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f84771c;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84769a);
        dest.writeString(this.f84770b);
        List list = this.f84771c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((Cell) itQ.next()).writeToParcel(dest, i);
            }
        }
        dest.writeString(this.d);
    }
}
