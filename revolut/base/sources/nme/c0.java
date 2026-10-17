package nme;

import com.revolut.core.ui_kit.delegates.ReferralContactDelegate;
import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.backgroundpicker.api.model.PersistedBackground;
import com.revolut.feature.cashback.api.models.CashbackBySources;
import com.revolut.feature.cashback.api.models.CashbackSource;
import com.revolut.feature.contacts_chooser.impl.ui.ContactsChooserScreen;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import w19.g;
import xme.e;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f217290a;

    public /* synthetic */ c0(int i) {
        this.f217290a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        switch (this.f217290a) {
            case 0:
                v19.a it8 = (v19.a) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8 == v19.a.V3);
            case 1:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a it9 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f89925c;
            case 2:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a update = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a(update, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, zi0.c.P(g.b.f293810b, false, null, 3), 134217727);
            case 3:
                PersistedBackground background = (PersistedBackground) obj2;
                Intrinsics.checkNotNullParameter(background, "background");
                return background.f63743a;
            case 4:
                x19.a it10 = (x19.a) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Boolean.valueOf(it10 instanceof x19.b);
            case 5:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a it11 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f89925c;
            case 6:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a it12 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.i;
            case 7:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a updateState = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a(updateState, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 251658239);
            case 8:
                CashbackBySources cashbackBySources = (CashbackBySources) obj2;
                Intrinsics.checkNotNullParameter(cashbackBySources, "cashbackBySources");
                ArrayList arrayList = cashbackBySources.f65686b;
                if (arrayList.isEmpty()) {
                    z = false;
                } else {
                    Iterator it13 = arrayList.iterator();
                    while (it13.hasNext()) {
                        if (((CashbackSource) it13.next()).f65688a.f(dj0.d.e)) {
                        }
                    }
                    z = false;
                }
                return Boolean.valueOf(z);
            case 9:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a it14 = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f89925c;
            case 10:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, true, null, null, null, 251658239);
            case 11:
                return ((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2).f89925c;
            case 12:
                com.revolut.feature.tab.lifestyle.impl.ui.screen.a aVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2;
                return Boolean.valueOf((aVar.f89926g.getContent() == null || aVar.f89925c.getContent() == null) ? false : true);
            case 13:
                return com.revolut.feature.tab.lifestyle.impl.ui.screen.a.a((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) obj2, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, null, null, 251658239);
            case 14:
                return Boolean.valueOf(nmm.j.u((nmm.l) obj2));
            case 15:
                nn0.a args = (nn0.a) obj2;
                Intrinsics.checkNotNullParameter(args, "args");
                return new nn0.c(args.f217430a);
            case 16:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                nb0 nb0Var = pb0.Companion;
                List listK = zhm.v.k(nb0.b(nb0Var, "1", false, 0, false, 30), nb0.b(nb0Var, "2", false, 0, false, 30), nb0.b(nb0Var, "3", false, 0, false, 30));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return new nn3.g(listK, null, null, false, zhm.f0.f322471a);
            case 17:
                SelectableDelegate.Model model = (SelectableDelegate.Model) obj2;
                ContactsChooserScreen.a aVar2 = ContactsChooserScreen.Companion;
                Intrinsics.checkNotNullParameter(model, "model");
                return new fn3.c(model.f53304a, ((RowDelegate.Model) model.f53305b).u);
            case 18:
                RewardDelegate.Model model2 = (RewardDelegate.Model) obj2;
                ContactsChooserScreen.a aVar3 = ContactsChooserScreen.Companion;
                Intrinsics.checkNotNullParameter(model2, "model");
                return new fn3.c(model2.f53191a, model2.f53195h);
            case 19:
                ReferralContactDelegate.Model model3 = (ReferralContactDelegate.Model) obj2;
                ContactsChooserScreen.a aVar4 = ContactsChooserScreen.Companion;
                Intrinsics.checkNotNullParameter(model3, "model");
                return new fn3.c(model3.f53161a, model3.f53167l);
            case 20:
                nn3.c update2 = (nn3.c) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return nn3.c.a(update2, null, null, null, null, null, false, false, null, update2.f217446n + 1, null, 122879);
            case 21:
                return nn3.c.a((nn3.c) obj2, null, null, null, null, null, false, false, null, 0, null, 130559);
            case 22:
                do3.n it15 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return do3.q.y(it15);
            case 23:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new nnb.k(nnb.q.a(0), (List) getDefaultLoadingItems.invoke(), false);
            case 24:
                nnb.j it16 = (nnb.j) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f217498b.f86683a.f86619c;
            case 25:
                nnb.j it17 = (nnb.j) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(it17.f217497a.d != pcd.h0.ACTIVE);
            case 26:
                nnb.j it18 = (nnb.j) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f217497a.e;
            case 27:
                nnd.c state = (nnd.c) obj2;
                Intrinsics.checkNotNullParameter(state, "state");
                nnd.a aVar5 = (nnd.a) state.f217532a.getContent();
                if (aVar5 != null) {
                    return aVar5.f217518a;
                }
                return null;
            case 28:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                aim.e eVarB = zhm.u.b();
                nb0 nb0Var2 = pb0.Companion;
                List listK2 = zhm.v.k(nb0.b(nb0Var2, "ROW_LOADING_ID1", false, 0, false, 30), nb0.b(nb0Var2, "ROW_LOADING_ID2", false, 0, false, 30), nb0.b(nb0Var2, "ROW_LOADING_ID3", false, 0, false, 30));
                yp0.b.k(listK2, 0, 0, 0, 0, 31);
                eVarB.addAll(listK2);
                return new nnd.r(zhm.u.a(eVarB));
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                one.d dVar = (one.d) pair.f186385a;
                xme.f fVar = (xme.f) pair.f186386b;
                boolean zIsEmpty = dVar.f226944a.isEmpty();
                boolean z3 = !zIsEmpty;
                ArrayList arrayList2 = dVar.f226945b;
                boolean zIsEmpty2 = arrayList2.isEmpty();
                boolean z4 = !zIsEmpty2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Iterator it19 = arrayList2.iterator();
                while (it19.hasNext()) {
                    linkedHashSet.add(((one.b) it19.next()).f226939a);
                }
                ArrayList arrayList3 = fVar.f307234b.f307222b;
                if (arrayList3.isEmpty()) {
                    z = false;
                } else {
                    Iterator it20 = arrayList3.iterator();
                    while (it20.hasNext()) {
                        if (linkedHashSet.contains(((xme.b) it20.next()).f307223a)) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (zIsEmpty && zIsEmpty2) {
                    return e.a.f307232a;
                }
                return new xme.d(fVar.f307233a == null, fVar, z3, z4, z);
        }
    }

    public /* synthetic */ c0(cli.n nVar, int i) {
        this.f217290a = i;
    }
}
