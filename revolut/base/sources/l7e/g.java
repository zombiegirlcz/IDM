package l7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.PaymentLinkWidgetDelegate;
import com.revolut.feature.subaccount.api.models.Subaccount;
import com.revolut.feature.subaccount.impl.product.widgets.links.SubaccountLinkParcel;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreen;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreenContract$InputData;
import com.revolut.feature.subaccount.impl.ui.qr_link.SubaccountQRLinkScreenContract$SubaccountInfo;
import com.revolut.kompot.common.ModalDestination;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BaseDraggableWidgetDelegate.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f192570w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(BaseDraggableWidgetDelegate.a aVar, h hVar, Continuation continuation) {
        super(2, continuation);
        this.v = aVar;
        this.f192570w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, this.f192570w, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        BaseDraggableWidgetDelegate.Model model = ((com.revolut.core.ui_kit.delegates.widgets.i) this.v).f55375c;
        PaymentLinkWidgetDelegate.Model model2 = model instanceof PaymentLinkWidgetDelegate.Model ? (PaymentLinkWidgetDelegate.Model) model : null;
        if (model2 == null) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SubaccountLinkWidgetEventHandler", "Unknown event model type ".concat(model.getClass().getName()), null, h0Var);
            return Unit.f186387a;
        }
        Object obj3 = model2.f55203g;
        SubaccountLinkParcel parcel = obj3 instanceof SubaccountLinkParcel ? (SubaccountLinkParcel) obj3 : null;
        if (parcel == null) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "SubaccountLinkWidgetEventHandler", j6.a.q("Unknown model parcel ", obj3 != null ? obj3.getClass().getName() : null), null, h0Var2);
            return Unit.f186387a;
        }
        Subaccount subaccount = parcel.f88984a;
        uc7.a aVar2 = this.f192570w.f192571a;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        aVar2.b(new fc7.d(new com.revolut.kompot.common.b(new SubaccountQRLinkScreen(new SubaccountQRLinkScreenContract$InputData(new SubaccountQRLinkScreenContract$SubaccountInfo(subaccount.c(), subaccount.getName(), subaccount.getF88959a().f234881a, subaccount.getCurrency()), parcel.f88985b)), ModalDestination.Style.POPUP.f98311a, 4)));
        return Unit.f186387a;
    }
}
