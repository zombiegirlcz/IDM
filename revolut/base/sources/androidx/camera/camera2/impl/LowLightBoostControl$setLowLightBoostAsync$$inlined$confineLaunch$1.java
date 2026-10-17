package androidx.camera.camera2.impl;

import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.q;

/* JADX INFO: loaded from: classes13.dex */
@d(c = "androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1", f = "LowLightBoostControl.kt", l = {201}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>", "(Lkotlinx/coroutines/CoroutineScope;)V"}, k = 3, mv = {2, 1, 0})
public final class LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $cancelPreviousTask$inlined;
    final /* synthetic */ boolean $lowLightBoost$inlined;
    final /* synthetic */ q $signal$inlined;
    int label;
    final /* synthetic */ LowLightBoostControl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(Continuation continuation, LowLightBoostControl lowLightBoostControl, q qVar, boolean z, boolean z3) {
        super(2, continuation);
        this.this$0 = lowLightBoostControl;
        this.$signal$inlined = qVar;
        this.$lowLightBoost$inlined = z;
        this.$cancelPreviousTask$inlined = z3;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1(continuation, this.this$0, this.$signal$inlined, this.$lowLightBoost$inlined, this.$cancelPreviousTask$inlined);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.impl.LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((LowLightBoostControl$setLowLightBoostAsync$$inlined$confineLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
