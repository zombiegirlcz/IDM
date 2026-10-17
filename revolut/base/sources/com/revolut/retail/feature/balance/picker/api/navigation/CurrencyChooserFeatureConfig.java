package com.revolut.retail.feature.balance.picker.api.navigation;

import aim.o;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.retail.feature.balance.picker.api.navigation.CurrencyChooserFlowDestination;
import io3.l;
import java.util.List;
import java.util.Set;
import k1j.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import xi0.b;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "BalanceChooser", "CurrencyChooser", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFeatureConfig$BalanceChooser;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFeatureConfig$CurrencyChooser;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CurrencyChooserFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFeatureConfig$BalanceChooser;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BalanceChooser extends CurrencyChooserFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f99462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final b f99463h;
        public final l i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AccountId f99464j;
        public final Set k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f99465l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f99466m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f99467n;
        public final boolean o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final Integer f99468p;

        public BalanceChooser(String str, b selectedCurrency, l pocketType, Set set, boolean z, Integer num, int i) {
            str = (i & 1) != 0 ? null : str;
            Set set2 = (i & 16) != 0 ? null : set;
            Intrinsics.checkNotNullParameter(selectedCurrency, "selectedCurrency");
            Intrinsics.checkNotNullParameter(pocketType, "pocketType");
            AccountId.Personal accountId = AccountId.Personal.f51414a;
            Intrinsics.checkNotNullParameter(accountId, "accountId");
            o oVar = new o();
            oVar.add(a.POCKETS);
            if (z) {
                oVar.add(a.CRYPTO);
            }
            String str2 = str;
            super(null, new CurrencyChooserFlowDestination(new CurrencyChooserFlowDestination.StartType.BalancePicker(str2, selectedCurrency, pocketType, set2, (Set) null, (Set) y0.a(oVar), (TextLocalisedClause) null, false, num, (Set) null, 1160)), false, num, 0, 37);
            this.f99462g = str2;
            this.f99463h = selectedCurrency;
            this.i = pocketType;
            this.f99464j = accountId;
            this.k = set2;
            this.f99465l = true;
            this.f99466m = z;
            this.f99467n = false;
            this.o = false;
            this.f99468p = num;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF66060h() {
            return this.f99468p;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BalanceChooser)) {
                return false;
            }
            BalanceChooser balanceChooser = (BalanceChooser) obj2;
            return Intrinsics.f(this.f99462g, balanceChooser.f99462g) && Intrinsics.f(this.f99463h, balanceChooser.f99463h) && this.i == balanceChooser.i && Intrinsics.f(this.f99464j, balanceChooser.f99464j) && Intrinsics.f(this.k, balanceChooser.k) && this.f99465l == balanceChooser.f99465l && this.f99466m == balanceChooser.f99466m && this.f99467n == balanceChooser.f99467n && this.o == balanceChooser.o && Intrinsics.f(this.f99468p, balanceChooser.f99468p);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            String str = this.f99462g;
            int iB = h30.l.b(this.f99464j, t61.a.c(this.i, h30.l.j(this.f99463h, (str == null ? 0 : str.hashCode()) * 31, 31), 31), 31);
            Set set = this.k;
            int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c((iB + (set == null ? 0 : set.hashCode())) * 961, 31, this.f99465l), 31, this.f99466m), 31, false), 31, false), 31, false), 31, this.f99467n), 31, this.o);
            Integer num = this.f99468p;
            return iC + (num != null ? num.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFeatureConfig$CurrencyChooser;", "Lcom/revolut/retail/feature/balance/picker/api/navigation/CurrencyChooserFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CurrencyChooser extends CurrencyChooserFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final b f99469g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f99470h;
        public final Clause i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Integer f99471j;

        /* JADX WARN: Multi-variable type inference failed */
        public CurrencyChooser() {
            this((b) null, (List) (0 == true ? 1 : 0), (Integer) (0 == true ? 1 : 0), 15);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        /* JADX INFO: renamed from: c, reason: from getter */
        public final Integer getF66060h() {
            return this.f99471j;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CurrencyChooser)) {
                return false;
            }
            CurrencyChooser currencyChooser = (CurrencyChooser) obj2;
            return Intrinsics.f(this.f99469g, currencyChooser.f99469g) && Intrinsics.f(this.f99470h, currencyChooser.f99470h) && Intrinsics.f(this.i, currencyChooser.i) && Intrinsics.f(this.f99471j, currencyChooser.f99471j);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            b bVar = this.f99469g;
            int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
            List list = this.f99470h;
            int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
            Clause clause = this.i;
            int iHashCode3 = (iHashCode2 + (clause == null ? 0 : clause.hashCode())) * 31;
            Integer num = this.f99471j;
            return iHashCode3 + (num != null ? num.hashCode() : 0);
        }

        public /* synthetic */ CurrencyChooser(b bVar, List list, Integer num, int i) {
            this((i & 1) != 0 ? null : bVar, (i & 2) != 0 ? null : list, (TextLocalisedClause) null, (i & 8) != 0 ? null : num);
        }

        public CurrencyChooser(b bVar, List list, TextLocalisedClause textLocalisedClause, Integer num) {
            super(null, new CurrencyChooserFlowDestination(new CurrencyChooserFlowDestination.StartType.CurrencyChooser(null, null, bVar, list, textLocalisedClause, num, 3)), false, num, 0, 37);
            this.f99469g = bVar;
            this.f99470h = list;
            this.i = textLocalisedClause;
            this.f99471j = num;
        }
    }
}
