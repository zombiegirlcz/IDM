package x42;

import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import com.revolut.feature.apm.core.ui.impl.ui.transfer.amount_settings.TransferSettingsScreen;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ TransferSettingsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(TransferSettingsScreen transferSettingsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = transferSettingsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.v, continuation, 0);
            default:
                return new j(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Unit unit = (Unit) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(unit, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        TransferSettingsScreen transferSettingsScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                transferSettingsScreen.m2().onBackPressed();
                break;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l lVar = (l) ((g) transferSettingsScreen.S.getValue());
                a aVar3 = (a) ((j2) lVar.f302783p.f22677a).getValue();
                ApmTransferPayerSettings apmTransferPayerSettings = lVar.o.f62451a;
                boolean z = aVar3.f302772a.f302778c;
                boolean z3 = aVar3.f302773b.f302779c;
                LocalDate selectedExpiryDate = aVar3.f302774c;
                LocalDate minExpiryDate = apmTransferPayerSettings.d;
                LocalDate maxExpiryDate = apmTransferPayerSettings.e;
                Intrinsics.checkNotNullParameter(selectedExpiryDate, "selectedExpiryDate");
                Intrinsics.checkNotNullParameter(minExpiryDate, "minExpiryDate");
                Intrinsics.checkNotNullParameter(maxExpiryDate, "maxExpiryDate");
                lVar.C2(new b(new ApmTransferPayerSettings(z, z3, selectedExpiryDate, minExpiryDate, maxExpiryDate)));
                break;
        }
        return Unit.f186387a;
    }
}
