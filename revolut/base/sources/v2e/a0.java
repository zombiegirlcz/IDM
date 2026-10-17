package v2e;

import com.revolut.data.model.Data;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import q2e.s0;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i0 f285694w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i, Continuation continuation, i0 i0Var) {
        super(2, continuation);
        this.u = i;
        this.f285694w = i0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a0 a0Var = new a0(0, continuation, this.f285694w);
                a0Var.v = obj2;
                return a0Var;
            case 1:
                a0 a0Var2 = new a0(1, continuation, this.f285694w);
                a0Var2.v = obj2;
                return a0Var2;
            case 2:
                a0 a0Var3 = new a0(2, continuation, this.f285694w);
                a0Var3.v = obj2;
                return a0Var3;
            case 3:
                a0 a0Var4 = new a0(3, continuation, this.f285694w);
                a0Var4.v = obj2;
                return a0Var4;
            case 4:
                a0 a0Var5 = new a0(4, continuation, this.f285694w);
                a0Var5.v = obj2;
                return a0Var5;
            default:
                a0 a0Var6 = new a0(5, continuation, this.f285694w);
                a0Var6.v = obj2;
                return a0Var6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((a0) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((a0) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((a0) create((s0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((a0) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((a0) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2e.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
