package androidx.compose.foundation.text.selection;

import android.os.Build;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import android.view.textclassifier.TextSelection;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import gim.d;
import gim.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes15.dex */
@d(c = "androidx.compose.foundation.text.selection.PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2", f = "PlatformSelectionBehaviors.android.kt", l = {369, 159}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/compose/ui/text/TextRange;", "Landroid/view/textclassifier/TextClassifier;"}, k = 3, mv = {2, 0, 0}, xi = 48)
public final class PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 extends i implements Function2<TextClassifier, Continuation<? super TextRange>, Object> {

    /* JADX INFO: renamed from: $$v$c$androidx-compose-ui-text-TextRange$-selection$0, reason: not valid java name */
    final /* synthetic */ long f42$$v$c$androidxcomposeuitextTextRange$selection$0;
    final /* synthetic */ CharSequence $text;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ PlatformSelectionBehaviorsImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(CharSequence charSequence, long j2, PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl, Continuation<? super PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2> continuation) {
        super(2, continuation);
        this.$text = charSequence;
        this.f42$$v$c$androidxcomposeuitextTextRange$selection$0 = j2;
        this.this$0 = platformSelectionBehaviorsImpl;
    }

    @Override // gim.a
    public final Continuation<Unit> create(Object obj2, Continuation<?> continuation) {
        PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2 = new PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2(this.$text, this.f42$$v$c$androidxcomposeuitextTextRange$selection$0, this.this$0, continuation);
        platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2.L$0 = obj2;
        return platformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TextClassifier textClassifier, Continuation<? super TextRange> continuation) {
        return ((PlatformSelectionBehaviorsImpl$suggestSelectionForLongPressOrDoubleClick$2) create(textClassifier, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        long j2;
        PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl;
        hlm.a aVar;
        CharSequence charSequence;
        long j3;
        TextSelection textSelection;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            o.b(obj2);
            TextClassifier textClassifier = (TextClassifier) this.L$0;
            TextSelection.Request.Builder defaultLocales = new TextSelection.Request.Builder(this.$text, TextRange.m2957getMinimpl(this.f42$$v$c$androidxcomposeuitextTextRange$selection$0), TextRange.m2956getMaximpl(this.f42$$v$c$androidxcomposeuitextTextRange$selection$0)).setDefaultLocales(this.this$0.getAndroidLocalList());
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                defaultLocales.setIncludeTextClassification(true);
            }
            TextSelection textSelectionSuggestSelection = textClassifier.suggestSelection(defaultLocales.build());
            long jTextRange = TextRangeKt.TextRange(textSelectionSuggestSelection.getSelectionStartIndex(), textSelectionSuggestSelection.getSelectionEndIndex());
            if (i2 < 31 || textSelectionSuggestSelection.getTextClassification() == null) {
                PlatformSelectionBehaviorsImpl platformSelectionBehaviorsImpl2 = this.this$0;
                CharSequence charSequence2 = this.$text;
                this.J$0 = jTextRange;
                this.label = 2;
                if (platformSelectionBehaviorsImpl2.m1142classifyTextM8tDOmk(charSequence2, jTextRange, textClassifier, this) != aVar2) {
                    j2 = jTextRange;
                    j3 = j2;
                }
            } else {
                hlm.a aVar3 = this.this$0.mutex;
                platformSelectionBehaviorsImpl = this.this$0;
                CharSequence charSequence3 = this.$text;
                this.L$0 = textSelectionSuggestSelection;
                this.L$1 = aVar3;
                this.L$2 = platformSelectionBehaviorsImpl;
                this.L$3 = charSequence3;
                this.J$0 = jTextRange;
                this.label = 1;
                if (aVar3.lock(null, this) != aVar2) {
                    aVar = aVar3;
                    charSequence = charSequence3;
                    j3 = jTextRange;
                    textSelection = textSelectionSuggestSelection;
                    TextClassification textClassification = textSelection.getTextClassification();
                    Intrinsics.h(textClassification);
                    platformSelectionBehaviorsImpl.setTextClassificationResult(new TextClassificationResult(charSequence, j3, textClassification, null));
                    Unit unit = Unit.f186387a;
                }
            }
            return aVar2;
        }
        if (i == 1) {
            long j5 = this.J$0;
            CharSequence charSequence4 = (CharSequence) this.L$3;
            platformSelectionBehaviorsImpl = (PlatformSelectionBehaviorsImpl) this.L$2;
            aVar = (hlm.a) this.L$1;
            textSelection = (TextSelection) this.L$0;
            o.b(obj2);
            j3 = j5;
            charSequence = charSequence4;
            try {
                TextClassification textClassification2 = textSelection.getTextClassification();
                Intrinsics.h(textClassification2);
                platformSelectionBehaviorsImpl.setTextClassificationResult(new TextClassificationResult(charSequence, j3, textClassification2, null));
                Unit unit2 = Unit.f186387a;
            } finally {
                aVar.unlock(null);
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = this.J$0;
            o.b(obj2);
            j3 = j2;
        }
        return TextRange.m2947boximpl(j3);
    }
}
