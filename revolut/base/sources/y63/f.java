package y63;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.sa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.cards_core.R$string;
import com.revolut.feature.cards_core.api.CardsCoreApi$Toggles;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import h93.f0;
import h93.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class f {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p63.a f311124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l93.f f311125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v63.b f311126c;
    public final b d;
    public final g e;
    public final n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final vi9.i f311127g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gte.a f311128h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p f311129j;
    public final al4.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s f311130l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f311131m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f311132n;

    public f(p63.a cardsItemProvider, l93.f revolutCardsInteractor, v63.b orderStatusBarMapper, b activationMapper, g cardActionItemsMapper, n cardTransactionAndSubscriptionMapper, vi9.i payLaterCardNotificationsMapper, gte.a featureToggleInteractor, l subscriptionsMapper, p transactionsMapper, al4.b comboCardInteractor, s googlePayUnavailableBannerMapper) {
        Intrinsics.checkNotNullParameter(cardsItemProvider, "cardsItemProvider");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(orderStatusBarMapper, "orderStatusBarMapper");
        Intrinsics.checkNotNullParameter(activationMapper, "activationMapper");
        Intrinsics.checkNotNullParameter(cardActionItemsMapper, "cardActionItemsMapper");
        Intrinsics.checkNotNullParameter(cardTransactionAndSubscriptionMapper, "cardTransactionAndSubscriptionMapper");
        Intrinsics.checkNotNullParameter(payLaterCardNotificationsMapper, "payLaterCardNotificationsMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(subscriptionsMapper, "subscriptionsMapper");
        Intrinsics.checkNotNullParameter(transactionsMapper, "transactionsMapper");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        Intrinsics.checkNotNullParameter(googlePayUnavailableBannerMapper, "googlePayUnavailableBannerMapper");
        this.f311124a = cardsItemProvider;
        this.f311125b = revolutCardsInteractor;
        this.f311126c = orderStatusBarMapper;
        this.d = activationMapper;
        this.e = cardActionItemsMapper;
        this.f = cardTransactionAndSubscriptionMapper;
        this.f311127g = payLaterCardNotificationsMapper;
        this.f311128h = featureToggleInteractor;
        this.i = subscriptionsMapper;
        this.f311129j = transactionsMapper;
        this.k = comboCardInteractor;
        this.f311130l = googlePayUnavailableBannerMapper;
        final int i = 0;
        this.f311131m = te0.w.y0(new Function0(this) { // from class: y63.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f311122b;

            {
                this.f311122b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i) {
                    case 0:
                        zC = ((jte.d) this.f311122b.f311128h).c(CardsCoreApi$Toggles.VirtualCardReissue.f65574c);
                        break;
                    default:
                        zC = ((jte.d) this.f311122b.f311128h).c(CardsCoreApi$Toggles.PhysicalCardReissue.f65567c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
        final int i2 = 1;
        this.f311132n = te0.w.y0(new Function0(this) { // from class: y63.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ f f311122b;

            {
                this.f311122b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                boolean zC;
                switch (i2) {
                    case 0:
                        zC = ((jte.d) this.f311122b.f311128h).c(CardsCoreApi$Toggles.VirtualCardReissue.f65574c);
                        break;
                    default:
                        zC = ((jte.d) this.f311122b.f311128h).c(CardsCoreApi$Toggles.PhysicalCardReissue.f65567c);
                        break;
                }
                return Boolean.valueOf(zC);
            }
        });
    }

    public static void a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (obj2 instanceof sa) {
                arrayList2.add(obj2);
            }
        }
        Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            yp0.b.l((sa) it8.next(), 0, 0, 0, 0, null, false, 63);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (obj3 instanceof CellDetailsNoteDelegate.Model) {
                arrayList3.add(obj3);
            }
        }
        Iterator it9 = arrayList3.iterator();
        while (it9.hasNext()) {
            yp0.b.l((CellDetailsNoteDelegate.Model) it9.next(), 0, 0, 0, 0, null, false, 63);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj4 : arrayList) {
            if (obj4 instanceof RowDelegate.Model) {
                arrayList4.add(obj4);
            }
        }
        yp0.b.k(arrayList4, 0, 0, 0, 0, 31);
    }

    public static Clause b(f0 f0Var, List list, Map map) {
        Object next;
        String str;
        String str2 = f0Var.f150111b;
        if (str2 != null) {
            return new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (!f0Var.b0() && !f0Var.d0()) {
            return null;
        }
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((psg.a) next).f239484a, f0Var.u)) {
                break;
            }
        }
        psg.a aVar = (psg.a) next;
        JuniorBankingProfile juniorBankingProfile = (aVar == null || (str = aVar.f239485b) == null) ? null : (JuniorBankingProfile) map.get(str);
        if (juniorBankingProfile != null) {
            return new CompositeClause(zhm.v.k(new TextClause(juniorBankingProfile.f77099b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v04.b.J(f0Var, str2, null, null, 14)), new DotDividerClause((Integer) null), null, null, 12);
        }
        return null;
    }

    public static String d(List list, String str, Map map) {
        Object next;
        String str2;
        JuniorBankingProfile juniorBankingProfile;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((psg.a) next).f239484a, str)) {
                break;
            }
        }
        psg.a aVar = (psg.a) next;
        if (aVar == null || (str2 = aVar.f239485b) == null || (juniorBankingProfile = (JuniorBankingProfile) map.get(str2)) == null) {
            return null;
        }
        return juniorBankingProfile.f77099b;
    }

    public final Clause c(f0 f0Var, do3.n nVar, boolean z) {
        TextLocalisedClause textLocalisedClause;
        if (f0Var.C()) {
            textLocalisedClause = new TextLocalisedClause(R$string.card_name_subtitle_credit, null, null, 14);
        } else if (f0Var.T) {
            textLocalisedClause = (((jte.d) this.f311128h).c(CardsCoreApi$Toggles.LocalComboCardsImprovements.f65565c) && !z) ? new TextLocalisedClause(R$string.card_name_subtitle_local_debit, null, null, 14) : new TextLocalisedClause(R$string.card_name_subtitle_combo, null, null, 14);
        } else {
            textLocalisedClause = f0Var.U ? new TextLocalisedClause(R$string.card_name_subtitle_global, null, null, 14) : f0Var.W ? new TextLocalisedClause(R$string.card_name_subtitle_mcy, null, null, 14) : null;
        }
        if (textLocalisedClause != null) {
            return textLocalisedClause;
        }
        if (nVar != null) {
            wi0.b.Companion.getClass();
            if (te0.w.S(nVar, wi0.b.M0)) {
                TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.card_name_subtitle_debit, null, null, 14);
                TextLocalisedClause textLocalisedClause3 = f0Var.M() ? new TextLocalisedClause(R$string.card_name_subtitle_pro, null, null, 14) : f0Var.P() ? new TextLocalisedClause(R$string.card_name_subtitle_joint, null, null, 14) : f0Var.b0() ? new TextLocalisedClause(R$string.card_name_subtitle_youth, null, null, 14) : f0Var.H == j0.FAMILY ? new TextLocalisedClause(R$string.card_name_subtitle_family, null, null, 14) : null;
                return textLocalisedClause3 != null ? new CompositeClause(zhm.v.k(textLocalisedClause3, textLocalisedClause2), new DotDividerClause((Integer) null), null, null, 12) : textLocalisedClause2;
            }
        }
        if (f0Var.M()) {
            return new TextLocalisedClause(R$string.card_name_subtitle_pro, null, null, 14);
        }
        if (f0Var.P()) {
            return new TextLocalisedClause(R$string.card_name_subtitle_joint, null, null, 14);
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean e() {
        return ((Boolean) this.f311132n.getValue()).booleanValue();
    }

    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v19, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.lang.Object, kotlin.Lazy] */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v93 ip0.m00, still in use, count: 2, list:
          (r4v93 ip0.m00) from 0x068b: MOVE (r26v7 ip0.m00) = (r4v93 ip0.m00)
          (r4v93 ip0.m00) from 0x0680: MOVE (r26v9 ip0.m00) = (r4v93 ip0.m00)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public final java.util.List f(q63.g r64, h93.f0 r65, yt8.i r66, zh9.y0 r67, s63.f r68, com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent r69, java.util.List r70, java.lang.String r71, java.util.List r72, java.util.Map r73, java.util.List r74, java.util.Map r75, boolean r76, boolean r77, boolean r78, boolean r79, boolean r80, boolean r81, do3.n r82, boolean r83, y63.v r84) {
        /*
            Method dump skipped, instruction units count: 3744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: y63.f.f(q63.g, h93.f0, yt8.i, zh9.y0, s63.f, com.revolut.feature.card_screen.common.cards.models.CardsStateSnapshot$SubscriptionsContent, java.util.List, java.lang.String, java.util.List, java.util.Map, java.util.List, java.util.Map, boolean, boolean, boolean, boolean, boolean, boolean, do3.n, boolean, y63.v):java.util.List");
    }
}
