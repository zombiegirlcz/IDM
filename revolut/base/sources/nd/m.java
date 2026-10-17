package nd;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.play.core.integrity.StandardIntegrityException;
import dp4.e1;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import ulm.x1;
import zhm.h0;

/* JADX INFO: loaded from: classes17.dex */
public final class m implements q, kfm.o, x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214265a;

    public m() {
        this.f214265a = 22;
        yua.n function = yua.n.f316956a;
        Intrinsics.checkNotNullParameter(function, "function");
    }

    public static j8l.e d(xi0.b bVar) {
        IllegalStateException illegalStateException = new IllegalStateException("CollateralTransferHandler not configured for this app");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        dj0.d dVar = new dj0.d(0L, bVar);
        return new j8l.e(dVar, dVar);
    }

    public static rqb.a e() {
        phm.a aVar = (phm.a) ((hf0.a) hf0.b.d.c()).a().get(qqb.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", qqb.a.class, " is not found"));
        }
        ((qqb.a) aVar2.b()).getClass();
        return new rqb.a();
    }

    @Override // nd.q
    public Object a(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f214265a) {
            case 2:
                return nz7.n.f220984a.invoke(obj2);
            case 17:
                return w48.g.f294526a.invoke(obj2);
            default:
                return yua.n.f316956a.invoke(obj2);
        }
    }

    public ApiException b(Bundle bundle) {
        int i = bundle.getInt("error");
        if (i == 0) {
            return null;
        }
        return new StandardIntegrityException(i, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j8l.e c(j8l.h r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof t7i.c
            if (r0 == 0) goto L13
            r0 = r6
            t7i.c r0 = (t7i.c) r0
            int r1 = r0.f268718w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268718w = r1
            goto L18
        L13:
            t7i.c r0 = new t7i.c
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r0 = r0.f268718w
            if (r0 == 0) goto L3a
            r5 = 1
            if (r0 != r5) goto L32
            yhm.o.b(r6)
            java.lang.String r5 = "sourceMoney"
            r6 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.String r5 = "targetMoney"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            throw r6
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3a:
            yhm.o.b(r6)
            r6 = r5
            com.revolut.feature_move_money.api.model.AccountWrapper r6 = (com.revolut.feature_move_money.api.model.AccountWrapper) r6
            j8l.a r0 = r6.f97224a
            dj0.d r6 = r6.getBalance()
            xi0.b r6 = r6.f115083b
            j8l.a r1 = j8l.a.SPOT_MARGIN_COLLATERAL
            if (r0 == r1) goto L56
            j8l.a r1 = j8l.a.FUTURES_COLLATERAL
            if (r0 != r1) goto L51
            goto L56
        L51:
            j8l.e r5 = d(r6)
            return r5
        L56:
            boolean r5 = r5 instanceof com.revolut.feature_move_money.api.model.AccountWrapper
            if (r5 != 0) goto L5f
            j8l.e r5 = d(r6)
            return r5
        L5f:
            j8l.e r5 = d(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.m.c(j8l.h, gim.c):j8l.e");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x011a, code lost:
    
        if (r13.b(r2) == r3) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(java.lang.String r13, i9b.a r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.m.f(java.lang.String, i9b.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public j8l.e g(j8l.h r5, j8l.h r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof t7i.d
            if (r0 == 0) goto L13
            r0 = r7
            t7i.d r0 = (t7i.d) r0
            int r1 = r0.f268719w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f268719w = r1
            goto L18
        L13:
            t7i.d r0 = new t7i.d
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r0 = r0.f268719w
            if (r0 == 0) goto L37
            r5 = 1
            if (r0 != r5) goto L2f
            yhm.o.b(r7)
            dj0.d r5 = new dj0.d
            r6 = 0
            r0 = 0
            r5.<init>(r6, r0)
            throw r0
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r7)
            com.revolut.feature_move_money.api.model.AccountWrapper r5 = (com.revolut.feature_move_money.api.model.AccountWrapper) r5
            j8l.a r7 = r5.f97224a
            dj0.d r5 = r5.getBalance()
            xi0.b r5 = r5.f115083b
            j8l.a r0 = j8l.a.SPOT_MARGIN_COLLATERAL
            if (r7 == r0) goto L52
            j8l.a r0 = j8l.a.FUTURES_COLLATERAL
            if (r7 != r0) goto L4d
            goto L52
        L4d:
            j8l.e r5 = d(r5)
            return r5
        L52:
            boolean r6 = r6 instanceof com.revolut.feature_move_money.api.model.AccountWrapper
            if (r6 != 0) goto L5b
            j8l.e r5 = d(r5)
            return r5
        L5b:
            j8l.e r5 = d(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nd.m.g(j8l.h, j8l.h, gim.c):j8l.e");
    }

    public /* synthetic */ m(int i) {
        this.f214265a = i;
    }

    public m(spc.f dialogMapper, j60.a expandableDialogControllerExtension, spc.b delegatesProvider) {
        this.f214265a = 12;
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        Intrinsics.checkNotNullParameter(expandableDialogControllerExtension, "expandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(delegatesProvider, "delegatesProvider");
    }

    public m(qpc.a eeaMapper, qpc.b sgMapper) {
        this.f214265a = 5;
        Intrinsics.checkNotNullParameter(eeaMapper, "eeaMapper");
        Intrinsics.checkNotNullParameter(sgMapper, "sgMapper");
    }

    public m(sm3.b tabsMapper, sm3.a simpleListItemMapper) {
        this.f214265a = 14;
        Intrinsics.checkNotNullParameter(tabsMapper, "tabsMapper");
        Intrinsics.checkNotNullParameter(simpleListItemMapper, "simpleListItemMapper");
    }

    public m(wli.x deeplinkHandler, ajk.b outOfAppNavigationProvider, ajk.c bottomSheetNavigationResolver) {
        this.f214265a = 16;
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(outOfAppNavigationProvider, "outOfAppNavigationProvider");
        Intrinsics.checkNotNullParameter(bottomSheetNavigationResolver, "bottomSheetNavigationResolver");
    }

    public m(e1 creditRepository) {
        this.f214265a = 4;
        Intrinsics.checkNotNullParameter(creditRepository, "creditRepository");
    }

    public m(q4k.c transferDataBuilder, f4h.a errorStateProvider, y1k.a bankTransferInteractor, b9k.f checksExtensionFactory) {
        this.f214265a = 6;
        Intrinsics.checkNotNullParameter(transferDataBuilder, "transferDataBuilder");
        Intrinsics.checkNotNullParameter(errorStateProvider, "errorStateProvider");
        Intrinsics.checkNotNullParameter(bankTransferInteractor, "bankTransferInteractor");
        Intrinsics.checkNotNullParameter(checksExtensionFactory, "checksExtensionFactory");
    }

    public m(svd.a unstakingDataDtoMapper, rvd.a unstakingDataDomainMapper, tvd.a unstakingDataEntityMapper) {
        this.f214265a = 7;
        Intrinsics.checkNotNullParameter(unstakingDataDtoMapper, "unstakingDataDtoMapper");
        Intrinsics.checkNotNullParameter(unstakingDataDomainMapper, "unstakingDataDomainMapper");
        Intrinsics.checkNotNullParameter(unstakingDataEntityMapper, "unstakingDataEntityMapper");
    }

    public m(bgc.e rewardsInteractor) {
        this.f214265a = 20;
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
    }

    public m(b79.n notificationsRepository, b79.s popupsRepository) {
        this.f214265a = 21;
        Intrinsics.checkNotNullParameter(notificationsRepository, "notificationsRepository");
        Intrinsics.checkNotNullParameter(popupsRepository, "popupsRepository");
    }

    public m(np.a appResetCoordinator) {
        this.f214265a = 3;
        Intrinsics.checkNotNullParameter(appResetCoordinator, "appResetCoordinator");
    }

    public m(r69.a inboxInteractor) {
        this.f214265a = 15;
        Intrinsics.checkNotNullParameter(inboxInteractor, "inboxInteractor");
    }

    public m(s4f.t descriptionMapper) {
        this.f214265a = 10;
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
    }

    public m(ytk.b numberClauseMapper) {
        this.f214265a = 19;
        Intrinsics.checkNotNullParameter(numberClauseMapper, "numberClauseMapper");
    }
}
