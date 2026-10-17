package x18;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends gim.i implements Function2 {
    public com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f302326w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f302327x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f302328y;
    public final /* synthetic */ com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b bVar, Continuation continuation) {
        super(2, continuation);
        this.z = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.z, continuation);
        bVar.f302328y = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b A[PHI: r0 r2 r6
      0x009b: PHI (r0v7 int) = (r0v6 int), (r0v8 int) binds: [B:37:0x0092, B:44:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r2v17 java.util.Iterator) = (r2v3 java.util.Iterator), (r2v18 java.util.Iterator) binds: [B:37:0x0092, B:44:0x00e8] A[DONT_GENERATE, DONT_INLINE]
      0x009b: PHI (r6v6 com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b) = 
      (r6v0 com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b)
      (r6v7 com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.b)
     binds: [B:37:0x0092, B:44:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00df -> B:43:0x00e2). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x18.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
