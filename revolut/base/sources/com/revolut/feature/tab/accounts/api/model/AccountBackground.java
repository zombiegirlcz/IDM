package com.revolut.feature.tab.accounts.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/accounts/api/model/AccountBackground;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_tab_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountBackground implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountBackground> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NavBarWithContainerBackground f89471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountBackgroundParams f89472b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountBackground((NavBarWithContainerBackground) parcel.readParcelable(AccountBackground.class.getClassLoader()), parcel.readInt() == 0 ? null : AccountBackgroundParams.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountBackground[i];
        }
    }

    public AccountBackground(NavBarWithContainerBackground navBarBackground, AccountBackgroundParams accountBackgroundParams) {
        Intrinsics.checkNotNullParameter(navBarBackground, "navBarBackground");
        this.f89471a = navBarBackground;
        this.f89472b = accountBackgroundParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountBackground)) {
            return false;
        }
        AccountBackground accountBackground = (AccountBackground) obj2;
        return Intrinsics.f(this.f89471a, accountBackground.f89471a) && Intrinsics.f(this.f89472b, accountBackground.f89472b);
    }

    public final int hashCode() {
        int iHashCode = this.f89471a.hashCode() * 31;
        AccountBackgroundParams accountBackgroundParams = this.f89472b;
        return iHashCode + (accountBackgroundParams == null ? 0 : Boolean.hashCode(accountBackgroundParams.f89473a));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f89471a, i);
        AccountBackgroundParams accountBackgroundParams = this.f89472b;
        if (accountBackgroundParams == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            accountBackgroundParams.writeToParcel(dest, i);
        }
    }
}
