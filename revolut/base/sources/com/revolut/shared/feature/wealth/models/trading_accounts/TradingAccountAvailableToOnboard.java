package com.revolut.shared.feature.wealth.models.trading_accounts;

import android.os.Parcel;
import android.os.Parcelable;
import cfl.j;
import cfl.o;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/trading_accounts/TradingAccountAvailableToOnboard;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TradingAccountAvailableToOnboard implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TradingAccountAvailableToOnboard> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f105265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f105266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f105267c;
    public final TradingAccountType d;
    public final j e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f105268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Beneficiary f105269h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            TradingAccountType tradingAccountType = (TradingAccountType) parcel.readParcelable(TradingAccountAvailableToOnboard.class.getClassLoader());
            j jVarValueOf = j.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TradingProduct.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList2.add(o.valueOf(parcel.readString()));
            }
            return new TradingAccountAvailableToOnboard(string, string2, string3, tradingAccountType, jVarValueOf, arrayList, arrayList2, Beneficiary.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TradingAccountAvailableToOnboard[i];
        }
    }

    public TradingAccountAvailableToOnboard(String str, String accountHolderId, String globalPersonalAccountId, TradingAccountType accountType, j accountHolderType, ArrayList tradingProducts, ArrayList permittedActions, Beneficiary beneficiary) {
        Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
        Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
        Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
        Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        this.f105265a = str;
        this.f105266b = accountHolderId;
        this.f105267c = globalPersonalAccountId;
        this.d = accountType;
        this.e = accountHolderType;
        this.f = tradingProducts;
        this.f105268g = permittedActions;
        this.f105269h = beneficiary;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TradingAccountAvailableToOnboard)) {
            return false;
        }
        TradingAccountAvailableToOnboard tradingAccountAvailableToOnboard = (TradingAccountAvailableToOnboard) obj2;
        return Intrinsics.f(this.f105265a, tradingAccountAvailableToOnboard.f105265a) && Intrinsics.f(this.f105266b, tradingAccountAvailableToOnboard.f105266b) && Intrinsics.f(this.f105267c, tradingAccountAvailableToOnboard.f105267c) && Intrinsics.f(this.d, tradingAccountAvailableToOnboard.d) && this.e == tradingAccountAvailableToOnboard.e && this.f.equals(tradingAccountAvailableToOnboard.f) && this.f105268g.equals(tradingAccountAvailableToOnboard.f105268g) && Intrinsics.f(this.f105269h, tradingAccountAvailableToOnboard.f105269h);
    }

    public final int hashCode() {
        String str = this.f105265a;
        return this.f105269h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f105268g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, v7.f(this.e, (this.d.hashCode() + p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f105266b), 31, this.f105267c)) * 31, 31), 31), 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f105265a);
        dest.writeString(this.f105266b);
        dest.writeString(this.f105267c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e.name());
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            ((TradingProduct) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.f105268g, dest);
        while (itY2.hasNext()) {
            dest.writeString(((o) itY2.next()).name());
        }
        this.f105269h.writeToParcel(dest, i);
    }
}
