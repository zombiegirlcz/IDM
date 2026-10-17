package androidx.compose.material3.internal;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import y07.m;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "properties", "childSemantics", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public abstract class ChildParentSemanticsKt {
    @NotNull
    public static final Modifier childSemantics(@NotNull Modifier modifier, @NotNull Function1<? super SemanticsPropertyReceiver, Unit> function1) {
        return modifier.then(new ChildSemanticsNodeElement(function1));
    }

    public static /* synthetic */ Modifier childSemantics$default(Modifier modifier, Function1 function1, int i, Object obj2) {
        if ((i & 1) != 0) {
            function1 = new m(9);
        }
        return childSemantics(modifier, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit childSemantics$lambda$0(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        return Unit.f186387a;
    }
}
