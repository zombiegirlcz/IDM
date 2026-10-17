package s1a;

import aw0.n6;
import cli.y;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.bottom_sheet.SplitBillLinkBottomSheetController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ryd.k;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ SplitBillLinkBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(SplitBillLinkBottomSheetController splitBillLinkBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = splitBillLinkBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            case 1:
                return new e(this.v, continuation, 1);
            case 2:
                return new e(this.v, continuation, 2);
            default:
                return new e(this.v, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((e) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        SplitBillLinkBottomSheetController splitBillLinkBottomSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarM3 = splitBillLinkBottomSheetController.m3();
                y yVar = gVarM3.f259120p;
                if (((a) ((j2) yVar.f22677a).getValue()).f259115a < 30) {
                    gVarM3.H2(yVar, new k(27));
                }
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarM32 = splitBillLinkBottomSheetController.m3();
                y yVar2 = gVarM32.f259120p;
                if (((a) ((j2) yVar2.f22677a).getValue()).f259115a > 2) {
                    gVarM32.H2(yVar2, new k(28));
                }
                break;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVarM33 = splitBillLinkBottomSheetController.m3();
                a aVar4 = (a) ((j2) gVarM33.f259120p.f22677a).getValue();
                j jVar = gVarM33.o;
                dj0.d dVar = aVar4.f259116b;
                int i2 = aVar4.f259115a;
                jVar.getClass();
                gVarM33.C2(new c(j.a(i2, dVar)));
                break;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                splitBillLinkBottomSheetController.m3().C2(b.f259117b);
                break;
        }
        return Unit.f186387a;
    }
}
