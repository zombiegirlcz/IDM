package pkj;

import cli.y;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreen;
import dej.q0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ EsimMobilePlanNumberTransferScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(EsimMobilePlanNumberTransferScreen esimMobilePlanNumberTransferScreen, Continuation continuation) {
        super(2, continuation);
        this.v = esimMobilePlanNumberTransferScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((PhoneEditorDelegate.PhoneData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        wi0.b bVar;
        PhoneEditorDelegate.PhoneData phoneData = (PhoneEditorDelegate.PhoneData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        k kVar = (k) this.v.R.getValue();
        String phoneNumber = phoneData.f52896b;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        y yVar = kVar.f237208r;
        q0 q0Var = ((e) ((j2) yVar.f22677a).getValue()).f237197a;
        if (q0Var != null && (bVar = q0Var.f113624c) != null) {
            kVar.H2(yVar, new pj3.b(kVar.f237206p.r0(phoneNumber, bVar), kVar, 4));
        }
        return Unit.f186387a;
    }
}
