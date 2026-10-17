package androidx.compose.foundation.text.selection;

import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", f = "TextFieldSelectionManager.kt", l = {567}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class TextFieldSelectionManager$maybeSuggestSelection$1 extends i implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OffsetMapping $offsetMapping;
    final /* synthetic */ PlatformSelectionBehaviors $platformSelectionBehaviors;
    final /* synthetic */ TextRange $selection;
    final /* synthetic */ String $text;
    final /* synthetic */ long $transformedSelection;
    int label;
    final /* synthetic */ TextFieldSelectionManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(PlatformSelectionBehaviors platformSelectionBehaviors, String str, long j2, TextRange textRange, TextFieldSelectionManager textFieldSelectionManager, OffsetMapping offsetMapping, Continuation<? super TextFieldSelectionManager$maybeSuggestSelection$1> continuation) {
        super(2, continuation);
        this.$platformSelectionBehaviors = platformSelectionBehaviors;
        this.$text = str;
        this.$transformedSelection = j2;
        this.$selection = textRange;
        this.this$0 = textFieldSelectionManager;
        this.$offsetMapping = offsetMapping;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.$platformSelectionBehaviors, this.$text, this.$transformedSelection, this.$selection, this.this$0, this.$offsetMapping, continuation);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            PlatformSelectionBehaviors platformSelectionBehaviors = this.$platformSelectionBehaviors;
            String str = this.$text;
            long j2 = this.$transformedSelection;
            this.label = 1;
            obj2 = platformSelectionBehaviors.mo1140suggestSelectionForLongPressOrDoubleClickpYaCww(str, j2, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        TextRange textRange = (TextRange) obj2;
        if (textRange == null) {
            return Unit.f186387a;
        }
        OffsetMapping offsetMapping = this.$offsetMapping;
        long packedValue = textRange.getPackedValue();
        long jTextRange = TextRangeKt.TextRange(offsetMapping.transformedToOriginal(TextRange.m2959getStartimpl(packedValue)), offsetMapping.transformedToOriginal(TextRange.m2954getEndimpl(packedValue)));
        if (!TextRange.m2951equalsimpl(jTextRange, this.$selection) && Intrinsics.f(this.this$0.getValue$foundation().getText(), this.$text) && this.$offsetMapping == this.this$0.getOffsetMapping()) {
            Function1<TextFieldValue, Unit> onValueChange$foundation = this.this$0.getOnValueChange$foundation();
            TextFieldSelectionManager textFieldSelectionManager = this.this$0;
            onValueChange$foundation.invoke(textFieldSelectionManager.m1158createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation().getAnnotatedString(), jTextRange));
            this.this$0.m1169setLatestSelectionOEnZFl4$foundation(TextRange.m2947boximpl(jTextRange));
        }
        return Unit.f186387a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }
}
