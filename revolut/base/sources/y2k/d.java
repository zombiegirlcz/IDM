package y2k;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.new_zealand_transfer_note.NewZealandTransferNoteScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ NewZealandTransferNoteScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(NewZealandTransferNoteScreen newZealandTransferNoteScreen, Continuation continuation) {
        super(2, continuation);
        this.v = newZealandTransferNoteScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Z.getValue();
        String listId = textData.f52597a;
        String noteItem = textData.f52598b.toString();
        a aVar2 = (a) hVar;
        aVar2.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(noteItem, "noteItem");
        int iHashCode = listId.hashCode();
        int i = 16;
        if (iHashCode != -1278042128) {
            if (iHashCode != -617931000) {
                if (iHashCode == -331605829 && listId.equals("LIST_ID_PARTICULARS")) {
                    aVar2.x2(new xyc.j(new xf0.h(noteItem, 20), aVar2, i));
                }
            } else if (listId.equals("LIST_ID_REFERENCE")) {
                aVar2.x2(new xyc.j(new xf0.h(noteItem, 22), aVar2, i));
            }
        } else if (listId.equals("LIST_ID_CODE")) {
            aVar2.x2(new xyc.j(new xf0.h(noteItem, 21), aVar2, i));
        }
        return Unit.f186387a;
    }
}
