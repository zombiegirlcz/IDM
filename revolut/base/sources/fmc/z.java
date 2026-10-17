package fmc;

import android.view.View;
import b9.w2;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.onfido.api.client.OnfidoFetcher;
import com.onfido.workflow.internal.network.WorkflowApi;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.core.api.R$string;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.ui.api.navigation.ApmRecipientListInputData;
import com.revolut.feature.credit.card.impl.ui.repay.pse.CreditCardPseRepayScreen;
import com.revolut.feature.retail.cfd.impl.screens.positions.CfdPositionsController;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$Input;
import com.revolut.feature.trade_rev_points.impl.data.network.TradeRevPointsService;
import com.revolut.feature.trading.impl.data.database.TradingDatabase;
import com.revolut.shared.feature.workflow.engine.api.models.workflow.Redirect;
import i2i.d0;
import ip0.jl0;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import z0h.q1;

/* JADX INFO: loaded from: classes6.dex */
public final class z implements g5b.d, el.b, kfm.o, cy8.a, zp0.c, k1f.m, bki.a, igm.o, igm.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f136369b;

    public z(d0 function) {
        this.f136368a = 17;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f136369b = function;
    }

    public static int b(List visitedCountries, Set allCountryCodes) {
        Intrinsics.checkNotNullParameter(visitedCountries, "visitedCountries");
        Intrinsics.checkNotNullParameter(allCountryCodes, "allCountryCodes");
        if (allCountryCodes.isEmpty()) {
            return 0;
        }
        return (int) ((((double) zhm.d0.i1(visitedCountries).size()) / ((double) allCountryCodes.size())) * ((double) 100));
    }

    @Override // bki.a
    public void a(View controllerView, os2.g uiStateBlockHandle, hli.a blockUserInteractionHandle, cli.r transitionStateLatch) {
        Intrinsics.checkNotNullParameter(controllerView, "controllerView");
        Intrinsics.checkNotNullParameter(uiStateBlockHandle, "uiStateBlockHandle");
        Intrinsics.checkNotNullParameter(blockUserInteractionHandle, "blockUserInteractionHandle");
        Intrinsics.checkNotNullParameter(transitionStateLatch, "transitionStateLatch");
        ((et0.z) ((xo0.f) this.f136369b)).setStateChangeListener(new k0d.c(uiStateBlockHandle, 22));
    }

    @Override // igm.g
    public void accept(Object obj2) {
        igm.g gVar = (igm.g) this.f136369b;
        Objects.requireNonNull(obj2, "value is null");
        gVar.accept(new fgm.f(obj2));
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f136368a) {
            case 17:
                return ((d0) this.f136369b).invoke(obj2);
            case 21:
                return ((j2i.c) this.f136369b).invoke(obj2);
            default:
                Object[] objArr = (Object[]) obj2;
                if (objArr.length == 2) {
                    return ((igm.c) this.f136369b).apply(objArr[0], objArr[1]);
                }
                throw new IllegalArgumentException("Array of size 2 expected but got " + objArr.length);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(dj0.d r5, java.util.Optional r6, java.lang.String r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof hxe.f
            if (r0 == 0) goto L13
            r0 = r8
            hxe.f r0 = (hxe.f) r0
            int r1 = r0.f156580y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156580y = r1
            goto L18
        L13:
            hxe.f r0 = new hxe.f
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.f156578w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156580y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.util.Optional r6 = r0.v
            dj0.d r5 = r0.u
            yhm.o.b(r8)
            goto L43
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r8)
            r0.u = r5
            r0.v = r6
            r0.f156580y = r3
            java.lang.Object r8 = r4.e(r7, r0)
            if (r8 != r1) goto L43
            return r1
        L43:
            dj0.d r8 = (dj0.d) r8
            java.lang.Object r6 = le.u1.l(r6)
            yte.k r6 = (yte.k) r6
            r7 = 0
            if (r6 == 0) goto L91
            yte.j r6 = r6.f316717a
            dj0.d r0 = dj0.d.e
            boolean r0 = r8.f(r0)
            if (r0 == 0) goto L62
            dj0.d r7 = new dj0.d
            r0 = 0
            xi0.b r8 = r8.f115083b
            r7.<init>(r0, r8)
            goto L86
        L62:
            java.util.List r8 = r6.f316715a
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L6a:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r8.next()
            r1 = r0
            dj0.d r1 = (dj0.d) r1
            dj0.d r2 = dj0.d.e
            boolean r1 = r1.f(r2)
            if (r1 == 0) goto L6a
            r7 = r0
        L80:
            dj0.d r7 = (dj0.d) r7
            if (r7 != 0) goto L86
            dj0.d r7 = r6.f316716b
        L86:
            jxe.b r8 = new jxe.b
            if (r5 != 0) goto L8b
            r5 = r7
        L8b:
            java.util.List r6 = r6.f316715a
            r8.<init>(r5, r6)
            return r8
        L91:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.z.c(dj0.d, java.util.Optional, java.lang.String, gim.c):java.lang.Object");
    }

    public jl0 d(float f, int i, int i2) {
        return htk.l.a(i, i2, "suggestions_widget_item_analysts_recommend", zhm.u.c(ytk.c.b((ytk.c) this.f136369b, new BigDecimal(String.valueOf(rim.d.b(((double) f) * ((double) 100)) / 100.0f)), null, null, 6)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hxe.g
            if (r0 == 0) goto L13
            r0 = r6
            hxe.g r0 = (hxe.g) r0
            int r1 = r0.f156581w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f156581w = r1
            goto L18
        L13:
            hxe.g r0 = new hxe.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f156581w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L57
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r4.f136369b
            te8.d0 r6 = (te8.d0) r6
            efm.r r5 = r6.a(r5)
            efm.d0 r5 = r5.firstOrError()
            java.lang.String r6 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            dj0.c r6 = dj0.d.Companion
            r6.getClass()
            dj0.d r6 = dj0.d.e
            pfm.z r5 = ue0.e.F(r5, r6)
            r0.f156581w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.z.e(java.lang.String, gim.c):java.lang.Object");
    }

    @Override // g5b.d
    public CellDetailsActionDelegate f() {
        return (CellDetailsActionDelegate) this.f136369b;
    }

    public c12.x g(hrf.f transferDirection) {
        Intrinsics.checkNotNullParameter(transferDirection, "transferDirection");
        return new c12.x(new ApmRecipientListInputData(ApmBlik.f61809c, transferDirection, new TextLocalisedClause(R$string.apm_select_contact_search_placeholder, null, null, 14)), (c12.z) this.f136369b);
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        OnfidoFetcher onfidoFetcher = (OnfidoFetcher) ((il.g) this.f136369b).get();
        il.l.Companion.getClass();
        Intrinsics.checkNotNullParameter(onfidoFetcher, "onfidoFetcher");
        WorkflowApi workflowApi = (WorkflowApi) onfidoFetcher.a(WorkflowApi.class);
        n14.e.g(workflowApi);
        return workflowApi;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public vye.b h(com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData r18) {
        /*
            r17 = this;
            r0 = r17
            r6 = r18
            java.lang.Object r1 = r0.f136369b
            n3i.b r1 = (n3i.b) r1
            java.lang.String r2 = "cardData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            t61.j r2 = r6.f90486c
            com.revolut.feature.topup_screen.common.CardDetails r3 = r6.f90484a
            java.lang.String r3 = r3.f90566a
            r4 = 4
            java.lang.String r3 = kotlin.text.f0.V0(r4, r3)
            java.lang.String r4 = r2.f268159b
            r5 = 0
            if (r4 == 0) goto L35
            boolean r7 = kotlin.text.d0.W(r4)
            if (r7 != 0) goto L25
            r9 = r4
            goto L26
        L25:
            r9 = r5
        L26:
            if (r9 == 0) goto L35
            com.revolut.core.ui_kit.models.TextClause r8 = new com.revolut.core.ui_kit.models.TextClause
            r14 = 0
            r15 = 126(0x7e, float:1.77E-43)
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            goto L3f
        L35:
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            r4 = 2132004855(0x7f13cff7, float:1.9647633E38)
            r7 = 14
            r8.<init>(r4, r5, r5, r7)
        L3f:
            com.revolut.core.ui_kit.models.TextClause r9 = new com.revolut.core.ui_kit.models.TextClause
            java.lang.String r4 = "*"
            java.lang.String r10 = r1.a(r2, r3, r4)
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r3 = r9
            java.lang.String r2 = r2.f268160c
            if (r2 == 0) goto L5c
            com.revolut.core.ui_kit_core.displayers.image.Image r1 = r1.c(r2)
        L5a:
            r4 = r1
            goto L63
        L5c:
            int r1 = com.revolut.core.ui_kit_resources.R$drawable.uikit_icn_24_card
            com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage r1 = sze.d.a(r1)
            goto L5a
        L63:
            r2 = r8
            com.revolut.core.ui_kit.models.Clause r2 = (com.revolut.core.ui_kit.models.Clause) r2
            vye.b r1 = new vye.b
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.z.h(com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData):vye.b");
    }

    @Override // cy8.a
    public Object i(String url2) {
        Intrinsics.checkNotNullParameter(url2, "url");
        List list = (List) this.f136369b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (kotlin.text.d0.J(url2, ((Redirect) it8.next()).f105640b, false)) {
                return url2;
            }
        }
        return null;
    }

    public Flow j() {
        ks0.n nVar = (ks0.n) this.f136369b;
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        ia7.n nVar2 = (ia7.n) ((ia7.e) nVar.f189085b);
        nVar2.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(t1.E(nim.a.v(nVar2.f159970j.b(Unit.f186387a, loadingStrategy), new ia7.f(nVar2, 0))));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String amount, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(amount, "formattedValue");
        ju4.q qVar = (ju4.q) ((CreditCardPseRepayScreen) this.f136369b).T.getValue();
        qVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        xi0.b bVar = qVar.I2().f178576c;
        qVar.J2(new dj0.d(qVar.f178594r.b(amount, bVar.f306286a), bVar));
    }

    public akg.n l(String juniorId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        gb8.b bVar = (gb8.b) this.f136369b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(bVar.e.b(Unit.f186387a, loadingStrategy), new jb8.a(juniorId, 0));
    }

    @Override // cy8.a
    public /* bridge */ /* synthetic */ av1.c m() {
        return tx8.j.f275353c;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[Catch: all -> 0x0028, TRY_ENTER, TryCatch #0 {all -> 0x0028, blocks: (B:11:0x0024, B:29:0x006d, B:26:0x005e), top: B:52:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof g7j.f
            if (r0 == 0) goto L13
            r0 = r15
            g7j.f r0 = (g7j.f) r0
            int r1 = r0.f141209w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f141209w = r1
            goto L18
        L13:
            g7j.f r0 = new g7j.f
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f141209w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r15)     // Catch: java.lang.Throwable -> L28
            goto L6d
        L28:
            r0 = move-exception
            r14 = r0
            goto L72
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L33:
            yhm.o.b(r15)
            java.lang.String r15 = "orderDraft"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r15)
            wd6.e r15 = r14.f99887c
            wd6.e r2 = wd6.e.BUY
            if (r15 == r2) goto L43
        L41:
            r5 = r4
            goto L5b
        L43:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails r15 = r14.f99886b
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails r14 = r14.f99885a
            java.lang.String r8 = r15.f
            if (r8 != 0) goto L4c
            goto L41
        L4c:
            vrc.a r5 = new vrc.a
            xi0.b r6 = r15.f99903a
            xi0.b r7 = r14.f99903a
            java.lang.String r9 = r14.f
            java.lang.Long r10 = r15.f99904b
            r11 = 0
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
        L5b:
            if (r5 != 0) goto L5e
            return r4
        L5e:
            yhm.m$a r14 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            java.lang.Object r14 = r13.f136369b     // Catch: java.lang.Throwable -> L28
            zrc.e r14 = (zrc.e) r14     // Catch: java.lang.Throwable -> L28
            r0.f141209w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r15 = r14.a(r5, r0)     // Catch: java.lang.Throwable -> L28
            if (r15 != r1) goto L6d
            return r1
        L6d:
            vrc.c r15 = (vrc.c) r15     // Catch: java.lang.Throwable -> L28
            yhm.m$a r14 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L78
        L72:
            yhm.m$a r15 = yhm.m.INSTANCE
            yhm.n r15 = yhm.o.a(r14)
        L78:
            java.lang.Throwable r14 = yhm.m.a(r15)
            if (r14 == 0) goto L87
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            rd0.d.a(r1, r4, r4, r14, r0)
        L87:
            boolean r14 = r15 instanceof yhm.n
            if (r14 != 0) goto La2
            vrc.c r15 = (vrc.c) r15
            boolean r14 = r15.f291571a
            if (r14 == 0) goto La1
            vrc.b r14 = r15.f291573c
            if (r14 == 0) goto L9e
            java.util.UUID r14 = r14.f291569a
            if (r14 == 0) goto L9e
            java.lang.String r14 = r14.toString()
            goto L9f
        L9e:
            r14 = r4
        L9f:
            r15 = r14
            goto La2
        La1:
            r15 = r4
        La2:
            boolean r14 = r15 instanceof yhm.n
            if (r14 == 0) goto La7
            goto La8
        La7:
            r4 = r15
        La8:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.z.n(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft, gim.c):java.lang.Object");
    }

    public z(j2i.c function) {
        this.f136368a = 21;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f136369b = function;
    }

    public /* synthetic */ z(Object obj2, int i) {
        this.f136368a = i;
        this.f136369b = obj2;
    }

    public z(TradingDatabase database) {
        this.f136368a = 14;
        Intrinsics.checkNotNullParameter(database, "database");
        this.f136369b = database;
    }

    public z(List redirects) {
        this.f136368a = 19;
        Intrinsics.checkNotNullParameter(redirects, "redirects");
        this.f136369b = redirects;
    }

    public z(mri.w revolutJobInteractor) {
        this.f136368a = 4;
        Intrinsics.checkNotNullParameter(revolutJobInteractor, "revolutJobInteractor");
        this.f136369b = revolutJobInteractor;
    }

    public z(is8.a juniorWalletRepository) {
        this.f136368a = 2;
        Intrinsics.checkNotNullParameter(juniorWalletRepository, "juniorWalletRepository");
        this.f136369b = juniorWalletRepository;
    }

    public z(ks0.n globeResourcesInteractor) {
        this.f136368a = 1;
        Intrinsics.checkNotNullParameter(globeResourcesInteractor, "globeResourcesInteractor");
        this.f136369b = globeResourcesInteractor;
    }

    public z(zrc.e tradingScaInteractor, g7j.a checkScaRequiredRequestBuilder) {
        this.f136368a = 6;
        Intrinsics.checkNotNullParameter(tradingScaInteractor, "tradingScaInteractor");
        Intrinsics.checkNotNullParameter(checkScaRequiredRequestBuilder, "checkScaRequiredRequestBuilder");
        this.f136369b = tradingScaInteractor;
    }

    public z(w2 shopsCampaignRepository) {
        this.f136368a = 23;
        Intrinsics.checkNotNullParameter(shopsCampaignRepository, "shopsCampaignRepository");
        this.f136369b = shopsCampaignRepository;
    }

    public z(htk.l itemMapper, ytk.c percentageClauseMapper) {
        this.f136368a = 12;
        Intrinsics.checkNotNullParameter(itemMapper, "itemMapper");
        Intrinsics.checkNotNullParameter(percentageClauseMapper, "percentageClauseMapper");
        this.f136369b = percentageClauseMapper;
    }

    public z(j5c.a revolutXPromoNavigationExtension) {
        this.f136368a = 18;
        Intrinsics.checkNotNullParameter(revolutXPromoNavigationExtension, "revolutXPromoNavigationExtension");
        this.f136369b = revolutXPromoNavigationExtension;
    }

    public z(q1 wealthDisclaimersMapper) {
        this.f136368a = 11;
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f136369b = wealthDisclaimersMapper;
    }

    public z(c6h.a repository, yk0.d schedulerProvider) {
        this.f136368a = 10;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        this.f136369b = repository;
    }

    public z(n3i.b externalCardsMapper, sze.d imageFactory) {
        this.f136368a = 20;
        Intrinsics.checkNotNullParameter(externalCardsMapper, "externalCardsMapper");
        Intrinsics.checkNotNullParameter(imageFactory, "imageFactory");
        this.f136369b = externalCardsMapper;
    }

    public z(c12.z apmRecipientListExtension) {
        this.f136368a = 9;
        Intrinsics.checkNotNullParameter(apmRecipientListExtension, "apmRecipientListExtension");
        this.f136369b = apmRecipientListExtension;
    }

    public z(te8.d0 juniorWalletBalanceProvider) {
        this.f136368a = 13;
        Intrinsics.checkNotNullParameter(juniorWalletBalanceProvider, "juniorWalletBalanceProvider");
        this.f136369b = juniorWalletBalanceProvider;
    }

    public z(ou5.b juniorPayeesTransferSettingsInteractor) {
        this.f136368a = 16;
        Intrinsics.checkNotNullParameter(juniorPayeesTransferSettingsInteractor, "juniorPayeesTransferSettingsInteractor");
        this.f136369b = juniorPayeesTransferSettingsInteractor;
    }

    public z(gb8.b juniorGraduationRepository) {
        this.f136368a = 22;
        Intrinsics.checkNotNullParameter(juniorGraduationRepository, "juniorGraduationRepository");
        this.f136369b = juniorGraduationRepository;
    }

    public z(gnk.c priceClauseMapper, egk.e pricingPlansUiInteractor) {
        this.f136368a = 8;
        Intrinsics.checkNotNullParameter(priceClauseMapper, "priceClauseMapper");
        Intrinsics.checkNotNullParameter(pricingPlansUiInteractor, "pricingPlansUiInteractor");
        this.f136369b = pricingPlansUiInteractor;
    }

    public z(fuk.p chartSectionMapper) {
        this.f136368a = 3;
        Intrinsics.checkNotNullParameter(chartSectionMapper, "chartSectionMapper");
        this.f136369b = chartSectionMapper;
    }

    public z(TradeRevPointsService service) {
        this.f136368a = 26;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f136369b = service;
    }

    public z(xo0.f bubbleAnimationController) {
        this.f136368a = 27;
        Intrinsics.checkNotNullParameter(bubbleAnimationController, "bubbleAnimationController");
        this.f136369b = bubbleAnimationController;
    }

    public z(r10.d availableToOnboardAccountsMapper) {
        this.f136368a = 7;
        Intrinsics.checkNotNullParameter(availableToOnboardAccountsMapper, "availableToOnboardAccountsMapper");
        this.f136369b = availableToOnboardAccountsMapper;
    }

    public z(CfdPositionsController cfdPositionsController) {
        this.f136368a = 5;
        this.f136369b = cfdPositionsController.P;
    }

    public z(qmc.b roboContextProvider) {
        this.f136368a = 0;
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        this.f136369b = roboContextProvider;
    }

    public z(ProjectionScreenContract$Input input) {
        this.f136368a = 24;
        Intrinsics.checkNotNullParameter(input, "input");
        this.f136369b = input;
    }
}
