package jyl;

import gim.i;
import h93.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import z6l.s;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends i implements Function2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u = 1;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f179529w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f179530x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f179531y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(fl1.c cVar, Continuation continuation) {
        super(2, continuation);
        this.A = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((g) this.A, this.f179530x, continuation);
            case 1:
                return new f((fl1.c) this.A, continuation);
            default:
                return new f((s) this.z, (f0) this.A, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:35|(1:(4:(1:(8:40|120|41|42|83|84|89|90)(2:45|46))(7:47|132|48|78|128|79|(2:81|138)(5:82|83|84|89|90))|44|87|88)(1:52))(4:53|(2:55|(1:139)(1:58))|89|90)|124|59|(6:61|(4:67|128|79|(0)(0))|71|(1:73)|74|(1:140)(5:77|78|128|79|(0)(0)))(7:130|62|(5:64|67|128|79|(0)(0))|71|(0)|74|(0)(0))|89|90) */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r8.G(r4, r9, true, r17) == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0147, code lost:
    
        r2 = r12;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0180 A[Catch: all -> 0x0146, TryCatch #3 {all -> 0x0146, blocks: (B:59:0x00f6, B:64:0x013c, B:71:0x014b, B:73:0x0180, B:74:0x0186, B:62:0x0134), top: B:124:0x00f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01be  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jyl.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, int i, Continuation continuation) {
        super(2, continuation);
        this.A = gVar;
        this.f179530x = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s sVar, f0 f0Var, Continuation continuation) {
        super(2, continuation);
        this.z = sVar;
        this.A = f0Var;
    }
}
