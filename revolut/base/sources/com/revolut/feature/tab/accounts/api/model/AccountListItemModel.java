package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountListItemModel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountListItemModel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountListItemModel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f89477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f89478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f89479c;
    public final List d;
    public final CircleBadgeModel e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f89480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f89481h;
    public final boolean i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            boolean z3;
            Image image = (Image) j6.a.f(parcel, "parcel", AccountListItemModel.class);
            Clause clause = (Clause) parcel.readParcelable(AccountListItemModel.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(AccountListItemModel.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (true) {
                z = true;
                if (iA == i) {
                    break;
                }
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ProductAccountListAction.CREATOR, parcel, arrayList, iA, 1);
            }
            CircleBadgeModel circleBadgeModel = (CircleBadgeModel) parcel.readParcelable(AccountListItemModel.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z3 = true;
            } else {
                z3 = true;
                z = false;
            }
            return new AccountListItemModel(image, clause, clause2, arrayList, circleBadgeModel, z, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false, parcel.readInt() != 0 ? z3 : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountListItemModel[i];
        }
    }

    public AccountListItemModel(Image image, Clause clause, Clause clause2, List list, CircleBadgeModel circleBadgeModel, boolean z, boolean z3, boolean z4, int i) {
        this(image, clause, (i & 4) != 0 ? null : clause2, (i & 8) != 0 ? f0.f322471a : list, (i & 16) != 0 ? null : circleBadgeModel, false, (i & 64) != 0 ? true : z, (i & 128) != 0 ? true : z3, z4);
    }

    public static AccountListItemModel a(AccountListItemModel accountListItemModel, Clause clause, int i) {
        Image icon = accountListItemModel.f89477a;
        Clause title = accountListItemModel.f89478b;
        List actions = accountListItemModel.d;
        CircleBadgeModel circleBadgeModel = accountListItemModel.e;
        boolean z = (i & 32) != 0 ? accountListItemModel.f : true;
        boolean z3 = accountListItemModel.f89480g;
        boolean z4 = accountListItemModel.f89481h;
        boolean z6 = accountListItemModel.i;
        accountListItemModel.getClass();
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        return new AccountListItemModel(icon, title, clause, actions, circleBadgeModel, z, z3, z4, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountListItemModel)) {
            return false;
        }
        AccountListItemModel accountListItemModel = (AccountListItemModel) obj2;
        return Intrinsics.f(this.f89477a, accountListItemModel.f89477a) && Intrinsics.f(this.f89478b, accountListItemModel.f89478b) && Intrinsics.f(this.f89479c, accountListItemModel.f89479c) && Intrinsics.f(this.d, accountListItemModel.d) && Intrinsics.f(this.e, accountListItemModel.e) && this.f == accountListItemModel.f && this.f89480g == accountListItemModel.f89480g && this.f89481h == accountListItemModel.f89481h && this.i == accountListItemModel.i;
    }

    public final int hashCode() {
        int iA = p.a.a(this.f89477a.hashCode() * 31, 31, this.f89478b);
        Clause clause = this.f89479c;
        int iD = p.a.d((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
        CircleBadgeModel circleBadgeModel = this.e;
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c((iD + (circleBadgeModel != null ? circleBadgeModel.hashCode() : 0)) * 31, 31, this.f), 31, this.f89480g), 31, this.f89481h);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89477a, i);
        dest.writeParcelable(this.f89478b, i);
        dest.writeParcelable(this.f89479c, i);
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            ((ProductAccountListAction) itV.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
        dest.writeInt(this.f ? 1 : 0);
        dest.writeInt(this.f89480g ? 1 : 0);
        dest.writeInt(this.f89481h ? 1 : 0);
        dest.writeInt(this.i ? 1 : 0);
    }

    public AccountListItemModel(Image icon, Clause title, Clause clause, List actions, CircleBadgeModel circleBadgeModel, boolean z, boolean z3, boolean z4, boolean z6) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f89477a = icon;
        this.f89478b = title;
        this.f89479c = clause;
        this.d = actions;
        this.e = circleBadgeModel;
        this.f = z;
        this.f89480g = z3;
        this.f89481h = z4;
        this.i = z6;
    }
}
