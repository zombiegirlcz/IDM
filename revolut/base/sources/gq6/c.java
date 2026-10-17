package gq6;

import gim.i;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends i implements Function2 {
    public h0 u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f145584w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f145585x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ f f145586y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, Continuation continuation) {
        super(2, continuation);
        this.f145586y = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.f145586y, continuation);
        cVar.f145585x = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gq6.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
