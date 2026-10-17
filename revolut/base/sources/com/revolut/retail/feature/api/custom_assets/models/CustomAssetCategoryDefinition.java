package com.revolut.retail.feature.api.custom_assets.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vzi.b;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/api/custom_assets/models/CustomAssetCategoryDefinition;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_analytics_cycle_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomAssetCategoryDefinition implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomAssetCategoryDefinition> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f99224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f99225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f99226c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(CustomAssetFieldDefinition.CREATOR, parcel, arrayList, iA, 1);
            }
            return new CustomAssetCategoryDefinition(bVarValueOf, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomAssetCategoryDefinition[i];
        }
    }

    public CustomAssetCategoryDefinition(b category, ArrayList fields, boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(fields, "fields");
        this.f99224a = category;
        this.f99225b = fields;
        this.f99226c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomAssetCategoryDefinition)) {
            return false;
        }
        CustomAssetCategoryDefinition customAssetCategoryDefinition = (CustomAssetCategoryDefinition) obj2;
        return this.f99224a == customAssetCategoryDefinition.f99224a && this.f99225b.equals(customAssetCategoryDefinition.f99225b) && this.f99226c == customAssetCategoryDefinition.f99226c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f99226c) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f99225b, this.f99224a.hashCode() * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f99224a.name());
        Iterator itY = j6.a.y(this.f99225b, dest);
        while (itY.hasNext()) {
            ((CustomAssetFieldDefinition) itY.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f99226c ? 1 : 0);
    }
}
