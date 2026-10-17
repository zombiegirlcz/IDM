package com.revolut.feature.statements.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import ehe.n;
import ip0.v7;
import j6.a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountsStatementFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "", "toString", "()Ljava/lang/String;", "AccountsStatementDestination", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountsStatementFeatureConfig extends KompotBridgeFeatureConfig {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f88241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AccountStatementProduct f88242h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StatementPeriod f88243j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccountsStatementFeatureConfig(StatementPeriod statementPeriod, AccountStatementProduct product, Set currencies, boolean z) {
        super((ActivityAnimation) null, (ParcelableDestination) new AccountsStatementDestination(statementPeriod, product, currencies, z), false, (Integer) null, 0, 61);
        Intrinsics.checkNotNullParameter(currencies, "currencies");
        Intrinsics.checkNotNullParameter(product, "product");
        this.f88241g = currencies;
        this.f88242h = product;
        this.i = z;
        this.f88243j = statementPeriod;
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountsStatementFeatureConfig)) {
            return false;
        }
        AccountsStatementFeatureConfig accountsStatementFeatureConfig = (AccountsStatementFeatureConfig) obj2;
        return Intrinsics.f(this.f88241g, accountsStatementFeatureConfig.f88241g) && Intrinsics.f(this.f88242h, accountsStatementFeatureConfig.f88242h) && this.i == accountsStatementFeatureConfig.i && Intrinsics.f(this.f88243j, accountsStatementFeatureConfig.f88243j);
    }

    @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
    public final int hashCode() {
        int iC = a.c((this.f88242h.hashCode() + (this.f88241g.hashCode() * 31)) * 31, 31, this.i);
        StatementPeriod statementPeriod = this.f88243j;
        return iC + (statementPeriod == null ? 0 : statementPeriod.hashCode());
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/statements/api/navigation/AccountsStatementFeatureConfig$AccountsStatementDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "retail_feature_statements_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountsStatementDestination implements KompotDestination {

        @NotNull
        public static final Parcelable.Creator<AccountsStatementDestination> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f88244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AccountStatementProduct f88245b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f88246c;
        public final StatementPeriod d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                int iD = 0;
                while (iD != i) {
                    iD = v7.d(parcel, linkedHashSet, iD, 1);
                }
                return new AccountsStatementDestination(parcel.readInt() == 0 ? null : StatementPeriod.CREATOR.createFromParcel(parcel), (AccountStatementProduct) parcel.readParcelable(AccountsStatementDestination.class.getClassLoader()), linkedHashSet, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AccountsStatementDestination[i];
            }
        }

        public AccountsStatementDestination(StatementPeriod statementPeriod, AccountStatementProduct product, Set currencies, boolean z) {
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            Intrinsics.checkNotNullParameter(product, "product");
            this.f88244a = currencies;
            this.f88245b = product;
            this.f88246c = z;
            this.d = statementPeriod;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getF88246c() {
            return this.f88246c;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Set getF88244a() {
            return this.f88244a;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final StatementPeriod getD() {
            return this.d;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AccountStatementProduct getF88245b() {
            return this.f88245b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountsStatementDestination)) {
                return false;
            }
            AccountsStatementDestination accountsStatementDestination = (AccountsStatementDestination) obj2;
            return Intrinsics.f(this.f88244a, accountsStatementDestination.f88244a) && Intrinsics.f(this.f88245b, accountsStatementDestination.f88245b) && this.f88246c == accountsStatementDestination.f88246c && Intrinsics.f(this.d, accountsStatementDestination.d);
        }

        public final int hashCode() {
            int iC = j6.a.c((this.f88245b.hashCode() + (this.f88244a.hashCode() * 31)) * 31, 31, this.f88246c);
            StatementPeriod statementPeriod = this.d;
            return iC + (statementPeriod == null ? 0 : statementPeriod.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = n.v(this.f88244a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
            dest.writeParcelable(this.f88245b, i);
            dest.writeInt(this.f88246c ? 1 : 0);
            StatementPeriod statementPeriod = this.d;
            if (statementPeriod == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                statementPeriod.writeToParcel(dest, i);
            }
        }

        public /* synthetic */ AccountsStatementDestination(Set set, AccountStatementProduct accountStatementProduct) {
            this(null, accountStatementProduct, set, false);
        }
    }
}
