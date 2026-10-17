package llb;

import aw0.h;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.screens.modal_sheet.ModalInfoSheetScreen;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ModalInfoSheetScreen v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ aw0.i f196695w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(ModalInfoSheetScreen modalInfoSheetScreen, aw0.i iVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = modalInfoSheetScreen;
        this.f196695w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, this.f196695w, continuation, 0);
            case 1:
                return new d(this.v, this.f196695w, continuation, 1);
            default:
                return new d(this.v, this.f196695w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        aw0.i iVar = this.f196695w;
        ModalInfoSheetScreen modalInfoSheetScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                modalInfoSheetScreen.e3().I2(((aw0.e) iVar).d.k, "");
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                modalInfoSheetScreen.e3().I2(((h) iVar).f10330b.k, "");
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                modalInfoSheetScreen.e3().I2(((h) iVar).f10331c.k, "");
                break;
        }
        return Unit.f186387a;
    }
}
