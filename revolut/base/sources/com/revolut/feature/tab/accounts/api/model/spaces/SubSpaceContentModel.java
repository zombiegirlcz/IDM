package com.revolut.feature.tab.accounts.api.model.spaces;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pie.v;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/spaces/SubSpaceContentModel;", "Landroid/os/Parcelable;", "FlatSubSpaceContentModel", "GroupedSubSpaceContentModel", "Lcom/revolut/feature/tab/accounts/api/model/spaces/SubSpaceContentModel$FlatSubSpaceContentModel;", "Lcom/revolut/feature/tab/accounts/api/model/spaces/SubSpaceContentModel$GroupedSubSpaceContentModel;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SubSpaceContentModel implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f89561a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/spaces/SubSpaceContentModel$FlatSubSpaceContentModel;", "Lcom/revolut/feature/tab/accounts/api/model/spaces/SubSpaceContentModel;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FlatSubSpaceContentModel extends SubSpaceContentModel {

        @NotNull
        public static final Parcelable.Creator<FlatSubSpaceContentModel> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final v f89562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f89563c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                v vVarValueOf = v.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SubSpaceAccountItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new FlatSubSpaceContentModel(vVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FlatSubSpaceContentModel[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlatSubSpaceContentModel(v id10, List accountItems) {
            super(accountItems);
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountItems, "accountItems");
            this.f89562b = id10;
            this.f89563c = accountItems;
        }

        public static FlatSubSpaceContentModel c(FlatSubSpaceContentModel flatSubSpaceContentModel, List accountItems) {
            v id10 = flatSubSpaceContentModel.f89562b;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountItems, "accountItems");
            return new FlatSubSpaceContentModel(id10, accountItems);
        }

        @Override // com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF() {
            return this.f89563c;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final v getE() {
            return this.f89562b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FlatSubSpaceContentModel)) {
                return false;
            }
            FlatSubSpaceContentModel flatSubSpaceContentModel = (FlatSubSpaceContentModel) obj2;
            return this.f89562b == flatSubSpaceContentModel.f89562b && Intrinsics.f(this.f89563c, flatSubSpaceContentModel.f89563c);
        }

        public final int hashCode() {
            return this.f89563c.hashCode() + (this.f89562b.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f89562b.name());
            Iterator itV = p.a.v(this.f89563c, dest);
            while (itV.hasNext()) {
                ((SubSpaceAccountItem) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/spaces/SubSpaceContentModel$GroupedSubSpaceContentModel;", "Lcom/revolut/feature/tab/accounts/api/model/spaces/SubSpaceContentModel;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GroupedSubSpaceContentModel extends SubSpaceContentModel {

        @NotNull
        public static final Parcelable.Creator<GroupedSubSpaceContentModel> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f89564b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f89565c;
        public final Image d;
        public final v e;
        public final List f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iA = 0;
                boolean z = parcel.readInt() != 0;
                Clause clause = (Clause) parcel.readParcelable(GroupedSubSpaceContentModel.class.getClassLoader());
                Image image = (Image) parcel.readParcelable(GroupedSubSpaceContentModel.class.getClassLoader());
                v vVarValueOf = v.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(SubSpaceAccountItem.CREATOR, parcel, arrayList, iA, 1);
                }
                return new GroupedSubSpaceContentModel(z, clause, image, vVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GroupedSubSpaceContentModel[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GroupedSubSpaceContentModel(boolean z, Clause name, Image icon, v id10, List accountItems) {
            super(accountItems);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountItems, "accountItems");
            this.f89564b = z;
            this.f89565c = name;
            this.d = icon;
            this.e = id10;
            this.f = accountItems;
        }

        public static GroupedSubSpaceContentModel c(GroupedSubSpaceContentModel groupedSubSpaceContentModel, boolean z, List list, int i) {
            if ((i & 1) != 0) {
                z = groupedSubSpaceContentModel.f89564b;
            }
            boolean z3 = z;
            Clause name = groupedSubSpaceContentModel.f89565c;
            Image icon = groupedSubSpaceContentModel.d;
            v id10 = groupedSubSpaceContentModel.e;
            if ((i & 16) != 0) {
                list = groupedSubSpaceContentModel.f;
            }
            List accountItems = list;
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountItems, "accountItems");
            return new GroupedSubSpaceContentModel(z3, name, icon, id10, accountItems);
        }

        @Override // com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF() {
            return this.f;
        }

        @Override // com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel
        /* JADX INFO: renamed from: b, reason: from getter */
        public final v getE() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GroupedSubSpaceContentModel)) {
                return false;
            }
            GroupedSubSpaceContentModel groupedSubSpaceContentModel = (GroupedSubSpaceContentModel) obj2;
            return this.f89564b == groupedSubSpaceContentModel.f89564b && Intrinsics.f(this.f89565c, groupedSubSpaceContentModel.f89565c) && Intrinsics.f(this.d, groupedSubSpaceContentModel.d) && this.e == groupedSubSpaceContentModel.e && Intrinsics.f(this.f, groupedSubSpaceContentModel.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + b.c(this.d, p.a.a(Boolean.hashCode(this.f89564b) * 31, 31, this.f89565c), 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f89564b ? 1 : 0);
            dest.writeParcelable(this.f89565c, i);
            dest.writeParcelable(this.d, i);
            dest.writeString(this.e.name());
            Iterator itV = p.a.v(this.f, dest);
            while (itV.hasNext()) {
                ((SubSpaceAccountItem) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    public SubSpaceContentModel(List list) {
        this.f89561a = list;
    }

    /* JADX INFO: renamed from: a */
    public abstract List getF();

    /* JADX INFO: renamed from: b */
    public abstract v getE();
}
