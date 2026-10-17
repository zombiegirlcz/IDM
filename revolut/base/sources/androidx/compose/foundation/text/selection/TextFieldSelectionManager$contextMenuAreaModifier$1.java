package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import com.youTransactor.uCube.rpc.Constants;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1", f = "TextFieldSelectionManager.kt", l = {Constants.TAG_E4_CUSTOMER_DATA, 230}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "clickLocation", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class TextFieldSelectionManager$contextMenuAreaModifier$1 extends i implements Function2<Offset, Continuation<? super Unit>, Object> {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$contextMenuAreaModifier$1(TextFieldSelectionManager textFieldSelectionManager, Continuation<? super TextFieldSelectionManager$contextMenuAreaModifier$1> continuation) {
        super(2, continuation);
        this.this$0 = textFieldSelectionManager;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        TextFieldSelectionManager$contextMenuAreaModifier$1 textFieldSelectionManager$contextMenuAreaModifier$1 = new TextFieldSelectionManager$contextMenuAreaModifier$1(this.this$0, continuation);
        textFieldSelectionManager$contextMenuAreaModifier$1.J$0 = ((Offset) obj2).getPackedValue();
        return textFieldSelectionManager$contextMenuAreaModifier$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        return m1171invoke3MmeM6k(((Offset) obj2).getPackedValue(), (Continuation) obj3);
    }

    /* JADX INFO: renamed from: invoke-3MmeM6k, reason: not valid java name */
    public final Object m1171invoke3MmeM6k(long j2, Continuation<? super Unit> continuation) {
        return ((TextFieldSelectionManager$contextMenuAreaModifier$1) create(Offset.m1826boximpl(j2), continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r6.mo1138onShowContextMenu_2OEclM(r7, r8, r10, r12) == r0) goto L20;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r12.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            yhm.o.b(r13)
            goto L5c
        L10:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L18:
            long r3 = r12.J$0
            yhm.o.b(r13)
            goto L31
        L1e:
            yhm.o.b(r13)
            long r4 = r12.J$0
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.this$0
            r12.J$0 = r4
            r12.label = r3
            java.lang.Object r13 = r13.updateClipboardEntry$foundation(r12)
            if (r13 != r0) goto L30
            goto L5b
        L30:
            r3 = r4
        L31:
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r13 = r12.this$0
            kotlin.Pair r13 = androidx.compose.foundation.text.selection.TextFieldSelectionManager.access$getContextTextAndSelection(r13)
            if (r13 == 0) goto L5c
            androidx.compose.foundation.text.selection.TextFieldSelectionManager r1 = r12.this$0
            java.lang.Object r5 = r13.f186385a
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r13 = r13.f186386b
            androidx.compose.ui.text.TextRange r13 = (androidx.compose.ui.text.TextRange) r13
            long r8 = r13.getPackedValue()
            androidx.compose.foundation.text.selection.PlatformSelectionBehaviors r6 = r1.getPlatformSelectionBehaviors()
            if (r6 == 0) goto L5c
            androidx.compose.ui.geometry.Offset r10 = androidx.compose.ui.geometry.Offset.m1826boximpl(r3)
            r12.label = r2
            r11 = r12
            java.lang.Object r13 = r6.mo1138onShowContextMenu_2OEclM(r7, r8, r10, r11)
            if (r13 != r0) goto L5c
        L5b:
            return r0
        L5c:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldSelectionManager$contextMenuAreaModifier$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
