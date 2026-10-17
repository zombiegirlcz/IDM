package uh0;

import et0.a0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import jpc.e;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProducerScope;
import xg0.i;
import xg0.k;
import xg0.m;
import xg0.n;
import xg0.o;
import xg0.p;
import xg0.q;
import xg0.r;
import xg0.t;
import yhm.m;
import zhm.d0;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements tc.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc.b f280052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f280053b;

    public d(vc.b installManager, e listener) {
        Intrinsics.checkNotNullParameter(installManager, "installManager");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f280052a = installManager;
        this.f280053b = listener;
    }

    @Override // tc.a
    public final void a(Object obj2) throws Throwable {
        Object objA;
        vc.c state = (vc.c) obj2;
        Intrinsics.checkNotNullParameter(state, "state");
        p nVar = null;
        switch (state.f287572b) {
            case 2:
                nVar = new n(state.d, state.e);
                break;
            case 3:
                nVar = m.f305471a;
                break;
            case 4:
                nVar = r.f305477a;
                break;
            case 5:
                nVar = q.f305476a;
                break;
            case 6:
                nVar = new o(2, null, c8g.a.B(state.f287573c));
                break;
            case 7:
                nVar = k.f305469a;
                break;
            case 8:
                nVar = new t(new b(this.f280052a, state));
                break;
        }
        if (nVar != null) {
            e eVar = this.f280053b;
            int i = state.f287571a;
            List list = state.f;
            ArrayList arrayList = list != null ? new ArrayList(list) : new ArrayList();
            Intrinsics.checkNotNullExpressionValue(arrayList, "moduleNames(...)");
            i state2 = new i(i, d0.i1(arrayList), nVar);
            Intrinsics.checkNotNullParameter(state2, "state");
            if (nVar.equals(q.f305476a)) {
                a0 a0Var = ((oi0.b) eVar.f177256b).f225410b;
                a0Var.getClass();
                try {
                    m.Companion companion = yhm.m.INSTANCE;
                    if (a0Var.f129006a <= 34) {
                        synchronized (a0Var.e) {
                            try {
                                if (((Boolean) ((Lazy) a0Var.d).getValue()).booleanValue() && ((LinkedHashSet) a0Var.f).add(Integer.valueOf(i))) {
                                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                                    rd0.d.b(rd0.c.WARNING, "NativeLibraryPathPatcher", "Starting native library path repair", null, null, 16);
                                    ((oi0.c) a0Var.f129008c).invoke((ClassLoader) a0Var.f129007b);
                                }
                                Unit unit = Unit.f186387a;
                            } finally {
                            }
                        }
                    }
                    objA = Unit.f186387a;
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = yhm.m.INSTANCE;
                    objA = yhm.o.a(th10);
                }
                Throwable thA = yhm.m.a(objA);
                if (thA != null) {
                    hx7.e.n(thA);
                }
            }
            ((oi0.b) eVar.f177256b).d.k(new xg0.e(state2.f305467b, state2.f305468c));
            Integer num = (Integer) ((Ref$ObjectRef) eVar.f177257c).f186409a;
            if (num == null || state2.f305466a == num.intValue()) {
                oi0.b.a((oi0.b) eVar.f177256b, (ProducerScope) eVar.d, state2.f305468c);
            }
        }
    }
}
