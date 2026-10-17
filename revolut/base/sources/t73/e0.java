package t73;

import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.CardsCarouselScreen;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import ip0.l00;
import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CardsCarouselScreen f268455w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(CardsCarouselScreen cardsCarouselScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f268455w = cardsCarouselScreen;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0571, code lost:
    
        if (r5.equals("junior_identity_check") == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0870, code lost:
    
        if (r5.equals("junior_identity_verification_pending") == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0874, code lost:
    
        r1 = kotlin.Unit.f186387a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0a94, code lost:
    
        if (r5.equals("DATA_MANAGEMENT_CONSENT_LIST_ID") == false) goto L139;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x0b8d  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0bde  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0be0  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0c11 A[PHI: r3 r4 r10 r12
      0x0c11: PHI (r3v146 kotlin.coroutines.Continuation) = 
      (r3v3 kotlin.coroutines.Continuation)
      (r3v4 kotlin.coroutines.Continuation)
      (r3v155 kotlin.coroutines.Continuation)
      (r3v6 kotlin.coroutines.Continuation)
      (r3v157 kotlin.coroutines.Continuation)
      (r3v163 kotlin.coroutines.Continuation)
      (r3v91 kotlin.coroutines.Continuation)
      (r3v106 kotlin.coroutines.Continuation)
      (r3v121 kotlin.coroutines.Continuation)
      (r3v147 kotlin.coroutines.Continuation)
     binds: [B:357:0x0c0f, B:353:0x0bf6, B:345:0x0bcd, B:341:0x0ba4, B:333:0x0b79, B:139:0x0458, B:100:0x0331, B:66:0x0231, B:49:0x01c5, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0c11: PHI (r4v66 int) = 
      (r4v2 int)
      (r4v3 int)
      (r4v4 int)
      (r4v5 int)
      (r4v6 int)
      (r4v51 int)
      (r4v54 int)
      (r4v57 int)
      (r4v59 int)
      (r4v67 int)
     binds: [B:357:0x0c0f, B:353:0x0bf6, B:345:0x0bcd, B:341:0x0ba4, B:333:0x0b79, B:139:0x0458, B:100:0x0331, B:66:0x0231, B:49:0x01c5, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0c11: PHI (r10v38 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) = 
      (r10v1 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v2 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v3 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v4 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v5 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v20 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v25 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v30 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v33 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
      (r10v39 com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g)
     binds: [B:357:0x0c0f, B:353:0x0bf6, B:345:0x0bcd, B:341:0x0ba4, B:333:0x0b79, B:139:0x0458, B:100:0x0331, B:66:0x0231, B:49:0x01c5, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]
      0x0c11: PHI (r12v54 int) = 
      (r12v7 int)
      (r12v8 int)
      (r12v9 int)
      (r12v10 int)
      (r12v11 int)
      (r12v35 int)
      (r12v41 int)
      (r12v48 int)
      (r12v50 int)
      (r12v55 int)
     binds: [B:357:0x0c0f, B:353:0x0bf6, B:345:0x0bcd, B:341:0x0ba4, B:333:0x0b79, B:139:0x0458, B:100:0x0331, B:66:0x0231, B:49:0x01c5, B:9:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0c1a  */
    /* JADX WARN: Type inference failed for: r3v148, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v154 */
    /* JADX WARN: Type inference failed for: r3v161 */
    /* JADX WARN: Type inference failed for: r3v162 */
    /* JADX WARN: Type inference failed for: r3v95 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v61, types: [kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r9v65 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r57) {
        /*
            Method dump skipped, instruction units count: 3598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t73.e0.b(java.lang.Object):java.lang.Object");
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e0 e0Var = new e0(this.f268455w, continuation, 0);
                e0Var.v = obj2;
                return e0Var;
            case 1:
                e0 e0Var2 = new e0(this.f268455w, continuation, 1);
                e0Var2.v = obj2;
                return e0Var2;
            case 2:
                e0 e0Var3 = new e0(this.f268455w, continuation, 2);
                e0Var3.v = obj2;
                return e0Var3;
            case 3:
                e0 e0Var4 = new e0(this.f268455w, continuation, 3);
                e0Var4.v = obj2;
                return e0Var4;
            default:
                e0 e0Var5 = new e0(this.f268455w, continuation, 4);
                e0Var5.v = obj2;
                return e0Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e0) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e0) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e0) create((um0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e0) create((l00) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e0) create((com.revolut.core.ui_kit.delegates.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        h93.f0 f0Var;
        h93.f0 f0Var2;
        String str;
        h93.f0 f0Var3;
        h93.f0 f0Var4;
        h93.f0 f0Var5;
        int i = this.u;
        CardsCarouselScreen cardsCarouselScreen = this.f268455w;
        switch (i) {
            case 0:
                break;
            case 1:
                um0 model = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1 g1VarS3 = cardsCarouselScreen.R2();
                Intrinsics.h(model);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) g1VarS3;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                j60.a.v(gVar.f65440t, false, null, 3);
                break;
            case 2:
                um0 model2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1 g1VarS32 = cardsCarouselScreen.R2();
                Intrinsics.h(model2);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) g1VarS32;
                cli.y yVar = gVar2.f65434h0;
                Intrinsics.checkNotNullParameter(model2, "model");
                j60.a.v(gVar2.f65440t, false, null, 3);
                String str2 = model2.f166695a;
                int i2 = 26;
                if (Intrinsics.f(str2, "CANCEL_ORDER_BUTTONS_ACTION_ID")) {
                    h93.f0 f0Var6 = (h93.f0) ((q0) ((vkm.j2) yVar.f22677a).getValue()).d.f224257a;
                    if (f0Var6 != null) {
                        gVar2.l2(new r1(gVar2, f0Var6, str, 14), new yi5.b(i2));
                    }
                } else if (Intrinsics.f(str2, "DELETE_COMPROMISED_CARD_BUTTONS_ID") && (f0Var = (h93.f0) ((q0) ((vkm.j2) yVar.f22677a).getValue()).d.f224257a) != null) {
                    gVar2.l2(new r1(gVar2, f0Var, str, 2), new yi5.b(i2));
                }
                break;
            case 3:
                l00 actionClickData = (l00) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1 g1VarS33 = cardsCarouselScreen.R2();
                Intrinsics.h(actionClickData);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar3 = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) g1VarS33;
                gVar3.getClass();
                Intrinsics.checkNotNullParameter(actionClickData, "actionClickData");
                j60.a.v(gVar3.f65440t, false, null, 3);
                if (Intrinsics.f(actionClickData.f165098a.f165287a, "AFFECTED_SUBSCRIPTIONS_LIST_ID") && (f0Var2 = (h93.f0) ((q0) ((vkm.j2) gVar3.f65434h0.f22677a).getValue()).d.f224257a) != null && (str = f0Var2.f150110a) != null) {
                    gVar3.C1(new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.CardSubscriptionList(str, b9e.d.None)));
                }
                break;
            default:
                com.revolut.core.ui_kit.delegates.t model3 = (com.revolut.core.ui_kit.delegates.t) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g1 g1VarS34 = cardsCarouselScreen.R2();
                Intrinsics.h(model3);
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar4 = (com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g) g1VarS34;
                cli.y yVar2 = gVar4.f65434h0;
                Intrinsics.checkNotNullParameter(model3, "model");
                ActionWidgetDelegate.a aVar5 = model3.f54721a;
                ActionWidgetDelegate.Model model4 = model3.f54722b;
                int i3 = 6;
                if (Intrinsics.f(aVar5, ActionWidgetDelegate.a.c.f51609a)) {
                    String str3 = model4.f51590a;
                    h93.f0 f0Var7 = (h93.f0) ((q0) ((vkm.j2) yVar2.f22677a).getValue()).d.f224257a;
                    if (f0Var7 != null) {
                        String str4 = f0Var7.u;
                        String str5 = f0Var7.f150110a;
                        switch (str3.hashCode()) {
                            case -334869516:
                                if (str3.equals("REISSUE_EXPIRED_PHYSICAL_CARD_BANNER_ID")) {
                                    gVar4.C2(new a1(str5, b93.e.PHYSICAL, gVar4.Q2(f0Var7), f0Var7.b0() ? str4 : 0));
                                }
                                break;
                            case 658225054:
                                if (str3.equals("AUTO_REISSUE_PHYSICAL_CARD_BANNER_ID")) {
                                    gVar4.C2(new a1(str5, b93.e.PHYSICAL, gVar4.Q2(f0Var7), f0Var7.b0() ? str4 : null));
                                }
                                break;
                            case 924400785:
                                if (str3.equals("ACTIVATION_BY_CLICK_ID")) {
                                    gVar4.X2(f0Var7, null);
                                }
                                break;
                            case 1356075466:
                                if (str3.equals("AUTO_RENEWAL_VIRTUAL_CARD_BANNER_ID")) {
                                    gVar4.n2(new r1(gVar4, f0Var7, str, 7), new whi.b(6));
                                }
                                break;
                        }
                    }
                } else if (Intrinsics.f(aVar5, ActionWidgetDelegate.a.d.f51610a)) {
                    String str6 = model4.f51590a;
                    h93.f0 f0Var8 = (h93.f0) ((q0) ((vkm.j2) yVar2.f22677a).getValue()).d.f224257a;
                    if (f0Var8 != null) {
                        switch (str6.hashCode()) {
                            case -1955390452:
                                if (str6.equals("NEW_PHYSICAL_CARD_READY_BANNER_ID")) {
                                    gVar4.W2(f0Var8);
                                }
                                break;
                            case 82070086:
                                if (str6.equals("RENEWED_VIRTUAL_CARD_BANNER_ID")) {
                                    gVar4.n2(new r1(gVar4, f0Var8, str, 8), new whi.b(6));
                                }
                                break;
                            case 262156902:
                                if (str6.equals("REISSUED_PHYSICAL_CARD_BANNER_ID")) {
                                    gVar4.n2(new r1(gVar4, f0Var8, str, 9), new whi.b(6));
                                }
                                break;
                            case 924400785:
                                if (str6.equals("ACTIVATION_BY_CLICK_ID")) {
                                    gVar4.V2(f0Var8);
                                }
                                break;
                        }
                    }
                } else if (Intrinsics.f(aVar5, ActionWidgetDelegate.a.C0395a.f51607a)) {
                    String str7 = model4.f51590a;
                    int iHashCode = str7.hashCode();
                    if (iHashCode != 82070086) {
                        if (iHashCode != 262156902) {
                            if (iHashCode == 1356075466 && str7.equals("AUTO_RENEWAL_VIRTUAL_CARD_BANNER_ID") && (f0Var5 = (h93.f0) ((q0) ((vkm.j2) yVar2.f22677a).getValue()).d.f224257a) != null) {
                                gVar4.H2(yVar2, new avc.o(f0Var5, 10));
                                gVar4.n2(new r1(gVar4, f0Var5, str, 4), new whi.b(6));
                            }
                        } else if (str7.equals("REISSUED_PHYSICAL_CARD_BANNER_ID") && (f0Var4 = (h93.f0) ((q0) ((vkm.j2) yVar2.f22677a).getValue()).d.f224257a) != null) {
                            gVar4.H2(yVar2, new avc.o(f0Var4, 12));
                            gVar4.n2(new r1(gVar4, f0Var4, str, i3), new whi.b(6));
                        }
                    } else if (str7.equals("RENEWED_VIRTUAL_CARD_BANNER_ID") && (f0Var3 = (h93.f0) ((q0) ((vkm.j2) yVar2.f22677a).getValue()).d.f224257a) != null) {
                        gVar4.H2(yVar2, new avc.o(f0Var3, 11));
                        gVar4.n2(new r1(gVar4, f0Var3, str, 5), new whi.b(6));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
