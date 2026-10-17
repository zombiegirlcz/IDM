package k50;

import com.revolut.chat.ui.ratechatexpression.ChatRatingShotDelegate$ChatRatingShotParcel;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class e3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f181057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j4 f181058x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e3(int i, j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f181058x = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e3 e3Var = new e3(0, this.f181058x, continuation);
                e3Var.f181057w = obj2;
                return e3Var;
            case 1:
                e3 e3Var2 = new e3(1, this.f181058x, continuation);
                e3Var2.f181057w = obj2;
                return e3Var2;
            case 2:
                e3 e3Var3 = new e3(2, this.f181058x, continuation);
                e3Var3.f181057w = obj2;
                return e3Var3;
            case 3:
                return new e3(this.f181057w, this.f181058x, continuation);
            case 4:
                e3 e3Var4 = new e3(4, this.f181058x, continuation);
                e3Var4.f181057w = obj2;
                return e3Var4;
            case 5:
                e3 e3Var5 = new e3(5, this.f181058x, continuation);
                e3Var5.f181057w = obj2;
                return e3Var5;
            default:
                e3 e3Var6 = new e3(6, this.f181058x, continuation);
                e3Var6.f181057w = obj2;
                return e3Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e3) create((ChatRatingShotDelegate$ChatRatingShotParcel) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e3) create((s2) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e3) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e3) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((e3) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((e3) create((v20.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e3) create((UUID) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f5, code lost:
    
        if (r9.k == 0) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.e3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(Object obj2, j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.u = 3;
        this.f181058x = j4Var;
        this.f181057w = obj2;
    }
}
