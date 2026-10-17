package e0a;

import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class s extends gim.i implements Function1 {
    public String u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MessageType f121521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ w f121522x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(MessageType messageType, w wVar, Continuation continuation) {
        super(1, continuation);
        this.f121521w = messageType;
        this.f121522x = wVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.f121521w, this.f121522x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            String str2 = ((MessageType.SalaryReferral) this.f121521w).f.f79558a;
            wli.x xVar = this.f121522x.f121536w;
            Boolean bool = Boolean.FALSE;
            this.u = str2;
            this.v = 1;
            obj2 = lg0.b.x1(xVar, str2, null, bool, this, 2);
            if (obj2 == aVar) {
                return aVar;
            }
            str = str2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = this.u;
            yhm.o.b(obj2);
        }
        if (!((Boolean) obj2).booleanValue()) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "PeerToPeerMessageClicksExtensionImpl", p.a.p("Error while handling deeplink: [", str, "]"), null, h0Var);
        }
        return Unit.f186387a;
    }
}
