package com.revolut.feature.pockets.impl.ui.pockets_list;

import afa.f;
import afa.g;
import afa.j;
import afa.q;
import afa.t;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.pockets.api.navigation.PocketListType;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import e7l.g;
import efm.r;
import hx7.e;
import ip0.v7;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mkd.d;
import oki.h;
import rea.m;
import rea.p;
import s99.i;
import t99.k;
import wsg.n;
import yji.l;
import zhm.f0;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends h implements afa.h {
    public final f A;
    public final on2.b B;
    public final rfb.b C;
    public final y D;
    public final com.revolut.kompot.navigable.vc.modal.a E;
    public final PocketsListContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f80920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final fk3.a f80921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f80922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f80923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final j f80924t;
    public final d u;
    public final k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f80925w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final uea.f f80926x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final p f80927y;
    public final ang.f z;

    public c(PocketsListContract$InputData inputData, n walletInteractor, fk3.a configurationInteractor, m pocketDetailsInteractor, j60.a bottomSheetDialog, j dialogMapper, d slotManagerFeedControllerModelExtension, k exchangeGlobalAccessFlowProvider, i exchangeGlobalAccessInteractor, uea.f pocketDetailsRepository, p validateMcyExtension, ang.f userInteractor, f keyboardControllerExtension, on2.b switchToRevFeatureChecker, rfb.b salaryAccountFeatureChecker, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "bottomSheetDialog");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(slotManagerFeedControllerModelExtension, "slotManagerFeedControllerModelExtension");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessFlowProvider, "exchangeGlobalAccessFlowProvider");
        Intrinsics.checkNotNullParameter(exchangeGlobalAccessInteractor, "exchangeGlobalAccessInteractor");
        Intrinsics.checkNotNullParameter(pocketDetailsRepository, "pocketDetailsRepository");
        Intrinsics.checkNotNullParameter(validateMcyExtension, "validateMcyExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(switchToRevFeatureChecker, "switchToRevFeatureChecker");
        Intrinsics.checkNotNullParameter(salaryAccountFeatureChecker, "salaryAccountFeatureChecker");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f80920p = walletInteractor;
        this.f80921q = configurationInteractor;
        this.f80922r = pocketDetailsInteractor;
        this.f80923s = bottomSheetDialog;
        this.f80924t = dialogMapper;
        this.u = slotManagerFeedControllerModelExtension;
        this.v = exchangeGlobalAccessFlowProvider;
        this.f80925w = exchangeGlobalAccessInteractor;
        this.f80926x = pocketDetailsRepository;
        this.f80927y = validateMcyExtension;
        this.z = userInteractor;
        this.A = keyboardControllerExtension;
        this.B = switchToRevFeatureChecker;
        this.C = salaryAccountFeatureChecker;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        SlotContext slotContext = inputData.f80907c.f80915c;
        Data data3 = new Data(slotContext != null ? null : f0.f322471a, null, slotContext != null, 2, null);
        Data data4 = new Data(null, null, true, 3, null);
        Map mapG = r0.g();
        kn2.a aVar = new kn2.a(0);
        boolean z = inputData.d;
        this.D = mra.d.b(this, new g(data, data2, data3, data4, mapG, "", new Data(z ? null : aVar, null, z, 2, null), zi0.c.P(new rfb.a(0), true, null, 2)), stateMapper, null, false, 12);
        this.E = e.a(this, new ack.f(this, 8));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.pockets.impl.ui.pockets_list.c r8, io3.d r9, wi0.b r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof afa.y
            if (r0 == 0) goto L14
            r0 = r11
            afa.y r0 = (afa.y) r0
            int r1 = r0.f4014w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f4014w = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            afa.y r0 = new afa.y
            r0.<init>(r8, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f4014w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L58
            goto L53
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r11)
            yhm.m$a r11 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L58
            uea.f r1 = r8.f80926x     // Catch: java.lang.Throwable -> L58
            r8 = r2
            java.lang.String r2 = r9.f163146b     // Catch: java.lang.Throwable -> L58
            xi0.a r11 = xi0.b.Companion     // Catch: java.lang.Throwable -> L58
            java.lang.String r3 = r9.f163147c     // Catch: java.lang.Throwable -> L58
            r11.getClass()     // Catch: java.lang.Throwable -> L58
            xi0.b r3 = xi0.a.a(r3)     // Catch: java.lang.Throwable -> L58
            io3.l r4 = r9.e     // Catch: java.lang.Throwable -> L58
            r7.f4014w = r8     // Catch: java.lang.Throwable -> L58
            r6 = 0
            r5 = r10
            java.lang.Object r8 = r1.a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L58
            if (r8 != r0) goto L53
            return r0
        L53:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L58
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L58
            goto L5f
        L58:
            r0 = move-exception
            r8 = r0
            yhm.m$a r9 = yhm.m.INSTANCE
            yhm.o.a(r8)
        L5f:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.ui.pockets_list.c.I2(com.revolut.feature.pockets.impl.ui.pockets_list.c, io3.d, wi0.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        J2();
        PocketsListContract$InputData pocketsListContract$InputData = this.o;
        SlotContext slotContext = pocketsListContract$InputData.f80907c.f80915c;
        int i = 3;
        Continuation continuation = null;
        if (slotContext != null) {
            gld.f0 f0Var = (gld.f0) this.u;
            l.b1(this, new a6e.b(v7.y("PocketListScreenModel", "observeSlotManager", f0Var.f144638l.h()), 1), null, new t(this, continuation, 4), 3);
            f0Var.c3(new mkd.a(slotContext));
        }
        if (pocketsListContract$InputData.d) {
            r rVarX = new ufm.i(this.B.a(), new aed.f(new ael.r0(18), 23), 1).x();
            Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
            l.a1(this, rd0.e.e(rd0.e.b(rVarX), h0.f322473a, new a35.k(i, 3, continuation)), null, null, new t(this, continuation, 5), 3);
        }
        l2(new a01.e(this, continuation, 24), new yi5.b(26));
    }

    public final void J2() {
        PocketsListContract$InputData pocketsListContract$InputData = this.o;
        io3.l lVarA = pocketsListContract$InputData.f80905a.a();
        io3.i iVar = io3.i.INTERNAL;
        PocketListType pocketListType = pocketsListContract$InputData.f80905a;
        AccountId accountId = pocketListType.getAccountId();
        n nVar = this.f80920p;
        w4l.h hVar = w4l.h.f294642c;
        vkm.d dVarB = rd0.e.b(nim.a.w(osg.b.g(nVar, hVar, lVarA, null, iVar, null, null, accountId, 52), new ael.r0(21)));
        Continuation continuation = null;
        l.a1(this, dVarB, null, null, new t(this, continuation, 3), 3);
        l.a1(this, rd0.e.b(nim.a.w(nim.a.w(((ik3.c) this.f80921q).l(g.b.f123407a, hVar), new ael.r0(19)), new ael.r0(20))), null, null, new t(this, continuation, 2), 3);
        sfm.b bVar = new sfm.b(this.f80920p.E(pocketListType.getAccountId()), new aed.f(new q(this, 0), 22), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        l.a1(this, rd0.e.b(nim.a.w(bVar, new ael.r0(17))), null, null, new t(this, continuation, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.E;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.D;
    }
}
