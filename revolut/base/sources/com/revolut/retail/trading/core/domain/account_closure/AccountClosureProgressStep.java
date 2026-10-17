package com.revolut.retail.trading.core.domain.account_closure;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureProgressStep;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureProgressStep implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountClosureProgressStep> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4l.a f104496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104498c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureProgressStep(h4l.a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureProgressStep[i];
        }
    }

    public AccountClosureProgressStep(h4l.a name, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f104496a = name;
        this.f104497b = str;
        this.f104498c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureProgressStep)) {
            return false;
        }
        AccountClosureProgressStep accountClosureProgressStep = (AccountClosureProgressStep) obj2;
        return this.f104496a == accountClosureProgressStep.f104496a && Intrinsics.f(this.f104497b, accountClosureProgressStep.f104497b) && Intrinsics.f(this.f104498c, accountClosureProgressStep.f104498c);
    }

    public final int hashCode() {
        int iHashCode = this.f104496a.hashCode() * 31;
        String str = this.f104497b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f104498c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104496a.name());
        dest.writeString(this.f104497b);
        dest.writeString(this.f104498c);
    }
}
