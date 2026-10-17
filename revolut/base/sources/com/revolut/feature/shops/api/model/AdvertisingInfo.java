package com.revolut.feature.shops.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shops/api/model/AdvertisingInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shops_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdvertisingInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AdvertisingInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Header f87003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f87004b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Header headerCreateFromParcel = Header.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Instruction.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AdvertisingInfo(headerCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdvertisingInfo[i];
        }
    }

    public AdvertisingInfo(Header header, ArrayList instructions) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f87003a = header;
        this.f87004b = instructions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdvertisingInfo)) {
            return false;
        }
        AdvertisingInfo advertisingInfo = (AdvertisingInfo) obj2;
        return Intrinsics.f(this.f87003a, advertisingInfo.f87003a) && this.f87004b.equals(advertisingInfo.f87004b);
    }

    public final int hashCode() {
        return this.f87004b.hashCode() + (this.f87003a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f87003a.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f87004b, dest);
        while (itY.hasNext()) {
            ((Instruction) itY.next()).writeToParcel(dest, i);
        }
    }
}
