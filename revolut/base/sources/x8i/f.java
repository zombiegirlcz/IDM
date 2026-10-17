package x8i;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.chaosmanagement.domain.model.ChaosManagementNewsItem;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.data.model.Data;
import com.revolut.retail.common.ui.model.NewsUiItem;
import com.revolut.tracking.v3.IdContext;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yhm.r;
import zhm.a0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f303409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f303410b;

    public /* synthetic */ f(i iVar, int i) {
        this.f303409a = i;
        this.f303410b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        boolean z;
        List listP0;
        int i = this.f303409a;
        int i2 = 2;
        int i3 = 1;
        i iVar = this.f303410b;
        switch (i) {
            case 0:
                r rVar = (r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                List list = (List) rVar.f314201a;
                List list2 = (List) rVar.f314202b;
                List list3 = (List) rVar.f314203c;
                d dVar = iVar.f303416c;
                if (list != null && (listP0 = d0.P0(list, new c())) != null) {
                    dVar.f303407a = listP0;
                }
                ArrayList<ChaosManagementNewsItem> newsItems = d0.E0(list3, list2);
                Intrinsics.checkNotNullParameter(newsItems, "newsItems");
                ArrayList arrayList = new ArrayList(w.t(newsItems, 10));
                for (ChaosManagementNewsItem chaosManagementNewsItem : newsItems) {
                    String strQ = j6.a.q("CHAOS_MANAGEMENT_BANNER.", chaosManagementNewsItem.f51352a);
                    String str = chaosManagementNewsItem.f51353b;
                    String str2 = chaosManagementNewsItem.f51354c;
                    UrlImage urlImage = new UrlImage(chaosManagementNewsItem.d, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
                    int i5 = a.f303406a[chaosManagementNewsItem.f51356h.ordinal()];
                    if (i5 == 1) {
                        z = true;
                    } else {
                        if (i5 != i2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = false;
                    }
                    arrayList.add(new NewsUiItem(strQ, null, chaosManagementNewsItem.e, null, urlImage, str, str2, null, null, null, false, null, null, z, chaosManagementNewsItem, new AnalyticsContext(kii.e.d(IdContext.newBuilder(), chaosManagementNewsItem.f51352a, AnalyticsContext.INSTANCE)), false, 1695626));
                    i2 = 2;
                }
                dVar.f303408b = arrayList;
                ArrayList arrayList2 = new ArrayList();
                a0.x(dVar.f303407a, arrayList2);
                a0.x((Iterable) dVar.f303408b, arrayList2);
                List listP02 = d0.P0(d0.Z(arrayList2), new b());
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : listP02) {
                    String id10 = ((NewsUiItem) obj3).f98597a;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    a61.a aVar = iVar.f303414a;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    if (!((q71.a) aVar.f1531b).d(id10)) {
                        arrayList3.add(obj3);
                    }
                }
                return arrayList3;
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                e7l.f fVar = (e7l.f) pair.f186386b;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.DEBUG, "NEWS IMPL", "data is " + data + ", config is " + fVar, null, null, 16);
                efm.r rVarJust = efm.r.just(data);
                Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
                String str3 = fVar.K;
                iVar.getClass();
                return nim.a.w(rVarJust, new x52.a(iVar, str3, 13)).map(new g(i3, new x8h.h(29))).filter(new g(i2, new h(0))).map(new x0i.i(new x8h.h(28), 28));
        }
    }
}
