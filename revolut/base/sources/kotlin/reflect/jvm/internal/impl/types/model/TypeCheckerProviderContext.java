package kotlin.reflect.jvm.internal.impl.types.model;

import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public interface TypeCheckerProviderContext {
    @NotNull
    TypeCheckerState newTypeCheckerState(boolean z, boolean z3, boolean z4);
}
