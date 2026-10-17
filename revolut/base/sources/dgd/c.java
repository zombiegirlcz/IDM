package dgd;

import gim.i;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends i implements Function1 {
    public Set u;
    public Set v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f114638w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f114639x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Set f114640y;
    public final /* synthetic */ Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, Set set, Set set2, Continuation continuation) {
        super(1, continuation);
        this.f114639x = dVar;
        this.f114640y = set;
        this.z = set2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.f114639x, this.f114640y, this.z, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (r12 == r3) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0137, code lost:
    
        if (r2 == r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01db  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dgd.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
