package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes15.dex */
@gim.d(c = "androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1", f = "Clickable.kt", l = {1624, 1625}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class AbstractClickableNode$handlePressInteractionStart$1$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $indirectPointer;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressInteraction.Press $press;
    int label;
    final /* synthetic */ AbstractClickableNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractClickableNode$handlePressInteractionStart$1$1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, boolean z, AbstractClickableNode abstractClickableNode, Continuation<? super AbstractClickableNode$handlePressInteractionStart$1$1> continuation) {
        super(2, continuation);
        this.$interactionSource = mutableInteractionSource;
        this.$press = press;
        this.$indirectPointer = z;
        this.this$0 = abstractClickableNode;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new AbstractClickableNode$handlePressInteractionStart$1$1(this.$interactionSource, this.$press, this.$indirectPointer, this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r7.emit(r1, r6) == r0) goto L15;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r7)
            goto L39
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            yhm.o.b(r7)
            goto L2c
        L1c:
            yhm.o.b(r7)
            long r4 = androidx.compose.foundation.Clickable_androidKt.getTapIndicationDelay()
            r6.label = r3
            java.lang.Object r7 = skm.k0.b(r4, r6)
            if (r7 != r0) goto L2c
            goto L38
        L2c:
            androidx.compose.foundation.interaction.MutableInteractionSource r7 = r6.$interactionSource
            androidx.compose.foundation.interaction.PressInteraction$Press r1 = r6.$press
            r6.label = r2
            java.lang.Object r7 = r7.emit(r1, r6)
            if (r7 != r0) goto L39
        L38:
            return r0
        L39:
            boolean r7 = r6.$indirectPointer
            if (r7 == 0) goto L45
            androidx.compose.foundation.AbstractClickableNode r7 = r6.this$0
            androidx.compose.foundation.interaction.PressInteraction$Press r0 = r6.$press
            androidx.compose.foundation.AbstractClickableNode.access$setIndirectPointerPressInteraction$p(r7, r0)
            goto L4c
        L45:
            androidx.compose.foundation.AbstractClickableNode r7 = r6.this$0
            androidx.compose.foundation.interaction.PressInteraction$Press r0 = r6.$press
            androidx.compose.foundation.AbstractClickableNode.access$setPressInteraction$p(r7, r0)
        L4c:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AbstractClickableNode$handlePressInteractionStart$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AbstractClickableNode$handlePressInteractionStart$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
