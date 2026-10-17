package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.tab.accounts.api.model.ProductAccount;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ld6.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountContent;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountContent implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountContent> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductId f89474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccount.ValueItem f89475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountBackground f89476c;
    public final boolean d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountContent((ProductId) parcel.readParcelable(AccountContent.class.getClassLoader()), (ProductAccount.ValueItem) parcel.readParcelable(AccountContent.class.getClassLoader()), AccountBackground.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountContent[i];
        }
    }

    public AccountContent(ProductId productId, ProductAccount.ValueItem account, AccountBackground background, boolean z, b bVar) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(background, "background");
        this.f89474a = productId;
        this.f89475b = account;
        this.f89476c = background;
        this.d = z;
        this.e = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountContent)) {
            return false;
        }
        AccountContent accountContent = (AccountContent) obj2;
        return this.f89474a == accountContent.f89474a && Intrinsics.f(this.f89475b, accountContent.f89475b) && Intrinsics.f(this.f89476c, accountContent.f89476c) && this.d == accountContent.d && this.e == accountContent.e;
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f89476c.hashCode() + ((this.f89475b.hashCode() + (this.f89474a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        b bVar = this.e;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89474a, i);
        dest.writeParcelable(this.f89475b, i);
        this.f89476c.writeToParcel(dest, i);
        dest.writeInt(this.d ? 1 : 0);
        b bVar = this.e;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
