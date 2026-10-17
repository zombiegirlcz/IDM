package f23;

import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_order_new.api.CardOrderFeatureApi$Toggles;
import com.revolut.feature.card_order_new.api.navigation.CardSubtypePickerDestination;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.checkout.models.CheckoutOrder;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.j;
import nii.y0;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class m extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final sh3.a f131393l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ffk.t f131394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f73.b f131395n;
    public final l93.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final gte.a f131396p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qh3.c f131397q;

    public m(sh3.a checkoutInteractor, ffk.t pricingPlanInteractor, f73.b revolutCardNavigationCommandFactory, l93.f revolutCardsInteractor, gte.a featureToggleInteractor, qh3.c processCheckoutExtension) {
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(revolutCardNavigationCommandFactory, "revolutCardNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(processCheckoutExtension, "processCheckoutExtension");
        this.f131393l = checkoutInteractor;
        this.f131394m = pricingPlanInteractor;
        this.f131395n = revolutCardNavigationCommandFactory;
        this.o = revolutCardsInteractor;
        this.f131396p = featureToggleInteractor;
        this.f131397q = processCheckoutExtension;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0077, code lost:
    
        if (r7.e3(r9, r3, r4, null, r6) == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(f23.m r7, com.revolut.feature.checkout.models.CheckoutOrder r8, f23.b r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof f23.g
            if (r0 == 0) goto L14
            r0 = r10
            f23.g r0 = (f23.g) r0
            int r1 = r0.f131366y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f131366y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            f23.g r0 = new f23.g
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f131364w
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f131366y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r10)
            goto L7a
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            f23.b r9 = r6.v
            com.revolut.feature.checkout.models.CheckoutOrder r8 = r6.u
            yhm.o.b(r10)
        L3b:
            r4 = r9
            goto L57
        L3d:
            yhm.o.b(r10)
            sh3.a r10 = r7.f131393l
            com.revolut.core.model.account.AccountId r1 = r9.f131350a
            ei3.m r10 = (ei3.m) r10
            pfm.h r10 = r10.h(r8, r1)
            r6.u = r8
            r6.v = r9
            r6.f131366y = r3
            java.lang.Object r10 = nim.a.a(r10, r6)
            if (r10 != r0) goto L3b
            goto L79
        L57:
            pi3.d r8 = r8.d
            if (r8 != 0) goto L5e
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L5e:
            boolean r9 = r8.i
            if (r9 == 0) goto L65
            e13.a r9 = e13.a.VIRTUAL
            goto L67
        L65:
            e13.a r9 = e13.a.PHYSICAL
        L67:
            h93.l0 r3 = r8.f236396n
            r8 = 0
            r6.u = r8
            r6.v = r8
            r6.f131366y = r2
            r5 = 0
            r1 = r7
            r2 = r9
            java.lang.Object r7 = r1.e3(r2, r3, r4, r5, r6)
            if (r7 != r0) goto L7a
        L79:
            return r0
        L7a:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.m.Z2(f23.m, com.revolut.feature.checkout.models.CheckoutOrder, f23.b, gim.c):java.lang.Object");
    }

    public final String b3(String str) {
        if (((jte.d) this.f131396p).c(CardOrderFeatureApi$Toggles.DecommissionDesignsForPlanId.f64946c)) {
            return null;
        }
        return str;
    }

    public final void c3(b93.e eVar, h93.l0 l0Var, pi3.h hVar, String str, AccountId accountId, AnalyticsProduct analyticsProduct) {
        A2(u0.c(new CardDesignFeatureConfig(eVar, accountId, null, null, null, false, str, false, false, null, xfa.b.ONBOARDING_CARD_SELECTION, hVar, null, null, null, analyticsProduct, null, null, l0Var, null, null, false, false, null, 527937402)));
    }

    public final void d3(e13.a aVar, b bVar, a aVar2) {
        String str;
        pi3.h hVar;
        zn3.a aVar3 = bVar.e;
        AccountId accountId = bVar.f131350a;
        NaviCommand naviCommand = bVar.f131351b;
        if (aVar2 == null || (str = aVar2.f131349b) == null) {
            str = bVar.d;
        }
        String strB3 = b3(str);
        if (aVar2 == null || (hVar = aVar2.f131348a) == null) {
            hVar = bVar.f131352c;
        }
        A2(new CardSubtypePickerDestination(aVar, aVar3, accountId, naviCommand, strB3, hVar, bVar.f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x00dd, code lost:
    
        if (r14.f131397q.Z2(r4, r1, r0, r8) == r9) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(e13.a r15, h93.l0 r16, f23.b r17, f23.a r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.m.e3(e13.a, h93.l0, f23.b, f23.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0063, code lost:
    
        if (e3(r8, r9, r10, null, r6) == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00a5, code lost:
    
        if (r1.e3(r8, r3, r4, r9, r6) == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(e13.a r8, h93.l0 r9, f23.b r10, gim.c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof f23.i
            if (r0 == 0) goto L14
            r0 = r11
            f23.i r0 = (f23.i) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            f23.i r0 = new f23.i
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f131374x
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.z
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L46
            if (r1 == r3) goto L39
            if (r1 != r2) goto L31
            yhm.o.b(r11)
            goto La8
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            f23.b r10 = r6.f131373w
            h93.l0 r9 = r6.v
            e13.a r8 = r6.u
            yhm.o.b(r11)
            r1 = r7
        L43:
            r3 = r9
            r4 = r10
            goto L7f
        L46:
            yhm.o.b(r11)
            r1 = r7
            goto L66
        L4b:
            yhm.o.b(r11)
            e13.a r11 = e13.a.DISPOSABLE
            if (r8 != r11) goto L69
            r6.u = r5
            r6.v = r5
            r6.f131373w = r5
            r6.z = r4
            r5 = 0
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            java.lang.Object r8 = r1.e3(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L66
            goto La7
        L66:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L69:
            r1 = r7
            e13.a r11 = e13.a.PHYSICAL
            if (r8 != r11) goto L6f
            goto L70
        L6f:
            r4 = 0
        L70:
            r6.u = r8
            r6.v = r9
            r6.f131373w = r10
            r6.z = r3
            java.lang.Object r11 = r7.i3(r10, r4, r6)
            if (r11 != r0) goto L43
            goto La7
        L7f:
            f23.e r11 = (f23.e) r11
            boolean r9 = r11 instanceof f23.d
            if (r9 == 0) goto L8f
            f23.d r11 = (f23.d) r11
            com.revolut.feature.checkout.models.CheckoutOrder r8 = r11.f131357a
            r7.j3(r8, r4)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L8f:
            boolean r9 = r11 instanceof f23.c
            if (r9 == 0) goto Lab
            f23.c r11 = (f23.c) r11
            f23.a r9 = r11.f131353a
            r6.u = r5
            r6.v = r5
            r6.f131373w = r5
            r6.z = r2
            r2 = r8
            r5 = r9
            java.lang.Object r8 = r1.e3(r2, r3, r4, r5, r6)
            if (r8 != r0) goto La8
        La7:
            return r0
        La8:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        Lab:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.m.f3(e13.a, h93.l0, f23.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(e13.a r5, f23.b r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof f23.j
            if (r0 == 0) goto L13
            r0 = r7
            f23.j r0 = (f23.j) r0
            int r1 = r0.f131379y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131379y = r1
            goto L18
        L13:
            f23.j r0 = new f23.j
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.f131377w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f131379y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            f23.b r6 = r0.v
            e13.a r5 = r0.u
            yhm.o.b(r7)
            goto L55
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r7)
            e13.a r7 = e13.a.DISPOSABLE
            if (r5 != r7) goto L41
            r7 = 0
            r4.d3(r5, r6, r7)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L41:
            e13.a r7 = e13.a.PHYSICAL
            if (r5 != r7) goto L47
            r7 = r3
            goto L48
        L47:
            r7 = 0
        L48:
            r0.u = r5
            r0.v = r6
            r0.f131379y = r3
            java.lang.Object r7 = r4.i3(r6, r7, r0)
            if (r7 != r1) goto L55
            return r1
        L55:
            f23.e r7 = (f23.e) r7
            boolean r0 = r7 instanceof f23.d
            if (r0 == 0) goto L63
            f23.d r7 = (f23.d) r7
            com.revolut.feature.checkout.models.CheckoutOrder r5 = r7.f131357a
            r4.j3(r5, r6)
            goto L6e
        L63:
            boolean r0 = r7 instanceof f23.c
            if (r0 == 0) goto L71
            f23.c r7 = (f23.c) r7
            f23.a r7 = r7.f131353a
            r4.d3(r5, r6, r7)
        L6e:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L71:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.m.g3(e13.a, f23.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a5 A[EDGE_INSN: B:42:0x00a5->B:37:0x00a5 BREAK  A[LOOP:0: B:28:0x0087->B:45:0x0087], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(com.revolut.core.model.account.AccountId r12, h93.l0 r13, f23.b r14, gim.c r15) {
        /*
            r11 = this;
            r1 = r15
            boolean r2 = r1 instanceof f23.k
            if (r2 == 0) goto L14
            r2 = r1
            f23.k r2 = (f23.k) r2
            int r3 = r2.f131383y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L14
            int r3 = r3 - r4
            r2.f131383y = r3
            goto L19
        L14:
            f23.k r2 = new f23.k
            r2.<init>(r11, r15)
        L19:
            java.lang.Object r1 = r2.f131381w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f131383y
            java.lang.String r5 = "await(...)"
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L40
            if (r4 == r7) goto L3a
            if (r4 != r6) goto L32
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = r2.v
            h93.l0 r2 = r2.u
            yhm.o.b(r1)
            goto L7e
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            h93.l0 r0 = r2.u
            yhm.o.b(r1)
            goto L5a
        L40:
            yhm.o.b(r1)
            xfa.b r1 = xfa.b.CARDS_TAB_FULL_SCREEN
            r4 = r14
            com.revolut.retail.core.navigation.NaviCommand r4 = r4.f131351b
            f73.b r9 = r11.f131395n
            ufm.b r1 = r9.f(r1, r12, r4, r13)
            r2.u = r13
            r2.f131383y = r7
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L59
            goto L79
        L59:
            r0 = r13
        L5a:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            com.revolut.retail.core.navigation.NaviCommand r1 = (com.revolut.retail.core.navigation.NaviCommand) r1
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = zh9.u0.b(r1)
            if (r0 != 0) goto L66
            return r1
        L66:
            l93.f r4 = r11.o
            r7 = 3
            ufm.b r4 = l93.f.j(r4, r8, r7)
            r2.u = r0
            r2.v = r1
            r2.f131383y = r6
            java.lang.Object r2 = nim.a.b(r4, r2)
            if (r2 != r3) goto L7a
        L79:
            return r3
        L7a:
            r10 = r2
            r2 = r0
            r0 = r1
            r1 = r10
        L7e:
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r5)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
        L87:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto La5
            java.lang.Object r3 = r1.next()
            r4 = r3
            h93.f0 r4 = (h93.f0) r4
            boolean r5 = r4.X()
            if (r5 != 0) goto La0
            boolean r5 = r4.V()
            if (r5 == 0) goto L87
        La0:
            h93.l0 r4 = r4.G
            if (r4 != r2) goto L87
            r8 = r3
        La5:
            h93.f0 r8 = (h93.f0) r8
            if (r8 == 0) goto Lc1
            com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig r1 = new com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig
            com.revolut.feature.card_screen.api.models.CardScreenAction$Select r6 = new com.revolut.feature.card_screen.api.models.CardScreenAction$Select
            java.lang.String r0 = r8.f150110a
            r2 = 6
            r3 = 0
            r6.<init>(r0, r2, r3, r3)
            r7 = 15
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = zh9.u0.c(r1)
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.m.h3(com.revolut.core.model.account.AccountId, h93.l0, f23.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i3(f23.b r13, boolean r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f23.m.i3(f23.b, boolean, gim.c):java.lang.Object");
    }

    public final void j3(CheckoutOrder checkoutOrder, b bVar) {
        yji.n.l2(this, L2(new y0(null, new nii.g0(new TextLocalisedClause(R$string.card_screen_unprocessed_card_order_item_title, null, null, 14), new TextLocalisedClause(R$string.card_screen_unprocessed_card_order_item_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.card_screen_unprocessed_card_order_item_positive, null, null, 14), new TextLocalisedClause(R$string.card_screen_unprocessed_card_order_item_negative, null, null, 14), null, null, j.b.f216170a, false, null, false, null, 12132), false, 5)), null, new dp4.p(this, checkoutOrder, bVar, (Continuation) null, 24), 3);
    }
}
