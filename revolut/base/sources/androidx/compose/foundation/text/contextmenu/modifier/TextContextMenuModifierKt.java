package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.builder.TextContextMenuBuilderScope;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuComponent;
import androidx.compose.foundation.text.contextmenu.data.TextContextMenuData;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.TraversableNode;
import androidx.compose.ui.node.TraversableNodeKt;
import g2.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import q03.h;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\b\u001a\u00020\u0004*\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00040\u00012\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0004\u0012\u00020\u00040\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuComponent;", "", "", "filterBlock", "Landroidx/compose/foundation/text/contextmenu/builder/TextContextMenuBuilderScope;", "builderBlock", "traverseTextContextMenuDataNodes", "(Landroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "collectTextContextMenuData", "(Landroidx/compose/ui/node/DelegatableNode;)Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", "foundation"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class TextContextMenuModifierKt {
    @NotNull
    public static final TextContextMenuData collectTextContextMenuData(@NotNull DelegatableNode delegatableNode) {
        TextContextMenuBuilderScope textContextMenuBuilderScope = new TextContextMenuBuilderScope();
        traverseTextContextMenuDataNodes(delegatableNode, new TextContextMenuModifierKt$collectTextContextMenuData$1$1(textContextMenuBuilderScope), new h(textContextMenuBuilderScope, 7));
        return textContextMenuBuilderScope.build$foundation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit collectTextContextMenuData$lambda$0$0(TextContextMenuBuilderScope textContextMenuBuilderScope, Function1 function1) {
        function1.invoke(textContextMenuBuilderScope);
        return Unit.f186387a;
    }

    private static final void traverseTextContextMenuDataNodes(DelegatableNode delegatableNode, Function1<? super Function1<? super TextContextMenuComponent, Boolean>, Unit> function1, Function1<? super Function1<? super TextContextMenuBuilderScope, Unit>, Unit> function12) {
        TraversableNodeKt.traverseAncestors(delegatableNode, TextContextMenuDataTraverseKey.INSTANCE, new b(function12, function1, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean traverseTextContextMenuDataNodes$lambda$0(Function1 function1, Function1 function12, TraversableNode traversableNode) {
        if (!(traversableNode instanceof AddTextContextMenuDataComponentsNode)) {
            throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
        }
        function1.invoke(((AddTextContextMenuDataComponentsNode) traversableNode).getBuilder());
        return true;
    }
}
