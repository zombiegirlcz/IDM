package r40;

import com.revolut.chat.domain.model.TranscriptIdentifier;
import com.revolut.chat.ui.chatlist.ChatListScreen;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.Instant;

/* JADX INFO: loaded from: classes19.dex */
public final class y extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public final /* synthetic */ ChatListScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(ChatListScreen chatListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = chatListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.v, continuation, 0);
            case 1:
                return new y(this.v, continuation, 1);
            default:
                return new y(this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((y) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((y) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((y) create((Integer) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        u40.d dVar;
        Instant instantB;
        int i = this.u;
        Object obj3 = null;
        ChatListScreen chatListScreen = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                chatListScreen.m2().onBackPressed();
                break;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w50.k kVar = ((x0) chatListScreen.T2()).f251380t;
                kVar.b3(TranscriptIdentifier.AllChats.f51078a);
                kVar.Z2(null);
                break;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x0 x0Var = (x0) chatListScreen.T2();
                List list = (List) ((a) x0Var.t2()).f251319a.f251337b.getContent();
                if (list != null) {
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        u40.d dVar2 = (u40.d) objPrevious;
                        Intrinsics.checkNotNullParameter(dVar2, "<this>");
                        if ((dVar2 instanceof u40.b) || (dVar2 instanceof u40.a)) {
                            obj3 = objPrevious;
                            dVar = (u40.d) obj3;
                            if (dVar != null && (instantB = dVar.b()) != null) {
                                x0Var.C.k(new Pair(instantB, Boolean.FALSE));
                            }
                        }
                    }
                    dVar = (u40.d) obj3;
                    if (dVar != null) {
                        x0Var.C.k(new Pair(instantB, Boolean.FALSE));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
