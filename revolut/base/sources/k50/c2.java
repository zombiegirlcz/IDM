package k50;

import com.revolut.chat.ui.messageslist.MessagesScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class c2 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ MessagesScreen f181042w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c2(MessagesScreen messagesScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f181042w = messagesScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c2 c2Var = new c2(this.f181042w, continuation, 0);
                c2Var.v = obj2;
                return c2Var;
            case 1:
                c2 c2Var2 = new c2(this.f181042w, continuation, 1);
                c2Var2.v = obj2;
                return c2Var2;
            case 2:
                c2 c2Var3 = new c2(this.f181042w, continuation, 2);
                c2Var3.v = obj2;
                return c2Var3;
            case 3:
                c2 c2Var4 = new c2(this.f181042w, continuation, 3);
                c2Var4.v = obj2;
                return c2Var4;
            default:
                c2 c2Var5 = new c2(this.f181042w, continuation, 4);
                c2Var5.v = obj2;
                return c2Var5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c2) create((oq0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c2) create((oq0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c2) create((oq0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c2) create((oq0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c2) create((uh0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e8  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.c2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
