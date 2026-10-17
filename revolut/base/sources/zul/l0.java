package zul;

import android.content.Context;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import aw0.m6;
import aw0.n6;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.models.NavBarProductIntro$StoryV2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainerHeaderView;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.data.model.Data;
import com.revolut.feature.currency.accounts.impl.R$string;
import com.revolut.feature.payments.messaging.data.api.model.P2PChatItem;
import com.revolut.feature.payments.social.impl.presentation.p2p_kompot.screen.PeerToPeerChatScreen;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.feature.tab.accounts.api.model.AccountWidgetItemModel;
import com.revolut.feature.transport.impl.ui.help.main.TransportHelpMainScreen;
import com.revolut.recyclerkit.layoutmanager.UIKitLinearLayoutManager;
import hha.w0;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class l0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f325537a;

    public /* synthetic */ l0(int i) {
        this.f325537a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object it8) {
        int i = this.f325537a;
        AccountWidgetItemModel.EmptyStateStories.NotApplicable notApplicable = AccountWidgetItemModel.EmptyStateStories.NotApplicable.f89489a;
        NavBarProductIntro$StoryV2 navBarProductIntro$StoryV2 = null;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                return zhm.f0.f322471a;
            case 1:
                Intrinsics.checkNotNullParameter((Function0) it8, "<unused var>");
                return iii.c.c(5);
            case 2:
                RowDelegate.Model it9 = (RowDelegate.Model) it8;
                KProperty[] kPropertyArr = TransportHelpMainScreen.S;
                Intrinsics.checkNotNullParameter(it9, "it");
                Object obj2 = it9.u;
                if (obj2 instanceof zvf.a) {
                    return (zvf.a) obj2;
                }
                return null;
            case 3:
                String str = (String) it8;
                ReactionsKeyboardView.Companion companion = ReactionsKeyboardView.INSTANCE;
                return prk.o.m(str, "id", str, "MENU_ITEM_WITH_SEARCH_ID");
            case 4:
                ReactionsKeyboardView.Companion companion2 = ReactionsKeyboardView.INSTANCE;
                return h30.l.q("it", (od0.i) it8);
            case 5:
                ReactionsKeyboardView.Companion companion3 = ReactionsKeyboardView.INSTANCE;
                return (String) ((od0.i) it8).f224257a;
            case 6:
                ReactionsKeyboardView.Companion companion4 = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter((Throwable) it8, "it");
                return zhm.f0.f322471a;
            case 7:
                ReactionsKeyboardView.Companion companion5 = ReactionsKeyboardView.INSTANCE;
                Intrinsics.checkNotNullParameter((Throwable) it8, "it");
                return zhm.f0.f322471a;
            case 8:
                SQLiteStatement sQLiteStatementPrepare = ((SQLiteConnection) it8).prepare("DELETE FROM multibanco_contacts");
                try {
                    sQLiteStatementPrepare.step();
                    return null;
                } finally {
                    sQLiteStatementPrepare.close();
                }
            case 9:
                Function0 getDefaultLoadingItems = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 10:
                List it10 = (List) it8;
                Intrinsics.checkNotNullParameter(it10, "it");
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : it10) {
                    if (((by7.h) obj3).f19776b) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
                Iterator it11 = arrayList.iterator();
                while (it11.hasNext()) {
                    arrayList2.add(((by7.h) it11.next()).f19775a);
                }
                return arrayList2;
            case 11:
                Data it12 = (Data) it8;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.valueOf(it12.getLoading());
            case 12:
                Function0 getDefaultLoadingItems2 = (Function0) it8;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems2.invoke();
            case 13:
                od0.i planEmptyStates = (od0.i) it8;
                Intrinsics.checkNotNullParameter(planEmptyStates, "planEmptyStates");
                AccountWidgetItemModel.EmptyStateStories emptyStateStories = (AccountWidgetItemModel.EmptyStateStories) planEmptyStates.f224257a;
                return emptyStateStories == null ? notApplicable : emptyStateStories;
            case 14:
                List it13 = (List) it8;
                Intrinsics.checkNotNullParameter(it13, "it");
                return !it13.isEmpty() ? new AccountWidgetItemModel.EmptyStateStories.V2(it13, null) : notApplicable;
            case 15:
                PricingPlanSubscription planSubscription = (PricingPlanSubscription) it8;
                Intrinsics.checkNotNullParameter(planSubscription, "planSubscription");
                return new Pair(hha.s.f(planSubscription.f81129a), planSubscription.e);
            case 16:
                od0.i planTier = (od0.i) it8;
                Intrinsics.checkNotNullParameter(planTier, "planTier");
                w0 pricingPlanTier = (w0) planTier.f224257a;
                od0.i iVar = od0.i.f224256b;
                if (pricingPlanTier != null) {
                    Intrinsics.checkNotNullParameter(pricingPlanTier, "tier");
                    switch (zy5.h.f326381b[pricingPlanTier.ordinal()]) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            Intrinsics.checkNotNullParameter(pricingPlanTier, "pricingPlanTier");
                            TextLocalisedClause textLocalisedClauseE = dok.g.e(pricingPlanTier, null);
                            if (textLocalisedClauseE != null) {
                                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.home_product_intro_manage_your_plan_benefits_title, zhm.u.c(textLocalisedClauseE), null, 12);
                                NavBarWithContainerHeaderView.INSTANCE.getClass();
                                navBarProductIntro$StoryV2 = new NavBarProductIntro$StoryV2(textLocalisedClause, null, new NavBarProductIntro$StoryV2.HighlightedItems.ViewFinderTarget(NavBarWithContainerHeaderView.f59372r0));
                                break;
                            }
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            if (navBarProductIntro$StoryV2 != null) {
                                ola.c cVarA = zy5.f.a((w0) planTier.c());
                                if (cVarA == null) {
                                    od0.i.Companion.getClass();
                                    return iVar;
                                }
                                od0.h hVar = od0.i.Companion;
                                AccountWidgetItemModel.EmptyStateStories.V2 v2 = new AccountWidgetItemModel.EmptyStateStories.V2(zhm.u.c(navBarProductIntro$StoryV2), cVarA);
                                hVar.getClass();
                                return od0.h.a(v2);
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
                od0.i.Companion.getClass();
                return iVar;
            case 17:
                Intrinsics.checkNotNullParameter((Function0) it8, "it");
                ArrayList arrayList3 = new ArrayList(2);
                for (int i2 = 0; i2 < 2; i2++) {
                    arrayList3.add(nb0.a(pb0.Companion, String.valueOf(i2), false, 6));
                }
                yp0.b.k(arrayList3, 0, 0, 0, 0, 31);
                lw0.h hVar2 = new lw0.h(lw0.i.TITLE_SUBTITLE);
                n6.Companion.getClass();
                return new cii.b(new aw0.e(false, null, null, m6.a(), null, null, 55), arrayList3, hVar2);
            case 18:
                hyc.f it14 = (hyc.f) it8;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f156783a;
            case 19:
                List transactionsWithState = (List) it8;
                Intrinsics.checkNotNullParameter(transactionsWithState, "transactionsWithState");
                List list = transactionsWithState;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                Iterator it15 = list.iterator();
                while (it15.hasNext()) {
                    arrayList4.add((hyc.c) ((Pair) it15.next()).f186386b);
                }
                return (arrayList4.contains(null) || arrayList4.contains(hyc.c.UPDATE_REQUESTED)) ? zyc.p.UNKNOWN : arrayList4.contains(hyc.c.UPDATE_REQUIRED) ? zyc.p.ACTION_REQUIRED : arrayList4.contains(hyc.c.UNDER_REVIEW) ? zyc.p.IN_REVIEW : arrayList4.contains(hyc.c.UPLOADED) ? zyc.p.SUBMITTED : zyc.p.VERIFIED;
            case 20:
                Function0 defaultLoadingItems = (Function0) it8;
                Intrinsics.checkNotNullParameter(defaultLoadingItems, "defaultLoadingItems");
                return (List) defaultLoadingItems.invoke();
            case 21:
                KProperty[] kPropertyArr2 = PeerToPeerChatScreen.l0;
                Object obj4 = ((ChatBubbleDelegate.ButtonModel) it8).d;
                if (obj4 instanceof cu9.b) {
                    return (cu9.b) obj4;
                }
                return null;
            case 22:
                Context it16 = (Context) it8;
                KProperty[] kPropertyArr3 = PeerToPeerChatScreen.l0;
                Intrinsics.checkNotNullParameter(it16, "it");
                UIKitLinearLayoutManager uIKitLinearLayoutManager = new UIKitLinearLayoutManager(it16);
                uIKitLinearLayoutManager.f98539c = true;
                uIKitLinearLayoutManager.setReverseLayout(true);
                return uIKitLinearLayoutManager;
            case 23:
                KProperty[] kPropertyArr4 = PeerToPeerChatScreen.l0;
                Object f52083j = ((qv0.p) it8).getF52083j();
                if (f52083j instanceof P2PChatItem) {
                    return (P2PChatItem) f52083j;
                }
                return null;
            case 24:
                zx0.i it17 = (zx0.i) it8;
                KProperty[] kPropertyArr5 = PeerToPeerChatScreen.l0;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj5 = it17.f326000g;
                if (obj5 instanceof h9i.c) {
                    return (h9i.c) obj5;
                }
                return null;
            case 25:
                KProperty[] kPropertyArr6 = PeerToPeerChatScreen.l0;
                Object f52083j2 = ((qv0.p) it8).getF52083j();
                if (f52083j2 instanceof P2PChatItem) {
                    return (P2PChatItem) f52083j2;
                }
                return null;
            case 26:
                KProperty[] kPropertyArr7 = PeerToPeerChatScreen.l0;
                Object f52083j3 = ((qv0.p) it8).getF52083j();
                if (f52083j3 instanceof P2PChatItem) {
                    return (P2PChatItem) f52083j3;
                }
                return null;
            case 27:
                KProperty[] kPropertyArr8 = PeerToPeerChatScreen.l0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(((qv0.p) it8).getF52083j() instanceof P2PChatItem);
            case 28:
                KProperty[] kPropertyArr9 = PeerToPeerChatScreen.l0;
                Intrinsics.checkNotNullParameter(it8, "it");
                Object f52083j4 = ((qv0.p) it8).getF52083j();
                Intrinsics.i(f52083j4, "null cannot be cast to non-null type com.revolut.feature.payments.messaging.data.api.model.P2PChatItem");
                return new zz9.v(((koi.j) it8).getF52079b(), (P2PChatItem) f52083j4);
            default:
                zz9.q it18 = (zz9.q) it8;
                Intrinsics.checkNotNullParameter(it18, "it");
                return new Pair(it18.f326625a, it18.f326627c);
        }
    }
}
