package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\b\u0010\u0007\u0082\u0001\u0001\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/runtime/PausableComposition;", "Landroidx/compose/runtime/ReusableComposition;", "Lkotlin/Function0;", "", "content", "Landroidx/compose/runtime/PausedComposition;", "setPausableContent", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/PausedComposition;", "setPausableContentWithReuse", "Landroidx/compose/runtime/CompositionImpl;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface PausableComposition extends ReusableComposition {
    @NotNull
    PausedComposition setPausableContent(@NotNull Function2<? super Composer, ? super Integer, Unit> content);

    @NotNull
    PausedComposition setPausableContentWithReuse(@NotNull Function2<? super Composer, ? super Integer, Unit> content);
}
