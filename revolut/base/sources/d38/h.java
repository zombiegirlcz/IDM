package d38;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public j u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BaseDraggableWidgetDelegate.a f110936w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j f110937x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(BaseDraggableWidgetDelegate.a aVar, j jVar, Continuation continuation) {
        super(2, continuation);
        this.f110936w = aVar;
        this.f110937x = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new h(this.f110936w, this.f110937x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0037, code lost:
    
        if (d38.j.b(r0, false, r9) == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (d38.j.b(r0, r6, r9) == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f6, code lost:
    
        if (r10 == r2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        return r2;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d38.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
