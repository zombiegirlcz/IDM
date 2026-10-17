package u3k;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.country_chooser.PaymentsCountryChooserScreen;
import d2k.l;
import gim.i;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ PaymentsCountryChooserScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(PaymentsCountryChooserScreen paymentsCountryChooserScreen, Continuation continuation) {
        super(2, continuation);
        this.v = paymentsCountryChooserScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.R.getValue();
        Intrinsics.h(model);
        h hVar = (h) fVar;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if (obj3 instanceof d2k.h) {
            hVar.C2(new l((d2k.h) obj3));
        } else {
            p0 p0Var = o0.f186429a;
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.s("Action not supported: modelType=", p0Var.b(RowDelegate.Model.class).m(), ", parcelType=", obj3 != null ? p0Var.b(obj3.getClass()).m() : null));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
