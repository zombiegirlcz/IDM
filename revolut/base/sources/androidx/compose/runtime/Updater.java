package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0a.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J5\u0010\u000e\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0010\u001a\u00020\n\"\u0004\b\u0001\u0010\u00072\u0006\u0010\b\u001a\u00028\u00012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000f\u0010\rJ!\u0010\u0014\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0011¢\u0006\u0004\b\u0012\u0010\u0013\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/Updater;", "T", "", "Landroidx/compose/runtime/Composer;", "composer", "constructor-impl", "(Landroidx/compose/runtime/Composer;)Landroidx/compose/runtime/Composer;", "V", "value", "Lkotlin/Function2;", "", "block", "set-impl", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "set", "init-impl", "init", "Lkotlin/Function1;", "reconcile-impl", "(Landroidx/compose/runtime/Composer;Lkotlin/jvm/functions/Function1;)V", "reconcile", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Updater<T> {
    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static <T> Composer m1662constructorimpl(@NotNull Composer composer) {
        return composer;
    }

    /* JADX INFO: renamed from: init-impl, reason: not valid java name */
    public static final <V> void m1663initimpl(Composer composer, V v, @NotNull Function2<? super T, ? super V, Unit> function2) {
        if (composer.getInserting()) {
            composer.apply(v, function2);
        }
    }

    /* JADX INFO: renamed from: reconcile-impl, reason: not valid java name */
    public static final void m1664reconcileimpl(Composer composer, @NotNull Function1<? super T, Unit> function1) {
        composer.apply(Unit.f186387a, new i(1, function1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reconcile_impl$lambda$0(Function1 function1, Object obj2, Unit unit) {
        function1.invoke(obj2);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: set-impl, reason: not valid java name */
    public static final <V> void m1665setimpl(Composer composer, V v, @NotNull Function2<? super T, ? super V, Unit> function2) {
        if (composer.getInserting() || !Intrinsics.f(composer.rememberedValue(), v)) {
            composer.updateRememberedValue(v);
            composer.apply(v, function2);
        }
    }
}
