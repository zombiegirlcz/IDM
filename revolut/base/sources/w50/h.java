package w50;

import com.revolut.chat.domain.model.TranscriptDateRange;
import com.revolut.chat.ui.transcript.ChatTranscriptPeriodCalendarBottomSheetController;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ChatTranscriptPeriodCalendarBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ChatTranscriptPeriodCalendarBottomSheetController chatTranscriptPeriodCalendarBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = chatTranscriptPeriodCalendarBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.v, continuation, 0);
            default:
                return new h(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        ChatTranscriptPeriodCalendarBottomSheetController chatTranscriptPeriodCalendarBottomSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                i iVar = (i) chatTranscriptPeriodCalendarBottomSheetController.S.getValue();
                vim.d dVar = ((a) ((j2) iVar.f294660p.f22677a).getValue()).f294650a;
                if (dVar != null) {
                    iVar.C2(new c(new TranscriptDateRange((LocalDate) dVar.getStart(), (LocalDate) dVar.b())));
                }
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((i) chatTranscriptPeriodCalendarBottomSheetController.S.getValue()).B2();
                break;
        }
        return Unit.f186387a;
    }
}
