package androidx.compose.foundation.text.selection;

import com.youTransactor.uCube.rpc.Constants;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2", f = "TextFieldSelectionManager.kt", l = {Constants.TAG_TRANSACTION_DATA, Constants.TAG_F3_BUILD_CONFIGURATION}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class TextFieldSelectionManager$contextMenuAreaModifier$2 extends i implements Function1<Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$2(TextFieldSelectionManager textFieldSelectionManager, Continuation<? super TextFieldSelectionManager$contextMenuAreaModifier$2> continuation) {
        super(1, continuation);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Continuation<?> continuation) {
        return new TextFieldSelectionManager$contextMenuAreaModifier$2(this.this$0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r8.mo1139onShowSelectionToolbarSbBc2M(r4, r5, r7) == r0) goto L19;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r8)
            goto L4f
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L18:
            yhm.o.b(r8)
            goto L2a
        L1c:
            yhm.o.b(r8)
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r7.this$0
            r7.label = r3
            java.lang.Object r8 = r8.updateClipboardEntry$foundation(r7)
            if (r8 != r0) goto L2a
            goto L4e
        L2a:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r7.this$0
            kotlin.Pair r8 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getContextTextAndSelection(r8)
            if (r8 == 0) goto L4f
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r7.this$0
            java.lang.Object r4 = r8.f186385a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r8 = r8.f186386b
            androidx.compose.ui.text.TextRange r8 = (androidx.compose.ui.text.TextRange) r8
            long r5 = r8.getPackedValue()
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors r8 = r1.getPlatformSelectionBehaviors()
            if (r8 == 0) goto L4f
            r7.label = r2
            java.lang.Object r8 = r8.mo1139onShowSelectionToolbarSbBc2M(r4, r5, r7)
            if (r8 != r0) goto L4f
        L4e:
            return r0
        L4f:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r8 = r7.this$0
            r8.setTextToolbarShownViaProvider$foundation(r3)
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Continuation<? super Unit> continuation) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$2) create(continuation)).invokeSuspend(Unit.f186387a);
    }
}
