package pj7;

import aw0.n6;
import cli.y;
import com.revolut.feature.insurance.impl.ui.cfac.claim.bottom_sheet.screen.CFACInsuranceBottomSheetScreen;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ CFACInsuranceBottomSheetScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(CFACInsuranceBottomSheetScreen cFACInsuranceBottomSheetScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = cFACInsuranceBottomSheetScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.v, continuation, 0);
            default:
                return new d(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((d) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        CFACInsuranceBottomSheetScreen cFACInsuranceBottomSheetScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((o) cFACInsuranceBottomSheetScreen.m3()).C2(f.f236681a);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) cFACInsuranceBottomSheetScreen.m3();
                y yVar = oVar.f236689p;
                j2 j2Var = (j2) yVar.f22677a;
                j2 j2Var2 = (j2) yVar.f22677a;
                switch (n.f236688a[((e) j2Var.getValue()).f236679b.ordinal()]) {
                    case 1:
                        oVar.C2(h.f236683a);
                        break;
                    case 2:
                        File file = ((e) j2Var2.getValue()).f;
                        if (file == null) {
                            r6.b.D("Remove document configuration requires a valid document to remove.");
                        } else {
                            oVar.C2(new g(file));
                        }
                        break;
                    case 3:
                        oVar.C2(new j(true, ((e) j2Var2.getValue()).f236678a));
                        break;
                    case 4:
                        oVar.C2(new j(false, ((e) j2Var2.getValue()).f236678a));
                        break;
                    case 5:
                    case 6:
                        r6.b.D("Submit button dialogs should not be available for payment canceller and purpose configurations.");
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
