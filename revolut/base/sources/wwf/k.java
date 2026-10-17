package wwf;

import com.revolut.feature.transport.models.transit.TransitTicket;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class k extends gim.i implements Function1 {
    public final /* synthetic */ TransitTicket A;
    public long u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f300657w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f300658x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ bxf.e f300659y;
    public final /* synthetic */ pza.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o oVar, boolean z, bxf.e eVar, pza.d dVar, TransitTicket transitTicket, Continuation continuation) {
        super(1, continuation);
        this.f300657w = oVar;
        this.f300658x = z;
        this.f300659y = eVar;
        this.z = dVar;
        this.A = transitTicket;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f300657w, this.f300658x, this.f300659y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (r2 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007a, code lost:
    
        if (r2 == r3) goto L18;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wwf.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
