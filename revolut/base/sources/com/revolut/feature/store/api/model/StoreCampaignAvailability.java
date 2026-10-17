package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreCampaignAvailability;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreCampaignAvailability implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreCampaignAvailability> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f88432b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreCampaignAvailabilityInterval.CREATOR, parcel, arrayList, iA, 1);
            }
            return new StoreCampaignAvailability(arrayList, arrayListCreateStringArrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreCampaignAvailability[i];
        }
    }

    public StoreCampaignAvailability(ArrayList intervals, List days) {
        Intrinsics.checkNotNullParameter(days, "days");
        Intrinsics.checkNotNullParameter(intervals, "intervals");
        this.f88431a = days;
        this.f88432b = intervals;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreCampaignAvailability)) {
            return false;
        }
        StoreCampaignAvailability storeCampaignAvailability = (StoreCampaignAvailability) obj2;
        return Intrinsics.f(this.f88431a, storeCampaignAvailability.f88431a) && this.f88432b.equals(storeCampaignAvailability.f88432b);
    }

    public final int hashCode() {
        return this.f88432b.hashCode() + (this.f88431a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f88431a);
        Iterator itY = j6.a.y(this.f88432b, dest);
        while (itY.hasNext()) {
            ((StoreCampaignAvailabilityInterval) itY.next()).writeToParcel(dest, i);
        }
    }
}
