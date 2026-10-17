package com.revolut.feature.defi.remittances.impl.ui.send.amount;

import cli.g;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.defi.accounts.api.model.DeFiBalance;
import com.revolut.feature.defi.asset_details.api.model.DeFiAssetDetails;
import com.revolut.feature.defi.remittances.impl.domain.model.DeFiTransferQuoteRequest;
import hx7.e;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import opf.z;
import org.jetbrains.annotations.NotNull;
import s42.f;
import s56.i0;
import s56.k0;
import s56.m;
import s56.n;
import s56.o;
import s56.o0;
import s56.p0;
import s56.s;
import s56.t;
import s56.u0;
import sgm.e3;
import vkm.q;
import vkm.t0;
import wk5.k;
import x66.d;
import xv5.c;
import yji.l;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements t {

    @NotNull
    public static final k0 Companion = new k0();
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final DeFiSendAmountScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.t f71832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.a f71833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f71834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i0 f71835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f71836t;
    public final z u;
    public final vo9.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d f71837w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e3 f71838x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final vii.b f71839y;
    public final y z;

    public b(u0 stateMapper, DeFiSendAmountScreenContract$InputData inputData, r10.t deFiSendInteractor, w80.a bigIntegerAmountFormatter, c baseCurrencyInteractor, i0 deFiSendAmountScreenInteractor, m deFiSendAmountScreenBottomSheetProvider, z transferFundingSourceInteractor, vo9.a paymentPocketMapper, d defiAssetsPreviewInteractor, e3 deFiSendBalancesFilterInteractorFactory) {
        wk5.a aVar;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deFiSendInteractor, "deFiSendInteractor");
        Intrinsics.checkNotNullParameter(bigIntegerAmountFormatter, "bigIntegerAmountFormatter");
        Intrinsics.checkNotNullParameter(baseCurrencyInteractor, "baseCurrencyInteractor");
        Intrinsics.checkNotNullParameter(deFiSendAmountScreenInteractor, "deFiSendAmountScreenInteractor");
        Intrinsics.checkNotNullParameter(deFiSendAmountScreenBottomSheetProvider, "deFiSendAmountScreenBottomSheetProvider");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        Intrinsics.checkNotNullParameter(defiAssetsPreviewInteractor, "defiAssetsPreviewInteractor");
        Intrinsics.checkNotNullParameter(deFiSendBalancesFilterInteractorFactory, "deFiSendBalancesFilterInteractorFactory");
        this.o = inputData;
        this.f71832p = deFiSendInteractor;
        this.f71833q = bigIntegerAmountFormatter;
        this.f71834r = baseCurrencyInteractor;
        this.f71835s = deFiSendAmountScreenInteractor;
        this.f71836t = deFiSendAmountScreenBottomSheetProvider;
        this.u = transferFundingSourceInteractor;
        this.v = paymentPocketMapper;
        this.f71837w = defiAssetsPreviewInteractor;
        this.f71838x = deFiSendBalancesFilterInteractorFactory;
        this.f71839y = new vii.b();
        CryptoAddress cryptoAddress = inputData.f71822b;
        k addressType = wk5.m.a(cryptoAddress.f71063h);
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        int i = s56.y.f260004a[addressType.ordinal()];
        if (i == 1) {
            aVar = wk5.a.ARBITRUM;
        } else {
            if (i != 2) {
                throw new IllegalStateException(("Invalid address type for DeFi: " + addressType).toString());
            }
            aVar = wk5.a.SOLANA;
        }
        this.z = mra.d.b(this, new o(cryptoAddress, "", n.ASSET_OUT, null, aVar, new Data(null, null, true, 3, null), null, null, new Data(null, null, false, 7, null), null, null), stateMapper, null, false, 12);
        this.A = e.a(this, new f(this, 6));
    }

    public static final s K2(b bVar, String str, DeFiBalance deFiBalance, DeFiAssetDetails deFiAssetDetails, wk5.a aVar, xi0.b bVar2, int i, b36.d dVar, b36.a aVar2) {
        BigInteger bigIntegerA = bVar.f71833q.a(str, bVar2);
        BigInteger bigInteger = bigIntegerA.compareTo(BigInteger.ZERO) > 0 ? bigIntegerA : null;
        if (bigInteger != null) {
            return new s(deFiBalance, deFiAssetDetails, aVar, bigInteger, i, dVar, aVar2);
        }
        return null;
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.R(q.Q(this.f71839y, new o0(0, this, continuation)), new hr4.b(3, 17, continuation)), null, null, new p0(0, this, continuation), 3);
    }

    public final DeFiTransferQuoteRequest I2(s sVar) {
        DeFiSendAmountScreenContract$InputData deFiSendAmountScreenContract$InputData = this.o;
        String str = deFiSendAmountScreenContract$InputData.f71821a;
        DeFiBalance deFiBalance = sVar.f259986a;
        return new DeFiTransferQuoteRequest(str, deFiBalance.f71638g, deFiBalance.f71639h, sVar.d, sVar.e, sVar.f259989g, sVar.f259987b.f71666b, sVar.f, sVar.f259988c, deFiSendAmountScreenContract$InputData.f71822b.f71059a);
    }

    public final String J2(BigDecimal bigDecimal, xi0.b bVar) {
        BigInteger bigIntegerUnscaledValue = bigDecimal.setScale(bVar.c(), RoundingMode.HALF_UP).unscaledValue();
        Intrinsics.h(bigIntegerUnscaledValue);
        return this.f71833q.b(bigIntegerUnscaledValue, bVar);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // yji.l
    public final void T1(long j2) {
        s4b.e eVar = new s4b.e(18);
        y yVar = this.z;
        Continuation continuation = null;
        l.b1(this, new qna.n(yVar.B(eVar), this, 29), null, new p0(3, this, continuation), 3);
        int i = 2;
        l.b1(this, q.Q(yVar.B(new s4b.e(19)), new o0(i, this, continuation)), null, new p0(i, this, continuation), 3);
        int i2 = 1;
        l.b1(this, q.Q(new t0(yVar.B(new s4b.e(17)), 1), new o0(i2, this, continuation)), null, new p0(i2, this, continuation), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
