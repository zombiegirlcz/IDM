package mx0;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.widgets.LineChartLoadingTileWidgetDelegate;
import com.revolut.core.ui_kit.views.TagsView;
import com.revolut.data.model.Data;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.impl.ui.transparent.TransparentKompotDestinationContract$Configuration;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileActivity;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreen;
import com.revolut.feature.wallets.api.module.WalletLimit;
import com.revolut.recyclerkit.ScreenGridLayoutManager;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import ip0.um0;
import ip0.vj0;
import ip0.xi0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import myg.l;
import rp0.p0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class oc implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209894a;

    public /* synthetic */ oc(int i) {
        this.f209894a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object obj3;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        switch (this.f209894a) {
            case 0:
                vj0 model = (vj0) obj2;
                int i = TagsView.e;
                Intrinsics.checkNotNullParameter(model, "model");
                return new pc(model.f166825a, model.f166826b, model.e);
            case 1:
                Throwable th10 = (Throwable) obj2;
                Intrinsics.h(th10);
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                return Unit.f186387a;
            case 2:
                List list = (List) obj2;
                ArrayList arrayListY = com.google.android.gms.internal.mlkit_vision_face.a.y("results", list);
                if (!list.isEmpty()) {
                    zhm.a0.x(mx7.c.b(list), arrayListY);
                }
                return arrayListY;
            case 3:
                Intrinsics.checkNotNullParameter((NaviCommand) obj2, "it");
                return Boolean.TRUE;
            case 4:
                hxf.e it8 = (hxf.e) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.name();
            case 5:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                SortingType sortingType = (SortingType) pair.f186385a;
                List list2 = (List) ((Data) pair.f186386b).getContent();
                if (list2 == null) {
                    list2 = zhm.f0.f322471a;
                }
                return te0.w.h(new ny5.v(sortingType, ny5.u.a(sortingType, list2)));
            case 6:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return Boolean.valueOf(it9.getLoading());
            case 7:
                do3.n it10 = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                Address address = it10.k;
                String city = address != null ? address.getCity() : null;
                return city == null ? "" : city;
            case 8:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return "";
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return LineChartLoadingTileWidgetDelegate.Model.Companion.b(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, "PERFORMANCE_WIDGET_LIST_ID");
            case 10:
                l.a aVar = myg.l.Companion;
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return LineChartLoadingTileWidgetDelegate.Model.Companion.a(LineChartLoadingTileWidgetDelegate.Model.INSTANCE, "TOTAL_VALUE_ID");
            case 11:
                yoj.a aVar2 = (yoj.a) obj2;
                return wp5.y.s(aVar2, "feature", aVar2);
            case 12:
                PluginPayload it11 = (PluginPayload) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                aj4.c.Companion.getClass();
                ExplicitActivityDestination explicitActivityDestination = aj4.a.f5397b;
                it3.d dVar = it11.f66247a;
                Object obj4 = dVar.e;
                if (!(obj4 instanceof hs3.y1)) {
                    List list3 = dVar.f;
                    if (list3 != null) {
                        Iterator it12 = list3.iterator();
                        while (true) {
                            if (it12.hasNext()) {
                                next = it12.next();
                                if (next instanceof hs3.y1) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        obj3 = (hs3.v) next;
                    } else {
                        obj3 = null;
                    }
                } else {
                    if (obj4 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.StatusDialogMetadata");
                    }
                    obj3 = (hs3.y1) obj4;
                }
                if (obj3 != null) {
                    return new ActivityNavigateCommand(explicitActivityDestination, new TransparentKompotDestinationContract$Configuration(new CreditApplicationKompotFeatureConfig.StatusDialog((hs3.y1) obj3, io3.h.R(it11, ""), null).f98274b), null, null, 0, null, null, null, null, false, 1020);
                }
                throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.y1.class)));
            case 13:
                rlm.f Json = (rlm.f) obj2;
                Lazy lazy = mz8.a.f210722a;
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.f255101c = true;
                return Unit.f186387a;
            case 14:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return zhm.u.c(new xi0("LOADING_ITEM_ID"));
            case 15:
                yt8.d addresses = (yt8.d) obj2;
                Intrinsics.checkNotNullParameter(addresses, "addresses");
                return addresses.f316665a;
            case 16:
                List limits = (List) obj2;
                Intrinsics.checkNotNullParameter(limits, "limits");
                Iterator it13 = zhm.c0.N(limits, WalletLimit.CounterLimit.class).iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next2 = it13.next();
                        if (((WalletLimit.CounterLimit) next2).f94844a == com.revolut.feature.wallets.api.module.a.TRANSFER_YEARLY) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                WalletLimit.CounterLimit counterLimit = (WalletLimit.CounterLimit) next2;
                if (counterLimit != null) {
                    return new czj.c(counterLimit);
                }
                return null;
            case 17:
                List limits2 = (List) obj2;
                Intrinsics.checkNotNullParameter(limits2, "limits");
                Iterator it14 = zhm.c0.N(limits2, WalletLimit.CounterLimit.class).iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next3 = it14.next();
                        if (((WalletLimit.CounterLimit) next3).f94844a == com.revolut.feature.wallets.api.module.a.TRANSFER_WEEKLY) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                WalletLimit.CounterLimit counterLimit2 = (WalletLimit.CounterLimit) next3;
                if (counterLimit2 != null) {
                    return new czj.c(counterLimit2);
                }
                return null;
            case 18:
                List limits3 = (List) obj2;
                Intrinsics.checkNotNullParameter(limits3, "limits");
                Iterator it15 = zhm.c0.N(limits3, WalletLimit.CounterLimit.class).iterator();
                while (true) {
                    if (it15.hasNext()) {
                        next4 = it15.next();
                        if (((WalletLimit.CounterLimit) next4).f94844a == com.revolut.feature.wallets.api.module.a.TRANSFER_DAILY) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                WalletLimit.CounterLimit counterLimit3 = (WalletLimit.CounterLimit) next4;
                if (counterLimit3 != null) {
                    return new czj.c(counterLimit3);
                }
                return null;
            case 19:
                cqi.g it16 = (cqi.g) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return Boolean.valueOf(it16 == cqi.g.USER);
            case 20:
                p0.a it17 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj5 = it17.f256150a;
                if (obj5 instanceof mzj.d) {
                    return (mzj.d) obj5;
                }
                return null;
            case 21:
                p0.a it18 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj6 = it18.f256150a;
                if (obj6 instanceof mzj.d) {
                    return (mzj.d) obj6;
                }
                return null;
            case 22:
                p0.a it19 = (p0.a) obj2;
                Intrinsics.checkNotNullParameter(it19, "it");
                Object obj7 = it19.f256150a;
                if (obj7 instanceof mzj.c) {
                    return (mzj.c) obj7;
                }
                return null;
            case 23:
                Intrinsics.checkNotNullParameter((cqi.g) obj2, "it");
                return Unit.f186387a;
            case 24:
                Intrinsics.checkNotNullParameter((p0.b) obj2, "it");
                return Unit.f186387a;
            case 25:
                um0 it20 = (um0) obj2;
                int i2 = PetProfileActivity.F0;
                Intrinsics.checkNotNullParameter(it20, "it");
                return um0.e(it20, "ID_CANCEL_CANCELLATION");
            case 26:
                um0 it21 = (um0) obj2;
                int i3 = PetProfileActivity.F0;
                Intrinsics.checkNotNullParameter(it21, "it");
                return um0.e(it21, "ID_CONFIRM_CANCELLATION");
            case 27:
                Data it22 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it22, "it");
                return Boolean.valueOf(it22.getLoading());
            case 28:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                return (List) pair2.f186386b;
            default:
                RecyclerView recyclerView = (RecyclerView) obj2;
                KProperty[] kPropertyArr = LearnHomeScreen.Y;
                Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
                Context context = recyclerView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                ScreenGridLayoutManager screenGridLayoutManager = new ScreenGridLayoutManager(context, 2, 12);
                screenGridLayoutManager.setSpanSizeLookup(new n09.k(recyclerView, screenGridLayoutManager));
                return screenGridLayoutManager;
        }
    }

    public /* synthetic */ oc(Object obj2, int i) {
        this.f209894a = i;
    }
}
