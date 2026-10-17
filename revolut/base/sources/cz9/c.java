package cz9;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.payments.send_from_clipboard.impl.ui.selection.SendFromClipboardSelectionScreen;
import cul.n0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SendFromClipboardSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(SendFromClipboardSelectionScreen sendFromClipboardSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sendFromClipboardSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model rowModel = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        g gVar = (g) this.v.R.getValue();
        Intrinsics.h(rowModel);
        i iVar = (i) gVar;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(rowModel, "rowModel");
        Object obj3 = rowModel.u;
        fz9.c cVar = obj3 instanceof fz9.c ? (fz9.c) obj3 : null;
        if (cVar != null) {
            if (cVar instanceof fz9.b) {
                iVar.H2(iVar.o, new n0(cVar, 24));
            } else {
                if (!(cVar instanceof fz9.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                iVar.C2(new sy9.b(((fz9.a) cVar).f139135a));
            }
        }
        return Unit.f186387a;
    }
}
