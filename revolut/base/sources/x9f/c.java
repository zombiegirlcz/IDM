package x9f;

import cli.y;
import com.revolut.feature.trading.transfer.investments.impl.ui.transfer_in_asset_selection.screens.number_of_shares.NumberOfSharesScreen;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ NumberOfSharesScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(NumberOfSharesScreen numberOfSharesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = numberOfSharesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.v, continuation, 0);
            default:
                return new c(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        BigDecimal bigDecimal;
        int i = this.u;
        NumberOfSharesScreen numberOfSharesScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((m) numberOfSharesScreen.e3()).B2();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m mVar = (m) numberOfSharesScreen.e3();
                y yVar = mVar.f303710q;
                if (((h) ((j2) yVar.f22677a).getValue()).f303705c && (bigDecimal = ((h) ((j2) yVar.f22677a).getValue()).f303703a) != null) {
                    mVar.C2(new i(bigDecimal.intValue()));
                }
                break;
        }
        return Unit.f186387a;
    }
}
