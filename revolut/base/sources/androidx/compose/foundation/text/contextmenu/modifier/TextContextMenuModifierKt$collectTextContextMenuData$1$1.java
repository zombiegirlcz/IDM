package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final /* synthetic */ class TextContextMenuModifierKt$collectTextContextMenuData$1$1 extends q implements Function1<Function1<? super TextContextMenuComponent, ? extends Boolean>, Unit> {
    public TextContextMenuModifierKt$collectTextContextMenuData$1$1(Object obj2) {
        super(1, 0, TextContextMenuBuilderScope.class, obj2, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        invoke((Function1<? super TextContextMenuComponent, Boolean>) obj2);
        return Unit.f186387a;
    }

    public final void invoke(Function1<? super TextContextMenuComponent, Boolean> function1) {
        ((TextContextMenuBuilderScope) this.receiver).addFilter$foundation(function1);
    }
}
