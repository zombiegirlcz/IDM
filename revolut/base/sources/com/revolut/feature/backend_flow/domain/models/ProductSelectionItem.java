package com.revolut.feature.backend_flow.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xl2.l;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0006J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/ProductSelectionItem;", "Lcom/revolut/feature/backend_flow/domain/models/InputItem;", "Lxl2/l;", "", "toString", "()Ljava/lang/String;", "Badge", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProductSelectionItem implements InputItem, l {

    @NotNull
    public static final Parcelable.Creator<ProductSelectionItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f63579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f63580c;
    public final AssetOption d;
    public final Integer e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f63581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f63582h;
    public final boolean i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/backend_flow/domain/models/ProductSelectionItem$Badge;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "core_backend_flow_domain_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Badge implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Badge> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f63583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BackendIconType f63584b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Badge(parcel.readString(), (BackendIconType) parcel.readParcelable(Badge.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Badge[i];
            }
        }

        public Badge(String label, BackendIconType backendIconType) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.f63583a = label;
            this.f63584b = backendIconType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj2;
            return Intrinsics.f(this.f63583a, badge.f63583a) && Intrinsics.f(this.f63584b, badge.f63584b);
        }

        public final int hashCode() {
            int iHashCode = this.f63583a.hashCode() * 31;
            BackendIconType backendIconType = this.f63584b;
            return iHashCode + (backendIconType == null ? 0 : backendIconType.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f63583a);
            dest.writeParcelable(this.f63584b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            AssetOption assetOption = (AssetOption) parcel.readParcelable(ProductSelectionItem.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            int iA = 0;
            while (iA != i2) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(Badge.CREATOR, parcel, arrayList, iA, i);
            }
            return new ProductSelectionItem(string, string2, string3, assetOption, numValueOf, z, z3, arrayList, parcel.readInt() != 0 ? i : 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ProductSelectionItem[i];
        }
    }

    public ProductSelectionItem(String id10, String title, String subtitle, AssetOption asset, Integer num, boolean z, boolean z3, List badges, boolean z4) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(badges, "badges");
        this.f63578a = id10;
        this.f63579b = title;
        this.f63580c = subtitle;
        this.d = asset;
        this.e = num;
        this.f = z;
        this.f63581g = z3;
        this.f63582h = badges;
        this.i = z4;
    }

    public static ProductSelectionItem J(ProductSelectionItem productSelectionItem, boolean z) {
        String id10 = productSelectionItem.f63578a;
        String title = productSelectionItem.f63579b;
        String subtitle = productSelectionItem.f63580c;
        AssetOption asset = productSelectionItem.d;
        Integer num = productSelectionItem.e;
        boolean z3 = productSelectionItem.f;
        List badges = productSelectionItem.f63582h;
        boolean z4 = productSelectionItem.i;
        productSelectionItem.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(badges, "badges");
        return new ProductSelectionItem(id10, title, subtitle, asset, num, z3, z, badges, z4);
    }

    @Override // xl2.t
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF63578a() {
        return this.f63578a;
    }

    @Override // xl2.l
    /* JADX INFO: renamed from: d, reason: from getter */
    public final Integer getE() {
        return this.e;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    /* JADX INFO: renamed from: d0, reason: from getter */
    public final boolean getF() {
        return this.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ProductSelectionItem)) {
            return false;
        }
        ProductSelectionItem productSelectionItem = (ProductSelectionItem) obj2;
        return Intrinsics.f(this.f63578a, productSelectionItem.f63578a) && Intrinsics.f(this.f63579b, productSelectionItem.f63579b) && Intrinsics.f(this.f63580c, productSelectionItem.f63580c) && Intrinsics.f(this.d, productSelectionItem.d) && Intrinsics.f(this.e, productSelectionItem.e) && this.f == productSelectionItem.f && this.f63581g == productSelectionItem.f63581g && Intrinsics.f(this.f63582h, productSelectionItem.f63582h) && this.i == productSelectionItem.i;
    }

    @Override // com.revolut.feature.backend_flow.domain.models.InputItem
    public final String getId() {
        return this.f63578a;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f63578a.hashCode() * 31, 31, this.f63579b), 31, this.f63580c)) * 31;
        Integer num = this.e;
        return Boolean.hashCode(this.i) + p.a.d(j6.a.c(j6.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f), 31, this.f63581g), 31, this.f63582h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63578a);
        dest.writeString(this.f63579b);
        dest.writeString(this.f63580c);
        dest.writeParcelable(this.d, i);
        Integer num = this.e;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f63581g ? 1 : 0);
        Iterator itV = p.a.v(this.f63582h, dest);
        while (itV.hasNext()) {
            ((Badge) itV.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.i ? 1 : 0);
    }
}
