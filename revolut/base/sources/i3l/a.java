package i3l;

import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_screen.StatusViewScreenContract$ClauseClickCommand;
import h3l.e;
import h3l.m;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import te0.w;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements mm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f158258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f158259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ln.a f158260c;

    public a(e state, ln.a navigationCommandsDispatcher, int i) {
        this.f158258a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                this.f158259b = state;
                this.f158260c = navigationCommandsDispatcher;
                break;
            default:
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(navigationCommandsDispatcher, "navigationCommandsDispatcher");
                this.f158259b = state;
                this.f158260c = navigationCommandsDispatcher;
                break;
        }
    }

    @Override // mm.b
    public final efm.b a3(mm.a aVar) {
        Object next;
        NaviCommand naviCommand;
        switch (this.f158258a) {
            case 0:
                h3l.a action = (h3l.a) aVar;
                Intrinsics.checkNotNullParameter(action, "action");
                m mVar = (m) this.f158259b;
                List list = (List) w.O(mVar.f149251h.getValue(mVar, m.f149247j[6]));
                pfm.m mVar2 = pfm.m.f235744a;
                if (list == null) {
                    Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                    return mVar2;
                }
                Iterator it8 = list.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((StatusViewScreenContract$ClauseClickCommand) next).f104330a, action.f149236b.f275445a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                StatusViewScreenContract$ClauseClickCommand statusViewScreenContract$ClauseClickCommand = (StatusViewScreenContract$ClauseClickCommand) next;
                if (statusViewScreenContract$ClauseClickCommand != null && (naviCommand = statusViewScreenContract$ClauseClickCommand.f104331b) != null) {
                    return this.f158260c.a(naviCommand);
                }
                Intrinsics.checkNotNullExpressionValue(mVar2, "complete(...)");
                return mVar2;
            default:
                Intrinsics.checkNotNullParameter((h3l.b) aVar, "action");
                m mVar3 = (m) this.f158259b;
                NaviCommand naviCommand2 = (NaviCommand) w.O(mVar3.f149250g.getValue(mVar3, m.f149247j[5]));
                if (naviCommand2 != null) {
                    return this.f158260c.a(naviCommand2);
                }
                pfm.m mVar4 = pfm.m.f235744a;
                Intrinsics.checkNotNullExpressionValue(mVar4, "complete(...)");
                return mVar4;
        }
    }
}
