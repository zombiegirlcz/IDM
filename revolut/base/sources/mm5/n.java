package mm5;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function1 {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f207152w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ o f207153x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list, o oVar, Continuation continuation) {
        super(1, continuation);
        this.f207152w = list;
        this.f207153x = oVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new n(this.f207152w, this.f207153x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((n) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        if (r11 == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (r11 == r3) goto L41;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm5.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
