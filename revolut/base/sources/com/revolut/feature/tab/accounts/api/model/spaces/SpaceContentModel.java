package com.revolut.feature.tab.accounts.api.model.spaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/spaces/SpaceContentModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpaceContentModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SpaceContentModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductSpaceIdentifier f89556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f89557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f89558c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ProductSpaceIdentifier productSpaceIdentifier = (ProductSpaceIdentifier) j6.a.f(parcel, "parcel", SpaceContentModel.class);
            Clause clause = (Clause) parcel.readParcelable(SpaceContentModel.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(SpaceContentModel.class, parcel, arrayList, iE, 1);
            }
            return new SpaceContentModel(clause, productSpaceIdentifier, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpaceContentModel[i];
        }
    }

    public SpaceContentModel(Clause clause, ProductSpaceIdentifier id10, List subspacesContentModels) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(subspacesContentModels, "subspacesContentModels");
        this.f89556a = id10;
        this.f89557b = clause;
        this.f89558c = subspacesContentModels;
    }

    public static SpaceContentModel a(SpaceContentModel spaceContentModel, List subspacesContentModels) {
        ProductSpaceIdentifier id10 = spaceContentModel.f89556a;
        Clause clause = spaceContentModel.f89557b;
        spaceContentModel.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(subspacesContentModels, "subspacesContentModels");
        return new SpaceContentModel(clause, id10, subspacesContentModels);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpaceContentModel)) {
            return false;
        }
        SpaceContentModel spaceContentModel = (SpaceContentModel) obj2;
        return Intrinsics.f(this.f89556a, spaceContentModel.f89556a) && Intrinsics.f(this.f89557b, spaceContentModel.f89557b) && Intrinsics.f(this.f89558c, spaceContentModel.f89558c);
    }

    public final int hashCode() {
        int iHashCode = this.f89556a.hashCode() * 31;
        Clause clause = this.f89557b;
        return this.f89558c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89556a, i);
        dest.writeParcelable(this.f89557b, i);
        Iterator itV = p.a.v(this.f89558c, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
