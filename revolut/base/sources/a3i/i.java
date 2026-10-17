package a3i;

import ael.q0;
import akf.j1;
import akf.p0;
import akf.r0;
import akf.s1;
import akf.x0;
import as1.a0;
import b9.w2;
import ble.e1;
import com.revolut.feature.tab.accounts.api.total_wealth.TotalWealthCategoryKey;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import vkm.y;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f1143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1144c;

    public /* synthetic */ i(Flow flow, Object obj2, int i) {
        this.f1142a = i;
        this.f1143b = flow;
        this.f1144c = obj2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f1142a) {
            case 0:
                Object objCollect = ((zfd.e) this.f1143b).collect(new h(flowCollector, (w2) this.f1144c, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((akg.n) this.f1143b).collect(new h(flowCollector, (q66.c) this.f1144c, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((uf0.b) this.f1143b).collect(new h(flowCollector, (com.revolut.feature.apm.multibanco.impl.ui.home.area.b) this.f1144c, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((vkm.d) this.f1143b).collect(new h(flowCollector, (com.revolut.feature.card_screen.impl.kompot.cards_list.screen.a) this.f1144c, 3), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((qij.s) this.f1143b).collect(new a87.f(flowCollector, (List) this.f1144c, 0), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((vkm.f) this.f1143b).collect(new h(flowCollector, (a9j.u) this.f1144c, 5), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = this.f1143b.collect(new a9j.s(flowCollector, (q0) this.f1144c), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = this.f1143b.collect(new h(flowCollector, (qf1.f) this.f1144c, 6), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((t38.e) this.f1143b).collect(new h(flowCollector, (LinkedHashSet) this.f1144c, 7), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = this.f1143b.collect(new h(flowCollector, (TotalWealthCategoryKey) this.f1144c, 9), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = ((a35.d) this.f1143b).collect(new h(flowCollector, (com.revolut.feature.tab.accounts.impl.ui.spaces.i) this.f1144c, 10), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((vkm.d) this.f1143b).collect(new akf.g(flowCollector, (p0) this.f1144c, 9), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = this.f1143b.collect(new h(flowCollector, (r0) this.f1144c, 11), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = this.f1143b.collect(new h(flowCollector, (x0) this.f1144c, 12), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f1143b.collect(new h(flowCollector, (j1) this.f1144c, 13), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((wkm.l) this.f1143b).collect(new h(flowCollector, (s1) this.f1144c, 14), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((y5j.e) this.f1143b).collect(new h(flowCollector, (alb.j) this.f1144c, 16), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = ((v0f.p) this.f1143b).collect(new h(flowCollector, (ald.h) this.f1144c, 17), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((y) this.f1143b).collect(new h(flowCollector, (alf.c) this.f1144c, 18), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = this.f1143b.collect(new akf.g(flowCollector, (amf.e) this.f1144c, 13), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = this.f1143b.collect(new akf.g(flowCollector, (amf.l) this.f1144c, 15), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = this.f1143b.collect(new arb.e(flowCollector, (arb.g) this.f1144c, 0), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((vkm.q0) this.f1143b).collect(new arb.e(flowCollector, (arb.g) this.f1144c, 1), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = this.f1143b.collect(new h(flowCollector, (a0) this.f1144c, 20), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = this.f1143b.collect(new h(flowCollector, (aw.u) this.f1144c, 22), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((an9.g) this.f1143b).collect(new ayf.d(flowCollector, (ayf.n) this.f1144c, 0), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = this.f1143b.collect(new ayf.d(flowCollector, (ayf.n) this.f1144c, 1), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((j23.b) this.f1143b).collect(new h(flowCollector, (zz9.s) this.f1144c, 23), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = this.f1143b.collect(new e1(flowCollector, (com.revolut.feature.credit.application.plugins.impl.ui.akahu.b) this.f1144c, 21), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((wkm.l) this.f1143b).collect(new h(flowCollector, (com.revolut.feature.shared.help_centre.impl.faq.screens.article.c) this.f1144c, 24), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
