package m30;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceFiltersSelection;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.f1;
import m3g.n;
import m3g.o;
import m3g.s;
import nel.e0;
import v30.c0;
import v30.y;
import w30.m;
import x2h.b;
import zhm.f0;
import zhm.h0;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f202262a;

    public /* synthetic */ c(int i) {
        this.f202262a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f202262a) {
            case 0:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Data(null, it8, false, 5, null);
            case 1:
                Throwable it9 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Data(null, it9, false, 5, null);
            case 2:
                Throwable it10 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return new Data(null, it10, false, 5, null);
            case 3:
                List<y> feeds = (List) obj2;
                Intrinsics.checkNotNullParameter(feeds, "feeds");
                ArrayList arrayList = new ArrayList();
                for (y yVar : feeds) {
                    m mVarK0 = jpc.e.k0(yVar.f285835c, yVar.f285834b);
                    if (mVarK0 != null) {
                        arrayList.add(mVarK0);
                    }
                }
                return arrayList;
            case 4:
                v30.j it11 = (v30.j) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return v.l(jpc.e.k0(it11, c0.SUPPORT));
            case 5:
                com.revolut.domain.models.topup.methods.b methods = (com.revolut.domain.models.topup.methods.b) obj2;
                Intrinsics.checkNotNullParameter(methods, "methods");
                return Boolean.valueOf((methods.f60525a.isEmpty() && methods.f60526b.isEmpty()) ? false : true);
            case 6:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Data(f0.f322471a, null, false, 2, null);
            case 7:
                Data it12 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                List list = (List) it12.getContent();
                return list == null ? f0.f322471a : list;
            case 8:
                Data it13 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                List list2 = (List) it13.getContent();
                return list2 == null ? f0.f322471a : list2;
            case 9:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return new Data(f0.f322471a, null, false, 2, null);
            case 10:
                Data it14 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return Boolean.valueOf((it14.getLoading() && it14.getContent() == null) ? false : true);
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 12:
                n updateState = (n) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return n.a(updateState, null, null, null, null, null, null, TravelExperienceFiltersSelection.a(updateState.f202545g, null, null, h0.f322473a, false, null, 27), null, null, false, 959);
            case 13:
                List<RevPointsEarningRate> rates = (List) obj2;
                Intrinsics.checkNotNullParameter(rates, "rates");
                for (RevPointsEarningRate revPointsEarningRate : rates) {
                    if (revPointsEarningRate.f83975a == f1.EXPERIENCES) {
                        return new o(revPointsEarningRate);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            case 14:
                n updateState2 = (n) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return n.a(updateState2, null, null, null, null, null, s.COLLAPSED, null, null, null, false, 991);
            case 15:
                n updateState3 = (n) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return n.a(updateState3, null, null, null, null, null, s.EXPANDED, null, null, null, false, 991);
            case 16:
                n updateState4 = (n) obj2;
                Intrinsics.checkNotNullParameter(updateState4, "$this$updateState");
                return n.a(updateState4, null, null, null, null, null, s.COLLAPSED, null, null, null, false, 991);
            case 17:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return m3g.c0.d();
            case 18:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return f0.f322471a;
            case 19:
                n2h.f update = (n2h.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data actions = zi0.c.P(new hdh.e(f0.f322471a), false, null, 3);
                update.getClass();
                Intrinsics.checkNotNullParameter(actions, "actions");
                return new n2h.f(actions);
            case 20:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return b.C1676b.f302573a;
            case 21:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "it", 5);
                for (int i = 0; i < 5; i++) {
                    arrayListP.add(nb0.a(pb0.Companion, "call_categories_loading", false, 4));
                }
                return arrayListP;
            case 22:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new cii.b(null, f0.f322471a, new lw0.h(lw0.i.TITLE_SUBTITLE));
            case 23:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return (List) getDefaultLoadingItems.invoke();
            case 24:
                od0.i.Companion.getClass();
                return od0.h.a((io3.d) obj2);
            case 25:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return new m58.c(f0.f322471a);
            case 26:
                nel.n instrument = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(instrument, "instrument");
                return new fsl.f(instrument);
            case 27:
                nel.n it15 = (nel.n) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                e0 e0VarK = ifk.b.k(it15);
                if (e0VarK != null) {
                    return e0VarK.i;
                }
                return null;
            case 28:
                fo3.c wallet = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet, "wallet");
                double dH = wallet.h();
                boolean z = true;
                if (dH > 0.0d && wallet.e / dH < 0.75d) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                fo3.c wallet2 = (fo3.c) obj2;
                Intrinsics.checkNotNullParameter(wallet2, "wallet");
                return new dj0.d(wallet2.h() - wallet2.e, wallet2.d);
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f202262a = i;
    }
}
