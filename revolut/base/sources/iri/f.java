package iri;

import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements sri.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f168053a;

    public f(g gVar) {
        this.f168053a = gVar;
    }

    @Override // sri.l
    public final void c(NaviCommand command) {
        g gVar = this.f168053a;
        j jVar = gVar.f168055h;
        Intrinsics.checkNotNullParameter(command, "command");
        List listB = com.revolut.retail.core.navigation.a.b(command);
        FinishFlowCommand finishFlowCommand = FinishFlowCommand.f98647a;
        if (listB.contains(finishFlowCommand)) {
            i state = i.TERMINATING;
            jVar.getClass();
            Intrinsics.checkNotNullParameter(state, "state");
            jVar.f168059a = state;
            com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, gVar.k);
            e eVar = g.Companion;
            ArrayList arrayListA0 = d0.A0(listB, finishFlowCommand);
            eVar.getClass();
            int size = arrayListA0.size();
            NaviCommand naviCommand = size != 0 ? size != 1 ? new CompositeCommand(arrayListA0) : (NaviCommand) arrayListA0.get(0) : null;
            if (naviCommand != null) {
                jVar.getClass();
                Intrinsics.checkNotNullParameter(naviCommand, "naviCommand");
                jVar.f168060b = naviCommand;
            }
        }
    }
}
