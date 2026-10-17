package kye;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
public final class d3 extends gim.i implements Function1 {
    public String u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f190725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ k3 f190726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f190727y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(k3 k3Var, CoroutineScope coroutineScope, Continuation continuation) {
        super(1, continuation);
        this.f190726x = k3Var;
        this.f190727y = coroutineScope;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new d3(this.f190726x, this.f190727y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((d3) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00cf A[LOOP:0: B:30:0x00c9->B:32:0x00cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f5 A[LOOP:1: B:34:0x00ef->B:36:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0104  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kye.d3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
