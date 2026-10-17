package com.revolut.retail.feature.api.custom_assets.models;

import android.os.Parcel;
import android.os.Parcelable;
import ehe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import prk.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/custom_assets/models/CustomAssetFieldDefinitions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomAssetFieldDefinitions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomAssetFieldDefinitions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f99230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f99231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f99232c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(CustomAssetCategoryDefinition.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = o.a(parcel, linkedHashSet, iA3, 1);
            }
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            while (iA != i3) {
                iA = o.a(parcel, linkedHashSet2, iA, 1);
            }
            return new CustomAssetFieldDefinitions(arrayList, linkedHashSet, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomAssetFieldDefinitions[i];
        }
    }

    public CustomAssetFieldDefinitions(ArrayList categories, Set mileCountries, Set squareFootCountries) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(mileCountries, "mileCountries");
        Intrinsics.checkNotNullParameter(squareFootCountries, "squareFootCountries");
        this.f99230a = categories;
        this.f99231b = mileCountries;
        this.f99232c = squareFootCountries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomAssetFieldDefinitions)) {
            return false;
        }
        CustomAssetFieldDefinitions customAssetFieldDefinitions = (CustomAssetFieldDefinitions) obj2;
        return this.f99230a.equals(customAssetFieldDefinitions.f99230a) && Intrinsics.f(this.f99231b, customAssetFieldDefinitions.f99231b) && Intrinsics.f(this.f99232c, customAssetFieldDefinitions.f99232c);
    }

    public final int hashCode() {
        return this.f99232c.hashCode() + p.a.f(this.f99230a.hashCode() * 31, 31, this.f99231b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f99230a, dest);
        while (itY.hasNext()) {
            ((CustomAssetCategoryDefinition) itY.next()).writeToParcel(dest, i);
        }
        Iterator itV = n.v(this.f99231b, dest);
        while (itV.hasNext()) {
            dest.writeString((String) itV.next());
        }
        Iterator itV2 = n.v(this.f99232c, dest);
        while (itV2.hasNext()) {
            dest.writeString((String) itV2.next());
        }
    }
}
