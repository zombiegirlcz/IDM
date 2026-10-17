package v2g;

import com.revolut.core.ui_kit.delegates.RewardDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$Step;
import com.revolut.feature.defi.remittances.impl.ui.send.flow.DeFiSendFlowContract$Step;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.feature.stories.StoriesActivity;
import com.revolut.feature.stories.models.StoriesModel;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import ip0.gu;
import ip0.jm0;
import ip0.pb0;
import ip0.rv;
import ip0.y;
import ip0.yl;
import java.util.ArrayList;
import java.util.List;
import jel.w2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import nel.d0;
import nel.e0;
import nel.n;
import v4a.o;
import v4e.p;
import v4g.m;
import yhm.r;
import zhm.r0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285741a;

    public /* synthetic */ i(int i) {
        this.f285741a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        w2 w2Var;
        n nVar;
        e0 e0VarK;
        switch (this.f285741a) {
            case 0:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                gu guVar = new gu("SUB_HEADER_LOADING_ITEM_ID", 0, 0, 30);
                rv rvVar = new rv("TILE_LOADING_ITEM_ID", null, 62);
                yp0.b.l(rvVar, 0, 0, 0, 0, null, false, 63);
                rv rvVar2 = new rv("TILE_LOADING_ITEM_ID", null, 62);
                yp0.b.l(rvVar2, 0, 0, 0, 0, null, false, 63);
                return v.k(guVar, rvVar, rvVar2);
            case 1:
                NaviCommand it8 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.TRUE;
            case 2:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.FALSE;
            case 3:
                FeatureConfig it10 = (FeatureConfig) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new FeatureCommand(it10);
            case 4:
                NaviCommand it11 = (NaviCommand) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return Boolean.TRUE;
            case 5:
                Throwable it12 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return Boolean.FALSE;
            case 6:
                StoriesModel story = (StoriesModel) obj2;
                KProperty[] kPropertyArr = StoriesActivity.f88741w0;
                Intrinsics.checkNotNullParameter(story, "story");
                return story.f88785b;
            case 7:
                if (((List) obj2).isEmpty()) {
                    throw new IllegalArgumentException("The stories are empty. Add stories to StoriesContract.Configuration or override StoriesContract.PresentationModel");
                }
                return Unit.f186387a;
            case 8:
                IntRange intRangeU = t61.a.u((Function0) obj2, "it", 1, 3, 1);
                ArrayList arrayList = new ArrayList(w.t(intRangeU, 10));
                vim.f it13 = intRangeU.iterator();
                while (it13.f289625c) {
                    arrayList.add(new pb0(a0.d.n("ID_LOADING_ITEM_", it13.nextInt())));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return arrayList;
            case 9:
                v44.g update = (v44.g) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v44.g.a(update, null, null, 1007);
            case 10:
                vh it14 = (vh) obj2;
                KProperty[] kPropertyArr2 = RecipientSelectionScreen.f80137h0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return ((RowDelegate.Model) it14.f54884b).u;
            case 11:
                y it15 = (y) obj2;
                KProperty[] kPropertyArr3 = RecipientSelectionScreen.f80137h0;
                Intrinsics.checkNotNullParameter(it15, "it");
                return (WhoToTransferFilter) it15.f167226b.f58324n;
            case 12:
                RewardDelegate.Model it16 = (RewardDelegate.Model) obj2;
                KProperty[] kPropertyArr4 = RecipientSelectionScreen.f80137h0;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f53195h;
            case 13:
                RowDelegate.Model it17 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr5 = RecipientSelectionScreen.f80137h0;
                Intrinsics.checkNotNullParameter(it17, "it");
                return it17.u;
            case 14:
                f5j.a it18 = (f5j.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it18);
            case 15:
                CardOwnerWithStats it19 = (CardOwnerWithStats) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it19);
            case 16:
                Function0 it20 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it20, "it");
                IntRange intRange = new IntRange(1, 5, 1);
                ArrayList arrayList2 = new ArrayList(w.t(intRange, 10));
                vim.f it21 = intRange.iterator();
                while (it21.f289625c) {
                    arrayList2.add(new pb0(a0.d.n("LOADING_STATE_ID_", it21.nextInt())));
                }
                yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
                return new v4a.g(oi0.d.U(arrayList2), o.b(false));
            case 17:
                Function0 it22 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                List listK = v.k(new yl("assets_performance_header_loading", 0, 30), new jm0("assets_performance_chart", null, null, false, null, null, 0, true, 0, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -198), new pb0("asset_performance_loading_1"), new pb0("asset_performance_loading_2"));
                yp0.b.k(listK, 0, 0, 0, 0, 31);
                return listK;
            case 18:
                jel.c it23 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it23, "it");
                if (it23 instanceof w2) {
                    return (w2) it23;
                }
                return null;
            case 19:
                p it24 = (p) obj2;
                Intrinsics.checkNotNullParameter(it24, "it");
                Data data = it24.f286057a;
                if (data == null || (w2Var = (w2) data.getContent()) == null) {
                    return null;
                }
                return w2Var.e;
            case 20:
                p it25 = (p) obj2;
                Intrinsics.checkNotNullParameter(it25, "it");
                return it25.f286057a;
            case 21:
                List it26 = (List) obj2;
                Intrinsics.checkNotNullParameter(it26, "it");
                return r0.t(it26);
            case 22:
                p pVar = (p) obj2;
                Data data2 = pVar.f286058b;
                d0 d0Var = (data2 == null || (nVar = (n) data2.getContent()) == null || (e0VarK = ifk.b.k(nVar)) == null) ? null : e0VarK.f214569h;
                Data data3 = pVar.f286057a;
                w2 w2Var2 = data3 != null ? (w2) data3.getContent() : null;
                Data data4 = pVar.e;
                List list = data4 != null ? (List) data4.getContent() : null;
                if (d0Var == null || w2Var2 == null || list == null) {
                    return null;
                }
                return new r(d0Var, w2Var2, list);
            case 23:
                Function0 it27 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(it27, "it");
                return m.f286086a;
            case 24:
                Data it28 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it28, "it");
                return (it28.getError() == null || it28.getContent() != null) ? efm.r.just(it28) : efm.r.error(it28.getError());
            case 25:
                Data it29 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it29, "it");
                return it29.getError() != null ? efm.r.error(it29.getError()) : efm.r.just(it29);
            case 26:
                BirthPlaceRootFlowContract$Step it30 = (BirthPlaceRootFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it30, "it");
                return Boolean.valueOf(it30 instanceof BirthPlaceRootFlowContract$Step.ChooseCountry);
            case 27:
                DeFiSendFlowContract$Step it31 = (DeFiSendFlowContract$Step) obj2;
                Intrinsics.checkNotNullParameter(it31, "it");
                return Boolean.valueOf(it31 instanceof DeFiSendFlowContract$Step.WalletList);
            case 28:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            default:
                jel.c it32 = (jel.c) obj2;
                Intrinsics.checkNotNullParameter(it32, "it");
                if (it32 instanceof w2) {
                    return (w2) it32;
                }
                return null;
        }
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f285741a = i;
    }
}
