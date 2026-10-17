package com.revolut.retail.trading.core.domain.account_closure;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/trading/core/domain/account_closure/AccountClosureBackendRequestedDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "trading_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureBackendRequestedDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountClosureBackendRequestedDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104487c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureBackendRequestedDetails(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureBackendRequestedDetails[i];
        }
    }

    public AccountClosureBackendRequestedDetails(String title, String subtitle, String content) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(content, "content");
        this.f104485a = title;
        this.f104486b = subtitle;
        this.f104487c = content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureBackendRequestedDetails)) {
            return false;
        }
        AccountClosureBackendRequestedDetails accountClosureBackendRequestedDetails = (AccountClosureBackendRequestedDetails) obj2;
        return Intrinsics.f(this.f104485a, accountClosureBackendRequestedDetails.f104485a) && Intrinsics.f(this.f104486b, accountClosureBackendRequestedDetails.f104486b) && Intrinsics.f(this.f104487c, accountClosureBackendRequestedDetails.f104487c);
    }

    public final int hashCode() {
        return this.f104487c.hashCode() + p.a.c(this.f104485a.hashCode() * 31, 31, this.f104486b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104485a);
        dest.writeString(this.f104486b);
        dest.writeString(this.f104487c);
    }
}
