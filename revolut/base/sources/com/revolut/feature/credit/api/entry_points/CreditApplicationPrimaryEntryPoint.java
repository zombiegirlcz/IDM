package com.revolut.feature.credit.api.entry_points;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ft3.q0;
import ft3.z0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/api/entry_points/CreditApplicationPrimaryEntryPoint;", "Landroid/os/Parcelable;", "SingleProduct", "GroupedProducts", "Lcom/revolut/feature/credit/api/entry_points/CreditApplicationPrimaryEntryPoint$GroupedProducts;", "Lcom/revolut/feature/credit/api/entry_points/CreditApplicationPrimaryEntryPoint$SingleProduct;", "feature_credit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface CreditApplicationPrimaryEntryPoint extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/api/entry_points/CreditApplicationPrimaryEntryPoint$GroupedProducts;", "Lcom/revolut/feature/credit/api/entry_points/CreditApplicationPrimaryEntryPoint;", "", "toString", "()Ljava/lang/String;", "feature_credit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupedProducts implements CreditApplicationPrimaryEntryPoint {

        @NotNull
        public static final Parcelable.Creator<GroupedProducts> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66163b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f66164c;
        public final List d;
        public final List e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", GroupedProducts.class);
                Clause clause2 = (Clause) parcel.readParcelable(GroupedProducts.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(GroupedProducts.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iE != i2) {
                    iE = j6.a.e(GroupedProducts.class, parcel, arrayList2, iE, 1);
                }
                return new GroupedProducts(clause, clause2, image, arrayList, arrayList2);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupedProducts[i];
            }
        }

        public GroupedProducts(Clause title, Clause description, Image icon, List tags, List entryPoints) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(entryPoints, "entryPoints");
            this.f66162a = title;
            this.f66163b = description;
            this.f66164c = icon;
            this.d = tags;
            this.e = entryPoints;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupedProducts)) {
                return false;
            }
            GroupedProducts groupedProducts = (GroupedProducts) obj2;
            return Intrinsics.f(this.f66162a, groupedProducts.f66162a) && Intrinsics.f(this.f66163b, groupedProducts.f66163b) && Intrinsics.f(this.f66164c, groupedProducts.f66164c) && Intrinsics.f(this.d, groupedProducts.d) && Intrinsics.f(this.e, groupedProducts.e);
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final Clause getF66166b() {
            return this.f66163b;
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        /* JADX INFO: renamed from: getIcon, reason: from getter */
        public final Image getF66167c() {
            return this.f66164c;
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        public final List getProducts() {
            List listC;
            List<CreditApplicationPrimaryEntryPoint> list = this.e;
            ArrayList arrayList = new ArrayList(w.t(list, 10));
            for (CreditApplicationPrimaryEntryPoint creditApplicationPrimaryEntryPoint : list) {
                if (creditApplicationPrimaryEntryPoint instanceof GroupedProducts) {
                    listC = ((GroupedProducts) creditApplicationPrimaryEntryPoint).getProducts();
                } else {
                    if (!(creditApplicationPrimaryEntryPoint instanceof SingleProduct)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    listC = u.c(((SingleProduct) creditApplicationPrimaryEntryPoint).e);
                }
                arrayList.add(listC);
            }
            return w.u(arrayList);
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF66165a() {
            return this.f66162a;
        }

        public final int hashCode() {
            return this.e.hashCode() + p.a.d(b.c(this.f66164c, p.a.a(this.f66162a.hashCode() * 31, 31, this.f66163b), 31), 31, this.d);
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66162a, i);
            dest.writeParcelable(this.f66163b, i);
            dest.writeParcelable(this.f66164c, i);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            Iterator itV2 = p.a.v(this.e, dest);
            while (itV2.hasNext()) {
                dest.writeParcelable((Parcelable) itV2.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/api/entry_points/CreditApplicationPrimaryEntryPoint$SingleProduct;", "Lcom/revolut/feature/credit/api/entry_points/CreditApplicationPrimaryEntryPoint;", "", "toString", "()Ljava/lang/String;", "feature_credit_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleProduct implements CreditApplicationPrimaryEntryPoint {

        @NotNull
        public static final Parcelable.Creator<SingleProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66165a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66166b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Image f66167c;
        public final List d;
        public final q0 e;
        public final z0 f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Clause clause = (Clause) j6.a.f(parcel, "parcel", SingleProduct.class);
                Clause clause2 = (Clause) parcel.readParcelable(SingleProduct.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(SingleProduct.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new SingleProduct(clause, clause2, image, arrayList, (q0) parcel.readSerializable(), parcel.readInt() == 0 ? null : z0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleProduct[i];
            }
        }

        public SingleProduct(Clause title, Clause description, Image icon, List tags, q0 product, z0 z0Var) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(tags, "tags");
            Intrinsics.checkNotNullParameter(product, "product");
            this.f66165a = title;
            this.f66166b = description;
            this.f66167c = icon;
            this.d = tags;
            this.e = product;
            this.f = z0Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleProduct)) {
                return false;
            }
            SingleProduct singleProduct = (SingleProduct) obj2;
            return Intrinsics.f(this.f66165a, singleProduct.f66165a) && Intrinsics.f(this.f66166b, singleProduct.f66166b) && Intrinsics.f(this.f66167c, singleProduct.f66167c) && Intrinsics.f(this.d, singleProduct.d) && Intrinsics.f(this.e, singleProduct.e) && this.f == singleProduct.f;
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final Clause getF66166b() {
            return this.f66166b;
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        /* JADX INFO: renamed from: getIcon, reason: from getter */
        public final Image getF66167c() {
            return this.f66167c;
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        public final List getProducts() {
            return u.c(this.e);
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF66165a() {
            return this.f66165a;
        }

        public final int hashCode() {
            int iHashCode = (this.e.hashCode() + p.a.d(b.c(this.f66167c, p.a.a(this.f66165a.hashCode() * 31, 31, this.f66166b), 31), 31, this.d)) * 31;
            z0 z0Var = this.f;
            return iHashCode + (z0Var == null ? 0 : z0Var.hashCode());
        }

        @Override // com.revolut.feature.credit.api.entry_points.CreditApplicationPrimaryEntryPoint
        /* JADX INFO: renamed from: p, reason: from getter */
        public final List getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66165a, i);
            dest.writeParcelable(this.f66166b, i);
            dest.writeParcelable(this.f66167c, i);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeSerializable(this.e);
            z0 z0Var = this.f;
            if (z0Var == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(z0Var.name());
            }
        }
    }

    /* JADX INFO: renamed from: getDescription */
    Clause getF66166b();

    /* JADX INFO: renamed from: getIcon */
    Image getF66167c();

    List getProducts();

    /* JADX INFO: renamed from: getTitle */
    Clause getF66165a();

    /* JADX INFO: renamed from: p */
    List getD();
}
