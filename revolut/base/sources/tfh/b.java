package tfh;

import cfl.p;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public boolean u;
    public p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f270313w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ jf0.c f270314x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f270315y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(jf0.c cVar, c cVar2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f270314x = cVar;
        this.f270315y = cVar2;
        this.z = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.f270314x, this.f270315y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0139, code lost:
    
        if (r14 == r0) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tfh.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
