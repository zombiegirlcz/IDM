package v7e;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode;
import com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreenContract$InputData;
import e7l.g;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import v2e.h0;
import v6l.b0;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends jki.g implements k {
    public static final List B;

    @NotNull
    public static final p Companion = new p();
    public final g A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SubaccountInfoPickerScreenContract$InputData f286615p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g6e.b f286616q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f286617r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r7e.c f286618s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final tj3.a f286619t;
    public final ang.f u;
    public final fk3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final t99.k f286620w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final s99.i f286621x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final n8b.a f286622y;
    public a2 z;

    static {
        xi0.a aVar = xi0.b.Companion;
        aVar.getClass();
        xi0.b bVar = xi0.b.i;
        aVar.getClass();
        xi0.b bVar2 = xi0.b.f306272g;
        aVar.getClass();
        B = zhm.v.k(bVar, bVar2, xi0.b.f306273h);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(jki.p stateMapper, SubaccountInfoPickerScreenContract$InputData inputData, g6e.b subaccountBackgroundInteractor, wsg.n walletInteractor, r7e.c currencyPickerInteractor, tj3.a commodityFeatureEnabledInteractor, ang.f userInteractor, fk3.a configurationInteractor, t99.k exchangeGlobalAccessFlowProvider, s99.i exchangeGlobalAccessInteractor, n8b.a countryInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subaccountBackgroundInteractor, "subaccountBackgroundInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(currencyPickerInteractor, "currencyPickerInteractor");
        Intrinsics.checkNotNullParameter(commodityFeatureEnabledInteractor, "commodityFeatureEnabledInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f286615p = inputData;
        this.f286616q = subaccountBackgroundInteractor;
        this.f286617r = walletInteractor;
        this.f286618s = currencyPickerInteractor;
        this.f286619t = commodityFeatureEnabledInteractor;
        this.u = userInteractor;
        this.v = configurationInteractor;
        this.f286620w = exchangeGlobalAccessFlowProvider;
        this.f286621x = exchangeGlobalAccessInteractor;
        this.f286622y = countryInteractor;
        this.A = new g(inputData.f89047a, "", null, null, new Data(null, null, true, 3, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(v7e.u r4, bla.c r5, xi0.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof v7e.q
            if (r0 == 0) goto L13
            r0 = r7
            v7e.q r0 = (v7e.q) r0
            int r1 = r0.f286611y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f286611y = r1
            goto L18
        L13:
            v7e.q r0 = new v7e.q
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f286609w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f286611y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            xi0.b r6 = r0.v
            bla.c r5 = r0.u
            yhm.o.b(r7)
            goto L4c
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r7)
            g6e.b r7 = r4.f286616q
            com.revolut.feature.subaccount.impl.ui.create.screen.info.SubaccountInfoPickerScreenContract$InputData r2 = r4.f286615p
            com.revolut.feature.subaccount.api.models.SubaccountType r2 = r2.f89047a
            r0.u = r5
            r0.v = r6
            r0.f286611y = r3
            s6e.d r7 = (s6e.d) r7
            r3 = 0
            java.lang.Object r7 = r7.b(r2, r6, r3, r0)
            if (r7 != r1) goto L4c
            return r1
        L4c:
            com.revolut.feature.backgroundpicker.api.model.ChosenBackground r7 = (com.revolut.feature.backgroundpicker.api.model.ChosenBackground) r7
            t99.k r0 = r4.f286620w
            grl.k9 r1 = grl.k9.Vaults
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r2 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r2 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r2 = new com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail
            r2.<init>(r1)
            r0.getClass()
            com.revolut.feature.onboarding.impl.exchange_global_access.flow.ExchangeGlobalAccessFlow r5 = t99.k.a(r5, r2)
            v7e.o r0 = new v7e.o
            r0.<init>(r4, r6, r7)
            com.revolut.kompot.common.ModalDestination$Style$FULLSCREEN_IMMEDIATE r6 = com.revolut.kompot.common.ModalDestination.Style.FULLSCREEN_IMMEDIATE.f98308a
            r4.f2(r5, r6, r0)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: v7e.u.y2(v7e.u, bla.c, xi0.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        efm.r rVarW;
        AccountId.Personal personal = AccountId.Personal.f51414a;
        wsg.n nVar = this.f286617r;
        w4l.h hVar = w4l.h.f294642c;
        efm.r rVarJ = nVar.J(personal, hVar);
        SubaccountInfoPickerScreenContract$InputData subaccountInfoPickerScreenContract$InputData = this.f286615p;
        SubaccountType subaccountType = subaccountInfoPickerScreenContract$InputData.f89047a;
        if (Intrinsics.f(subaccountType, SubaccountType.Personal.f88963a) || Intrinsics.f(subaccountType, SubaccountType.Group.f88960a)) {
            CreateSubaccountFlowProvider$CurrencySelectionMode createSubaccountFlowProvider$CurrencySelectionMode = subaccountInfoPickerScreenContract$InputData.f89048b;
            if (Intrinsics.f(createSubaccountFlowProvider$CurrencySelectionMode, CreateSubaccountFlowProvider$CurrencySelectionMode.FiatOnly.f88976a)) {
                rVarW = zi0.c.j(Boolean.FALSE);
            } else {
                if (!(createSubaccountFlowProvider$CurrencySelectionMode instanceof CreateSubaccountFlowProvider$CurrencySelectionMode.Specific) && !Intrinsics.f(createSubaccountFlowProvider$CurrencySelectionMode, CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a)) {
                    throw new NoWhenBranchMatchedException();
                }
                rVarW = nim.a.w(((zj3.a) this.f286619t).b(), new b0(25));
            }
        } else {
            if (!Intrinsics.f(subaccountType, SubaccountType.Joint.f88961a) && !Intrinsics.f(subaccountType, SubaccountType.Junior.f88962a) && !Intrinsics.f(subaccountType, SubaccountType.Teen.f88966a) && !Intrinsics.f(subaccountType, SubaccountType.Pro.f88964a) && !Intrinsics.f(subaccountType, SubaccountType.ProTax.f88965a)) {
                throw new NoWhenBranchMatchedException();
            }
            rVarW = zi0.c.j(Boolean.FALSE);
        }
        yji.l.a1(this, rd0.e.b(nim.a.w(mif.a.f(rVarJ, rVarW, this.u.k(false), ((ik3.c) this.v).l(g.b.f123407a, hVar)), new n(this, 1))), null, null, new v06.i(this, null, 17), 3);
        yji.l.a1(this, new h0(rd0.e.b(this.f286618s.f252200a), 5), null, null, new s(this, null), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.A;
    }
}
