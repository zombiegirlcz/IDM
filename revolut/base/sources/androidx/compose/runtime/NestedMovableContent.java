package androidx.compose.runtime;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/runtime/NestedMovableContent;", "", "Landroidx/compose/runtime/MovableContentStateReference;", "content", "Landroidx/compose/runtime/MovableContentStateReference;", "getContent", "()Landroidx/compose/runtime/MovableContentStateReference;", "container", "getContainer", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
abstract class NestedMovableContent {
    @NotNull
    public abstract MovableContentStateReference getContainer();

    @NotNull
    public abstract MovableContentStateReference getContent();
}
