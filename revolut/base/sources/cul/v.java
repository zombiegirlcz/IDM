package cul;

import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.FrequencySettings;
import com.revolut.feature.trading_orders.common.models.SourcePocket;
import com.revolut.retail.trading.core.domain.orders.OrderExpiry;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.ui.invest.placement.models.InvestInputValue;
import com.revolut.trading.orders.ui.invest.placement.models.InvestOutputValue;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements cli.j {
    public final Data A;
    public final Data B;
    public final Data C;
    public final Data D;
    public final Boolean E;
    public final boolean F;
    public final boolean G;
    public final Data H;
    public final Data I;
    public final Data J;
    public final Data K;
    public final Data L;
    public final Data M;
    public final Data N;
    public final Data O;
    public final Data P;
    public final Data Q;
    public final Data R;
    public final Data S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f109175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k4l.r0 f109176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f109177c;
    public final aul.b d;
    public final InvestInputValue e;
    public final Data f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f109178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InvestOutputValue f109179h;
    public final Data i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Data f109180j;
    public final Data k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Amount f109181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Data f109182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Data f109183n;
    public final Data o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Data f109184p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final SourcePocket f109185q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Data f109186r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Data f109187s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f109188t;
    public final Data u;
    public final Data v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final OrderExpiry f109189w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Data f109190x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final FrequencySettings f109191y;
    public final Data z;

    public v(bfl.g tradeSide, k4l.r0 orderType, String idempotencyKey, aul.b bVar, InvestInputValue inputValue, Data inputValueAsset, Data data, InvestOutputValue outputValue, Data outputValueAsset, Data data2, Data processedInputAmount, Amount amount, Data orderQuoteResult, Data fiatExchangeOrderQuoteResult, Data shouldDisplayMoneyExchangeInfo, Data data3, SourcePocket sourcePocket, Data data4, Data availableOrderTypes, boolean z, Data extendedHoursStatus, Data defaultOrderExpiry, OrderExpiry orderExpiry, Data defaultFrequencySettings, FrequencySettings frequencySettings, Data autoTopUpStatus, Data fieldAttribute, Data fiatBalanceError, Data securityBalanceError, Data isOrderValid, Boolean bool, boolean z3, boolean z4, Data instrument, Data instrumentTicker, Data timeInForce, Data data5, Data data6, Data data7, Data tradingLegalEntityInformation, Data isBalanceSwitchAllowed, Data isRecurringBuysFeatureEnabled, Data stocksConfig, Data data8, Data data9) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(inputValueAsset, "inputValueAsset");
        Intrinsics.checkNotNullParameter(outputValue, "outputValue");
        Intrinsics.checkNotNullParameter(outputValueAsset, "outputValueAsset");
        Intrinsics.checkNotNullParameter(processedInputAmount, "processedInputAmount");
        Intrinsics.checkNotNullParameter(orderQuoteResult, "orderQuoteResult");
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteResult, "fiatExchangeOrderQuoteResult");
        Intrinsics.checkNotNullParameter(shouldDisplayMoneyExchangeInfo, "shouldDisplayMoneyExchangeInfo");
        Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
        Intrinsics.checkNotNullParameter(extendedHoursStatus, "extendedHoursStatus");
        Intrinsics.checkNotNullParameter(defaultOrderExpiry, "defaultOrderExpiry");
        Intrinsics.checkNotNullParameter(defaultFrequencySettings, "defaultFrequencySettings");
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        Intrinsics.checkNotNullParameter(fieldAttribute, "fieldAttribute");
        Intrinsics.checkNotNullParameter(fiatBalanceError, "fiatBalanceError");
        Intrinsics.checkNotNullParameter(securityBalanceError, "securityBalanceError");
        Intrinsics.checkNotNullParameter(isOrderValid, "isOrderValid");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(isBalanceSwitchAllowed, "isBalanceSwitchAllowed");
        Intrinsics.checkNotNullParameter(isRecurringBuysFeatureEnabled, "isRecurringBuysFeatureEnabled");
        Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
        this.f109175a = tradeSide;
        this.f109176b = orderType;
        this.f109177c = idempotencyKey;
        this.d = bVar;
        this.e = inputValue;
        this.f = inputValueAsset;
        this.f109178g = data;
        this.f109179h = outputValue;
        this.i = outputValueAsset;
        this.f109180j = data2;
        this.k = processedInputAmount;
        this.f109181l = amount;
        this.f109182m = orderQuoteResult;
        this.f109183n = fiatExchangeOrderQuoteResult;
        this.o = shouldDisplayMoneyExchangeInfo;
        this.f109184p = data3;
        this.f109185q = sourcePocket;
        this.f109186r = data4;
        this.f109187s = availableOrderTypes;
        this.f109188t = z;
        this.u = extendedHoursStatus;
        this.v = defaultOrderExpiry;
        this.f109189w = orderExpiry;
        this.f109190x = defaultFrequencySettings;
        this.f109191y = frequencySettings;
        this.z = autoTopUpStatus;
        this.A = fieldAttribute;
        this.B = fiatBalanceError;
        this.C = securityBalanceError;
        this.D = isOrderValid;
        this.E = bool;
        this.F = z3;
        this.G = z4;
        this.H = instrument;
        this.I = instrumentTicker;
        this.J = timeInForce;
        this.K = data5;
        this.L = data6;
        this.M = data7;
        this.N = tradingLegalEntityInformation;
        this.O = isBalanceSwitchAllowed;
        this.P = isRecurringBuysFeatureEnabled;
        this.Q = stocksConfig;
        this.R = data8;
        this.S = data9;
    }

    public static v a(v vVar, k4l.r0 r0Var, String str, aul.b bVar, InvestInputValue investInputValue, Data data, Data data2, InvestOutputValue investOutputValue, Data data3, Data data4, Data data5, Amount amount, Data data6, Data data7, Data data8, Data data9, SourcePocket sourcePocket, Data data10, Data data11, boolean z, Data data12, Data data13, OrderExpiry orderExpiry, Data data14, FrequencySettings frequencySettings, Data data15, Data data16, Data data17, Data data18, Data data19, Boolean bool, boolean z3, boolean z4, Data data20, Data data21, Data data22, Data data23, Data data24, Data data25, Data data26, Data data27, Data data28, Data data29, Data data30, Data data31, int i, int i2) {
        Data data32;
        OrderExpiry orderExpiry2;
        Data data33;
        FrequencySettings frequencySettings2;
        Data data34;
        Data data35;
        Data data36;
        Data data37;
        Data data38;
        Data data39;
        Data data40;
        Data data41;
        Data data42;
        Boolean bool2;
        Data data43;
        Data data44;
        Data data45;
        Data data46;
        Data data47;
        Data data48;
        bfl.g tradeSide = vVar.f109175a;
        k4l.r0 orderType = (i & 2) != 0 ? vVar.f109176b : r0Var;
        String idempotencyKey = (i & 4) != 0 ? vVar.f109177c : str;
        aul.b bVar2 = (i & 8) != 0 ? vVar.d : bVar;
        InvestInputValue inputValue = (i & 16) != 0 ? vVar.e : investInputValue;
        Data inputValueAsset = (i & 32) != 0 ? vVar.f : data;
        Data data49 = (i & 64) != 0 ? vVar.f109178g : data2;
        InvestOutputValue outputValue = (i & 128) != 0 ? vVar.f109179h : investOutputValue;
        Data outputValueAsset = (i & 256) != 0 ? vVar.i : data3;
        Data data50 = (i & 512) != 0 ? vVar.f109180j : data4;
        Data processedInputAmount = (i & 1024) != 0 ? vVar.k : data5;
        Amount amount2 = (i & 2048) != 0 ? vVar.f109181l : amount;
        Data orderQuoteResult = (i & 4096) != 0 ? vVar.f109182m : data6;
        aul.b bVar3 = bVar2;
        Data fiatExchangeOrderQuoteResult = (i & 8192) != 0 ? vVar.f109183n : data7;
        Data data51 = data49;
        Data shouldDisplayMoneyExchangeInfo = (i & 16384) != 0 ? vVar.o : data8;
        Data data52 = (i & 32768) != 0 ? vVar.f109184p : data9;
        SourcePocket sourcePocket2 = (i & 65536) != 0 ? vVar.f109185q : sourcePocket;
        Data data53 = (i & 131072) != 0 ? vVar.f109186r : data10;
        Data availableOrderTypes = (i & 262144) != 0 ? vVar.f109187s : data11;
        Data data54 = data50;
        boolean z6 = (i & 524288) != 0 ? vVar.f109188t : z;
        Data extendedHoursStatus = (i & PKIFailureInfo.badCertTemplate) != 0 ? vVar.u : data12;
        Amount amount3 = amount2;
        Data data55 = (i & PKIFailureInfo.badSenderNonce) != 0 ? vVar.v : data13;
        if ((i & 4194304) != 0) {
            data32 = data55;
            orderExpiry2 = vVar.f109189w;
        } else {
            data32 = data55;
            orderExpiry2 = orderExpiry;
        }
        OrderExpiry orderExpiry3 = orderExpiry2;
        Data data56 = (i & 8388608) != 0 ? vVar.f109190x : data14;
        if ((i & 16777216) != 0) {
            data33 = data56;
            frequencySettings2 = vVar.f109191y;
        } else {
            data33 = data56;
            frequencySettings2 = frequencySettings;
        }
        FrequencySettings frequencySettings3 = frequencySettings2;
        Data data57 = (i & 33554432) != 0 ? vVar.z : data15;
        if ((i & 67108864) != 0) {
            data34 = data57;
            data35 = vVar.A;
        } else {
            data34 = data57;
            data35 = data16;
        }
        if ((i & 134217728) != 0) {
            data36 = data35;
            data37 = vVar.B;
        } else {
            data36 = data35;
            data37 = data17;
        }
        if ((i & 268435456) != 0) {
            data38 = data37;
            data39 = vVar.C;
        } else {
            data38 = data37;
            data39 = data18;
        }
        if ((i & PKIFailureInfo.duplicateCertReq) != 0) {
            data40 = data39;
            data41 = vVar.D;
        } else {
            data40 = data39;
            data41 = data19;
        }
        if ((i & 1073741824) != 0) {
            data42 = data41;
            bool2 = vVar.E;
        } else {
            data42 = data41;
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        boolean z11 = (i & Integer.MIN_VALUE) != 0 ? vVar.F : z3;
        boolean z12 = (i2 & 1) != 0 ? vVar.G : z4;
        Data data58 = (i2 & 2) != 0 ? vVar.H : data20;
        if ((i2 & 4) != 0) {
            data43 = data58;
            data44 = vVar.I;
        } else {
            data43 = data58;
            data44 = data21;
        }
        if ((i2 & 8) != 0) {
            data45 = data44;
            data46 = vVar.J;
        } else {
            data45 = data44;
            data46 = data22;
        }
        if ((i2 & 16) != 0) {
            data47 = data46;
            data48 = vVar.K;
        } else {
            data47 = data46;
            data48 = data23;
        }
        Data data59 = data48;
        Data data60 = (i2 & 32) != 0 ? vVar.L : data24;
        Data data61 = (i2 & 64) != 0 ? vVar.M : data25;
        Data tradingLegalEntityInformation = (i2 & 128) != 0 ? vVar.N : data26;
        Data isBalanceSwitchAllowed = (i2 & 256) != 0 ? vVar.O : data27;
        Data isRecurringBuysFeatureEnabled = (i2 & 512) != 0 ? vVar.P : data28;
        Data stocksConfig = (i2 & 1024) != 0 ? vVar.Q : data29;
        Data data62 = (i2 & 2048) != 0 ? vVar.R : data30;
        Data data63 = (i2 & 4096) != 0 ? vVar.S : data31;
        vVar.getClass();
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(idempotencyKey, "idempotencyKey");
        Intrinsics.checkNotNullParameter(inputValue, "inputValue");
        Intrinsics.checkNotNullParameter(inputValueAsset, "inputValueAsset");
        Intrinsics.checkNotNullParameter(outputValue, "outputValue");
        Intrinsics.checkNotNullParameter(outputValueAsset, "outputValueAsset");
        Intrinsics.checkNotNullParameter(processedInputAmount, "processedInputAmount");
        Intrinsics.checkNotNullParameter(orderQuoteResult, "orderQuoteResult");
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteResult, "fiatExchangeOrderQuoteResult");
        Intrinsics.checkNotNullParameter(shouldDisplayMoneyExchangeInfo, "shouldDisplayMoneyExchangeInfo");
        Intrinsics.checkNotNullParameter(availableOrderTypes, "availableOrderTypes");
        Intrinsics.checkNotNullParameter(extendedHoursStatus, "extendedHoursStatus");
        Data data64 = availableOrderTypes;
        Data defaultOrderExpiry = data32;
        Intrinsics.checkNotNullParameter(defaultOrderExpiry, "defaultOrderExpiry");
        Data defaultFrequencySettings = data33;
        Intrinsics.checkNotNullParameter(defaultFrequencySettings, "defaultFrequencySettings");
        Data autoTopUpStatus = data34;
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        Data fieldAttribute = data36;
        Intrinsics.checkNotNullParameter(fieldAttribute, "fieldAttribute");
        Data fiatBalanceError = data38;
        Intrinsics.checkNotNullParameter(fiatBalanceError, "fiatBalanceError");
        Data securityBalanceError = data40;
        Intrinsics.checkNotNullParameter(securityBalanceError, "securityBalanceError");
        Data isOrderValid = data42;
        Intrinsics.checkNotNullParameter(isOrderValid, "isOrderValid");
        Data instrument = data43;
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Data instrumentTicker = data45;
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Data timeInForce = data47;
        Intrinsics.checkNotNullParameter(timeInForce, "timeInForce");
        Intrinsics.checkNotNullParameter(tradingLegalEntityInformation, "tradingLegalEntityInformation");
        Intrinsics.checkNotNullParameter(isBalanceSwitchAllowed, "isBalanceSwitchAllowed");
        Intrinsics.checkNotNullParameter(isRecurringBuysFeatureEnabled, "isRecurringBuysFeatureEnabled");
        Intrinsics.checkNotNullParameter(stocksConfig, "stocksConfig");
        return new v(tradeSide, orderType, idempotencyKey, bVar3, inputValue, inputValueAsset, data51, outputValue, outputValueAsset, data54, processedInputAmount, amount3, orderQuoteResult, fiatExchangeOrderQuoteResult, shouldDisplayMoneyExchangeInfo, data52, sourcePocket2, data53, data64, z6, extendedHoursStatus, data32, orderExpiry3, data33, frequencySettings3, data34, data36, data38, data40, data42, bool3, z11, z12, data43, data45, data47, data59, data60, data61, tradingLegalEntityInformation, isBalanceSwitchAllowed, isRecurringBuysFeatureEnabled, stocksConfig, data62, data63);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return this.f109175a == vVar.f109175a && this.f109176b == vVar.f109176b && Intrinsics.f(this.f109177c, vVar.f109177c) && this.d == vVar.d && Intrinsics.f(this.e, vVar.e) && Intrinsics.f(this.f, vVar.f) && Intrinsics.f(this.f109178g, vVar.f109178g) && Intrinsics.f(this.f109179h, vVar.f109179h) && Intrinsics.f(this.i, vVar.i) && Intrinsics.f(this.f109180j, vVar.f109180j) && Intrinsics.f(this.k, vVar.k) && Intrinsics.f(this.f109181l, vVar.f109181l) && Intrinsics.f(this.f109182m, vVar.f109182m) && Intrinsics.f(this.f109183n, vVar.f109183n) && Intrinsics.f(this.o, vVar.o) && Intrinsics.f(this.f109184p, vVar.f109184p) && Intrinsics.f(this.f109185q, vVar.f109185q) && Intrinsics.f(this.f109186r, vVar.f109186r) && Intrinsics.f(this.f109187s, vVar.f109187s) && this.f109188t == vVar.f109188t && Intrinsics.f(this.u, vVar.u) && Intrinsics.f(this.v, vVar.v) && Intrinsics.f(this.f109189w, vVar.f109189w) && Intrinsics.f(this.f109190x, vVar.f109190x) && Intrinsics.f(this.f109191y, vVar.f109191y) && Intrinsics.f(this.z, vVar.z) && Intrinsics.f(this.A, vVar.A) && Intrinsics.f(this.B, vVar.B) && Intrinsics.f(this.C, vVar.C) && Intrinsics.f(this.D, vVar.D) && Intrinsics.f(this.E, vVar.E) && this.F == vVar.F && this.G == vVar.G && Intrinsics.f(this.H, vVar.H) && Intrinsics.f(this.I, vVar.I) && Intrinsics.f(this.J, vVar.J) && Intrinsics.f(this.K, vVar.K) && Intrinsics.f(this.L, vVar.L) && Intrinsics.f(this.M, vVar.M) && Intrinsics.f(this.N, vVar.N) && Intrinsics.f(this.O, vVar.O) && Intrinsics.f(this.P, vVar.P) && Intrinsics.f(this.Q, vVar.Q) && Intrinsics.f(this.R, vVar.R) && Intrinsics.f(this.S, vVar.S);
    }

    public final int hashCode() {
        int iC = p.a.c(com.revolut.data.database.models.openbanking.d.f(this.f109176b, this.f109175a.hashCode() * 31, 31), 31, this.f109177c);
        aul.b bVar = this.d;
        int iC2 = kii.e.c(this.f, (this.e.hashCode() + ((iC + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31, 31);
        Data data = this.f109178g;
        int iC3 = kii.e.c(this.i, (this.f109179h.hashCode() + ((iC2 + (data == null ? 0 : data.hashCode())) * 31)) * 31, 31);
        Data data2 = this.f109180j;
        int iC4 = kii.e.c(this.k, (iC3 + (data2 == null ? 0 : data2.hashCode())) * 31, 31);
        Amount amount = this.f109181l;
        int iC5 = kii.e.c(this.o, kii.e.c(this.f109183n, kii.e.c(this.f109182m, (iC4 + (amount == null ? 0 : amount.hashCode())) * 31, 31), 31), 31);
        Data data3 = this.f109184p;
        int iHashCode = (iC5 + (data3 == null ? 0 : data3.hashCode())) * 31;
        SourcePocket sourcePocket = this.f109185q;
        int iHashCode2 = (iHashCode + (sourcePocket == null ? 0 : sourcePocket.hashCode())) * 31;
        Data data4 = this.f109186r;
        int iC6 = kii.e.c(this.v, kii.e.c(this.u, j6.a.c(kii.e.c(this.f109187s, (iHashCode2 + (data4 == null ? 0 : data4.hashCode())) * 31, 31), 31, this.f109188t), 31), 31);
        OrderExpiry orderExpiry = this.f109189w;
        int iC7 = kii.e.c(this.f109190x, (iC6 + (orderExpiry == null ? 0 : orderExpiry.hashCode())) * 31, 31);
        FrequencySettings frequencySettings = this.f109191y;
        int iC8 = kii.e.c(this.D, kii.e.c(this.C, kii.e.c(this.B, kii.e.c(this.A, kii.e.c(this.z, (iC7 + (frequencySettings == null ? 0 : frequencySettings.hashCode())) * 31, 31), 31), 31), 31), 31);
        Boolean bool = this.E;
        int iC9 = kii.e.c(this.J, kii.e.c(this.I, kii.e.c(this.H, j6.a.c(j6.a.c((iC8 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.F), 31, this.G), 31), 31), 31);
        Data data5 = this.K;
        int iHashCode3 = (iC9 + (data5 == null ? 0 : data5.hashCode())) * 31;
        Data data6 = this.L;
        int iHashCode4 = (iHashCode3 + (data6 == null ? 0 : data6.hashCode())) * 31;
        Data data7 = this.M;
        int iC10 = kii.e.c(this.Q, kii.e.c(this.P, kii.e.c(this.O, kii.e.c(this.N, (iHashCode4 + (data7 == null ? 0 : data7.hashCode())) * 31, 31), 31), 31), 31);
        Data data8 = this.R;
        int iHashCode5 = (iC10 + (data8 == null ? 0 : data8.hashCode())) * 31;
        Data data9 = this.S;
        return iHashCode5 + (data9 != null ? data9.hashCode() : 0);
    }
}
