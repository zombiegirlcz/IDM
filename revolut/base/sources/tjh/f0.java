package tjh;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes10.dex */
public final class f0 extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ RowDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h0 f271727w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(RowDelegate.Model model, Continuation continuation, h0 h0Var) {
        super(1, continuation);
        this.v = model;
        this.f271727w = h0Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f0(this.v, continuation, this.f271727w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f0) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01d3, code lost:
    
        if (tjh.h0.s3(r10, r2, r18) == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01e4, code lost:
    
        if (tjh.h0.r3(r10, r2, r18) == r1) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01e6, code lost:
    
        return r1;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tjh.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
