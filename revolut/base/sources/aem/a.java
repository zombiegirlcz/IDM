package aem;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes23.dex */
public final class a extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3687w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f3688x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f3689y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, Continuation continuation) {
        super(i, continuation);
        this.u = 1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        switch (this.u) {
            case 0:
                a aVar = new a((Function2) this.f3689y, (Continuation) obj4, 0);
                aVar.v = (sem.f) obj2;
                aVar.f3688x = (hem.c) obj3;
                return aVar.invokeSuspend(Unit.f186387a);
            case 1:
                a aVar2 = new a(3, (Continuation) obj4);
                aVar2.f3688x = (sem.f) obj2;
                aVar2.f3689y = (hem.c) obj3;
                return aVar2.invokeSuspend(Unit.f186387a);
            case 2:
                a aVar3 = new a((bem.b) this.f3689y, (Continuation) obj4, 2);
                aVar3.v = (bem.i) obj2;
                aVar3.f3688x = (fem.d) obj3;
                return aVar3.invokeSuspend(Unit.f186387a);
            case 3:
                a aVar4 = new a((oim.o) this.f3689y, (Continuation) obj4, 3);
                aVar4.f3688x = (sem.f) obj2;
                return aVar4.invokeSuspend(Unit.f186387a);
            default:
                a aVar5 = new a((vdm.b) this.f3689y, (Continuation) obj4, 4);
                aVar5.v = (sem.f) obj2;
                aVar5.f3688x = obj3;
                return aVar5.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:71|134|(1:(1:(3:75|106|107)(2:76|77))(3:78|79|80))(2:83|(4:85|(1:87)|88|149)(4:89|(1:91)|92|(2:94|150)))|95|136|96|100|(1:102)|103|(1:151)|106|107) */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0253, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0254, code lost:
    
        r3 = yhm.m.INSTANCE;
        r0 = yhm.o.a(r0);
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aem.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f3689y = obj2;
    }
}
