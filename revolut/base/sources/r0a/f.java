package r0a;

import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.screen.TransferOnlyChatScreen;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TransferOnlyChatScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TransferOnlyChatScreen transferOnlyChatScreen, Continuation continuation) {
        super(2, continuation);
        this.v = transferOnlyChatScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((ChatBubbleDelegate.ButtonModel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        NaviCommand featureCommand;
        ChatBubbleDelegate.ButtonModel buttonModel = (ChatBubbleDelegate.ButtonModel) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        o oVarD = this.v.d();
        Intrinsics.h(buttonModel);
        y yVar = (y) oVarD;
        yVar.getClass();
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        m0a.g gVar = yVar.f250758q;
        ChatTransferRecipient chatTransferRecipient = ((i) ((j2) yVar.E.f22677a).getValue()).f250735b;
        m0a.k kVar = (m0a.k) gVar;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(chatTransferRecipient, "chatTransferRecipient");
        Intrinsics.checkNotNullParameter(buttonModel, "buttonModel");
        Object obj3 = buttonModel.d;
        cu9.b chatButtonParcel = obj3 instanceof cu9.b ? (cu9.b) obj3 : null;
        if (chatButtonParcel != null) {
            if (chatButtonParcel instanceof cu9.d) {
                cu9.d dVar = (cu9.d) chatButtonParcel;
                ((g6k.r) kVar.o).c3(vz9.q.a(dVar.f108918b), dVar.f108917a);
            } else {
                kVar.f201124l.getClass();
                Intrinsics.checkNotNullParameter(chatButtonParcel, "chatButtonParcel");
                if (chatButtonParcel instanceof cu9.k) {
                    featureCommand = new FeatureCommand(new TransactionsFeatureConfig.Details(ofm.q.P(((cu9.k) chatButtonParcel).f108926a), null, null, null, 126));
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(a0.d.l(chatButtonParcel.getClass(), "Transfer only chat doesn't support button action handling for "));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                    featureCommand = DummyCommand.f98635a;
                }
                kVar.A2(u0.b(featureCommand));
            }
        }
        return Unit.f186387a;
    }
}
