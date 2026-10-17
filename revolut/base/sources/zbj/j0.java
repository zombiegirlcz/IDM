package zbj;

import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendFlowUploadItem;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import com.revolut.feature.backend_flow.domain.models.PromptScreen;
import com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem;
import com.revolut.retail.feature.crypto_deposits.api.models.CryptoDepositAddress;
import ip0.x10;
import ip0.x80;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import rp0.p0;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class j0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f320917a;

    public /* synthetic */ j0(int i) {
        this.f320917a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws Throwable {
        List list;
        List list2;
        switch (this.f320917a) {
            case 0:
                q update = (q) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return q.a(update, null, null, null, null, null, null, null, null, null, null, null, u0.FRIENDS, 12287);
            case 1:
                CryptoDepositAddress it8 = (CryptoDepositAddress) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.f100038b;
            case 2:
                q it9 = (q) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return (wk5.a) it9.f320928g.f224257a;
            case 3:
                CryptoDepositAddress it10 = (CryptoDepositAddress) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                String str = it10.f100039c;
                if (str != null) {
                    return str;
                }
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                hx7.e.n(new IllegalStateException("Null tag shouldn't be visible"));
                return "";
            case 4:
                ((Boolean) obj2).booleanValue();
                return Unit.f186387a;
            case 5:
                CryptoDepositAddress it11 = (CryptoDepositAddress) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f100038b;
            case 6:
                CryptoDepositAddress it12 = (CryptoDepositAddress) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f100038b;
            case 7:
                q update2 = (q) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return q.a(update2, null, null, null, null, null, null, null, null, null, null, null, null, 8191);
            case 8:
                return Boolean.valueOf(!((Boolean) obj2).booleanValue());
            case 9:
                q qVar = (q) obj2;
                if (qVar.f320933n) {
                    return new o(qVar.f320926b, qVar.e, qVar.f, qVar.f320928g, qVar.f320929h, qVar.f320930j, qVar.k);
                }
                return null;
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return iii.c.c(5);
            case 11:
                List groupItems = (List) obj2;
                Intrinsics.checkNotNullParameter(groupItems, "groupItems");
                List<koi.j> list3 = groupItems;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it13 = list3.iterator();
                    while (it13.hasNext()) {
                        if (!(((koi.j) it13.next()) instanceof qv0.i)) {
                            return groupItems;
                        }
                    }
                }
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                for (koi.j jVar : list3) {
                    Intrinsics.i(jVar, "null cannot be cast to non-null type com.revolut.core.ui_kit.items.BoxListItem");
                    arrayList.add((qv0.i) jVar);
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 12:
                x10 it14 = (x10) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f167081a;
            case 13:
                InputTextDelegate.TextData it15 = (InputTextDelegate.TextData) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return new Pair(it15.f52597a, it15.f52598b.toString());
            case 14:
                InputChecklistDelegate.TextData it16 = (InputChecklistDelegate.TextData) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return new Pair(it16.f52532a, it16.f52533b.toString());
            case 15:
                SelectableDelegate.Model it17 = (SelectableDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return Boolean.valueOf(!(((RowDelegate.Model) it17.f53305b).u instanceof zc0.d));
            case 16:
                InputTextDelegate.Model it18 = (InputTextDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return it18.f52580a;
            case 17:
                SelectableDelegate.Model it19 = (SelectableDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                return (RowDelegate.Model) it19.f53305b;
            case 18:
                Object k = ((qv0.p) obj2).getF51698j();
                if (k instanceof zc0.d) {
                    return (zc0.d) k;
                }
                return null;
            case 19:
                x80 it20 = (x80) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                return new Pair(it20.f167109a, Integer.valueOf(it20.f167110b));
            case 20:
                BackendFlowUploadItem it21 = (BackendFlowUploadItem) obj2;
                Intrinsics.checkNotNullParameter(it21, "it");
                return it21.getE();
            case 21:
                ty0.a it22 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return it22.f275445a;
            case 22:
                p0.a clickData = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Intrinsics.checkNotNullParameter(clickData, "<this>");
                Object obj3 = clickData.f256150a;
                PromptScreen promptScreen = obj3 instanceof PromptScreen ? (PromptScreen) obj3 : null;
                if (promptScreen == null || (list = promptScreen.f63588g) == null) {
                    return null;
                }
                return (Action) zhm.d0.e0(0, list);
            case 23:
                p0.a clickData2 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(clickData2, "clickData");
                Intrinsics.checkNotNullParameter(clickData2, "<this>");
                Object obj4 = clickData2.f256150a;
                PromptScreen promptScreen2 = obj4 instanceof PromptScreen ? (PromptScreen) obj4 : null;
                if (promptScreen2 == null || (list2 = promptScreen2.f63588g) == null) {
                    return null;
                }
                return (Action) zhm.d0.e0(1, list2);
            case 24:
                BackendScreen screen = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen, "screen");
                return screen.getId();
            case 25:
                Set it23 = (Set) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                return it23;
            case 26:
                BackendScreen screen2 = (BackendScreen) obj2;
                Intrinsics.checkNotNullParameter(screen2, "screen");
                Object objB0 = zhm.d0.b0(((FormScreen) screen2).f63468b);
                Intrinsics.i(objB0, "null cannot be cast to non-null type com.revolut.feature.backend_flow.domain.models.TransactionsSelectionItem");
                return (TransactionsSelectionItem) objB0;
            case 27:
                String it24 = (String) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                od0.h hVar = od0.i.Companion;
                if (kotlin.text.d0.W(it24)) {
                    it24 = null;
                }
                hVar.getClass();
                return od0.h.a(it24);
            case 28:
                Boolean isOpened = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isOpened, "isOpened");
                return Boolean.valueOf(!isOpened.booleanValue());
            default:
                Intrinsics.checkNotNullParameter((Boolean) obj2, "it");
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return "";
        }
    }
}
