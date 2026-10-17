package z0m;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class c extends kotlin.jvm.internal.u implements Function1 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f318644h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, int i) {
        super(1);
        this.f = i;
        this.f318644h = obj2;
        this.i = obj3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f) {
            case 0:
                i iVar = (i) obj2;
                e eVar = (e) this.f318644h;
                if (iVar != null) {
                    eVar.f131307a.add(iVar);
                }
                HashMap map = new HashMap();
                map.put("event", eVar);
                a1m.d.b("SnowplowInstallTracking", map);
                d dVar = e.Companion;
                Context context = (Context) this.i;
                dVar.getClass();
                SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(context).edit();
                if (editorEdit != null) {
                    editorEdit.putString("installed_before", "YES");
                }
                if (editorEdit != null) {
                    editorEdit.apply();
                }
                return Unit.f186387a;
            default:
                v tracker = (v) obj2;
                Intrinsics.checkNotNullParameter(tracker, "tracker");
                tracker.i = (s) this.f318644h;
                String strV = ((q) this.i).e().v();
                if (!tracker.f318670b) {
                    tracker.f318684x = strV;
                }
                boolean zC = ((q) this.i).e().c();
                if (!tracker.f318670b) {
                    tracker.k = zC;
                }
                i1m.b bVarE = ((q) this.i).e().e();
                Intrinsics.checkNotNullParameter(bVarE, "<set-?>");
                tracker.f318675l = bVarE;
                i1m.c level = ((q) this.i).e().m();
                Intrinsics.checkNotNullParameter(level, "level");
                if (!tracker.f318670b) {
                    tracker.f318676m = level;
                }
                ((q) this.i).e().n();
                boolean z = tracker.f318670b;
                boolean zU = ((q) this.i).e().u();
                synchronized (tracker) {
                    try {
                        tracker.z = zU;
                        x0m.f fVar = tracker.f318674j;
                        if (fVar != null && !zU) {
                            tracker.b();
                            tracker.f318674j = null;
                        } else if (fVar == null && zU) {
                            Runnable[] runnableArr = {null, null, null, null};
                            Runnable[] runnableArr2 = tracker.f318685y;
                            tracker.f318674j = x0m.f.Companion.a(tracker.f318671c, tracker.f318677n, tracker.o, tracker.f318679q, runnableArr2.length == 4 ? runnableArr2 : runnableArr, tracker.f318678p);
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                }
                boolean zB = ((q) this.i).e().b();
                if (!tracker.f318670b) {
                    tracker.C = zB;
                }
                boolean zO = ((q) this.i).e().o();
                if (!tracker.f318670b) {
                    tracker.B = zO;
                }
                boolean zI = ((q) this.i).e().i();
                if (!tracker.f318670b) {
                    tracker.A = zI;
                }
                if (((q) this.i).e().d()) {
                    tracker.a(new y0m.c());
                } else {
                    y0m.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter("DeepLinkContext", "identifier");
                    tracker.d.d("DeepLinkContext");
                }
                if (((q) this.i).e().r()) {
                    tracker.a(new w0m.c());
                } else {
                    w0m.c.Companion.getClass();
                    Intrinsics.checkNotNullParameter("ScreenContext", "identifier");
                    tracker.d.d("ScreenContext");
                }
                boolean zT = ((q) this.i).e().t();
                if (!tracker.f318670b) {
                    tracker.v = zT;
                }
                if (((q) this.i).e().s()) {
                    tracker.a(new w0m.h());
                } else {
                    w0m.h.Companion.getClass();
                    Intrinsics.checkNotNullParameter("ScreenSummaryContext", "identifier");
                    tracker.d.d("ScreenSummaryContext");
                }
                boolean zL = ((q) this.i).e().l();
                if (!tracker.f318670b) {
                    tracker.f318682t = zL;
                }
                boolean zK = ((q) this.i).e().k();
                if (!tracker.f318670b) {
                    tracker.u = zK;
                }
                boolean zH = ((q) this.i).e().h();
                if (!tracker.f318670b) {
                    tracker.f318680r = zH;
                }
                boolean zF = ((q) this.i).e().f();
                if (!tracker.f318670b) {
                    tracker.f318681s = zF;
                }
                boolean zW = ((q) this.i).e().w();
                boolean z3 = tracker.f318670b;
                if (!z3) {
                    tracker.f318683w = zW;
                } else if (tracker.f318683w != zW && z3) {
                    tracker.f318683w = zW;
                    x0m.f fVar2 = tracker.f318674j;
                    if (fVar2 != null) {
                        fVar2.f301666g.set(true);
                    }
                }
                String strV2 = ((q) this.i).e().v();
                if (!tracker.f318670b) {
                    tracker.f318684x = strV2;
                }
                c1m.c cVar = ((q) this.i).f318665n;
                if (cVar == null) {
                    Intrinsics.r("gdprConfiguration");
                    throw null;
                }
                c1m.c cVar2 = cVar.f20543a;
                if (cVar2 != null) {
                    tracker.D = new u0m.a(cVar2.a(), cVar2.c(), cVar2.d(), cVar2.b());
                }
                j1m.c cVarA = ((q) this.i).d().a();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                long jA = cVarA.a(timeUnit);
                if (!tracker.f318670b) {
                    tracker.o = jA;
                }
                long jA2 = ((q) this.i).d().c().a(timeUnit);
                if (!tracker.f318670b) {
                    tracker.f318677n = jA2;
                }
                boolean zB2 = ((q) this.i).d().b();
                if (!tracker.f318670b) {
                    tracker.f318678p = zB2;
                    x0m.f fVar3 = tracker.f318674j;
                    if (fVar3 != null) {
                        fVar3.f301663a = zB2;
                    }
                }
                Iterator it8 = ((q) this.i).o.iterator();
                if (!it8.hasNext()) {
                    return Unit.f186387a;
                }
                if (it8.next() != null) {
                    throw new ClassCastException();
                }
                Intrinsics.checkNotNullParameter(null, "<this>");
                throw null;
        }
    }
}
