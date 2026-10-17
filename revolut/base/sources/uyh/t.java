package uyh;

import androidx.camera.video.internal.config.DynamicRangeFormatComboRegistry;
import androidx.camera.video.internal.config.FormatComboRegistry;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.feature.rev_points.impl.ui.trophy_room.details.b;
import com.revolut.retail.feature.marketnews.api.delegate.WealthTopStoriesContract$TopStoriesOverviewParcel;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zw7.h1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f284406a;

    public /* synthetic */ t(int i) {
        this.f284406a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f284406a) {
            case 0:
                io3.d it8 = (io3.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                od0.i.Companion.getClass();
                return od0.h.a(it8);
            case 1:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return od0.i.f224256b;
            case 2:
                j domainState = (j) obj2;
                Intrinsics.checkNotNullParameter(domainState, "domainState");
                return domainState;
            case 3:
                tz4.c it9 = (tz4.c) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                lz4.a aVarX = tz4.d.x(it9);
                return aVarX != null ? efm.k.g(aVarX) : rfm.h.f253943a;
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return (Date) pair.f186385a;
            case 5:
                zw7.k0 it10 = (zw7.k0) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return it10.f325807a;
            case 6:
                h1 quote = (h1) obj2;
                Intrinsics.checkNotNullParameter(quote, "quote");
                return quote.f325793c;
            case 7:
                h1 quote2 = (h1) obj2;
                Intrinsics.checkNotNullParameter(quote2, "quote");
                return quote2.d;
            case 8:
                Pair pair2 = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair2, "<destruct>");
                hel.a aVar = (hel.a) pair2.f186385a;
                List list = (List) pair2.f186386b;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!aVar.f151716a.contains((wi0.b) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 9:
                hel.b tradingContext = (hel.b) obj2;
                Intrinsics.checkNotNullParameter(tradingContext, "tradingContext");
                if (uzk.c.f284684a[tradingContext.ordinal()] == 1) {
                    wi0.b.Companion.getClass();
                    return zhm.v.k(wi0.b.f297756l, wi0.b.p0, wi0.b.O0, wi0.b.N, wi0.b.l2, wi0.b.r2);
                }
                wi0.b.Companion.getClass();
                return zhm.v.k(wi0.b.f297770q3, wi0.b.p0, wi0.b.f297760n0, wi0.b.N, wi0.b.O0);
            case 10:
                return DynamicRangeFormatComboRegistry.buildDolbyVisionRegistry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj2);
            case 11:
                return DynamicRangeFormatComboRegistry.buildHdr10PlusRegistry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj2);
            case 12:
                return DynamicRangeFormatComboRegistry.buildHlgRegistry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj2);
            case 13:
                return DynamicRangeFormatComboRegistry.buildSdrRegistry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj2);
            case 14:
                return DynamicRangeFormatComboRegistry.buildSdrRegistry$lambda$0$1((FormatComboRegistry.Builder.ContainerScope) obj2);
            case 15:
                return DynamicRangeFormatComboRegistry.buildHdr10Registry$lambda$0$0((FormatComboRegistry.Builder.ContainerScope) obj2);
            case 16:
                return DynamicRangeFormatComboRegistry.buildHdr10Registry$lambda$0$1((FormatComboRegistry.Builder.ContainerScope) obj2);
            case 17:
                return v03.e.a((v03.e) obj2, null);
            case 18:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "<unused var>");
                ufm.b bVarM = efm.d0.m(Boolean.FALSE);
                Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
                return bVarM;
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ArrayList arrayList2 = new ArrayList(2);
                for (int i = 0; i < 2; i++) {
                    pb0 pb0VarB = nb0.b(pb0.Companion, a0.d.n("LOADING_PRODUCT_ITEM_ID_", i), false, 0, false, 30);
                    yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                    arrayList2.add(pb0VarB);
                }
                return new v0c.j(arrayList2, b.a.f83905a, null);
            case 20:
                v0f.u update = (v0f.u) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return v0f.u.a(update, null, null, null, null, null, v0f.t.NONE, null, null, false, false, false, false, false, false, 16351);
            case 21:
                v0f.u it11 = (v0f.u) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.f;
            case 22:
                v0f.u it12 = (v0f.u) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.f;
            case 23:
                v0f.u it13 = (v0f.u) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.e;
            case 24:
                v0f.u it14 = (v0f.u) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.f284824a;
            case 25:
                rzj.k it15 = (rzj.k) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f258697a;
            case 26:
                rzj.k it16 = (rzj.k) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f258697a;
            case 27:
                ListSubheaderDelegate.Model it17 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                Object obj4 = it17.f52715m;
                if (obj4 instanceof WealthTopStoriesContract$TopStoriesOverviewParcel) {
                    return (WealthTopStoriesContract$TopStoriesOverviewParcel) obj4;
                }
                return null;
            case 28:
                ListSubheaderDelegate.Model it18 = (ListSubheaderDelegate.Model) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                return Boolean.valueOf(Intrinsics.f(it18.f52708a, "WEALTH_TOP_STORIES_HEADER_ID"));
            default:
                Object obj5 = ((ListSubheaderDelegate.Model) obj2).f52715m;
                if (obj5 instanceof WealthTopStoriesContract$TopStoriesOverviewParcel) {
                    return (WealthTopStoriesContract$TopStoriesOverviewParcel) obj5;
                }
                return null;
        }
    }

    public /* synthetic */ t(qee.s sVar) {
        this.f284406a = 19;
    }
}
