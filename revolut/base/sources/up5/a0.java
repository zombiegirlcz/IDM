package up5;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.navigation.WithdrawFinishBehavior;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.transactions.api.navigation.TransactionDetailsDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import eq5.x0;
import ip0.v7;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import nii.o0;
import tfm.n4;
import tx0.g4;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends ori.a implements b {
    public final Lazy A;
    public final Lazy B;
    public final Lazy C;
    public final Lazy D;
    public ifm.c E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f281852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ap5.b f281853c;
    public final wsg.n d;
    public final mm.d e;
    public final ifm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final rea.m f281854g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.firebase.messaging.t f281855h;
    public final bk5.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i90.b f281856j;
    public final gte.a k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tga.k f281857l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wj0.a f281858m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final x0 f281859n;
    public final opf.z o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vo9.a f281860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Lazy f281861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Lazy f281862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Lazy f281863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Lazy f281864t;
    public final ihm.b u;
    public final Lazy v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n4 f281865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final efm.r f281866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Lazy f281867y;
    public final Lazy z;

    public a0(c state, ap5.b cryptoWithdrawInteractor, wsg.n walletInteractor, mm.d actionsDispatcher, ifm.b compositeDisposable, rea.m pocketDetailsInteractor, com.google.firebase.messaging.t actionsFactory, po5.a cryptoWithdrawEnabledStateChecker, bk5.a blockchainInteractor, i90.b uuidUtils, gte.a featureToggleInteractor, tga.k upgradeEntryPointItemProvider, wj0.a idempotencyKeyHolder, x0 cryptoSendAmountInputScreenInteractor, opf.z transferFundingSourceInteractor, vo9.a paymentPocketMapper) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(actionsFactory, "actionsFactory");
        Intrinsics.checkNotNullParameter(cryptoWithdrawEnabledStateChecker, "cryptoWithdrawEnabledStateChecker");
        Intrinsics.checkNotNullParameter(blockchainInteractor, "blockchainInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(cryptoSendAmountInputScreenInteractor, "cryptoSendAmountInputScreenInteractor");
        Intrinsics.checkNotNullParameter(transferFundingSourceInteractor, "transferFundingSourceInteractor");
        Intrinsics.checkNotNullParameter(paymentPocketMapper, "paymentPocketMapper");
        this.f281852b = state;
        this.f281853c = cryptoWithdrawInteractor;
        this.d = walletInteractor;
        this.e = actionsDispatcher;
        this.f = compositeDisposable;
        this.f281854g = pocketDetailsInteractor;
        this.f281855h = actionsFactory;
        this.i = blockchainInteractor;
        this.f281856j = uuidUtils;
        this.k = featureToggleInteractor;
        this.f281857l = upgradeEntryPointItemProvider;
        this.f281858m = idempotencyKeyHolder;
        this.f281859n = cryptoSendAmountInputScreenInteractor;
        this.o = transferFundingSourceInteractor;
        this.f281860p = paymentPocketMapper;
        final int i = 6;
        this.f281861q = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        final int i2 = 1;
        this.f281862r = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        final int i3 = 2;
        this.f281863s = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        final int i5 = 3;
        this.f281864t = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i5) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.u = bVarE;
        final int i6 = 4;
        this.v = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i6) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        e eVar = (e) state;
        n4 n4VarE = eVar.f281886t.getValue(eVar, e.v[18]).c(te0.s.f270018a).switchMapSingle(new uoe.a(4, new f(this, 1))).distinctUntilChanged().replay(1).e();
        Intrinsics.checkNotNullExpressionValue(n4VarE, "refCount(...)");
        this.f281865w = n4VarE;
        this.f281866x = n4VarE.map(new uoe.a(5, new umc.c(26)));
        final int i21 = 5;
        this.f281867y = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i21) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        final int i22 = 7;
        this.z = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i22) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        final int i32 = 8;
        this.A = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i32) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        final int i33 = 9;
        this.B = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i33) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        final int i43 = 10;
        this.C = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i43) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        final int i59 = 0;
        this.D = yhm.j.b(new Function0(this) { // from class: up5.g

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ a0 f281891b;

            {
                this.f281891b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i59) {
                    case 0:
                        return this.f281891b.f281865w.filter(new uoe.a(11, new h(1))).map(new uoe.a(12, new h(2))).replay(1).e();
                    case 1:
                        Object value = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        return nim.a.w((efm.r) value, new h(0)).replay(1).e();
                    case 2:
                        Object value2 = this.f281891b.f281861q.getValue();
                        Intrinsics.checkNotNullExpressionValue(value2, "getValue(...)");
                        return nim.a.w((efm.r) value2, new h(7)).replay(1).e();
                    case 3:
                        return this.f281891b.d.J(AccountId.Personal.f51414a, w4l.h.f294642c).replay(1).e();
                    case 4:
                        a0 a0Var = this.f281891b;
                        return te0.w.l(((e) a0Var.f281852b).w0().c(te0.s.f270018a), a0Var.u).switchMap(new uoe.a(20, new f(a0Var, 15))).distinctUntilChanged().replay(1).e();
                    case 5:
                        return nim.a.w(this.f281891b.n3(), new h0() { // from class: up5.n
                            @Override // kotlin.jvm.internal.h0, wim.p
                            public final Object get(Object obj2) {
                                return ((CryptoAddress) obj2).f71060b;
                            }
                        }).replay(1).e();
                    case 6:
                        a0 a0Var2 = this.f281891b;
                        efm.r rVarM3 = a0Var2.m3();
                        efm.r sourceCurrencyDataObservable = a0Var2.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable, "sourceCurrencyDataObservable");
                        efm.r rVarDistinctUntilChanged = mif.a.d(rVarM3, sourceCurrencyDataObservable).distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged, new f(a0Var2, 3)).distinctUntilChanged().startWith(new Data(null, null, true, 3, null)).replay(1).e();
                    case 7:
                        return nim.a.w(this.f281891b.n3(), new h(6)).replay(1).e();
                    case 8:
                        a0 a0Var3 = this.f281891b;
                        efm.r rVarDistinctUntilChanged2 = a0Var3.m3().distinctUntilChanged();
                        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
                        return pd.b.r(rVarDistinctUntilChanged2, new f(a0Var3, 8)).distinctUntilChanged().replay(1).e();
                    case 9:
                        a0 a0Var4 = this.f281891b;
                        efm.r rVarO3 = a0Var4.o3();
                        efm.r rVarM32 = a0Var4.m3();
                        efm.r sourceCurrencyDataObservable2 = a0Var4.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable2, "sourceCurrencyDataObservable");
                        efm.r map = a0Var4.x3().map(new uoe.a(10, new umc.c(29)));
                        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                        return pd.b.r(mif.a.f(rVarO3, rVarM32, sourceCurrencyDataObservable2, map), new f(a0Var4, 7)).replay(1).e();
                    default:
                        a0 a0Var5 = this.f281891b;
                        efm.r rVarV3 = a0Var5.v3();
                        efm.r rVarStartWith = ((e) a0Var5.f281852b).y0().c(te0.s.f270018a).map(new uoe.a(27, new h(8))).startWith(new Data(null, null, true, 3, null));
                        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                        efm.r rVarO32 = a0Var5.o3();
                        efm.r sourceCurrencyDataObservable3 = a0Var5.f281866x;
                        Intrinsics.checkNotNullExpressionValue(sourceCurrencyDataObservable3, "sourceCurrencyDataObservable");
                        efm.r rVarW = nim.a.w(mif.a.e(rVarStartWith, rVarO32, sourceCurrencyDataObservable3), new h(9));
                        efm.r rVarY3 = a0Var5.y3();
                        Object value3 = a0Var5.D.getValue();
                        Intrinsics.checkNotNullExpressionValue(value3, "getValue(...)");
                        return nim.a.w(zi0.c.u(mif.a.f(rVarV3, rVarW, rVarY3, (efm.r) value3), new umc.c(27)), new umc.c(28)).replay(1).e();
                }
            }
        });
        ifm.a aVar = new ifm.a(mfm.f.f205042b, 1);
        Intrinsics.checkNotNullExpressionValue(aVar, "empty(...)");
        this.E = aVar;
    }

    public final efm.r A3() {
        efm.r rVarDoOnNext = te0.w.m(((e) this.f281852b).C0().c(te0.s.f270018a), C3(), m70.a.g(n3(), null, null, 3)).distinctUntilChanged().switchMapSingle(new uoe.a(25, new f(this, 17))).distinctUntilChanged().doOnNext(new uoe.a(26, new f(this, 18)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        return rVarDoOnNext;
    }

    public final efm.r B3() {
        efm.r map = this.f281866x.filter(new j(new h(13), 3)).map(new j(new h(14), 4));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r C3() {
        efm.r map = ((e) this.f281852b).E0().c(te0.s.f270018a).filter(new uoe.a(29, new h(10))).map(new j(new h(11), 0));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final pfm.t D3(nqi.c moneyInputState) {
        Intrinsics.checkNotNullParameter(moneyInputState, "moneyInputState");
        return te0.w.z0(((e) this.f281852b).B0(), moneyInputState);
    }

    public final pfm.t E3(wk5.a blockchain) {
        Intrinsics.checkNotNullParameter(blockchain, "blockchain");
        te0.e eVarC0 = ((e) this.f281852b).C0();
        od0.i.Companion.getClass();
        return te0.w.z0(eVarC0, od0.h.a(blockchain));
    }

    @Override // ori.a, nri.a
    public final void i3() {
        efm.d0 iVar;
        e eVar = (e) this.f281852b;
        if (((String) te0.w.O(eVar.z0())) == null) {
            te0.e eVarZ0 = eVar.z0();
            String string = this.f281856j.a().toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            eVarZ0.set(string);
            Unit unit = Unit.f186387a;
        }
        this.f281858m.a("IDEMPOTENCY_TAG_CRYPTO_WITHDRAW_V2");
        int i = 1;
        int i2 = 9;
        int i3 = 14;
        efm.r rVarDoOnNext = m70.a.g(n3(), null, new uj8.j(27), 1).doOnNext(new uoe.a(i3, new f(this, i2)));
        Intrinsics.checkNotNullExpressionValue(rVarDoOnNext, "doOnNext(...)");
        efm.r rVarSwitchMap = rVarDoOnNext.switchMap(new uoe.a(19, new f(this, i3)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        efm.r rVarOnErrorResumeNext = rVarSwitchMap.onErrorResumeNext(new n1i.b(21, new t33.r(new BreadcrumbException(), 29)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new o0(19, q.f281907a), new o0(19, r.f281908a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        ifm.b bVar = this.f;
        te0.w.j0(bVar, cVarSubscribe);
        int i5 = 0;
        if (((od0.i) eVar.E0().get()).d()) {
            iVar = efm.d0.m(((od0.i) eVar.E0().get()).c());
        } else {
            efm.d0 d0VarFirstOrError = m70.a.g(n3(), null, null, 3).firstOrError();
            uoe.a aVar = new uoe.a(24, new f(this, i5));
            d0VarFirstOrError.getClass();
            iVar = new ufm.i(d0VarFirstOrError, aVar, 0);
        }
        int i6 = 5;
        pfm.a aVar2 = new pfm.a(new ufm.i(iVar, new uoe.a(8, new f(this, 4)), 0), new uoe.a(i2, new f(this, i6)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar2, "flatMapCompletable(...)");
        pfm.a aVar3 = new pfm.a(aVar2, new n1i.b(21, new s(new BreadcrumbException(), i5)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar3.w(new o0(19, u.f281912a), t.f281911a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        te0.w.j0(bVar, hVarW);
        efm.b bVarSwitchMapCompletable = C3().distinctUntilChanged().switchMapCompletable(new uoe.a(7, new f(this, 2)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        n1i.b bVar2 = new n1i.b(21, new s(new BreadcrumbException(), i));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar4 = new pfm.a(bVarSwitchMapCompletable, bVar2, 2);
        Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
        ofm.h hVarW2 = aVar4.w(new o0(19, w.f281914a), v.f281913a);
        Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
        te0.w.j0(bVar, hVarW2);
        efm.b bVarSwitchMapCompletable2 = eVar.D0().c(te0.s.f270018a).filter(new uoe.a(17, new h(i6))).switchMapCompletable(new uoe.a(18, new f(this, 12)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable2, "saveConfirmedCryptoAmount(...)");
        n1i.b bVar3 = new n1i.b(21, new t33.r(new BreadcrumbException(), 28));
        bVarSwitchMapCompletable2.getClass();
        pfm.a aVar5 = new pfm.a(bVarSwitchMapCompletable2, bVar3, 2);
        Intrinsics.checkNotNullExpressionValue(aVar5, "onErrorResumeNext(...)");
        ofm.h hVarW3 = aVar5.w(new o0(19, p.f281906a), o.f281905a);
        Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
        te0.w.j0(bVar, hVarW3);
    }

    public final pfm.a j3() {
        efm.d0 d0VarFirstOrError = m70.a.g(p3(), null, new k(1), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        pfm.a aVar = new pfm.a(efm.d0.D(d0VarFirstOrError, te0.w.a0(this.f281865w, new h(22)).firstOrError(), new j(new k(5), 23)), new uoe.a(6, new l(this, 4)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }

    public final efm.b k3() {
        efm.r a7 = m70.a.g(n3(), null, null, 3);
        efm.r b4 = w3();
        efm.r c2 = C3();
        efm.r d = B3();
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b4, "b");
        Intrinsics.checkNotNullParameter(c2, "c");
        Intrinsics.checkNotNullParameter(d, "d");
        efm.r rVarZip = efm.r.zip(a7, b4, c2, d, new uyd.y(25));
        Intrinsics.checkNotNullExpressionValue(rVarZip, "zip(...)");
        efm.b bVarFlatMapCompletable = rVarZip.take(1L).flatMapCompletable(new j(new f(this, 27), 14));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        return bVarFlatMapCompletable;
    }

    public final pfm.h l3() {
        efm.d0 d0VarFirstOrError = m70.a.g(p3(), null, new k(1), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        j jVar = new j(new g4(1, this, a0.class, "requestWithdrawQuoteSingle", "requestWithdrawQuoteSingle(Lcom/revolut/feature/crypto/withdraw/impl/ui_v3/amountinput/CryptoSendAmountInputScreenContract$CalculatedAmounts;)Lio/reactivex/Single;", 0, 24), 15);
        d0VarFirstOrError.getClass();
        return v7.x(new ufm.f(new ufm.i(d0VarFirstOrError, jVar, 0), new j(new f(this, 28), 16), 3), "ignoreElement(...)");
    }

    public final efm.r m3() {
        Object value = this.f281867y.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (efm.r) value;
    }

    public final efm.r n3() {
        Object value = this.v.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (efm.r) value;
    }

    public final efm.r o3() {
        return (efm.r) this.f281862r.getValue();
    }

    public final efm.r p3() {
        Object value = this.C.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (efm.r) value;
    }

    public final NaviCommand q3() {
        WithdrawFinishBehavior withdrawFinishBehavior = (WithdrawFinishBehavior) ((e) this.f281852b).F0().get();
        if (!(withdrawFinishBehavior instanceof WithdrawFinishBehavior.ShowTransaction)) {
            if (withdrawFinishBehavior instanceof WithdrawFinishBehavior.Navigate) {
                return ((WithdrawFinishBehavior.Navigate) withdrawFinishBehavior).f71148a;
            }
            aim.e eVarB = zhm.u.b();
            eVarB.add(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6))));
            FeatureCommand featureCommandR3 = r3();
            if (featureCommandR3 != null) {
                eVarB.add(featureCommandR3);
            }
            return new CompositeCommand(zhm.u.a(eVarB));
        }
        aim.e eVarB2 = zhm.u.b();
        eVarB2.add(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.b.f277278a, null, null, 6))));
        Iterator it8 = ((WithdrawFinishBehavior.ShowTransaction) withdrawFinishBehavior).f71149a.iterator();
        while (it8.hasNext()) {
            eVarB2.add((NaviCommand) it8.next());
        }
        FeatureCommand featureCommandR32 = r3();
        if (featureCommandR32 != null) {
            eVarB2.add(featureCommandR32);
        }
        return new CompositeCommand(zhm.u.a(eVarB2));
    }

    public final FeatureCommand r3() {
        e eVar = (e) this.f281852b;
        String str = (String) ((od0.i) eVar.o.getValue(eVar, e.v[13]).get()).f224257a;
        if (str != null) {
            return u0.f(new TransactionDetailsDestination(new k71.c(str), rhf.d.CRYPTO, 4));
        }
        return null;
    }

    public final efm.r s3() {
        Object value = this.A.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        efm.r rVarM3 = m3();
        efm.r map = ((e) this.f281852b).A0().c(te0.s.f270018a).map(new j(new h(21), 13));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(mif.a.e((efm.r) value, rVarM3, map), new f(this, 26));
    }

    public final efm.r t3() {
        efm.r rVarDistinctUntilChanged = ((e) this.f281852b).B0().c(te0.s.f270018a).map(new j(new h(20), 12)).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        return rVarDistinctUntilChanged;
    }

    public final efm.r u3() {
        efm.r rVarN3 = n3();
        efm.r map = ((e) this.f281852b).A0().c(te0.s.f270018a).map(new j(new h(23), 19));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return nim.a.w(kli.a.h(rVarN3, map), new l(this, 0));
    }

    public final efm.r v3() {
        Object value = this.B.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (efm.r) value;
    }

    public final efm.r w3() {
        return m70.a.g(nim.a.w(v3(), new h(12)), null, new uj8.j(28), 1);
    }

    public final efm.r x3() {
        return ((e) this.f281852b).B0().c(te0.s.f270018a);
    }

    public final efm.r y3() {
        efm.r rVarDistinctUntilChanged = m3().distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        Object value = this.D.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        efm.r rVarDistinctUntilChanged2 = kli.a.i(rVarDistinctUntilChanged, (efm.r) value, o3()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged2, "distinctUntilChanged(...)");
        return pd.b.r(rVarDistinctUntilChanged2, new f(this, 16));
    }

    public final efm.r z3() {
        efm.r rVarSwitchMap = m70.a.g(kli.a.h(n3(), o3()), null, new k(4), 1).switchMap(new j(new f(this, 25), 10));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }
}
