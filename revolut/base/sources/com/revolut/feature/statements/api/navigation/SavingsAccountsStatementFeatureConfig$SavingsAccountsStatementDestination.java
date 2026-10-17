package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.b;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/statements/api/navigation/SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f88264b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(SavingsAccountsStatementFeatureConfig$SavingsAccountInfo.CREATOR, parcel, arrayList, iA, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList2.add(b.valueOf(parcel.readString()));
            }
            return new SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination[i];
        }
    }

    public SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination() {
        this((List) null, 3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getF88264b() {
        return this.f88264b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getF88263a() {
        return this.f88263a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination)) {
            return false;
        }
        SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination savingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination = (SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination) obj2;
        return Intrinsics.f(this.f88263a, savingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination.f88263a) && Intrinsics.f(this.f88264b, savingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination.f88264b);
    }

    public final int hashCode() {
        return this.f88264b.hashCode() + (this.f88263a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f88263a, dest);
        while (itV.hasNext()) {
            ((SavingsAccountsStatementFeatureConfig$SavingsAccountInfo) itV.next()).writeToParcel(dest, i);
        }
        Iterator itV2 = p.a.v(this.f88264b, dest);
        while (itV2.hasNext()) {
            dest.writeString(((b) itV2.next()).name());
        }
    }

    public SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination(List list, int i) {
        this(f0.f322471a, (i & 2) != 0 ? v.k(b.PERSONAL, b.YOUTH) : list);
    }

    public SavingsAccountsStatementFeatureConfig$SavingsAccountsStatementDestination(List savingsAccounts, List accountTypes) {
        Intrinsics.checkNotNullParameter(savingsAccounts, "savingsAccounts");
        Intrinsics.checkNotNullParameter(accountTypes, "accountTypes");
        this.f88263a = savingsAccounts;
        this.f88264b = accountTypes;
    }
}
