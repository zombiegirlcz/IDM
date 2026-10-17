package com.revolut.feature.rewards.api.model.rewards;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rewards/api/model/rewards/RewardOutlet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_rewards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RewardOutlet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardOutlet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final co3.a f84882c;
    public final Integer d;
    public final ArrayList e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            co3.a aVar = (co3.a) parcel.readSerializable();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RewardAvailabilityInOutlet.CREATOR, parcel, arrayList, iA, 1);
            }
            return new RewardOutlet(string, string2, aVar, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RewardOutlet[i];
        }
    }

    public RewardOutlet(String id10, String address, co3.a location, Integer num, ArrayList availability) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f84880a = id10;
        this.f84881b = address;
        this.f84882c = location;
        this.d = num;
        this.e = availability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RewardOutlet)) {
            return false;
        }
        RewardOutlet rewardOutlet = (RewardOutlet) obj2;
        return Intrinsics.f(this.f84880a, rewardOutlet.f84880a) && Intrinsics.f(this.f84881b, rewardOutlet.f84881b) && Intrinsics.f(this.f84882c, rewardOutlet.f84882c) && Intrinsics.f(this.d, rewardOutlet.d) && this.e.equals(rewardOutlet.e);
    }

    public final int hashCode() {
        int iHashCode = (this.f84882c.hashCode() + p.a.c(this.f84880a.hashCode() * 31, 31, this.f84881b)) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84880a);
        dest.writeString(this.f84881b);
        dest.writeSerializable(this.f84882c);
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((RewardAvailabilityInOutlet) itY.next()).writeToParcel(dest, i);
        }
    }
}
