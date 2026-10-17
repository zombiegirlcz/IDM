package com.revolut.feature.store.core.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1e.b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/core/api/model/StoreProduct;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreProduct implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreProduct> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88631c;
    public final LocalDateTime d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Integer f88632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f88633h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f88634j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f88635l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StoreProductVariant f88636m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f88637n;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int iA;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LocalDateTime localDateTime = (LocalDateTime) parcel.readSerializable();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            b bVarValueOf = b.valueOf(parcel.readString());
            boolean z = false;
            if (parcel.readInt() != 0) {
                iA = 0;
                z = true;
            } else {
                iA = 0;
            }
            int i = parcel.readInt() != 0 ? 1 : iA;
            int i2 = parcel.readInt();
            boolean z3 = i;
            ArrayList arrayList = new ArrayList(i2);
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(StoreProductOption.CREATOR, parcel, arrayList, iA, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            int iA2 = 0;
            while (iA2 != i3) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(StoreProductTerm.CREATOR, parcel, arrayList2, iA2, 1);
                i3 = i3;
            }
            return new StoreProduct(string, string2, string3, localDateTime, string4, string5, numValueOf, bVarValueOf, z, z3, arrayList, arrayList2, parcel.readInt() == 0 ? null : StoreProductVariant.CREATOR.createFromParcel(parcel), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreProduct[i];
        }
    }

    public StoreProduct(String id10, String name, String description, LocalDateTime localDateTime, String str, String image, Integer num, b state, boolean z, boolean z3, ArrayList options, ArrayList productTerms, StoreProductVariant storeProductVariant, List deliveryCountries) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(productTerms, "productTerms");
        Intrinsics.checkNotNullParameter(deliveryCountries, "deliveryCountries");
        this.f88629a = id10;
        this.f88630b = name;
        this.f88631c = description;
        this.d = localDateTime;
        this.e = str;
        this.f = image;
        this.f88632g = num;
        this.f88633h = state;
        this.i = z;
        this.f88634j = z3;
        this.k = options;
        this.f88635l = productTerms;
        this.f88636m = storeProductVariant;
        this.f88637n = deliveryCountries;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreProduct)) {
            return false;
        }
        StoreProduct storeProduct = (StoreProduct) obj2;
        return Intrinsics.f(this.f88629a, storeProduct.f88629a) && Intrinsics.f(this.f88630b, storeProduct.f88630b) && Intrinsics.f(this.f88631c, storeProduct.f88631c) && Intrinsics.f(this.d, storeProduct.d) && Intrinsics.f(this.e, storeProduct.e) && Intrinsics.f(this.f, storeProduct.f) && Intrinsics.f(this.f88632g, storeProduct.f88632g) && this.f88633h == storeProduct.f88633h && this.i == storeProduct.i && this.f88634j == storeProduct.f88634j && this.k.equals(storeProduct.k) && this.f88635l.equals(storeProduct.f88635l) && Intrinsics.f(this.f88636m, storeProduct.f88636m) && Intrinsics.f(this.f88637n, storeProduct.f88637n);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f88629a.hashCode() * 31, 31, this.f88630b), 31, this.f88631c);
        LocalDateTime localDateTime = this.d;
        int iHashCode = (iC + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        String str = this.e;
        int iC2 = p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f);
        Integer num = this.f88632g;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f88635l, com.google.android.gms.internal.mlkit_vision_face.a.b(this.k, j6.a.c(j6.a.c((this.f88633h.hashCode() + ((iC2 + (num == null ? 0 : num.hashCode())) * 31)) * 31, 31, this.i), 31, this.f88634j), 31), 31);
        StoreProductVariant storeProductVariant = this.f88636m;
        return this.f88637n.hashCode() + ((iB + (storeProductVariant != null ? storeProductVariant.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88629a);
        dest.writeString(this.f88630b);
        dest.writeString(this.f88631c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        Integer num = this.f88632g;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.f88633h.name());
        dest.writeInt(this.i ? 1 : 0);
        dest.writeInt(this.f88634j ? 1 : 0);
        Iterator itY = j6.a.y(this.k, dest);
        while (itY.hasNext()) {
            ((StoreProductOption) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.f88635l, dest);
        while (itY2.hasNext()) {
            ((StoreProductTerm) itY2.next()).writeToParcel(dest, i);
        }
        StoreProductVariant storeProductVariant = this.f88636m;
        if (storeProductVariant == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            storeProductVariant.writeToParcel(dest, i);
        }
        dest.writeStringList(this.f88637n);
    }
}
