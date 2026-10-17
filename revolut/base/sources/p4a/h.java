package p4a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.contacts.api.navigation.ContactsFeatureConfig;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.api.transfer.TransferBridgeFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;
import zhm.h0;
import zhm.y0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ RowDelegate.Model u;
    public final /* synthetic */ j v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(RowDelegate.Model model, Continuation continuation, j jVar) {
        super(1, continuation);
        this.u = model;
        this.v = jVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new h(this.u, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((h) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        RowDelegate.Model model = this.u;
        Object obj3 = model.u;
        c cVar = c.SEARCH;
        j jVar = this.v;
        if (obj3 == cVar) {
            jVar.C1(new BridgeDestination(new FeatureCommand(new TransferBridgeFeatureConfig.PaymentsSearch(y0.b(WhoToTransferFilter.Revolut.f80005a), null, null, 14))));
        } else if (obj3 == c.ADD) {
            jVar.C1(new BridgeDestination(new FeatureCommand(new ContactsFeatureConfig.AddContact.ByPhoneOrEmail(com.revolut.feature.contacts.api.navigation.a.CHAT, null))));
        } else if (obj3 == c.SCAN) {
            jVar.C1(new BridgeDestination(new FeatureCommand(new PaymentProfileFeatureConfig(ew9.a.QR_SCANNER))));
        } else {
            IllegalStateException illegalStateException = new IllegalStateException(a0.d.m(model.u, "Item is not supported: "));
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        }
        return Unit.f186387a;
    }
}
