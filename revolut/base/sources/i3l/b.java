package i3l;

import com.revolut.retail.core.navigation.NaviCommand;
import h3l.c;
import h3l.d;
import h3l.e;
import h3l.m;
import ho.n;
import ho.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import te0.j;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f158262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.a f158263c;
    public final t d;

    public b(e state, ln.a navigationCommandsDispatcher, t appAnalyticsTracker, int i) {
        this.f158261a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(appAnalyticsTracker, "appAnalyticsTracker");
                this.f158262b = state;
                this.f158263c = navigationCommandsDispatcher;
                this.d = appAnalyticsTracker;
                break;
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                Intrinsics.checkNotNullParameter(appAnalyticsTracker, "appAnalyticsTracker");
                this.f158262b = state;
                this.f158263c = navigationCommandsDispatcher;
                this.d = appAnalyticsTracker;
                break;
        }
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        switch (this.f158261a) {
            case 0:
                c action = (c) aVar;
                Intrinsics.checkNotNullParameter(action, "action");
                m mVar = (m) this.f158262b;
                j jVar = mVar.d;
                KProperty[] kPropertyArr = m.f149247j;
                n nVar = (n) w.O(jVar.getValue(mVar, kPropertyArr[2]));
                if (nVar != null) {
                    this.d.e2(nVar);
                }
                NaviCommand naviCommand = (NaviCommand) w.O(mVar.f149249c.getValue(mVar, kPropertyArr[1]));
                if (naviCommand != null) {
                    return this.f158263c.a(naviCommand);
                }
                pfm.m mVar2 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                return mVar2;
            default:
                d action2 = (d) aVar;
                Intrinsics.checkNotNullParameter(action2, "action");
                m mVar3 = (m) this.f158262b;
                j jVar2 = mVar3.f;
                KProperty[] kPropertyArr2 = m.f149247j;
                n nVar2 = (n) w.O(jVar2.getValue(mVar3, kPropertyArr2[4]));
                if (nVar2 != null) {
                    this.d.e2(nVar2);
                }
                NaviCommand naviCommand2 = (NaviCommand) w.O(mVar3.e.getValue(mVar3, kPropertyArr2[3]));
                if (naviCommand2 != null) {
                    return this.f158263c.a(naviCommand2);
                }
                pfm.m mVar4 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                return mVar4;
        }
    }
}
