package com.revolut.feature.add.new_product.impl.gateway;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qf1.c;
import qf1.e;
import qf1.f;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/add/new_product/impl/gateway/AddNewProductGroupDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_add_new_product_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddNewProductGroupDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<AddNewProductGroupDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f60853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f60854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f60855c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            e eVarValueOf = e.valueOf(parcel.readString());
            c cVarValueOf = c.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(f.valueOf(parcel.readString()));
            }
            return new AddNewProductGroupDestination(eVarValueOf, cVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddNewProductGroupDestination[i];
        }
    }

    public AddNewProductGroupDestination(e groupId, c categoryId, ArrayList itemIds) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(itemIds, "itemIds");
        this.f60853a = groupId;
        this.f60854b = categoryId;
        this.f60855c = itemIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddNewProductGroupDestination)) {
            return false;
        }
        AddNewProductGroupDestination addNewProductGroupDestination = (AddNewProductGroupDestination) obj2;
        return this.f60853a == addNewProductGroupDestination.f60853a && this.f60854b == addNewProductGroupDestination.f60854b && this.f60855c.equals(addNewProductGroupDestination.f60855c);
    }

    public final int hashCode() {
        return this.f60855c.hashCode() + ((this.f60854b.hashCode() + (this.f60853a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f60853a.name());
        dest.writeString(this.f60854b.name());
        Iterator itY = j6.a.y(this.f60855c, dest);
        while (itY.hasNext()) {
            dest.writeString(((f) itY.next()).name());
        }
    }
}
