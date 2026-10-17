package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreCampaignOutlet;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreCampaignOutlet implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreCampaignOutlet> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88466c;
    public final StoreCampaignLocation d;
    public final Integer e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            StoreCampaignLocation storeCampaignLocationCreateFromParcel = StoreCampaignLocation.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreCampaignAvailability.CREATOR, parcel, arrayList, iA, 1);
            }
            return new StoreCampaignOutlet(string, string2, string3, storeCampaignLocationCreateFromParcel, numValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreCampaignOutlet[i];
        }
    }

    public StoreCampaignOutlet(String id10, String str, String address, StoreCampaignLocation location, Integer num, ArrayList availability) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(availability, "availability");
        this.f88464a = id10;
        this.f88465b = str;
        this.f88466c = address;
        this.d = location;
        this.e = num;
        this.f = availability;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreCampaignOutlet)) {
            return false;
        }
        StoreCampaignOutlet storeCampaignOutlet = (StoreCampaignOutlet) obj2;
        return Intrinsics.f(this.f88464a, storeCampaignOutlet.f88464a) && Intrinsics.f(this.f88465b, storeCampaignOutlet.f88465b) && Intrinsics.f(this.f88466c, storeCampaignOutlet.f88466c) && Intrinsics.f(this.d, storeCampaignOutlet.d) && Intrinsics.f(this.e, storeCampaignOutlet.e) && this.f.equals(storeCampaignOutlet.f);
    }

    public final int hashCode() {
        int iHashCode = this.f88464a.hashCode() * 31;
        String str = this.f88465b;
        int iHashCode2 = (this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f88466c)) * 31;
        Integer num = this.e;
        return this.f.hashCode() + ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88464a);
        dest.writeString(this.f88465b);
        dest.writeString(this.f88466c);
        this.d.writeToParcel(dest, i);
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((StoreCampaignAvailability) itY.next()).writeToParcel(dest, i);
        }
    }
}
