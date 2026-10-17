package k50;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class b4 extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j4 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b4(j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.v = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b4(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b4) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (k50.j4.U2(r0, r8) == r2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (k50.j4.U2(r0, r8) == r2) goto L29;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            k50.j4 r0 = r8.v
            cli.y r1 = r0.f181140w0
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r8.u
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L27
            if (r3 == r6) goto L23
            if (r3 == r5) goto L1f
            if (r3 != r4) goto L17
            yhm.o.b(r9)
            goto L84
        L17:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1f:
            yhm.o.b(r9)
            goto L6a
        L23:
            yhm.o.b(r9)
            goto L39
        L27:
            yhm.o.b(r9)
            n30.v r9 = r0.v
            com.revolut.chat.ui.messageslist.MessagesContract$InputData r3 = r0.o
            com.revolut.chat.domain.model.ChatFeed r3 = r3.f51174a
            r8.u = r6
            java.lang.Object r9 = r9.a(r3, r8)
            if (r9 != r2) goto L39
            goto L83
        L39:
            n30.p r9 = (n30.p) r9
            boolean r3 = r9 instanceof n30.q
            r6 = 0
            if (r3 == 0) goto L6d
            n30.q r9 = (n30.q) r9
            com.revolut.chat.domain.model.ChatMode r9 = r9.f211661a
            kotlin.jvm.internal.Ref$ObjectRef r3 = new kotlin.jvm.internal.Ref$ObjectRef
            r3.<init>()
            k1.a r4 = new k1.a
            r7 = 24
            r4.<init>(r3, r9, r7)
            r0.H2(r1, r4)
            java.lang.Object r9 = r3.f186409a
            java.util.UUID r9 = (java.util.UUID) r9
            if (r9 == 0) goto L61
            vkm.j2 r1 = r0.j0
            r1.getClass()
            r1.g(r6, r9)
        L61:
            r8.u = r5
            java.lang.Object r9 = k50.j4.U2(r0, r8)
            if (r9 != r2) goto L6a
            goto L83
        L6a:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L6d:
            boolean r3 = r9 instanceof n30.o
            if (r3 == 0) goto L87
            k50.l2 r9 = new k50.l2
            r3 = 29
            r9.<init>(r3)
            r0.H2(r1, r9)
            r8.u = r4
            java.lang.Object r9 = k50.j4.U2(r0, r8)
            if (r9 != r2) goto L84
        L83:
            return r2
        L84:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        L87:
            boolean r9 = r9 instanceof n30.p.a
            if (r9 == 0) goto La9
            k50.a4 r9 = new k50.a4
            r2 = 0
            r9.<init>(r2)
            r0.H2(r1, r9)
            mii.h r9 = new mii.h
            com.revolut.core.ui_kit.models.TextLocalisedClause r1 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r2 = com.revolut.chat_core.R$string.chat_error_something_went_wrong
            r3 = 14
            r1.<init>(r2, r6, r6, r3)
            java.lang.String r2 = "next_ticket_error"
            r9.<init>(r1, r2)
            kotlinx.coroutines.flow.Flow r9 = r0.X1(r9)
            return r9
        La9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.b4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
