package r8;

import android.os.Bundle;
import android.view.View;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.internal.views.chart.ChartButtonHeaderView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.retail.advanced_charts.impl.screen.advanced_charts.AdvancedChartsScreen;
import efm.f0;
import java.util.ArrayList;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l8.v;
import ro0.w;
import ro0.y;
import sgm.j1;
import sgm.k1;
import sgm.t5;
import sgm.u5;
import skm.a1;
import skm.e0;
import tfm.i1;
import tfm.t7;
import tfm.u7;
import vc.t;
import wfm.z;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f252280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f252281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f252282c;

    public /* synthetic */ d(int i, Object obj2, boolean z, Object obj3) {
        this.f252280a = i;
        this.f252281b = obj2;
        this.f252282c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String listId;
        w wVar;
        switch (this.f252280a) {
            case 0:
                v vVarA = v.a();
                vVarA.getClass();
                y8.l.a();
                vVarA.d.set(true);
                ((e) this.f252282c).f252284b.f252286b = true;
                ((e) this.f252282c).f252283a.getViewTreeObserver().removeOnDrawListener((e) this.f252281b);
                ((e) this.f252282c).f252284b.f252285a.clear();
                return;
            case 1:
                ((Function0) this.f252282c).invoke();
                return;
            case 2:
                y yVar = (y) this.f252282c;
                yVar.f255794h = null;
                RecyclerView recyclerView = yVar.d;
                if (recyclerView == null || (listId = yVar.e) == null || (wVar = yVar.f255795j) == null || wVar.equals(yVar.f(recyclerView))) {
                    return;
                }
                yVar.i++;
                yVar.b(recyclerView);
                to0.f fVar = (to0.f) yVar.f255790a;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                fVar.f272495c.e(listId);
                OneShotPreDrawListener oneShotPreDrawListener = yVar.f255793g;
                if (oneShotPreDrawListener != null) {
                    oneShotPreDrawListener.removeListener();
                }
                yVar.f255793g = null;
                yVar.a(recyclerView, listId, yVar.i);
                return;
            case 3:
                ((rp0.o) this.f252281b).j(((rp0.y) this.f252282c).d);
                return;
            case 4:
                k1 k1Var = (k1) this.f252282c;
                try {
                    k1Var.f262950a.onError((Throwable) this.f252281b);
                    return;
                } finally {
                    k1Var.d.dispose();
                }
            case 5:
                ((k1) this.f252282c).f262950a.onNext(this.f252281b);
                return;
            case 6:
                ((u5) this.f252282c).f262688a.subscribe((t5) this.f252281b);
                return;
            case 7:
                ((skm.l) this.f252282c).E((a1) this.f252281b, Unit.f186387a);
                return;
            case 8:
                ((i1) this.f252282c).f270526a.onNext(this.f252281b);
                return;
            case 9:
                u7 u7Var = (u7) this.f252282c;
                u7Var.f224947c.offer(new t7((ihm.m) this.f252281b, false));
                if (u7Var.f()) {
                    u7Var.j0();
                    return;
                }
                return;
            case 10:
                ((fgm.p) ((k18.c) this.f252282c).f180141c).onError((Throwable) this.f252281b);
                return;
            case 11:
                ((fgm.p) ((k18.c) this.f252282c).f180141c).onSuccess(this.f252281b);
                return;
            case 12:
                ChartButtonHeaderView chartButtonHeaderView = (ChartButtonHeaderView) this.f252281b;
                chartButtonHeaderView.getDisplayValue().setCurrentClause((Clause) this.f252282c);
                chartButtonHeaderView.d = true;
                return;
            case 13:
                try {
                    ((uc.a) this.f252282c).b((HashSet) this.f252281b);
                    return;
                } catch (Exception e) {
                    return;
                }
            case 14:
                ((f0) ((ufm.d) this.f252282c).f279876b).onError((Throwable) this.f252281b);
                return;
            case 15:
                ((f0) ((ufm.d) this.f252282c).f279876b).onSuccess(this.f252281b);
                return;
            case 16:
                t tVar = ((vc.d) this.f252282c).f287577b;
                tb4.t tVar2 = (tb4.t) this.f252281b;
                ArrayList arrayList = (ArrayList) tVar2.f269456b;
                ArrayList arrayListH = vc.d.h((ArrayList) tVar2.f269457c);
                Bundle bundle = new Bundle();
                bundle.putInt("session_id", 0);
                bundle.putInt("status", 5);
                bundle.putInt("error_code", 0);
                if (!arrayList.isEmpty()) {
                    bundle.putStringArrayList("module_names", new ArrayList<>(arrayList));
                }
                if (!arrayListH.isEmpty()) {
                    bundle.putStringArrayList("languages", new ArrayList<>(arrayListH));
                }
                bundle.putLong("total_bytes_to_download", 0L);
                bundle.putLong("bytes_downloaded", 0L);
                tVar.c(vc.c.e(bundle));
                return;
            case 17:
                ((vgm.v) this.f252281b).d = true;
                ((vgm.w) this.f252282c).f289261a.remove((vgm.v) this.f252281b);
                return;
            case 18:
                vx0.e eVar = (vx0.e) this.f252282c;
                eVar.f292784m = false;
                if (eVar.f292787q && eVar.f292781h == null) {
                    float f = eVar.k;
                    if (f < 1.0f) {
                        eVar.a(f, eVar.f292783l);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                wfm.g gVar = (wfm.g) this.f252281b;
                lfm.b bVar = gVar.f297172b;
                ifm.c cVarC = ((wfm.j) this.f252282c).c(gVar);
                bVar.getClass();
                lfm.d.c(bVar, cVarC);
                return;
            case 20:
                ((wfm.y) this.f252281b).d = true;
                ((z) this.f252282c).f297211a.remove((wfm.y) this.f252281b);
                return;
            case 21:
                ((FragmentActivity) this.f252282c).startPostponedEnterTransition();
                return;
            case 22:
                ((View) this.f252281b).postOnAnimation(new j1((AdvancedChartsScreen) this.f252282c, 11));
                return;
            case 23:
                yc.a aVar = (yc.a) this.f252281b;
                vc.c cVar = (vc.c) this.f252282c;
                aVar.f.i(cVar);
                aVar.f312393g.i(cVar);
                return;
            default:
                int i = 0;
                while (true) {
                    try {
                        ((Runnable) this.f252281b).run();
                    } catch (Throwable th10) {
                        e0.v(kotlin.coroutines.g.f186406a, th10);
                    }
                    Runnable runnableM = ((zkm.h) this.f252282c).m();
                    if (runnableM == null) {
                        return;
                    }
                    try {
                        this.f252281b = runnableM;
                        i++;
                        if (i >= 16) {
                            zkm.h hVar = (zkm.h) this.f252282c;
                            if (zkm.g.e(hVar.f323108c, hVar)) {
                                zkm.h hVar2 = (zkm.h) this.f252282c;
                                zkm.g.d(hVar2.f323108c, hVar2, this);
                                return;
                            }
                        }
                    } catch (Throwable th11) {
                        zkm.h hVar3 = (zkm.h) this.f252282c;
                        synchronized (hVar3.f323109g) {
                            zkm.h.f323106h.decrementAndGet(hVar3);
                            throw th11;
                        }
                    }
                    break;
                }
                break;
        }
    }

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f252280a = i;
        this.f252282c = obj2;
        this.f252281b = obj3;
    }
}
