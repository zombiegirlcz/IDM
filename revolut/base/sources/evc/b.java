package evc;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.security_hub.impl.ui.manage_merchants.ManageMerchantsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ManageMerchantsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ManageMerchantsScreen manageMerchantsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = manageMerchantsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        n nVar = (n) this.v.P.getValue();
        String listId = model.f53228a;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        switch (listId.hashCode()) {
            case -605941502:
                if (listId.equals("TRUSTED_ENTITIES_CELL_ID")) {
                    nVar.C2(f.f129769a);
                }
                break;
            case -252975364:
                if (listId.equals("TRUSTED_MERCHANTS_CELL_ID")) {
                    nVar.C2(g.f129770a);
                }
                break;
            case -31414036:
                if (listId.equals("GAMBLING_BLOCK_CELL_ID")) {
                    nVar.I2();
                }
                break;
            case 1528285209:
                if (listId.equals("BLOCKED_PAYMENTS_CELL_ID")) {
                    nVar.C2(e.f129768a);
                }
                break;
        }
        return Unit.f186387a;
    }
}
