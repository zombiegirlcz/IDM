package com.revolut.feature.pockets.impl.ui.add_new;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public TextLocalisedClause u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f80892w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f80893x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ c f80894y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, Continuation continuation) {
        super(2, continuation);
        this.f80894y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.f80894y, continuation);
        bVar.f80893x = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0198, code lost:
    
        if (r0 != r5) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.pockets.impl.ui.add_new.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
