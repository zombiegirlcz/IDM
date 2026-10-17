package kye;

import ch.qos.logback.core.CoreConstants;
import com.revolut.core.model.account.AccountId;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DecimalFormatSymbols;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kkf.r6;
import kkf.x5;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class k3 extends oki.h implements g0 {

    @NotNull
    public static final n0 Companion = new n0();
    public final y51.a A;
    public final qb3.a B;
    public final nb3.b C;
    public final aah.h D;
    public final c1f.b E;
    public final wj0.a F;
    public final uye.c G;
    public final uye.b H;
    public final u51.a I;
    public final com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h J;
    public final vte.b K;
    public final t0f.b L;
    public final wsg.n M;
    public final uye.d N;
    public final f0f.a O;
    public final t1j.b P;
    public final hg6.a Q;
    public final ogm.i R;
    public final sye.c S;
    public final rve.h T;
    public final l61.a U;
    public final uye.a V;
    public final yve.e W;
    public final ang.f X;
    public final qd0.b Y;
    public final Lazy Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Lazy f190761a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final boolean f190762b0;
    public final boolean c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final cli.y f190763d0;
    public final gte.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n8b.a f190764p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final eye.b f190765q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final q3 f190766r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f190767s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n60.a f190768t;
    public final gye.d u;
    public final j60.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gye.g f190769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ote.a f190770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ppk.f f190771y;
    public final pye.b z;

    public k3(gte.a featureToggleInteractor, n8b.a countryInteractor, eye.b moneyParser, q3 topUpAmountInteractor, cli.n stateMapper, n inputData, n60.a keyboardControllerExtension, gye.d bottomSheetModelMapper, j60.a bottomExpandableDialogControllerExtension, gye.g topupAmountDelegatesProvider, ote.a topUpModelExtension, ppk.f ratesInteractor, pye.b topupExtrasProvider, y51.a externalCardsInteractor, qb3.a cashTopUpAmountDialogMapper, nb3.b cashTopUpInteractor, aah.h wealthDisclaimersExtension, c1f.b differentCurrenciesDialogProvider, wj0.a idempotencyKeyHolder, uye.c selectedMethodRelay, uye.b cardDetailsReceiver, u51.a topupMethodsInteractor, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.h methodMapper, vte.b topUpLimitsInteractor, t0f.b preKycTopUpHelper, wsg.n walletInteractor, uye.d topUpFlowBottomSheetResultRelay, f0f.a externalCardBlockPushInterceptor, t1j.b topUpFeesInteractor, hg6.a indiaLimitsInteractor, ogm.i brazilInboundPixLimitsInteractor, sye.c indiaFeeInputModelMapper, rve.h externalCardVerificationInteractor, l61.a userCompanyInteractor, uye.a amountSelectedCurrencyRelay, yve.e topUpCurrencyOrderInteractor, ang.f userInteractor, qd0.b languageProvider) {
        String strX2;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(moneyParser, "moneyParser");
        Intrinsics.checkNotNullParameter(topUpAmountInteractor, "topUpAmountInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(bottomSheetModelMapper, "bottomSheetModelMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(topupAmountDelegatesProvider, "topupAmountDelegatesProvider");
        Intrinsics.checkNotNullParameter(topUpModelExtension, "topUpModelExtension");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(topupExtrasProvider, "topupExtrasProvider");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(cashTopUpAmountDialogMapper, "cashTopUpAmountDialogMapper");
        Intrinsics.checkNotNullParameter(cashTopUpInteractor, "cashTopUpInteractor");
        Intrinsics.checkNotNullParameter(wealthDisclaimersExtension, "wealthDisclaimersExtension");
        Intrinsics.checkNotNullParameter(differentCurrenciesDialogProvider, "differentCurrenciesDialogProvider");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(selectedMethodRelay, "selectedMethodRelay");
        Intrinsics.checkNotNullParameter(cardDetailsReceiver, "cardDetailsReceiver");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        Intrinsics.checkNotNullParameter(methodMapper, "methodMapper");
        Intrinsics.checkNotNullParameter(topUpLimitsInteractor, "topUpLimitsInteractor");
        Intrinsics.checkNotNullParameter(preKycTopUpHelper, "preKycTopUpHelper");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(topUpFlowBottomSheetResultRelay, "topUpFlowBottomSheetResultRelay");
        Intrinsics.checkNotNullParameter(externalCardBlockPushInterceptor, "externalCardBlockPushInterceptor");
        Intrinsics.checkNotNullParameter(topUpFeesInteractor, "topUpFeesInteractor");
        Intrinsics.checkNotNullParameter(indiaLimitsInteractor, "indiaLimitsInteractor");
        Intrinsics.checkNotNullParameter(brazilInboundPixLimitsInteractor, "brazilInboundPixLimitsInteractor");
        Intrinsics.checkNotNullParameter(indiaFeeInputModelMapper, "indiaFeeInputModelMapper");
        Intrinsics.checkNotNullParameter(externalCardVerificationInteractor, "externalCardVerificationInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(amountSelectedCurrencyRelay, "amountSelectedCurrencyRelay");
        Intrinsics.checkNotNullParameter(topUpCurrencyOrderInteractor, "topUpCurrencyOrderInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.o = featureToggleInteractor;
        this.f190764p = countryInteractor;
        this.f190765q = moneyParser;
        this.f190766r = topUpAmountInteractor;
        this.f190767s = inputData;
        this.f190768t = keyboardControllerExtension;
        this.u = bottomSheetModelMapper;
        this.v = bottomExpandableDialogControllerExtension;
        this.f190769w = topupAmountDelegatesProvider;
        this.f190770x = topUpModelExtension;
        this.f190771y = ratesInteractor;
        this.z = topupExtrasProvider;
        this.A = externalCardsInteractor;
        this.B = cashTopUpAmountDialogMapper;
        this.C = cashTopUpInteractor;
        this.D = wealthDisclaimersExtension;
        this.E = differentCurrenciesDialogProvider;
        this.F = idempotencyKeyHolder;
        this.G = selectedMethodRelay;
        this.H = cardDetailsReceiver;
        this.I = topupMethodsInteractor;
        this.J = methodMapper;
        this.K = topUpLimitsInteractor;
        this.L = preKycTopUpHelper;
        this.M = walletInteractor;
        this.N = topUpFlowBottomSheetResultRelay;
        this.O = externalCardBlockPushInterceptor;
        this.P = topUpFeesInteractor;
        this.Q = indiaLimitsInteractor;
        this.R = brazilInboundPixLimitsInteractor;
        this.S = indiaFeeInputModelMapper;
        this.T = externalCardVerificationInteractor;
        this.U = userCompanyInteractor;
        this.V = amountSelectedCurrencyRelay;
        this.W = topUpCurrencyOrderInteractor;
        this.X = userInteractor;
        this.Y = languageProvider;
        final int i = 0;
        this.Z = yhm.j.b(new Function0(this) { // from class: kye.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f190757b;

            {
                this.f190757b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zG;
                switch (i) {
                    case 0:
                        zG = ((o8b.c) this.f190757b.f190764p).g();
                        break;
                    default:
                        zG = ((jte.d) this.f190757b.o).c(TopupApi$Toggles.ExternalCardRollingLimit.f90464c);
                        break;
                }
                return Boolean.valueOf(zG);
            }
        });
        final int i2 = 1;
        this.f190761a0 = yhm.j.b(new Function0(this) { // from class: kye.k0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k3 f190757b;

            {
                this.f190757b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zG;
                switch (i2) {
                    case 0:
                        zG = ((o8b.c) this.f190757b.f190764p).g();
                        break;
                    default:
                        zG = ((jte.d) this.f190757b.o).c(TopupApi$Toggles.ExternalCardRollingLimit.f90464c);
                        break;
                }
                return Boolean.valueOf(zG);
            }
        });
        jte.d dVar = (jte.d) featureToggleInteractor;
        this.f190762b0 = dVar.c(TopupApi$Toggles.TopUpCardOwnerVerification.f90471c);
        this.c0 = dVar.c(TopupApi$Toggles.AmountCurrencyChooserMigration.f90459c);
        String str = inputData.f190797c.f306286a;
        dj0.d dVar2 = inputData.f;
        this.f190763d0 = mra.d.b(this, new m(true, str, null, dVar2, (dVar2 == null || (strX2 = X2(dVar2)) == null) ? "" : strX2, null, null, null, null, false, null, null, false, topUpModelExtension.d3(), null, null, null, null, null, null, null, false, false, null, false, null, true, true, null, null, null, null, null, null, null, null, null), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(kye.k3 r8, java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            rve.h r0 = r8.T
            boolean r1 = r10 instanceof kye.u0
            if (r1 == 0) goto L15
            r1 = r10
            kye.u0 r1 = (kye.u0) r1
            int r2 = r1.f190846x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f190846x = r2
            goto L1a
        L15:
            kye.u0 r1 = new kye.u0
            r1.<init>(r8, r10)
        L1a:
            java.lang.Object r10 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f190846x
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L3b
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2d
            yhm.o.b(r10)
            return r10
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r9 = r1.u
            yhm.o.b(r10)
            goto L6a
        L3b:
            yhm.o.b(r10)
            cli.y r10 = r8.f190763d0
            k7c.n r3 = new k7c.n
            r7 = 22
            r3.<init>(r9, r7)
            r8.H2(r10, r3)
            r1.u = r9
            r1.f190846x = r6
            o7.d r8 = r0.f257769a
            ave.c r10 = new ave.c
            r10.<init>(r8, r9, r4, r6)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r8, r10, r1)
            if (r8 != r2) goto L60
            goto L62
        L60:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L62:
            if (r8 != r2) goto L65
            goto L67
        L65:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L67:
            if (r8 != r2) goto L6a
            goto L74
        L6a:
            r1.u = r4
            r1.f190846x = r5
            java.lang.Enum r8 = r0.a(r9, r1)
            if (r8 != r2) goto L75
        L74:
            return r2
        L75:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.I2(kye.k3, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008a, code lost:
    
        if (r2 == r3) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b9, code lost:
    
        if (r2 == r3) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ee A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(kye.k3 r18, vye.b r19, dj0.d r20, l71.d r21, gim.c r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.J2(kye.k3, vye.b, dj0.d, l71.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x007c, code lost:
    
        if (r0 == r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a9, code lost:
    
        if (r0 == r9) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(kye.k3 r10, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card r11, dj0.d r12, l71.d r13, gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.K2(kye.k3, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod$StoredMethod$Card, dj0.d, l71.d, gim.c):java.lang.Object");
    }

    public static final Object L2(k3 k3Var, CardDetailsScreenDescriptor$OutputData$CardData cardDetailsScreenDescriptor$OutputData$CardData, gim.i iVar) {
        String str = cardDetailsScreenDescriptor$OutputData$CardData.d;
        if (str == null) {
            IllegalStateException illegalStateException = new IllegalStateException("newCardId was missing in new card data while trying to launch cardholder verification");
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
            return Unit.f186387a;
        }
        CardholderVerificationStatus cardholderVerificationStatus = cardDetailsScreenDescriptor$OutputData$CardData.e;
        if (cardholderVerificationStatus == null) {
            IllegalStateException illegalStateException2 = new IllegalStateException("cardholderVerificationStatus was missing in new card data while trying to launch cardholder verification");
            zhm.h0 h0Var2 = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
            return Unit.f186387a;
        }
        k3Var.V2();
        switch (o0.f190804a[cardholderVerificationStatus.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return Unit.f186387a;
            case 4:
                Object objO2 = k3Var.O2(str, iVar);
                return objO2 == fim.a.COROUTINE_SUSPENDED ? objO2 : Unit.f186387a;
            case 5:
            case 6:
                IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected cardholder verification status while adding new card on amount screen " + cardholderVerificationStatus);
                zhm.h0 h0Var3 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException3, h0Var3);
                return Unit.f186387a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final boolean M2(k3 k3Var, SelectedMethod selectedMethod) {
        if (selectedMethod instanceof vye.d) {
            vye.c[] elements = {vye.c.MCY_BANK_TRANSFER, vye.c.MCY_NET_BANKING, vye.c.MCY_UPI_APP};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return kotlin.collections.d.y0(elements).contains(((vye.d) selectedMethod).e);
        }
        if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.c) {
            return ((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.c) selectedMethod).f90918g;
        }
        if (selectedMethod instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.g) {
            return ((com.revolut.feature.topup_screen.impl.flows.topup.flow.data.g) selectedMethod).f90932g;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N2(kye.k3 r11, java.lang.String r12, gim.c r13) {
        /*
            boolean r0 = r13 instanceof kye.u2
            if (r0 == 0) goto L13
            r0 = r13
            kye.u2 r0 = (kye.u2) r0
            int r1 = r0.f190849x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190849x = r1
            goto L18
        L13:
            kye.u2 r0 = new kye.u2
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190849x
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kye.k3 r12 = r0.u
            yhm.o.b(r13)
            r5 = r12
            goto L50
        L2b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L33:
            yhm.o.b(r13)
            u51.a r13 = r11.I
            kye.n r2 = r11.f190767s
            pte.a r5 = r2.f190796b
            com.revolut.feature.topup_screen.common.TopUpTarget r2 = r2.f190795a
            yte.n r2 = pw5.a.K(r5, r2)
            r0.u = r11
            r0.f190849x = r3
            e0f.r1 r13 = (e0f.r1) r13
            java.lang.Object r13 = r13.g(r12, r2, r4, r0)
            if (r13 != r1) goto L4f
            return r1
        L4f:
            r5 = r11
        L50:
            r6 = r13
            kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
            ie6.q r7 = new ie6.q
            r12 = 2
            r13 = 17
            r7.<init>(r12, r13, r4)
            kye.v2 r9 = new kye.v2
            r9.<init>(r11, r4)
            r10 = 2
            r8 = 0
            yji.l.a1(r5, r6, r7, r8, r9, r10)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.N2(kye.k3, java.lang.String, gim.c):java.lang.Object");
    }

    public static vkm.y Y2(Function1 function1) {
        return vkm.q.L(new vkm.v1(new iji.d(3, (Continuation) null, function1)), 3L, new hd2.b(2, 3, null));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void I1() {
        this.v.d((List) ((gye.b) this.f190769w).d.getValue());
        n nVar = this.f190767s;
        Continuation continuation = null;
        if (nVar.e) {
            l2(new r1(4, continuation, this), new yi5.b(26));
        }
        kxb.c cVar = new kxb.c(10);
        cli.y yVar = this.f190763d0;
        yji.l.a1(this, vkm.q.q(yVar.B(cVar)), null, null, new y1(this, null), 3);
        l2(new kq5.d(this, ((m) ((vkm.j2) yVar.f22677a).getValue()).f190775b, continuation, 20), new yi5.b(26));
        yji.l.a1(this, this.G.f284262a, null, null, new h3(this, null), 3);
        e0f.r1 r1Var = (e0f.r1) this.I;
        yji.l.a1(this, ((hve.o) r1Var.f121679a).f155855m, null, null, new t2(this, null), 3);
        yji.l.a1(this, vkm.q.Q(yVar.B(new kxb.c(21)), new b1(2, continuation, this)), null, null, new g2(this, null), 3);
        yji.l.a1(this, vkm.q.H(new z0(0, continuation, this), yVar.B(new kxb.c(28))), null, null, new a1(this, null), 3);
        yji.l.a1(this, this.H.f284258a, null, null, new t1(this, null), 3);
        int i = 1;
        yji.l.a1(this, vkm.q.q(yh5.b.d(new vkm.t0(yVar.B(new m0(0)), i), yVar.B(new m0(i)))), null, null, new h2(0, continuation, this), 3);
        yji.l.a1(this, new x5(yVar.B(new kxb.c(17)), 22), null, null, new q2(this, null), 3);
        yji.l.a1(this, this.N.f284265a, null, null, new o1(this, null), 3);
        yji.l.a1(this, this.O.f131119a, null, null, new r1(0, continuation, this), 3);
        l2(new p0(this, null), new yi5.b(26));
        yji.l.a1(this, vkm.q.q(new x5(yVar.B(new kxb.c(9)), 21)), null, null, new a2(this, null), 3);
        Flow flowB = yVar.B(new kxb.c(11));
        Flow flowB2 = yVar.B(new kxb.c(12));
        efm.r rVarX = this.M.x(AccountId.Personal.f51414a).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        yji.l.a1(this, yh5.b.e(flowB2, flowB, rd0.e.b(rVarX)), null, null, new b3(this, null), 3);
        yji.l.a1(this, new k2(yVar.B(new m0(2)), this, 1), null, null, new o2(this, null), 3);
        yji.l.a1(this, vkm.q.Q(new r6(new k2(vkm.q.q(yVar.B(new kxb.c(22))), this, 0), 8), new b1(3, continuation, this)), null, null, new m2(this, null), 3);
        yji.l.a1(this, vkm.q.Q(yVar.B(new kxb.c(27)), new b1(0, continuation, this)), null, null, new d1(this, null), 3);
        yji.l.a1(this, vkm.q.H(new p1(this, null), vkm.q.q(yVar.B(new kxb.c(19)))), null, null, new q1(this, null), 3);
        l2(new r0(this, null), new yi5.b(26));
        yji.l.a1(this, rd0.e.e(rd0.e.b(m70.a.g(hng.g.b(((ang.b) this.U).f7765a), null, new ku1.f0(27), 1)), zhm.h0.f322473a, new klf.l1(3, 10, continuation)), null, null, new c3(this, null), 3);
        l2(new r1(1, continuation, this), new yi5.b(26));
        yji.l.a1(this, vkm.q.H(new j1(this, null), vkm.q.q(yVar.B(new kxb.c(16)))), null, null, new k1(this, null), 3);
        if (this.c0) {
            yji.l.a1(this, this.V.f284255a, null, null, new krc.h(this, continuation, 20), 3);
            yji.l.a1(this, mo3.a.g(r1Var.i(pw5.a.K(nVar.f190796b, nVar.f190795a)), null, new ku1.f0(26), 1), null, null, new l1(this, null), 3);
        }
        if (this.f190762b0) {
            yji.l.a1(this, new x5(yVar.B(new kxb.c(18)), 23), null, null, new h2(1, continuation, this), 3);
            l2(new f2(this, null), new yi5.b(26));
            yji.l.a1(this, new x5(yVar.B(new kxb.c(29)), 20), null, null, new w1(this, null), 3);
        }
        int i2 = 26;
        l2(new f1(this, null), new yi5.b(i2));
        l2(new g1(this, null), new yi5.b(i2));
        l2(new e1(this, null), new yi5.b(i2));
        l2(new r1(2, continuation, this), new yi5.b(i2));
        yji.l.a1(this, vkm.q.q(yVar.B(new kxb.c(13))), null, null, new n1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kye.v0
            if (r0 == 0) goto L13
            r0 = r8
            kye.v0 r0 = (kye.v0) r0
            int r1 = r0.f190854w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190854w = r1
            goto L18
        L13:
            kye.v0 r0 = new kye.v0
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190854w
            cli.y r3 = r6.f190763d0
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r8)     // Catch: java.lang.Exception -> L2a
            goto L50
        L2a:
            r7 = move-exception
            goto L77
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            java.lang.Object r8 = r3.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            kye.m r8 = (kye.m) r8
            java.lang.String r8 = r8.f190775b
            vte.b r2 = r6.K     // Catch: java.lang.Exception -> L2a
            r0.f190854w = r4     // Catch: java.lang.Exception -> L2a
            xve.d r2 = (xve.d) r2     // Catch: java.lang.Exception -> L2a
            java.lang.Object r8 = r2.b(r7, r8, r0)     // Catch: java.lang.Exception -> L2a
            if (r8 != r1) goto L50
            return r1
        L50:
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: java.lang.Exception -> L2a
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Exception -> L2a
            r7.<init>()     // Catch: java.lang.Exception -> L2a
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Exception -> L2a
        L5b:
            boolean r0 = r8.hasNext()     // Catch: java.lang.Exception -> L2a
            if (r0 == 0) goto L75
            java.lang.Object r0 = r8.next()     // Catch: java.lang.Exception -> L2a
            aue.b r0 = (aue.b) r0     // Catch: java.lang.Exception -> L2a
            boolean r1 = r0 instanceof aue.a     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L6e
            aue.a r0 = (aue.a) r0     // Catch: java.lang.Exception -> L2a
            goto L6f
        L6e:
            r0 = r5
        L6f:
            if (r0 == 0) goto L5b
            r7.add(r0)     // Catch: java.lang.Exception -> L2a
            goto L5b
        L75:
            r5 = r7
            goto L80
        L77:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r5, r5, r7, r8)
        L80:
            k37.t r7 = new k37.t
            r8 = 13
            r7.<init>(r5, r8)
            r6.H2(r3, r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.O2(java.lang.String, gim.c):java.lang.Object");
    }

    public final void P2() {
        this.f190768t.Q();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kye.h1
            if (r0 == 0) goto L13
            r0 = r8
            kye.h1 r0 = (kye.h1) r0
            int r1 = r0.f190737w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190737w = r1
            goto L18
        L13:
            kye.h1 r0 = new kye.h1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190737w
            r3 = 0
            java.lang.String r4 = "IL"
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 != r5) goto L2a
            yhm.o.b(r8)
            goto L5b
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            boolean r8 = r7 instanceof com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card
            if (r8 == 0) goto L71
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod$StoredMethod$Card r7 = (com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod.StoredMethod.Card) r7
            java.lang.String r7 = r7.f90903a
            w4l.h r8 = w4l.h.f294642c
            y51.a r2 = r6.A
            e0f.z r2 = (e0f.z) r2
            efm.r r7 = r2.c(r7, r8)
            kye.l0 r8 = new kye.l0
            r2 = 0
            r8.<init>(r2)
            r2 = 0
            efm.r r7 = m70.a.g(r7, r2, r8, r5)
            r0.f190737w = r5
            java.lang.Object r8 = nim.a.e(r7, r0)
            if (r8 != r1) goto L5b
            return r1
        L5b:
            t61.g r8 = (t61.g) r8
            if (r8 == 0) goto L8e
            t61.j r7 = r8.f268142j
            if (r7 == 0) goto L8e
            java.lang.String r7 = r7.i
            if (r7 == 0) goto L8e
            wi0.a r8 = wi0.b.Companion
            r8.getClass()
            boolean r3 = r7.equalsIgnoreCase(r4)
            goto L8e
        L71:
            boolean r8 = r7 instanceof vye.b
            if (r8 == 0) goto L8d
            vye.b r7 = (vye.b) r7
            com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData r7 = r7.e
            if (r7 == 0) goto L8e
            t61.j r7 = r7.f90486c
            if (r7 == 0) goto L8e
            java.lang.String r7 = r7.i
            if (r7 == 0) goto L8e
            wi0.a r8 = wi0.b.Companion
            r8.getClass()
            boolean r3 = r7.equalsIgnoreCase(r4)
            goto L8e
        L8d:
            r3 = r5
        L8e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.Q2(com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable R2(e71.b r6, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kye.i1
            if (r0 == 0) goto L13
            r0 = r8
            kye.i1 r0 = (kye.i1) r0
            int r1 = r0.f190744y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190744y = r1
            goto L18
        L13:
            kye.i1 r0 = new kye.i1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f190742w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190744y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            dj0.d r6 = r0.v
            e71.b r7 = r0.u
            yhm.o.b(r8)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r8)
            dj0.d r8 = r6.f123019a
            if (r8 == 0) goto L67
            r0.u = r6
            r0.v = r8
            r0.f190744y = r3
            java.lang.Object r7 = r5.W2(r8, r7, r0)
            if (r7 != r1) goto L47
            return r1
        L47:
            r4 = r7
            r7 = r6
            r6 = r8
            r8 = r4
        L4b:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L5d
            qte.f r8 = new qte.f
            java.lang.String r7 = r7.f123020b
            xi0.b r6 = r6.f115083b
            r8.<init>(r7, r6)
            return r8
        L5d:
            qte.d r8 = new qte.d
            java.lang.String r0 = r7.f123020b
            e71.a r7 = r7.f123021c
            r8.<init>(r6, r0, r7)
            return r8
        L67:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.R2(e71.b, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod, gim.c):java.io.Serializable");
    }

    public final void S2(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        l2(new g3(currencyCode, this, null), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n nVar = this.f190767s;
        boolean z = nVar.f190795a instanceof TopUpTarget.Joint;
        Continuation continuation = null;
        cli.y yVar = this.f190763d0;
        if (z) {
            H2(yVar, new kxb.c(23));
        } else {
            yji.l.b1(this, vkm.q.q(vkm.q.Q(yVar.B(new kxb.c(24)), new b1(1, continuation, this))), null, new m1(this, null), 3);
        }
        if (((m) ((vkm.j2) yVar.f22677a).getValue()).f190779j) {
            H2(yVar, new kxb.c(14));
        } else {
            H2(yVar, new kxb.c(15));
        }
        yji.l.b1(this, rd0.e.b(m70.a.g(this.X.k(false), null, new ku1.f0(28), 1)), null, new j3(this, null), 3);
        if (nVar.f190795a instanceof TopUpTarget.Invest) {
            yji.l.b1(this, new g48.r(mo3.a.g(rd0.e.n(this.D.f2828l.w0(), zhm.h0.f322473a), null, new ku1.f0(29), 1), 26), null, new z2(this, null), 3);
        }
    }

    public final void T2() {
        cli.y yVar = this.f190763d0;
        String str = ((m) ((vkm.j2) yVar.f22677a).getValue()).f190775b;
        dj0.d dVar = ((m) ((vkm.j2) yVar.f22677a).getValue()).d;
        if (dVar != null) {
            C2(new y(dVar, str));
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Amount money was null on open topup methods");
        zhm.h0 h0Var = zhm.h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U2() {
        /*
            Method dump skipped, instruction units count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.U2():void");
    }

    public final void V2() {
        H2(this.f190763d0, new kxb.c(25));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object W2(dj0.d r6, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof kye.i3
            if (r0 == 0) goto L13
            r0 = r8
            kye.i3 r0 = (kye.i3) r0
            int r1 = r0.f190748y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f190748y = r1
            goto L18
        L13:
            kye.i3 r0 = new kye.i3
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f190746w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f190748y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            dj0.d r6 = r0.u
            yhm.o.b(r8)
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod r7 = r0.v
            dj0.d r6 = r0.u
            yhm.o.b(r8)
            goto L54
        L3c:
            yhm.o.b(r8)
            l61.a r8 = r5.U
            ang.b r8 = (ang.b) r8
            efm.d0 r8 = r8.a()
            r0.u = r6
            r0.v = r7
            r0.f190748y = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L54
            goto L6e
        L54:
            java.lang.String r2 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            l71.d r8 = (l71.d) r8
            boolean r8 = l71.f.e(r8)
            if (r8 == 0) goto L7e
            r0.u = r6
            r8 = 0
            r0.v = r8
            r0.f190748y = r3
            java.lang.Object r8 = r5.Q2(r7, r0)
            if (r8 != r1) goto L6f
        L6e:
            return r1
        L6f:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r7 = r8.booleanValue()
            if (r7 != 0) goto L7e
            boolean r6 = r6.k()
            if (r6 == 0) goto L7e
            goto L7f
        L7e:
            r4 = 0
        L7f:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.k3.W2(dj0.d, com.revolut.feature.topup_screen.impl.flows.topup.flow.data.SelectedMethod, gim.c):java.lang.Object");
    }

    public final String X2(dj0.d dVar) {
        char monetaryDecimalSeparator = DecimalFormatSymbols.getInstance(((s80.b) this.Y).b()).getMonetaryDecimalSeparator();
        BigDecimal bigDecimalY = pyd.c.Y(dVar);
        if (bigDecimalY.remainder(BigDecimal.ONE).compareTo(BigDecimal.ZERO) == 0) {
            bigDecimalY = bigDecimalY.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalY.stripTrailingZeros();
        }
        String plainString = bigDecimalY.toPlainString();
        Intrinsics.h(plainString);
        return kotlin.text.a0.E(plainString, CoreConstants.DOT, monetaryDecimalSeparator);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f190763d0;
    }
}
