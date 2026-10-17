package zdm;

import io.ktor.utils.io.t0;
import java.io.Closeable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import mmm.k;

/* JADX INFO: loaded from: classes23.dex */
public final class f extends gim.i implements Function2 {
    public int A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ k D;
    public final /* synthetic */ CoroutineContext E;
    public final /* synthetic */ fem.e F;
    public Closeable u;
    public CoroutineContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f321612w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k f321613x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Ref$IntRef f321614y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(k kVar, CoroutineContext coroutineContext, fem.e eVar, Continuation continuation) {
        super(2, continuation);
        this.D = kVar;
        this.E = coroutineContext;
        this.F = eVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.D, this.E, this.F, continuation);
        fVar.C = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((t0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ab, code lost:
    
        if (((io.ktor.utils.io.m) r11).h(r14) != r1) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ab -> B:8:0x0023). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zdm.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
