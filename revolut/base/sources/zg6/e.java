package zg6;

import aw0.n6;
import com.revolut.feature.external_accounts.api.navigation.InstitutionData;
import com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.MandateSetupBottomSheetController;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import we6.r0;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ MandateSetupBottomSheetController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(MandateSetupBottomSheetController mandateSetupBottomSheetController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = mandateSetupBottomSheetController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new e(this.v, continuation, 0);
            default:
                return new e(this.v, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        n6 n6Var = (n6) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((e) create(n6Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        int i = this.u;
        MandateSetupBottomSheetController mandateSetupBottomSheetController = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b bVar = (com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) mandateSetupBottomSheetController.h3();
                Object value = ((j2) bVar.u.f22677a).getValue();
                a aVar2 = value instanceof a ? (a) value : null;
                if (aVar2 != null) {
                    InstitutionData institutionData = bVar.o.f72425a;
                    if (institutionData instanceof InstitutionData.Institution) {
                        str = ((InstitutionData.Institution) institutionData).f72331a.f66107a;
                    } else {
                        if (!(institutionData instanceof InstitutionData.InstitutionId)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        str = ((InstitutionData.InstitutionId) institutionData).f72332a;
                    }
                    if (str != null) {
                        bVar.n2(new z9m.a(bVar, aVar2, str, (Continuation) null), new whi.b(6));
                    }
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.mandate.bottom_sheet.b) mandateSetupBottomSheetController.h3()).C2(r0.f296672a);
                return Unit.f186387a;
        }
    }
}
