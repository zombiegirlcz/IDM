package sui;

import bti.p;
import cli.y;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftConfig;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTerminal;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreen;
import com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.AsftTerminalSelectionScreenContract$ModalStep;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AsftTerminalSelectionScreen f265776w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(AsftTerminalSelectionScreen asftTerminalSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f265776w = asftTerminalSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f265776w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f265776w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        AsftTerminal asftTerminal = (AsftTerminal) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(asftTerminal, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        AsftTerminal asftTerminal;
        Object next;
        int i = this.u;
        AsftTerminalSelectionScreen asftTerminalSelectionScreen = this.f265776w;
        switch (i) {
            case 0:
                AsftTerminal asftTerminal2 = (AsftTerminal) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVarE3 = asftTerminalSelectionScreen.R2();
                String terminalId = asftTerminal2.f98737a;
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b bVar = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b) jVarE3;
                bVar.getClass();
                Intrinsics.checkNotNullParameter(terminalId, "terminalId");
                y yVar = bVar.u;
                AsftConfig asftConfig = (AsftConfig) ((h) ((j2) yVar.f22677a).getValue()).f265777a.getContent();
                if (asftConfig == null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "AsftTerminalSelectionScreenModel", "Can not show price info modal: ASFT config is null in the screen state", null, h0Var);
                } else {
                    List list = (List) ((h) ((j2) yVar.f22677a).getValue()).f265778b.getContent();
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (Intrinsics.f(((AsftTerminal) next).f98737a, terminalId)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        asftTerminal = (AsftTerminal) next;
                    } else {
                        asftTerminal = null;
                    }
                    if (asftTerminal == null) {
                        h0 h0Var2 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "AsftTerminalSelectionScreenModel", j6.a.q("Can not select terminal with id ", terminalId), null, h0Var2);
                    } else {
                        oki.h.v2(bVar.v, new AsftTerminalSelectionScreenContract$ModalStep.AboutPriceDialog(asftConfig, asftTerminal), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                    }
                }
                break;
            default:
                AsftTerminal terminal = (AsftTerminal) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b bVar2 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.terminal_selection.b) asftTerminalSelectionScreen.R2();
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(terminal, "terminal");
                p pVar = terminal.f98745n;
                if (pVar == p.ALLOWED) {
                    bVar2.C2(new i(bVar2.o.f98868a, terminal.f98737a));
                } else {
                    String str = terminal.f98744m;
                    if (str == null) {
                        r6.b.D("overriddenPlanName must be present in Terminal if bookingAvailability != ALLOWED");
                    } else {
                        oki.h.v2(bVar2.v, new AsftTerminalSelectionScreenContract$ModalStep.FreeAccessInfo(str, pVar == p.ALTERNATIVE_BOOKING), ModalDestination.Style.POPUP.f98311a);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
