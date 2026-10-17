package ji5;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ec5.c f174352w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f174353x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ yh5.a f174354y;
    public final /* synthetic */ NaviCommand z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ec5.c cVar, e eVar, yh5.a aVar, NaviCommand naviCommand, Continuation continuation) {
        super(2, continuation);
        this.f174352w = cVar;
        this.f174353x = eVar;
        this.f174354y = aVar;
        this.z = naviCommand;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f174352w, this.f174353x, this.f174354y, this.z, continuation);
        cVar.v = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ProducerScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (r1.send(od0.i.f224256b, r18) != r2) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e6, code lost:
    
        if (r3 != r2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010c, code lost:
    
        if (r1.send(r3, r18) == r2) goto L65;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ji5.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
