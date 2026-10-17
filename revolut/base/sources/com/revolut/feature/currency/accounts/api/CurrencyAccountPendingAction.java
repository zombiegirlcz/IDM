package com.revolut.feature.currency.accounts.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/currency/accounts/api/CurrencyAccountPendingAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_currency_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrencyAccountPendingAction implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f71601a;

    @NotNull
    public static final Parcelable.Creator<CurrencyAccountPendingAction> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrencyAccountPendingAction(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrencyAccountPendingAction[i];
        }
    }

    public CurrencyAccountPendingAction(String actionId) {
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.f71601a = actionId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CurrencyAccountPendingAction) && Intrinsics.f(this.f71601a, ((CurrencyAccountPendingAction) obj2).f71601a);
    }

    public final int hashCode() {
        return this.f71601a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71601a);
    }
}
